# # ASSIGNMENT 2: NumPy for Numeric Data

# ### Dataset: assignment2_regional_performance.csv

# ### Q2.1: Array Creation and Shape

# #### Load the regional performance data into NumPy arrays and display the shape and data types.

import numpy as np # importing numpy module

import pandas as pd # importing pandas module

df = pd.read_csv('assignment2_regional_performance(in).csv') #load the data
df #display the dataframe
regional_performance = df[['Q1Revenue','Q2Revenue','Q3Revenue','Q4Revenue']].values
print(f'Regional Performance Array:\n{regional_performance}')
print(f'Shape of the array: {regional_performance.shape}') # display the no of rows and columns 
print(f'This array consists of rows:{regional_performance.shape[0]} and columns:{regional_performance.shape[1]}') #display the result
print(f'Data Type: {regional_performance.dtype}')

#Q2.1: Array Creation and Shape

import numpy as np # importing numpy module
import pandas as pd # importing pandas module
df = pd.read_csv('assignment2_regional_performance(in).csv') #load the data
df # display the dataframe and review it
regional_performance = df[['Q1Revenue','Q2Revenue','Q3Revenue','Q4Revenue']].values # get the regional performance
print(f'Regional Performance Array:\n{regional_performance}') # display the results
print(f'Shape of the array: {regional_performance.shape}') # display the no of rows and columns
print(f'This array consists of rows:{regional_performance.shape[0]} and columns:{regional_performance.shape[1]}') #display the result
print(f'Data Type of regional performance: {regional_performance.dtype}') # display the datatypes of regional performance

# ### Q2.2: Annual Revenue Calculation

# #### Calculate the total annual revenue for each region (sum of Q1, Q2, Q3, Q4 revenues).

total_revenue = regional_performance.sum(axis=1) #find the total revenue for each region
print("Total Revenue For Each Region")
for i,region in enumerate(df['RegionName']): 
    print(f'{region}: {total_revenue[i]}')  #display the region wise total revenue

#Q2.2: Annual Revenue Calculation
total_revenue = regional_performance.sum(axis=1) #find the total revenue for each region
print("Total Revenue For Each Region")
for i,region in enumerate(df['RegionName']): 
    print(f'{region}: {total_revenue[i]}')  #display the region wise total revenue

# ### Q2.3: Quarterly Average

# #### Find the average units sold per quarter across all regions

regional_unit = df[['Q1Units','Q2Units','Q3Units','Q4Units']].values #convert the units value to array
avg_unit = regional_unit.mean(axis = 0) # find the avergae across all regoin
print("Average Units Sold per Region")
quaters = ['Quarter_1','Quarter_2','Quarter_3','Quarter_4'] #initialize the quarters
for i,region in enumerate(quaters):
    print(f' {quaters[i]} average sold: {avg_unit[i]}') #display the result

# Q2.3: Quarterly Average
regional_unit = df[['Q1Units','Q2Units','Q3Units','Q4Units']].values #convert the units value to array
avg_unit = regional_unit.mean(axis = 0) # find the avergae across all regoin
print("Average Units Sold per Region")
quaters = ['Quarter_1','Quarter_2','Quarter_3','Quarter_4'] #initialize the quarters
for i,region in enumerate(quaters):
    print(f' {quaters[i]} average sold: {avg_unit[i]}') #display the result

# ### Q2.4: Conditional Filtering

# #### Identify regions where Q4 revenue is higher than the annual average revenue

Q4_revenue = regional_performance[:, 3] #filter Q4_revenue in regional_performance.
average_revenue = total_revenue.mean() # find the average_revenue in total_revenue.
high_q4_mask = Q4_revenue > total_revenue #compare Q4_revenue with average_revenue.
values = Q4_revenue[Q4_revenue > average_revenue]
print(f"Q4 revenues:{Q4_revenue}") # display the Q4 revenue
print(f"Average_revenue:{average_revenue}") # display the avergae revenue
print(f"Regions with Q4 revenue > annual average: {values}") # display the comparison of Q4 revenue vs avrage_revenue

#Q2.4: Conditional Filtering
Q4_revenue = regional_performance[:, 3] #filter Q4_revenue in regional_performance.
average_revenue = total_revenue.mean() # find the average_revenue in total_revenue.
compare = Q4_revenue > average_revenue #compare Q4_revenue with average_revenue.
values = Q4_revenue[Q4_revenue > average_revenue] # get the values from comaprison
print(f"Q4 revenues:{Q4_revenue}") # display the Q4 revenue
print(f"Average_revenue:{average_revenue}") # display the avergae revenue
print(f"Regions with Q4 revenue > annual average: {values}") # display the comparison of Q4 revenue vs avrage_revenue

# ### Q2.5: 2D Matrix Operations

# #### Create a 2D matrix of quarterly revenues and compute column-wise totals (total revenue per quarter)

matrix_2d = regional_performance.reshape(10,4) #created the 2D Matrix
column_wise_total = matrix_2d.sum(axis = 0) #column-wise totals in each quater
print("Total revenue per Quater:") #display the header
quarters = ['Quarter_1','Quarter_2','Quarter_3','Quarter_4'] #initialize the quarters
for i,quarter in enumerate(quarters): # get both values and quarter
    print(f' {quarter}: {column_wise_total[i]} $') #display the result

#Q2.5: 2D Matrix Operations
matrix_2d = regional_performance.reshape(10,4) #created the 2D Matrix
column_wise_total = matrix_2d.sum(axis = 0) #column-wise totals in each quater
print("Total revenue per Quater:") #display the header
quarters = ['Quarter_1','Quarter_2','Quarter_3','Quarter_4'] #initialize the quarters
for i,quarter in enumerate(quarters): # get both values and quarter
    print(f' {quarter}: {column_wise_total[i]} $') #display the result

# ### Q2.6: Min-Max Normalization

# #### Normalize all revenue values between 0 and 1 using min-max normalization.

normalize_flat = regional_performance.flatten() #Multi-dimension array converted into single dimension array
formula = (normalize_flat - normalize_flat.min()) / (normalize_flat.max() - normalize_flat.min())# normalize the values between 0 and 1
print(f'Single dimensonal array:\n{normalize_flat}') #display single dimension array
print(f'Minimum of the array: {normalize_flat.min()} and Maximum of the array: {normalize_flat.max()}') #print the min and max of an array
print("First 10 Normalized Values:")
print(formula[:10]) # display first 10 normalized value

# Q2.6: Min-Max Normalization
normalize_flat = regional_performance.flatten() #Multi-dimension array converted into single dimension array
formula = (normalize_flat - normalize_flat.min()) / (normalize_flat.max() - normalize_flat.min())# normalize the values between 0 and 1
print(f'Single dimensonal array:\n{normalize_flat}') #display single dimension array
print(f'Minimum of the array: {normalize_flat.min()} and Maximum of the array: {normalize_flat.max()}') #print the min and max of an array
print("First 10 Normalized Values:")
print(formula[:10]) # display first 10 normalized value

# ### Q2.7: Boolean Masking

# #### Use Boolean indexing to filter regions with total annual revenue > 500,000.

high_revenue_mask = total_revenue > 500000
high_revenue_regions = df[high_revenue_mask]
print("Regions with revenue > $500,000:")
for idx, row in high_revenue_regions.iterrows():
    print(f"{row['RegionName']}: ${total_revenue[idx]:,.0f}")

# ### Q2.8: Element-wise Division

# #### Calculate the revenue per unit for each region and quarter (Revenue / Units).

revenue_per_unit = (regional_performance / regional_unit) #Revenue / Units
print("Revenue Per Unit By Each Region:")
for i in range(len(revenue_per_unit)):  # get the region name
    print(f"\n{df.loc[i, 'RegionName']}") #display the each region
    for quarter, revenue in zip(quarters, revenue_per_unit[i]): # get the quarter and values in single loop
        print(f" {quarter}: {revenue:.2f}") # display the region quarter wise revenue

# Q2.8: Element-wise Division
revenue_per_unit = (regional_performance / regional_unit) #Revenue / Units
print("Revenue Per Unit By Each Region:")
for i in range(len(revenue_per_unit)):  # get the region name
    print(f"\n{df.loc[i, 'RegionName']}") #display the each region
    for quarter, revenue in zip(quarters, revenue_per_unit[i]): # get the quarter and values in single loop
        print(f" {quarter}: {revenue:.2f}") # display the region quarter wise revenue

# ### Q2.9: Statistical Analysis


# #### Calculate the standard deviation of revenue and identify outlier regions (> 2 std deviations from mean).

revenue_flat = regional_performance.flatten()
std_revenue = revenue_flat.std() #find the standard deviation in single line array
mean_revenue = revenue_flat.mean() #find the mean in single line array
print(f'Standard deviation of revenue: ({std_revenue:,.2f})') #display the std value
outlier_mask =np.abs(revenue_flat - mean_revenue) > (2 * std_revenue) # calculate the outlier_value
print(f'No of the Outlier in this data: {outlier_mask.sum()}') #display the no of the outlier in this array.

#Q2.9: Statistical Analysis
std_revenue = normalize_flat.std() #find the standard deviation in single line array.
mean_revenue = normalize_flat.mean() #find the mean in single line array.
print(f'Standard deviation of revenue: ({std_revenue:,.2f})') #display the std value.
outlier_mask =np.abs(normalize_flat - mean_revenue) > (2 * std_revenue) # calculate the outlier_value.
print(f'No of the Outlier in this data: {outlier_mask.sum()}') #display the no of the outlier in this array.

# ### Q2.10: Correlation Matrix

# #### Create a correlation matrix between quarterly revenues using NumPy

regional_performance_t = regional_performance.T # transponse the quarterly revenue 
corr_matrix =np.corrcoef(regional_performance_t) # calculates the linear relationship using pearson correlation.
print("Correclation_Matrix(Quarterly Revenues)")
print('='*50)
print(corr_matrix)
print('='*50)

#Q2.10: Correlation Matrix
regional_performance_t = regional_performance.T # transponse the quarterly revenue.
corr_matrix =np.corrcoef(regional_performance_t) # calculates the linear relationship using pearson correlation..
print("Correclation_Matrix(Quarterly Revenues)")
print('='*50)
print(corr_matrix) #display the correlated matrix
print('='*50)

# ### Challenge Extension

# #### Challenge 1: Create a 3D array structure and perform multi-axis operations

arr_3d = np.arange(1,28).reshape(3,3,3) # create a 3d array (depth,rows,columns)
print(f'Created 3D Array Structure: \n{arr_3d}') #display the created 3D array.

#multi-axis operation
print(f'Sum of 3D_array: {np.sum(arr_3d, axis=(0,1))}') # sum of the particular row and column
print(f'Meam of 3D_array: {np.mean(arr_3d, axis=(1,2))}') # mean of the particular row and column
print(f'Maximum of 3D_array: {np.max(arr_3d, axis=(0,1))}') # maximum of the particular row and column
print(f'Minimum of 3D_array: {np.min(arr_3d, axis=(0,1))}') # minimum of the particular row and column
print(f'standard Deviation of 3D_array: {np.std(arr_3d, axis=(1,2))}') # standard deviation of the particular row and column

# Challenge 1
arr_3d = np.arange(1,28).reshape(3,3,3) # create a 3d array (depth,rows,columns)
print(f'Created 3D Array Structure: \n{arr_3d}') #display the created 3D array.
#multi-axis operation
print(f'Sum of 3D_array: {np.sum(arr_3d, axis=(0,1))}') # sum of the particular row and column
print(f'Meam of 3D_array: {np.mean(arr_3d, axis=(1,2))}') # mean of the particular row and column
print(f'Maximum of 3D_array: {np.max(arr_3d, axis=(0,1))}') # maximum of the particular row and column
print(f'Minimum of 3D_array: {np.min(arr_3d, axis=(0,1))}') # minimum of the particular row and column
print(f'standard Deviation of 3D_array: {np.std(arr_3d, axis=(1,2))}') # standard deviation of the particular row and column

# #### Challenge 2: Implement z-score normalization instead of min-max.

z_scores = (arr_3d - np.mean(arr_3d)) / np.std(arr_3d) # instead of pearson correlation we can use Z_scores method
print(f'Z-score normalization:\n{z_scores}') # display the result

# #### Challenge 3: Detect and analyze seasonal patterns in quarterly data

quarter_std = regional_performance.std(axis=0) #find the sum of regional_wise
strong_quarter = quarter_std.argmax()
print(f"Strong season: Q{strong_quarter + 1}")
avg_by_quarter = regional_performance.mean(axis=0) # Year-over-year comparison potential
print("Average revenue by quarter:", avg_by_quarter)