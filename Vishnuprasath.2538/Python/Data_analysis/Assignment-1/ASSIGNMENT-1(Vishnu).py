# ## ASSIGNMENT 1: CSV Reading & Writing


# ### Q1.1: Load and Inspect


import pandas as pd
import numpy as np

# #### Load the sales dataset and display its shape, column names, and first 5 rows.


Assignment1 = pd.read_csv('assignment1_sales_data.csv')
Assignment1

Assignment1.isnull()

df = pd.DataFrame(Assignment1)
df

df.shape

df.columns.tolist()

df.head(10)

# ### Q1.2: Regional Analysis


# #### Count the total number of products in each region and display the results.


Total = df.groupby('Region')['ProductID'].count()
Total

Total_product = df.groupby('Region').size() # counts the products
Total_product

# ### Q1.3: Filter and Export High Sales


# #### Filter all products where TotalSales > 2000 and save to a new CSV file named high_sales_products.csv.


high_sales = df[df['TotalSales'] > 2000]
high_sales.to_csv('high_sales_products.csv' , index = 'False')

# ### Q1.4: CSV Module Reading


# #### Read the CSV file using the csv module (standard library) and print all product names.


import csv

with open('assignment1_sales_data.csv', 'r') as f:
    reader = csv.DictReader(f)
    print("All Product Nmaes: ")
    for row in reader:
        print(" --", row["ProductName"])

# ### Q1.5: Find Best Performer


# #### Find the product with the highest TotalSales and display its complete details.


Best_sales = df['TotalSales'].idxmax()
Best_sales
df.loc[Best_sales]

# ### Q1.6: Category Filtering


# #### Create a CSV file containing only Electronics products with their quarterly sales (Q1-Q4).


Electronics = df[df['Category']== 'Electronics']

Electronics

Electronics_col = ['ProductName', 'Category', 'Region', 'Q1Sales', 'Q2Sales', 'Q3Sales', 'Q4Sales']

Electronics_col

Electronics[Electronics_col].to_csv('Electronics.csv', index=False)

# ### Q1.7: Summary Statistics


# #### Calculate the average UnitPrice per region and write results to avg_price_by_region.csv.


Average_unit = df.groupby('Region')['UnitPrice'].mean()
Average_unit

Average_unit.to_csv('avg_price_by_region.csv', index=False)

# ### Q1.8: Data Quality Check


# #### Identify missing values in the dataset (if any) and handle them appropriately.


data_null = df.isnull().sum()

data_null

# ### Q1.9: Sorting and Export


# #### Sort the dataset by TotalSales in descending order and save as sorted_sales.csv.


Sorted = df.sort_values('TotalSales', ascending= False)
Sorted

Sorted.to_csv('sorted_sales.csv', index = False)

# ### Q1.10: Data Merging


# #### Merge this dataset with a region-level summary and export as merged_analysis.csv.


Region_summary = df.groupby('Region').agg({'TotalSales':'sum', 'UnitPrice':'mean'})
Region_summary

Region_level_summary = Region_summary.rename(columns={'TotalSales':'RegionTotalSales', 'UnitPrice':'RegionUnitPrice'})
Region_summary

merged = df.merge(Region_summary, left_on = 'Region', right_index= True, how = 'left')
merged

merged.to_csv('merged_analysis.csv', index = False)

# ### Challenge Extension
# #### Challenge 1: Create a report showing top 5 products per region and export as a single CSV.


products = (df.sort_values(['Region','TotalSales'], ascending=[True, False]))

products

Top_5 = products.groupby('Region').head()

Top_5

Top_5.to_csv('Top_5_Products_Regional.csv', index= False)

# #### Challenge 2: Calculate quarterly growth rate for each product and identify fastest-growing products.


df['Q2_growth'] = (df['Q2Sales']-df['Q1Sales'])/df['Q2Sales']

df['Q2_growth']

df['Q3_growth'] = (df['Q3Sales']-df['Q2Sales'])/df['Q3Sales']

df['Q4_growth'] = (df['Q4Sales']-df['Q3Sales'])/df['Q4Sales']

df['avg_growth'] = df[['Q4_growth', 'Q4_growth', 'Q4_growth']].mean(axis=1)

df['avg_growth']

fastest = df.sort_values('avg_growth', ascending = False)

fastest

fastest.head()

# #### Challenge 3: Detect and handle duplicate rows intelligently.


df.duplicated()

df.duplicated().sum()

df[df.duplicated()]