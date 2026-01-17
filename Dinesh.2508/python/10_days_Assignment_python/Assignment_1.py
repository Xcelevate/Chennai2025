import numpy as np 
import pandas as pd 
import matplotlib.pyplot as py 
import seaborn as sns 

## Overview


#### This assignment focuses on reading CSV files, filtering data, and writing cleaned data back to CSV format using Pandas and the csv module.


### Q1.1: Load and Inspect
#### Load the sales dataset and display its shape, column names, and first 5 rows.
df = pd.read_csv('assignment1_sales_data.csv')
print ('Shape:', df.shape)
print ('Columns:',df.columns.tolist())
print (df.head(5))


## Q1.2: Regional Analysis
# ### Count the total number of products in each region and display the results.
product_in_region = df.groupby('Region').size()
print ('Products per Region')
print(product_in_region)

## Q1.3: Filter and Export High Sales
#### Filter all products where TotalSales > 2000 and save to a new CSV file named high_sales_products.cs
high_sales = df[df['TotalSales'] > 2000]
high_sales.to_csv('high_sales_prodeucts.csv', index = False)

## Q1.4: CSV Module Reading
#### Read the CSV file using the csv module (standard library) and print all product names.
import csv

with open('assignment1_sales_data.csv',
          mode ='r', newline = '')as file:
    reader = csv.DictReader(file)
    for row in reader:
        print(row['ProductName'])

## Q1.5: Find Best Performer
#### Find the product with the highest TotalSales and display its complete details
best_index = df['TotalSales'].idxmax()
best_product = df.loc[best_index]
print(best_product)

## Q1.6: Category Filtering
##### Create a CSV file containing only Electronics products with their quarterly sales (Q1-Q4
electronics = df[df['Category'] == 'Electronics']
electronics_qtr = electronics[['Q1Sales','Q2Sales','Q3Sales','Q4Sales']]
electronics_qtr.to_csv('electronics_quarterly_sales.csv',index = False )

## Q1.7: Summary Statistics
#### Calculate the average UnitPrice per region and write results to avg_price_by_region.csv.
avg_price_by_region = df.groupby('Region')['UnitPrice'].mean()
avg_price_by_region = avg_price_by_region.reset_index()
avg_price_by_region.to_csv('avg_price_by_region.csv',index = False)

## Q1.8: Data Quality Check


#### Identify missing values in the dataset (if any) and handle them appropriately.
print("Missing values:")
print(df.isnull().sum())
df_cleaned = df.fillna(0)
print("After filling:")
print(df_cleaned.isnull().sum())

## Q1.9: Sorting and Export - Simple Solution
#### Sort the dataset by TotalSales in descending order and save as sorted_sales.csv.
sorted_df = df.sort_values('TotalSales', ascending = False)
sorted_df.to_csv('sorted_sales.csv',index = False)

## Q1.10: Data Merging
#### Merge this dataset with a region-level summary and export as merged_analysis.csv.
df.groupby('Region')['TotalSales'].sum().reset_index()
region_sum.columns = ['Region', 'RegionTotal']
merged = df.merge(region_sum, on='Region')
merged.to_csv('merged_analysis.csv', index=False)

print("Merged file saved!")
print(merged.head())

## Challenge Extension


##### Challenge 1: Create a report showing top 5 products per region and export as a single CSV.
top5 = merged.nlargest(5, 'TotalSales')
top5.to_csv('top5_per_region.csv', index=False)
print("Top 5 products:")
print(top5[['ProductName', 'Region', 'TotalSales']])

#### Challenge 2: Calculate quarterly growth rate for each product and identify fastest-growing products.




#### Challenge 3: Detect and handle duplicate rows intelligently.
