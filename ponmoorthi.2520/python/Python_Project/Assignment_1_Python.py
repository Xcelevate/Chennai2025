# Generated from: Assignment_Python.ipynb
# Converted at: 2025-12-20T08:53:21.628Z
# Next step (optional): refactor into modules & generate tests with RunCell
# Quick start: pip install runcell

# ### ASSIGNMENT 1: CSV Reading & Writing
# 


# #### Q1.1: Load and Inspect
# #### Load the sales dataset and display its shape, column names, and first 5 row


import pandas as pd

df=pd.read_csv("assignment1_sales_data.csv")

df

df.shape

df.head()

df.columns.tolist()

# ### Q1.2: Regional Analysis


# #### Count the total number of products in each region and display the results


result=df.groupby('Region').size()
result

# ### Q1.3: Filter and Export High Sales


# #### Filter all products where TotalSales > 2000 and save to a new CSV file named high_sales_products.csv.


high_sales = df[df['TotalSales']> 2000]
high_sales.to_csv('high_sales_products.csv')
high_sales


high_sales

# ### 1.4: CSV Module Reading


# #### Read the CSV file using the csv module (standard library) and print all product names.
# Hint: Use csv.DictReader() and iterate through rows
# 


import csv

with open('assignment1_sales_data.csv', mode='r', newline='') as file:
    reader = csv.DictReader(file, delimiter=',')
    print("All the Product Names:")
    for row in reader:
        print(row['ProductName'])

# ### Q1.5: Find Best Performer


# #### Find the product with the highest TotalSales and display its complete details.
# Hint: Use .idxmax() and .loc[]


totalsales=df['TotalSales'].idxmax()

Highest_sales=df.loc[totalsales]
print("product with the highest TotalSale:")
print(Highest_sales)

# ### Q1.6: Category Filtering
# 


# #### Create a CSV file containing only Electronics products with their quarterly sales (Q1-Q4).
# Hint: Filter by Category == 'Electronics' and select relevant columns


filtered=df[df['Category']=='Electronics']

filtered

select=filtered[['Q1Sales','Q2Sales','Q3Sales','Q4Sales']]
select.to_csv('electronics_quarterly_sales.csv', index=False)


Electronics =pd.read_csv("electronics_quarterly_sales.csv")


Electronics

# ### Q1.7: Summary Statistics


# #### Calculate the average UnitPrice per region and write results to avg_price_by_region.csv.
# Hint: Use .groupby() and .mean()


unit=df.groupby('Region').agg({'UnitPrice':'mean'})

unit

average=unit.to_csv("avg_price_by_region.csv")

# ### Q1.8: Data Quality Check


# #### Identify missing values in the dataset (if any) and handle them appropriately.
# Hint: Use .isnull().sum() and .fillna()


missing=df.isnull().sum()
missing

df=df.fillna(df.mean(numeric_only=True))

df.isnull().sum()

# ### Q1.9: Sorting and Export
# #### Sort the dataset by TotalSales in descending order and save as sorted_sales.csv.


sort = df.sort_values(by ='TotalSales', ascending = False)
sort_to_csv = sort.to_csv('sorted_sales.csv', index = False)
sort.head()

# ### Q1.10: Data Merging
# #### Merge this dataset with a region-level summary and export as merged_analysis.csv.
# 


filtered=df.groupby('Region').agg({'UnitPrice':'mean','TotalSales':'sum'})
filtered.rename(columns ={'TotalSales':'RegionTotalSales','UnitPrice':'RegionAveragePrice'})
merged = df.merge(filtered, left_on='Region', right_index=True, how='left')

merged

# ## Challenge Extension
# #### Challenge 1: Create a report showing top 5 products per region and export as a single CSV


top_product=df.groupby('Region')
sort=top_product.sort_values(by='TotalSales',ascending=False)
Top_5_product=sort.head()
values=Top_5_product.to_csv("single CSV")

# #### Challenge 2: Calculate quarterly growth rate for each product and identify fastest-growing products.
# 


df['G1'] = (df['Q2Sales'] - df['Q1Sales']) / df['Q1Sales'] * 100   
df['G2'] = (df['Q3Sales'] - df['Q2Sales']) / df['Q2Sales'] * 100   
df['G3'] = (df['Q4Sales'] - df['Q3Sales']) / df['Q3Sales'] * 100

df['Avg_growth']=df[['G1','G2','G3']].mean(axis=1)

fastest = df.loc[df['Avg_growth'].idxmax(), ['ProductID','ProductName','Avg_growth']]
print(fastest)

# #### Challenge 3: Detect and handle duplicate rows intelligently


duplicate=df.duplicated()
duplicate