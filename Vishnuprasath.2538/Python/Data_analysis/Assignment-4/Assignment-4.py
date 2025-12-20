# ## ASSIGNMENT 4: Data Summarization & Grouping


# ### Q4.1: Basic GroupBy
# #### Group sales data by Region and calculate total revenue per region.


import pandas as pd
import numpy as np

df = pd.read_csv('assignment4_sales_transactions(in).csv')
df

Total_revenue = df.groupby('Region')['Revenue'].sum()
Total_revenue

# ### Q4.2: Multi-column GroupBy
# #### Group by both Region and Category, showing transaction count and total revenue for each combination.


category_region = df.groupby(['Region', 'Category']).agg({'TransactionID' : 'count', 'Revenue' : 'sum'}).rename(columns={'TransactionID':'transaction_count'}).reset_index()
category_region

# ### Q4.3: Average Quantity Analysis
# #### Calculate the average quantity sold per region and sort in descending order.


avg_quantity = round(df.groupby('Region')['Quantity'].mean().sort_values(ascending = False),2)
avg_quantity

# ### Q4.4: Pivot Table Creation
# #### Create a pivot table with Region as rows, Category as columns, and sum of Revenue as values.


pivot = pd.pivot_table(df, values = 'Revenue', index = 'Region', columns ='Category', aggfunc = 'sum').reset_index()
pivot

# ### Q4.5: Calculated Columns
# #### Add a calculated column 'RevenuePerUnit' (Revenue / Quantity) for each transaction.


df['RevenuePerUnit'] = df['Revenue']/df['Quantity']

df

# ### Q4.6: Top Products
# #### Find the top 3 products by total revenue and display their sales details.


Top_3_products = df.groupby('ProductName')['Revenue'].sum().nlargest(3)
Top_3_products

# ### Q4.7: Customer Type Analysis
# #### Group by CustomerType and calculate total revenue, transaction count, and average order value


summary = df.groupby('CustomerType').agg({'Revenue':['sum', 'count', 'mean']}).reset_index()
summary

# ### Q4.8: Composite Analysis
# #### Identify which region-category combination has the highest average revenue per transaction.


high = round(df.groupby(["Region",'Category'])['Revenue'].mean(),2)
high

highest = high.idxmax()
highest

high.loc[highest]

# ### Q4.9: Summary Report Export
# #### Create a summary CSV showing region-wise performance metrics.


summary_metrics = round(df.groupby('Region').agg({'Revenue':['sum','mean','count'], 'Quantity':['sum','mean'], 'TransactionID': 'count'}),2).reset_index()
summary_metrics

summary_metrics.to_csv("Summary.csv", index= False)

# ### Q4.10: Quarterly Summary
# #### Generate a quarterly revenue summary grouped by region (requires Date extraction).


df['Date'] = pd.to_datetime(df['Date'])

df['Quater']= df['Date'].dt.quarter

Quaterly_summary = df.groupby(['Region', 'Quater'])['Revenue'].sum()
Quaterly_summary

Quaterly_summary = Quaterly_summary.unstack()

Quaterly_summary

# ### Challenge Extension
# #### Challenge 1: Create a rolling 7-day revenue analysis.


df['Date'] = pd.to_datetime(df['Date'])

df = df.sort_values('Date')

df['7_day_revenue'] = df['Revenue'].rolling(window=7).mean()

df

# ### Challenge 2: Calculate month-over-month growth rates by region.


df['Date'] = pd.to_datetime(df['Date'])

df['Month'] = df['Date'].dt.to_period('M')

df['Month'] = df['Date'].dt.to_period('M')

monthly = df.groupby(['Region', 'Month'])['Revenue'].sum().reset_index()

monthly['MoM_Growth'] = monthly.groupby('Region')['Revenue'].pct_change() * 100

df

# ### Challenge 3: Generate a comprehensive business intelligence report with multiple views.


total_revenue   = df['Revenue'].sum()
avg_revenue     = df['Revenue'].mean()
num_products    = df['ProductName'].nunique()
num_categories  = df['Category'].nunique()
num_regions     = df['Region'].nunique()

print("Total Revenue        :", total_revenue)
print("Average Revenue      :", avg_revenue)
print("Unique Products      :", num_products)
print("Unique Categories    :", num_categories)
print("Regions Covered      :", num_regions)