# Generated from: assignment_2 numpy.ipynb
# Converted at: 2025-12-20T11:28:20.712Z
# Next step (optional): refactor into modules & generate tests with RunCell
# Quick start: pip install runcell

# ## ASSIGNMENT 2: NumPy for Numeric Data


# ### Q2.1: Array Creation and Shape


import pandas as pd
import numpy as np

df=pd.read_csv('assignment2_regional_performance.csv')

df_arr=df.values

df_arr

np.shape(df_arr)

df_arr.dtype

# ### Q2.2: Annual Revenue Calculation


df

revenue_col=df[['Q1Revenue','Q2Revenue','Q3Revenue','Q4Revenue']].values

annual_rev=revenue_col.sum(axis=1)
annual_rev

for i,region in enumerate(df['RegionName']):
    print(f" {region}: {annual_rev[i]}")

# ### Q2.3: Quarterly Average


arr_units=df[['Q1Units','Q2Units','Q3Units','Q4Units']].values

qua_avg=avg_col.mean(axis=0)

qua_avg

quarters=['Q1','Q2','Q3','Q4']

for q,avg in zip(quarters,qua_avg):
    print(f" {q}: {avg:.1f} units")

# ### Q2.4: Conditional Filtering
# 


rev_filter=df[['Q1Revenue','Q2Revenue','Q3Revenue','Q4Revenue']].values

annual_avg=rev_filter.mean()

annual_avg

q4_revenue=df['Q4Revenue'].values

checking=q4_revenue>rev_sum

regions=df['RegionName'].values

filter_region=regions[checking]

print(f" Annual average revenue:{annual_avg:.2f}")
for region in filter_region:
    print(f" {region}")

# ### Q2.5:2D Matrix Operations


arr_rev=df[['Q1Revenue','Q2Revenue','Q3Revenue','Q4Revenue']].values

quarter_totals=arr.sum(axis=0)

quarters=['Q1','Q2','Q3','Q4']

for q,total in zip(quarters,quarter_totals):
    print(f" {q}:${total}")

# ### Q2.6: Min-Max Normalization


revenue_flatten =revenue_col.flatten()
revenue_flatten

min_val=revenue_flatten.min()
max_val=revenue_flatten.max()

normalization=(revenue_flatten-min_val)/(max_val-min_val)

print(f" Normalized matrix is :{normalization}")



normalization.ndim

# ### Q2.7: Boolean Masking


boolean_val=annual_rev > 500000


boolean_val

# ### Q2.8: Element-wise Division


quarter_value=arr_rev/arr_units

for i in range(len(quarter_value)):
    print(f"\n{df.loc[i,'RegionName']}")
    for i ,region in zip(quarters,arr_rev):
        print(f"{i} : {region}")

# ### Q2.9: Statistical Analysis


rev_mean = revenue_flatten.mean()
print(rev_mean)
rev_std = revenue_flatten.std()
print(rev_std)

outlier_mask = np.abs(revenue_flatten-rev_mean)>(2*rev_std)
outlier_mask

# ### Q2.10: Correlation Matrix


revenue_t=arr_rev.T
revenue_t
cor=np.corrcoef(revenue_t)
print("="*50)
print(cor)
print("="*50)

# ## Challenge Extension


# ### Challenge 1: Create a 3D array structure and perform multi-axis operations.


array=np.arange(1,28).reshape(3,3,3)       
mean=array.mean(axis=(0,1))
arr_sum=array.sum(axis=(1,2))
std=array.std(axis=(0,1))
print("3D Array Structure")
print(array)
print(f"Mean values : {mean}")
print(f"Sum values : {array}")
print(f"Standard Deviation : {std}")

# ### Challenge 2: Implement z-score normalization instead of min-max.


scoring=arr-np.mean(arr)/np.std(arr)
print(f"Z-score normalization : \n{score}")

# ### Challenge 3: Detect and analyze seasonal patterns in quarterly data


quarter_std = revenue_col.std(axis=0) #find the sum of regional_wise
strong_quarter = quarter_std.argmax()
print(f"Strong season: Q{strong_quarter + 1}")
avg_by_quarter = revenue_col.mean(axis=0) # Year-over-year comparison potential
print("Average revenue by quarter:", avg_by_quarter)