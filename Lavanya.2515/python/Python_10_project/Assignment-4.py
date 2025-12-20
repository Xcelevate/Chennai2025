# Generated from: Assignment-4.ipynb
# Converted at: 2025-12-20T10:51:43.491Z
# Next step (optional): refactor into modules & generate tests with RunCell
# Quick start: pip install runcell

# # ASSIGNMENT 4: Data Summarization & Grouping


# ## Questions


# ### Q4.1: Basic GroupBy


# #### Group sales data by Region and calculate total revenue per region


import pandas as pd

df=pd.read_csv('assignment4_sales_transactions(in).csv')

df

region_wise=df.groupby('Region')['Revenue'].sum()
print('Total Revenue by Region\n')
print(region_wise)

# ### Q4.2: Multi-column GroupBy


# #### Group by both Region and Category, showing transaction count and total revenue for each combination.


region_category=df.groupby(['Region','Category']).agg({'TransactionID':'count','Revenue':'sum'}).rename(columns={'TransactionID':'TransactionCount'})
region_category

# ### Q4.3: Average Quantity Analysis


# #### Calculate the average quantity sold per region and sort in descending order.


average_quantity=df.groupby('Region')['Quantity'].mean().sort_values(ascending=False)
print("Average Quantity Sold per Region\n")
print(average_quantity)

# ### Q4.4: Pivot Table Creation


# #### Create a pivot table with Region as rows, Category as columns, and sum of Revenue as values.


pivot_table = pd.pivot_table(df, values='Revenue', 
                       index='Region', 
                       columns='Category', 
                       aggfunc='sum')
pivot_table

# ### Q4.5: Calculated Columns


# #### Add a calculated column 'RevenuePerUnit' (Revenue / Quantity) for each transaction


df['RevenuePerUnit']=df['Revenue']/df['Quantity']

df[['ProductName', 'Quantity', 'Revenue', 'RevenuePerUnit']].head(10)

# ### Q4.6: Top Products


# #### Find the top 3 products by total revenue and display their sales details.


top_product=df.groupby('ProductName')['Revenue'].sum().nlargest(3)
top_products_details = df[df['ProductName'].isin(top_product.index)]

top_products_details

# ### Q4.7: Customer Type Analysis


# #### Group by CustomerType and calculate total revenue, transaction count, and average order value.


customer_type=df.groupby('CustomerType').agg({'Revenue':'sum','TransactionID':'count','Quantity':'mean'}).rename(columns={'TransactionID':'TransactionCount'})


customer_type

# ### Q4.8: Composite Analysis


# #### Identify which region-category combination has the highest average revenue per transaction.


highest_average=df.groupby(['Region','Category'])['Revenue'].mean().idxmax
print('Average Revenue per Transaction\n')
print(highest_average)

# ### Q4.9: Summary Report Export


# #### Create a summary CSV showing region-wise performance metrics.


summary_metrics = df.groupby('Region').agg({'Revenue': ['sum', 'mean', 'count'],
                                            'Quantity': ['sum', 'mean'],
                                            'TransactionID': 'count'}).round(2)

summary_metrics.to_csv('region_summary_report.csv')

print("Summary Report Export")
print(summary_metrics)

# ### Q4.10: Quarterly Summary


# #### Generate a quarterly revenue summary grouped by region (requires Date extraction)


df['Date'] = pd.to_datetime(df['Date'])
df['Quarter'] = df['Date'].dt.quarter
quarterly_summary =(df.groupby(['Region', 'Quarter'])
      .agg(TotalRevenue=('Revenue', 'sum')).unstack())
quarterly_summary


quarterly_summary.to_csv('quarterly_revenue_by_region.csv')

# ## Challenge Extension


# ### Challenge 1: Create a rolling 7-day revenue analysis.


df['Date']=pd.to_datetime(df['Date'])
df=df.sort_values('Date')
daily_revenue=df.groupby('Date')['Revenue'].sum().reset_index()

daily_revenue['Rolling_7Day_Revenue']=(daily_revenue['Revenue'].rolling(7).sum())

print(daily_revenue)

# ### Challenge 2: Calculate month-over-month growth rates by region


df['Date']=pd.to_datetime(df['Date'])
df['YearMonth']=df['Date'].dt.to_period('M')

monthly_revenue=df.groupby(['Region','YearMonth'])['Revenue'].sum().reset_index()
monthly_revenue = monthly_revenue.sort_values(['Region', 'YearMonth'])

monthly_revenue['Prev_Month'] = (monthly_revenue.groupby('Region')['Revenue'].shift(1))

monthly_revenue['MoM_Growth_%'] = ((monthly_revenue['Revenue'] - monthly_revenue['Prev_Month']) / monthly_revenue['Prev_Month'] * 100)

monthly_revenue