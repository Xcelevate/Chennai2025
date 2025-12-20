import pandas as pd 

import numpy as np

## Q4.1: Basic GroupBy
#### Group sales data by Region and calculate total revenue per region.
df = pd.read_csv('assignment4_sales_transactions.csv')
df.groupby('Region')['Revenue'].sum()
df

## Q4.2: Multi-column GroupBy
#### Group by both Region and Category, showing transaction count and total revenue for each combination.
df.groupby(['Region','Category']).agg({'TransactionID': 'count','Revenue': 'sum'})

## Q4.3: Average Quantity Analysis
#### Calculate the average quantity sold per region and sort in descending order
avg_quantity = df.groupby('Region')['Quantity'].mean().sort_values(ascending = False)
print (avg_quantity)

## Q4.4: Pivot Table Creation
#### Create a pivot table with Region as rows, Category as columns, and sum of Revenue as values.`
pivot_table = pd.pivot_table(df,values = 'Revenue',
                            index = 'Region',
                            columns = 'Category',
                            aggfunc = 'sum',
                            fill_value = 0
)
print (pivot_table)

## Q4.5: Calculated Columns
#### Add a calculated column 'RevenuePerUnit' (Revenue / Quantity) for each transaction.
df['RevenuePerUnit'] = df['Revenue']/ df['Quantity']
df.head(5)

## Q4.6: Top Products
#### Find the top 3 products by total revenue and display their sales details.
top_3_products = df.groupby('ProductName')['Revenue'].sum().sort_values(ascending = False)
top_3_products.head(3)

## Q4.7: Customer Type Analysis
#### Group by CustomerType and calculate total revenue, transaction count, and average order value
customer_analysis = df.groupby('CustomerType').agg(Total_revenue = ('Revenue','sum'),
                                                  Transaction_count = ('TransactionID','count'),
                                                  Avg_order_values = ('Revenue','mean'))
print(customer_analysis)

## Q4.8: Composite Analysis
#### Identify which region-category combination has the highest average revenue per transaction.
avg_rev = df.groupby(['Region', 'Category'])['Revenue'].mean()
best_idx = avg_rev.idxmax()
best_value = avg_rev.max()
print(f'Best combo: {best_idx}, AvgRevenue: {best_value:.2f}')


## Q4.9: Summary Report Export 
#### Create a summary CSV showing region-wise performance metrics.
region_metrics = (
    df.groupby('Region')
      .agg(TotalRevenue=('Revenue', 'sum'),
          AvgRevenue=('Revenue', 'mean'),
          TransactionCount=('TransactionID', 'count'),
          TotalQuantity=('Quantity', 'sum'),
          AvgQuantity=('Quantity', 'mean')
      ).round(2).reset_index()
)


region_metrics.to_csv('Region_summary_report.csv', index=False)

print('Region summary report exported')
print(region_metrics)


## Q4.10: Quarterly Summary
#### Generate a quarterly revenue summary grouped by region (requires Date extraction).
df['Date'] = pd.to_datetime(df['Date'])
df['Quarter'] = df['Date'].dt.quarter
df['Month'] = df['Date'].dt.month
quarterly_summary = (df.groupby(['Region','Quarter'])['Revenue']
                    .sum().round(2))
print(quarterly_summary)

## Challenge Extension
#### Challenge 1: Create a rolling 7-day revenue analysis.
df['Date'] = pd.to_datetime(df['Date'])
df = df.sort_values('Date')
daily_rev = df.groupby('Date')['Revenue'].sum()
rolling_7d = daily_rev.rolling(7,min_periods = 1).sum()
print(rolling_7d)

#### Challenge 2: Calculate month-over-month growth rates by region
df['Date'] = pd.to_datetime(df['Date'])

monthly = (
    df.groupby(['Region', df['Date'].dt.to_period('M')])['Revenue'].sum().reset_index(name='Revenue').rename(columns={'Date': 'YearMonth'}))
monthly['MoM_Growth'] = (monthly.groupby('Region')['Revenue'].pct_change() * 100)
print(monthly)


#### Challenge 3: Generate a comprehensive business intelligence report with multiple views.
