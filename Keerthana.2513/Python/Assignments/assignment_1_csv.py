# Generated from: assignment_1_csv.ipynb
# Converted at: 2025-12-20T11:26:44.240Z
# Next step (optional): refactor into modules & generate tests with RunCell
# Quick start: pip install runcell

# ##  Reading and Writing CSV Files


# ### Questions
# ### Q1.1: Load and Inspect
# ### Load the sales dataset and display its shape, column names, and first 5 rows.


import pandas as pd
df=pd.read_csv('assignment1_sales_data.csv')

df

print(df.shape)

print(df.columns)

df.head(5)

# ### Q1.2: Regional Analysis


df.groupby('Region')['ProductID'].size()

# ### Q1.3: Filter and Export High Sales


new_df=df[df['TotalSales']>2000]

new_df.to_csv('high_sales_products.csv')

new_df

# ### Q1.4: CSV Module Reading


import csv

with open('assignment1_sales_data.csv', 'r') as f:
    reader = csv.DictReader(f)
    for row in reader:
        print(f"  - {row['ProductName']}")


# ### Q1.5: Find Best Performer


best_pf=df.loc[df['TotalSales'].idxmax()]

# ### Q1.6: Category Filtering


new_csv=df[df['Category']=='Electronics']

new_csv=new_csv[['Category','Q1Sales','Q2Sales','Q3Sales','Q4Sales']]

new_csv

new_csv.to_csv('Categorize filtered.csv')

# ### Q1.7: Summary Statistics


avg_price=df.groupby('Region')['UnitPrice'].mean()

avg_price

avg_price.to_csv('avg_price_by_region.csv')

# ### Q1.8: Data Quality Check


df.isnull().sum()

# ### Q1.9: Sorting and Export


sorted_sales=df.sort_values('TotalSales',ascending=False)

sorted_sales.to_csv('sorted_sales.csv')

# ### Q1.10: Data Merging


reg_level=df.groupby('Region').agg({'TotalSales':'sum','UnitPrice':'mean'}) 

reg_level.rename(columns={'TotalSales':'RegionBasedTotalSales','UnitPrice':'RegionBasedAverageAmount'})

merged_df=df.merge(reg_level,on='Region',how='left')

merged_df.to_csv('merged_analysis.csv',index=False)

merged_df.head()

# ### Challenge 1:Create a report showing top 5 products per region and export as a single CSV.


sorted_values=df.sort_values(['Region', 'TotalSales'], ascending=[True, False]).groupby('Region').head(5)

sorted_values

sorted_values.to_csv('top5 result.csv')

# ### Challenge 2: Calculate quarterly growth rate for each product and identify fastest-growing products


df['first'] = (df['Q2Sales'] - df['Q1Sales']) / df['Q1Sales'] * 100   
df['second'] = (df['Q3Sales'] - df['Q2Sales']) / df['Q2Sales'] * 100   
df['third'] = (df['Q4Sales'] - df['Q3Sales']) / df['Q3Sales'] * 100

df['Average']=df[['first','second','third']].mean(axis=1)
 

fast_product= df.loc[df['Average'].idxmax(), ['ProductID','ProductName','Average']]

 

fast_product

# ### 3.Challenge 3: Detect and handle duplicate rows intelligently.


duplicate=df.duplicated()
duplicate.drop_duplicates()