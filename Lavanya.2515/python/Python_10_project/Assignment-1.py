# Generated from: Assignment 1.ipynb
# Converted at: 2025-12-20T08:40:12.483Z
# Next step (optional): refactor into modules & generate tests with RunCell
# Quick start: pip install runcell

# # ASSIGNMENT 1: CSV Reading & Writing


# ## Questions


# ### Q1.1: Load and Inspect


# #### Load the sales dataset and display its shape, column names, and first 5 rows.


import pandas as pd                                 # Load the sales dataset
df=pd.read_csv('assignment1_sales_data.csv')

df.shape   #display its shape  

df

df.columns.tolist()  #  column names

df.head()   # first 5 rows

# ### Q1.2: Regional Analysis


# #### Count the total number of products in each region and display the results.


df1=df.groupby('Region').size()
df1

# ### Q1.3: Filter and Export High Sales


# #### Filter all products where TotalSales > 2000 and save to a new CSV file named high_sales_products.csv.


high_sales=df[df['TotalSales']>2000]
high_sales

high_sales.to_csv('high_sales_products.csv',index=False)
df=high_sales

# ### Q1.4: CSV Module Reading


# #### Read the CSV file using the csv module (standard library) and print all product names.


import csv
with open('assignment1_sales_data.csv', 'r') as f:
    reader = csv.DictReader(f)
    print("All Product Names:")
    for row in reader:
        print(f"  - {row['ProductName']}")

# ### Q1.5: Find Best Performer


# #### Find the product with the highest TotalSales and display its complete details.


best_performer=df.loc[df['TotalSales'].idxmax()]
best_performer

# ### Q1.6: Category Filtering


# ### Create a CSV file containing only Electronics products with their quarterly sales (Q1-Q4).


electronic=df[df['Category']=='Electronics'][['ProductName', 'Category', 'Region','Q1Sales','Q2Sales','Q3Sales','Q4Sales']]
electronic.to_csv('electronics_quarterly.csv', index=False)

# ### Q1.7: Summary Statistics


# #### Calculate the average UnitPrice per region and write results to avg_price_by_region.csv.


average_unitPrice=df.groupby('Region')['UnitPrice'].mean()
average_unitPrice.to_csv('avg_price_by_region.csv',index=False)

# ### Q1.8: Data Quality Check


# ### Identify missing values in the dataset (if any) and handle them appropriately.


df.isnull().sum()

# ### Q1.9: Sorting and Export


# #### Sort the dataset by TotalSales in descending order and save as sorted_sales.csv.


sort=df.sort_values('TotalSales',ascending=False)
sort.to_csv('sorted_sales.csv',index=False)

# ### Q1.10: Data Merging


# #### Merge this dataset with a region-level summary and export as merged_analysis.csv.


region_level = df.groupby('Region').agg({'TotalSales': 'sum','UnitPrice': 'mean'})
region_level.rename(columns={'TotalSales': 'RegionTotalSales','UnitPrice': 'RegionAvgPrice'})

merged_dataset = df.merge(region_level, on='Region', how='left')
merged_dataset.to_csv('merged_analysis.csv', index=False)
merged_dataset.head()

# # Challenge Extension


# ### Challenge 1: Create a report showing top 5 products per region and export as a single CSV.


top_5=df.sort_values(['Region', 'TotalSales'], ascending=[True, False]).groupby('Region').head(5)

top_5.to_csv('single.csv',index=False)

# ### Challenge 2: Calculate quarterly growth rate for each product and identify fastest-growing products.


df['first'] = (df['Q2Sales'] - df['Q1Sales']) / df['Q1Sales'] * 100   
df['second'] = (df['Q3Sales'] - df['Q2Sales']) / df['Q2Sales'] * 100   
df['third'] = (df['Q4Sales'] - df['Q3Sales']) / df['Q3Sales'] * 100



# ### Challenge 3: Detect and handle duplicate rows intelligently


duplicate=df.duplicated()
duplicate