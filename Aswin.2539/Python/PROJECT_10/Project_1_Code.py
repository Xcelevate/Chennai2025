# ### ASSIGNMENT 1: CSV Reading & Writing

# #### Dataset: assignment1_sales_data.csv

# ### Q1.1: Load and Inspect

# #### Load the sales dataset and display its shape, column names, and first 5 rows.

import pandas as pd

df = pd.read_csv('assignment1_sales_data.csv')
print(f'Shape of DataFrame:{df.shape}')
print(f'Colmns of DataFrame:\n{df.columns.tolist()}')
print("First 5 Records:")
df.head()

# ### Q1.2: Regional Analysis

# #### Count the total number of products in each region and display the results.

number_of_products = df.groupby('Region')['ProductName'].size()
print(f'Number of Product Each Region:\n{number_of_products}')

# ### Q1.3: Filter and Export High Sales

# #### Filter all products where TotalSales > 2000 and save to a new CSV file named high_sales_products.csv.

filter_products = df[df['TotalSales'] > 2000]
filter_products_to_csv = filter_products.to_csv('high_sales_products.csv', index= False)
print(f'Filtered {len(filter_products)} high-sales products')

# ### Q1.4: CSV Module Reading

# #### Read the CSV file using the csv module (standard library) and print all product names


import csv
with open('assignment1_sales_data.csv', mode='r', newline='') as file:
    reader = csv.DictReader(file, delimiter=',')
    print("All the Product Names:")
    for row in reader:
        print(row['ProductName'])
        

# ### Q1.5: Find Best Performer

# #### Find the product with the highest TotalSales and display its complete details.

highest_total_sales = df.loc[df['TotalSales'].idxmax()]
print(f'Complete details of Highest Sales Products: \n{highest_total_sales}')

# ### Q1.6: Category Filtering

# #### Create a CSV file containing only Electronics products with their quarterly sales (Q1-Q4).

electronics = df[df['Category'] == 'Electronics']
electronics_product_columns = ['ProductName','Category','Q1Sales','Q2Sales','Q3Sales','Q4Sales']
filtered_data = electronics[electronics_product_columns]
filtered_data_csv = filtered_data.to_csv('electronics_quarterly.csv', index=False)
print(f'Exported {len(filtered_data)} Electronics products with sales')

# ### Q1.7: Summary Statistics

# #### Calculate the average UnitPrice per region and write results to avg_price_by_region.csv


avg_price = df.groupby('Region')['UnitPrice'].mean().reset_index()
avg_price.rename(columns={'UnitPrice': 'AveragePrice'}, inplace=True)
avg_price_to_csv = avg_price.to_csv('avg_price_by_region.csv', index = False)
print("Exported the Average UnitPrice Per Region")

# ### Q1.8: Data Quality Check

# #### Identify missing values in the dataset (if any) and handle them appropriately.

missing_values = df.isnull().sum()
missing_values
df = df.fillna(df.mean(numeric_only=True))
print(df.isnull().sum())

# ### Q1.9: Sorting and Export

# #### Sort the dataset by TotalSales in descending order and save as sorted_sales.csv.

sorting = df.sort_values(by ='TotalSales', ascending = False)
sorting_to_csv = sorting.to_csv('sorted_sales.csv', index = False)
print("Exported the Total Sales in Descending Order")
sorted_csv = sorting.to_csv('sorted_sales.csv', index = False)
print("Exported the sorted_sales.csv file")
print("First five records in Descending Order")
sorting.head()

# ### 1Q1.10: Data Merging

# #### Merge this dataset with a region-level summary and export as merged_analysis.csv.

summary_df= df.groupby('Region').agg({'TotalSales':'sum','UnitPrice':'mean'})
summary_df.rename(columns ={'TotalSales':'RegionTotalSales','UnitPrice':'RegionAveragePrice'})
merged = df.merge(summary_df, left_on='Region', right_index=True, how='left')
merged.to_csv('merged_analysis.csv', index=False)
print("Meged Csv Exported")
merged.head()

# ### Challenge Extension

# #### Challenge 1: Create a report showing top 5 products per region and export as a single CSV

top_5_products = (
    df.groupby('Region', group_keys=False)
      .apply(lambda x: x.nlargest(5, 'TotalSales'))
      .reset_index(drop=True)
)
top_5_products.nlargest(5,'TotalSales')

#### Challenge 2: Calculate quarterly growth rate for each product and identify fastest-growing products.

df['G1'] = (df['Q2Sales'] - df['Q1Sales'])/df['Q1Sales']*100  
df['G2'] = (df['Q3Sales'] - df['Q2Sales'])/df['Q2Sales']*100   
df['G3'] = (df['Q4Sales'] - df['Q3Sales'])/df['Q3Sales']*100
df['AvgGrowth'] = df[['G1','G2','G3']].mean(axis=1)
fastest_grow_product = df.loc[df['AvgGrowth'].idxmax(), ['ProductID','ProductName','AvgGrowth']]
print(f'Fastest_growing_product:\n{fastest_grow_product }')

# #### Challenge 3: Detect and handle duplicate rows intelligently.

duplicates = df[df.duplicated()]
print(f'No of duplicates: {duplicates}')
df_drop_duplicated= df.drop_duplicates(subset=['ProductName', 'Region'], keep='first')
df_drop_duplicated