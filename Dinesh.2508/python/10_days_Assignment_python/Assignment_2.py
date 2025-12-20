import numpy as np
import pandas as pd 

## Q2.1: Array Creation and Shape
#### Load the regional performance data into NumPy arrays and display the shape and data types 
df = pd.read_csv('assignment2_regional_performance.csv')
revenue_arr = df[['Q1Revenue','Q2Revenue','Q3Revenue','Q4Revenue']].values
print('Revenue values in array')
print(revenue_arr)
print('Array shape:', unit_arr.shape)
print('Data Type:', unit_arr.dtype)
df

## Q2.2: Annual Revenue Calculation
#### Calculate the total annual revenue for each region (sum of Q1, Q2, Q3, Q4 revenues
annual_revenue = revenue_arr.sum(axis = 1)
print('Annual Revenue by Region:')
for i, region in enumerate(df['RegionName']):
    print(f'{region}: {annual_revenue[i]:,.0f}')

## Q2.3: Quarterly Average
#### Find the average units sold per quarter across all regions.
units_arr = df[['Q1Units', 'Q2Units', 'Q3Units', 'Q4Units']].values
quarterly_avg = units_arr.mean(axis=0)
print("Average units sold per quarter (all regions):")
print(f" Q1: {quarterly_avg[0]:.2f}")
print(f" Q2: {quarterly_avg[1]:.2f}")
print(f" Q3: {quarterly_avg[2]:.2f}")
print(f" Q4: {quarterly_avg[3]:.2f}")

## Q2.4: Conditional Filtering
#### Identify regions where Q4 revenue is higher than the annual average revenue
quarter_cols = ['Q1Revenue', 'Q2Revenue', 'Q3Revenue', 'Q4Revenue']
df['AnnualAvg'] = df[quarter_cols].mean(axis=1)
high_q4_regions = df.loc[df['Q4Revenue'] > df['AnnualAvg'], 'RegionName'].tolist()

print("Regions with Q4 revenue > their annual average:")
print(high_q4_regions)

## Q2.5: 2D Matrix Operations
##### Create a 2D matrix of quarterly revenues and compute column-wise totals (total revenue per quarter).
quarter_totals = revenue_arr.sum(axis=0)
print("Total revenue per quarter (Q1 to Q4):")
print(quarter_totals)
quarter_cols = ['Q1Revenue', 'Q2Revenue', 'Q3Revenue', 'Q4Revenue']
revenue_matrix = df[quarter_cols].values
quarter_totals = revenue_matrix.sum(axis=0)
print("Total revenue per quarter (Q1 to Q4):")
print(quarter_totals)

## Q2.6: Min-Max Normalization
#### Normalize all revenue values between 0 and 1 using min-max normalization
quarter_cols = ['Q1Revenue', 'Q2Revenue', 'Q3Revenue', 'Q4Revenue']
revenue_matrix = df[quarter_cols].values
flat = revenue_matrix.flatten()
r_min = flat.min()
r_max = flat.max()
normalized_flat = (flat - r_min) / (r_max - r_min)
normalized_revenue = normalized_flat.reshape(revenue_matrix.shape)
normalized_revenue

## Q2.7: Boolean Masking
#### Use Boolean indexing to filter regions with total annual revenue > 500,000
boolean_mask = annual_revenue>500000
for i,region in enumerate(df['RegionName']):
    print(f"{region} : {boolean_mask[i]}")

## Q2.8: Element-wise Division
##### Calculate the revenue per unit for each region and quarter (Revenue / Units).
quarter=(revenue/unit_arr)
print(quarter)
for i in range(len(quarter)):
    print(f"\n{df.loc[i,'RegionName']}")
    for i ,region in zip(quarter,revenue):
        print(f"{i} : {region}")

## Q2.9: Statistical Analysis
##### Calculate the standard deviation of revenue and identify outlier regions (> 2 std deviations frommean).
mean_flat=flat.mean()   
std_flat=flat.std()

outlier_mask=np.abs(flat-mean_flat)>(2*std_flat)
outlier_mask

## Q2.10: Correlation Matrix
##### Create a correlation matrix between quarterly revenues using NumPy.
revenue = df [['Q1Revenue','Q2Revenue','Q3Revenue','Q1Revenue']]
revenue_t=revenue.T
revenue_t
cor=np.corrcoef(revenue_t)
print("="*50)
print(cor)
print("="*50)

## Challenge Extension
##### Challenge 1: Create a 3D array structure and perform multi-axis operations
arr_3D=np.arange(1,28).reshape(3,3,3)       
mean=arr_3D.mean(axis=(0,1))
arr_sum=arr_3D.sum(axis=(1,2))
std=arr_3D.std(axis=(0,1))
print("3D Array Structure")
print(arr_3D)

print(f"Mean values : {mean}")
print(f"Sum values : {arr_3D}")
print(f"Standard Deviation : {std}")

##### Challenge 2: Implement z-score normalization instead of min-max
score=arr_3D-np.mean(arr_3D)/np.std(arr_3D)
print(f"Z-score normalization : \n{score}")

##### Challenge 3: Detect and analyze seasonal patterns in quarterly data
quarter_std = revenue.std(axis=0)
strong_quarter = quarter_std.argmax()
print(f"Strong season: Q{strong_quarter + 1}")
avg_by_quarter = revenue.mean(axis=0) 
print("Average revenue by quarter:", avg_by_quarter)