# ## ASSIGNMENT 4: Data Summarization & Grouping

# ### Dataset: assignment4_sales_transactions.csv

# ### Q4.1: Basic GroupBy

# #### Group sales data by Region and calculate total revenue per region.

import pandas as pd # importing the pandas module
df = pd.read_csv('assignment4_sales_transactions(in).csv') # load the csv file
df # display the result
regional_sales = df.groupby('Region')['Revenue'].sum().sort_values(ascending = False) # calculate the total revenue per region
print('='*32)
print("Totatl Revenue Per Region:")
print('='*32)
regional_sales # display the result

# ### Q4.2: Multi-column GroupBy

# #### Group by both Region and Category, showing transaction count and total revenue for each combination.

transcation_count = df.groupby(['Region','Category']).agg({'TransactionID':'count','Revenue':'sum'}).rename(columns={'TransactionID':'TranscationCount','Revenue':'TotalRevenue'}) # calculate the multi-grouping with revenue sum avergae and count
print('='*52)
print("Transcation By Revenue:")
print('='*52)
print(transcation_count)

# ### Q4.3: Average Quantity Analysis

# #### Calculate the average quantity sold per region and sort in descending order

avg_sold = df.groupby('Region')['Quantity'].mean().sort_values(ascending = False) # calculate the average quantity sold per region
print('='*30)
print("Average Quantity Per Region:")
print('='*30)
print(avg_sold) # display the result 

# ### Q4.4: Pivot Table Creation

# #### Create a pivot table with Region as rows, Category as columns, and sum of Revenue as values.

pivot_table = pd.pivot_table(df,values ='Revenue',
                             index = 'Region',
                             columns = 'Category',
                             aggfunc = 'sum'
                            ) # created the pivot table with use of dataframe
print('='*47)
print("Category wise Regional salas:")
print('='*47)
print(pivot_table) # display the result 

# ### Q4.5: Calculated Columns

# #### Add a calculated column 'RevenuePerUnit' (Revenue / Quantity) for each transaction

df['RevenuePerUnit'] = df['Revenue'] / df['Quantity'] # calculate the revenue and quantity column to create a new column RevenuePerUnit
print('='*50)
print("Revenue for Each Quantity:")
print('='*50)
print(df[['Revenue','ProductName','Quantity','RevenuePerUnit']]) # display the result 

# ### Q4.6: Top Products

# #### Find the top 3 products by total revenue and display their sales details.

top_3 = df.groupby('ProductName')['Revenue'].sum().nlargest(3) #  calculate top 3 saled products
print('='*20)
print("Top 3 sales Products:")
print('='*20)
print(top_3) # display the result 

# ### Q4.7: Customer Type Analysis

# #### Group by CustomerType and calculate total revenue, transaction count, and average order value

customer_type = df.groupby('CustomerType').agg({'Revenue':['sum','mean'],'TransactionID':'count'}).round(2)
customer_type.rename(columns={'sum':'TotalRevenue','mean':'AverageValue','count':'TransactionCount'})
print('='*50)
print("Customer Revenue Average TransactionCount:")
print('='*50)
print(customer_type) # display the result 

# ### Q4.8: Composite Analysis

# #### Identify which region-category combination has the highest average revenue per transaction

highest_average = df.groupby(['Region','Category'])['Revenue'].mean().idxmax() # calculate the region and category combination which product is highest
print('='*35)
print("Highest Average Per Transaction:")
print('='*35)
print(highest_average) # display the result

# ### Q4.9: Summary Report Export

# #### Create a summary CSV showing region-wise performance metrics

summary_metrics = df.groupby('Region').agg({'Revenue': ['sum', 'mean', 'count'],'Quantity': ['sum', 'mean'],'TransactionID': 'count'
}) # Calculate the Region wise Total sum avg and count
print('='*65)
print("Highest Average Per Transaction:")
print('='*65)
print(summary_metrics.round(2)) # display the result with round 2

# ### Q4.10: Quarterly Summary

# #### Generate a quarterly revenue summary grouped by region (requires Date extraction).

# Q4.10: Quarterly Summary
df['Date'] = pd.to_datetime(df['Date']) # date extraction
df['Quarter'] = 'Q' + df['Date'].dt.quarter.astype(str) # quarter seperation
quarterly_revenue = df.groupby(['Region','Quarter']).agg({'Revenue':['sum','mean','count']}).rename(columns={'sum':'TotalRevenue','mean':'AverageRevenue','count':'TotalCount'}).round(2)
print('='*115)
print("Quarterly Revenue Summary:")
print('='*115)
print(quarterly_revenue.unstack().to_string()) # display the result with round 2
quarterly_revenue_to_csv = quarterly_revenue.to_csv('quarterly_revenue_report.csv') # convert the quarterly_revenue into csv
print("Quarterly_report csv extracted")

# ## Challenge Extension

# #### Challenge 1: Create a rolling 7-day revenue analysis.

df['Date'] = pd.to_datetime(df['Date']) # convert date into date time
df = df.sort_values(by='Date').reset_index(drop=True) # sort the date
daily_revenue = df.groupby('Date').agg({'Revenue':['sum','count','mean']}).reset_index() # get the daily revenue aggregration
daily_revenue.columns = ['Date','DailyRevenue','TransactionCount','AvgTransactionValue'] # columns of the daily revenue
daily_revenue['Rolling_7Day_Sum'] = daily_revenue['DailyRevenue'].rolling(window = 7, min_periods = 1).sum() # calculate 7Day rolling sum
daily_revenue['Rolling_7Day_Mean'] = daily_revenue['DailyRevenue'].rolling(window = 7, min_periods = 1).mean() # calculate 7Day rolling mean
daily_revenue['Rolling_7Day_Std'] = daily_revenue['DailyRevenue'].rolling(window=7, min_periods=1).std() # calculate 7Day rolling standard deviation
daily_revenue['DayOverDay_Growth'] = daily_revenue['DailyRevenue'].pct_change() * 100 # calculate the dayoverday growth
print(daily_revenue) # display the result
df = df.drop(columns=['Rolling_7Day_Sum', 'Rolling_7Day_Mean'], errors='ignore')
df = df.merge(daily_revenue[['Date', 'Rolling_7Day_Sum', 'Rolling_7Day_Mean']], on='Date',how='left').round(2) # merge back to original dataframe
df.head(10) # display first 10 records

# #### Challenge 2: Calculate month-over-month growth rates by region

df['Date'] = pd.to_datetime(df['Date']) # date extraction
df['YearMonth'] = df['Date'].dt.to_period('M') # year month extraction
monthly = df.groupby(['YearMonth', 'Region'])['Revenue'].sum().reset_index()
monthly['Previous_Revenue'] = monthly.groupby('Region')['Revenue'].shift(1)
monthly['MoM_Growth_%'] = ((monthly['Revenue'] - monthly['Previous_Revenue']) / monthly['Previous_Revenue'] * 100).round(2)
print("="*60)
print("Month ove month growth")
print("="*60)
print(monthly.to_string())

# #### Challenge 3: Generate a comprehensive business intelligence report with multiple

# DATA PREPARATION
df['Date'] = pd.to_datetime(df['Date'])
df['YearMonth'] = df['Date'].dt.to_period('M')
df['Quarter'] = 'Q' + df['Date'].dt.quarter.astype(str)
df['RevenuePerUnit'] = df['Revenue'] / df['Quantity']

# 1. EXECUTIVE SUMMARY
print("="*30)
print("Executive Summary")
print("="*30)
print(f"Total Revenue: {df['Revenue'].sum():,.2f}")
print(f"Total Transactions: {len(df)}")
print(f"Avg Transaction Value: {df['Revenue'].mean():,.2f}")
print(f"Total Units Sold: {df['Quantity'].sum()}")
print(f"Regions: {df['Region'].value_counts()}")

# 2. REVENUE BY REGION
print("="*58)
print("Revenue by Region")
print("="*58)
revenue_by_region = df.groupby('Region').agg({'Revenue': ['sum', 'mean', 'count'],'Quantity': 'sum'}).round(2)
revenue_by_region.columns = ['Total_Revenue', 'Avg_Value', 'Transactions', 'Units']
revenue_by_region = revenue_by_region.sort_values('Total_Revenue', ascending=False)
print(revenue_by_region)

# 3. QUARTERLY REVENUE
print("="*30)
print("Quarterly Revenue")
print("="*30)
quarterly = df.groupby(['Quarter', 'Region'])['Revenue'].sum().reset_index()
print(quarterly)

# 4. MONTH-OVER-MONTH GROWTH
print("="*60)
print("Month ove month growth")
print("="*60)
monthly = df.groupby(['YearMonth', 'Region'])['Revenue'].sum().reset_index()
monthly['Previous_Revenue'] = monthly.groupby('Region')['Revenue'].shift(1)
monthly['MoM_Growth_%'] = ((monthly['Revenue'] - monthly['Previous_Revenue']) / monthly['Previous_Revenue'] * 100).round(2)
print(monthly.to_string())

# 5. ROLLING 7-DAY REVENUE
print("="*40)
print("ROLLING 7-DAY REVENUE (Last 10 Days)")
print("="*40)
daily = df.sort_values('Date').groupby('Date')['Revenue'].sum().reset_index()
daily['Rolling_7Day'] = daily['Revenue'].rolling(window=7, min_periods=1).sum()
print(daily.tail(10))

# 6. PRODUCT PERFORMANCE
print("="*60)
print("Top 5 products by Revenue")
print("="*60)
products = df.groupby('ProductName').agg({'Revenue': ['sum', 'count', 'mean'],'Quantity': 'sum'}).round(2)
products.columns = ['Total_Revenue', 'Transactions', 'Avg_Value', 'Units_Sold']
products = products.sort_values('Total_Revenue', ascending=False).head(5)
print(products)

# # Thank You