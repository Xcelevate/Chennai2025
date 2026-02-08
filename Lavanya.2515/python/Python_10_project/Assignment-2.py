# Generated from: Assignment-2.ipynb
# Converted at: 2025-12-20T10:49:07.699Z
# Next step (optional): refactor into modules & generate tests with RunCell
# Quick start: pip install runcell

# # ASSIGNMENT 2: NumPy for Numeric Data


# ## Questions


# ### Q2.1: Array Creation and Shape


# #### Load the regional performance data into NumPy arrays and display the shape and data types


import pandas as pd
import numpy as np

df=pd.read_csv('assignment2_regional_performance(in).csv')

df

arr=df.values

print(arr.shape)

print(arr.dtype)

# ### Q2.2: Annual Revenue Calculation


# #### Calculate the total annual revenue for each region (sum of Q1, Q2, Q3, Q4 revenues)


revenue_col=df[['Q1Revenue','Q2Revenue','Q3Revenue','Q4Revenue']].values

total_revenue=revenue_col.sum(axis=1)
total_revenue

for i, region in enumerate(df['RegionName']):
    print(f"  {region} : ${total_revenue[i]:,.0f}")

# ### Q2.3: Quarterly Average


# #### Find the average units sold per quarter across all regions.


units=df[['Q1Units','Q2Units','Q3Units','Q4Units']].values

avg_units=units.mean(axis=0)
avg_units

quarters = ['Q1', 'Q2', 'Q3', 'Q4']
for q, avg in zip(quarters, avg_units):
    print(f"  {q} : {avg:.1f} units")

# ### Q2.4: Conditional Filtering


# #### Identify regions where Q4 revenue is higher than the annual average revenue.
# 


annual_avg=revenue_col.mean(axis=1)
annual_avg

filter=df[df['Q4Revenue']>annual_avg]
filter

# ### Q2.5: 2D Matrix Operations


# #### Create a 2D matrix of quarterly revenues and compute column-wise totals (total revenue per quarter).
# 


twoD_matrix=revenue_col.sum(axis=0)
twoD_matrix 

for q, total in zip(quarters, twoD_matrix):
    print(f"  {q}: ${total:,.0f}")


# ### Q2.6: Min-Max Normalization


# #### Normalize all revenue values between 0 and 1 using min-max normalization.


revenue_flat =revenue_col.flatten()
revenue_flat

normalized = (revenue_flat - revenue_flat.min()) / (revenue_flat.max() - revenue_flat.min())

normalized

# ### Q2.7: Boolean Masking


# #### Use Boolean indexing to filter regions with total annual revenue > 500,000.


boolean_mask=total_revenue > 500000
boolean_mask

# ### Q2.8: Element-wise Division


# #### Calculate the revenue per unit for each region and quarter (Revenue / Units).


quarter = revenue_col / units
quarter

for i in range(len(quarter)):
    print(f"\n{df.loc[i,'RegionName']}")
    for i ,region in zip(quarters,revenue_col):
        print(f"{i} : {region}")

# ### Q2.9: Statistical Analysis


# #### Calculate the standard deviation of revenue and identify outlier regions (> 2 std deviations from mean).


revenue_mean = revenue_flat.mean()
print(revenue_mean)
revenue_std = revenue_flat.std()
print(revenue_std)

outliers = np.abs(revenue_flat-revenue_mean)>(2*revenue_std)
outliers

# ### Q2.10: Correlation Matrix


# #### Create a correlation matrix between quarterly revenues using NumPy


revenue_t=revenue_col.T
revenue_t
cor=np.corrcoef(revenue_t)
print("="*50)
print(cor)
print("="*50)

# ## Challenge Extension


# ### Challenge 1: Create a 3D array structure and perform multi-axis operations.


arr=np.arange(1,28).reshape(3,3,3)       
mean=arr.mean(axis=(0,1))
arr_sum=arr.sum(axis=(1,2))
std=arr.std(axis=(0,1))
print("3D Array Structure")
print(arr)
print(f"Mean values : {mean}")
print(f"Sum values : {arr}")
print(f"Standard Deviation : {std}")

# ### Challenge 2: Implement z-score normalization instead of min-max.


score=arr-np.mean(arr)/np.std(arr)
print(f"Z-score normalization : \n{score}")

# ### Challenge 3: Detect and analyze seasonal patterns in quarterly data


quarter_std = revenue_col.std(axis=0) #find the sum of regional_wise
strong_quarter = quarter_std.argmax()
print(f"Strong season: Q{strong_quarter + 1}")
avg_by_quarter = revenue_col.mean(axis=0) # Year-over-year comparison potential
print("Average revenue by quarter:", avg_by_quarter)