# Generated from: Assignment_2_Python.ipynb
# Converted at: 2025-12-20T08:53:51.353Z
# Next step (optional): refactor into modules & generate tests with RunCell
# Quick start: pip install runcell

import numpy as np
import pandas as pd

# ### Q2.1: Array Creation and Shape
# #### Load the regional performance data into NumPy arrays and display the shape and data types


df=pd.read_csv("assignment2_regional_performance(in).csv")

df

df.describe()

df.info()

array=df.values        #converts a pandas DataFrame into a NumPy array
array

print(array.shape)

print(array.dtype)

# ### Q2.2: Annual Revenue Calculation
# #### Calculate the total annual revenue for each region (sum of Q1, Q2, Q3, Q4 revenues).
# ##### Hint: Use .sum(axis=1) on the revenue columns array


revenue=df[['Q1Revenue','Q2Revenue','Q3Revenue','Q4Revenue']].values

revenue

col=revenue.sum(axis=1)

for i,region in enumerate(df['RegionName']):
    print(f"{region} : {col[i]}")

# ### Q2.3: Quarterly Average
# #### Find the average units sold per quarter across all regions.
# ##### Hint: Use .mean() on the units array and specify axis


unit=df[['Q1Units','Q2Units',	'Q3Units','Q4Units']].values

unit

sold=unit.mean(axis=1)

sold

for i,quarter in enumerate(df['RegionName']):
    print(f"{quarter} : {sold[i]}")

# ### Q2.4: Conditional Filtering
# #### Identify regions where Q4 revenue is higher than the annual average revenue.
# ##### Hint: Use Boolean indexing and compare with .mean()


revenue=df[['Q1Revenue','Q2Revenue','Q3Revenue','Q4Revenue']].values

value=revenue.mean(axis=1)

value

avg=df['Q4Revenue']>value

df[avg]

# ### Q2.5: 2D Matrix Operations
# #### Create a 2D matrix of quarterly revenues and compute column-wise totals (total revenue per quarter).
# ##### Hint: Extract revenue columns as matrix, use 
# 


revenue=df[['Q1Revenue','Q2Revenue','Q3Revenue','Q4Revenue']].values

revenue

result=revenue.sum(axis=0)

Quarter=['Quarter_1','Quarter_2','Quarter_3','Quarter_4']   
for i,region in enumerate(Quarter):
    print(f"{region} : {result[i]}")

# ### Q2.6: Min-Max Normalization.sum(axis=0)
# #### Normalize all revenue values between 0 and 1 using min-max normalization.
# #### Formula: (value - min) / (max - min)
# ##### Hint: Use .flatten(), .min()
# 


flat=revenue.flatten()   #flatten() -- convert to 2Darray into 1Darray

min_value=flat.min()
max_value=flat.max()

print(min_value)
print(max_value)

cal=(flat-min_value)/(max_value - min_value)

cal

# ### Q2.7: Boolean Masking.max()
# #### Use Boolean indexing to filter regions with total annual revenue > 500,000.
# #### Hint: Create a Boolean mask and use it for filtering




boolean_mask=col>500000

for i,region in enumerate(df['RegionName']):
    print(f"{region} : {boolean_mask[i]}")

# ### Q2.8: Element-wise Division
# #### Calculate the revenue per unit for each region and quarter (Revenue / Units).
# #### Hint: Use element-wise division on two arrays


quarter=(revenue/unit)
print(quarter)

for i in range(len(quarter)):
    print(f"\n{df.loc[i,'RegionName']}")
    for i ,region in zip(Quarter,revenue):
        print(f"{i} : {region}")

# ## Q2.9: Statistical Analysis
# #### Calculate the standard deviation of revenue and identify outlier regions (> 2 std deviations frommean).
# #### Hint: Use np.std() and Boolean indexing


mean_flat=flat.mean()   #find the sumsingle line array
std_flat=flat.std()

outlier_mask=np.abs(flat-mean_flat)>(2*std_flat)
outlier_mask

print(f"No of the outlier in this data: {outlier_mask.sum()}")

# ### Q2.10: Correlation Matrix
# #### Create a correlation matrix between quarterly revenues using NumPy.
# #### Hint: Use np.corrcoef() on transposed revenue array


revenue_t=revenue.T

revenue_t

cor=np.corrcoef(revenue_t)

cor

print("="*50)
print(cor)
print("="*50)

# ## Challenge Extension


# ### Challenge 1: Create a 3D array structure and perform multi-axis operations


arr_3D=np.arange(1,28).reshape(3,3,3)       # reshape(depth,row,column)
mean=arr_3D.mean(axis=(0,1))
arr_sum=arr_3D.sum(axis=(1,2))
std=arr_3D.std(axis=(0,1))

print("3D Array Structure")
print(arr_3D)


print(f"Mean values : {mean}")
print(f"Sum values : {arr_3D}")
print(f"Standard Deviation : {std}")


# ### Challenge 2: Implement z-score normalization instead of min-max.


score=arr_3D-np.mean(arr_3D)/np.std(arr_3D)

score

print(f"Z-score normalization : \n{score}")


# ### Challenge 3: Detect and analyze seasonal patterns in quarterly data