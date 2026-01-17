# Generated from: Assignment_4_python.ipynb
# Converted at: 2025-12-20T08:54:34.896Z
# Next step (optional): refactor into modules & generate tests with RunCell
# Quick start: pip install runcell

import pandas as pd

df=pd.read_csv('assignment4_sales_transactions(in).csv')

df

df.info()

df.describe()

# ### Q4.1: Basic GroupBy
# #### Group sales data by Region and calculate total revenue per region.
# #### Hint: Use .groupby('Region')['Revenue'].sum()


total_revenue=df.groupby('Region')['Revenue'].sum()

total_revenue

# ### Q4.2: Multi-column GroupBy
# #### Group by both Region and Category, showing transaction count and total revenue for eachcombination.
# #### Hint: Use .groupby(['Region', 'Category']).agg() with multiple functions


df.groupby(['Region','Category']).agg({'TransactionID':'count','Revenue':'sum'})

# ### Q4.3: Average Quantity Analysis
# #### Calculate the average quantity sold per region and sort in descending order.
# #### Hint: Use .groupby('Region')['Quantity'].mean().sort_values()


avg_region=df.groupby('Region')['Quantity'].mean().sort_values()

avg_region

# ### Q4.4: Pivot Table Creation
# #### Create a pivot table with Region as rows, Category as columns, and sum of Revenue as values.
# #### Hint: Use pd.pivot_table() with values, index, columns, aggfunc


pivot=df.pivot_table(
    values='Revenue',
    index='Region',
    columns='Category',
    aggfunc='sum'
)

pivot

# ### Q4.5: Calculated Columns
# #### Add a calculated column 'RevenuePerUnit' (Revenue / Quantity) for each transaction.
# #### Hint: Simple arithmetic operation between columns


df['RevenuePerUnit']=df['Revenue']/ df['Quantity']

df['RevenuePerUnit']

# ### Q4.6: Top Products
# #### Find the top 3 products by total revenue and display their sales details.
# #### Hint: Use .groupby('ProductName')['Revenue'].sum().nlargest(3)


Top3_product=df.groupby('ProductName')['Revenue'].sum().nlargest(3)

Top3_product

# ### Q4.7: Customer Type Analysis
# #### Group by CustomerType and calculate total revenue, transaction count, and average order value.
# #### Hint: Use .agg() with multiple aggregation functions


df.groupby('CustomerType').agg({'Revenue':['sum','count','mean'],'Quantity':'sum'})

# ### Q4.8: Composite Analysis
# #### Identify which region-category combination has the highest average revenue per transaction.
# #### Hint: Group by both, calculate mean, use .idxmax()


Ref_cat=df.groupby(['Region','Category'])['Revenue'].mean().idxmax()

Ref_cat

# ### Q4.9: Summary Report Export
# #### Create a summary CSV showing region-wise performance metrics.
# #### Hint: Use .groupby().agg() and .to_csv()


profit=df.groupby('Region').agg({
    'Revenue': 'mean',    # Average revenue
    'UnitPrice': 'sum'        # Total units
})

profit

profit.to_csv('Summary Report Export)

# ### Q4.10: Quarterly Summary
# #### Generate a quarterly revenue summary grouped by region (requires Date extraction).
# #### Hint: Extract quarter from Date, then .groupby(['Region', 'Quarter'])


df['Date'] = pd.to_datetime(df['Date'])
df['Quarter'] = df['Date'].dt.quarter
df['Month'] = df['Date'].dt.month

summary=df.groupby(['Region','Quarter'])['Revenue'].sum().unstack()           # unstack()-- convert row into columns

summary

summary.to_csv('quarterly_revenue.csv')

# ## Challenge Extension
# ### Challenge 1: Create a rolling 7-day revenue analysis


# Step 1: Convert Date to datetime
df['Date'] = pd.to_datetime(df['Date'])

# Step 2: Sort by Date
df = df.sort_values('Date').reset_index(drop=True)

# Step 3: Create daily revenue aggregation
daily_revenue = df.groupby('Date').agg({
    'Revenue': ['sum', 'count', 'mean']
}).reset_index()

# Flatten column names
daily_revenue.columns = ['Date', 'DailyRevenue', 'TransactionCount', 'AvgTransactionValue']

# Step 4: Calculate 7-day rolling sum
daily_revenue['Rolling_7Day_Sum'] = daily_revenue['DailyRevenue'].rolling(window=7, min_periods=1).sum()

# Step 5: Calculate 7-day rolling mean
daily_revenue['Rolling_7Day_Mean'] = daily_revenue['DailyRevenue'].rolling(window=7, min_periods=1).mean()

# Step 6: Calculate 7-day rolling standard deviation
daily_revenue['Rolling_7Day_Std'] = daily_revenue['DailyRevenue'].rolling(window=7, min_periods=1).std()

# Step 7: Calculate day-over-day growth percentage
daily_revenue['DayOverDay_Growth_%'] = daily_revenue['DailyRevenue'].pct_change() * 100

# Step 8: Display results
print(daily_revenue)

# Step 9: Merge back to original dataframe
df = df.merge(daily_revenue[['Date', 'Rolling_7Day_Sum', 'Rolling_7Day_Mean']], 
              on='Date', 
              how='left')

print(df.head())

# ### Challenge 2: Calculate month-over-month growth rates by region.


# Step 1: Convert Date to datetime
df['Date'] = pd.to_datetime(df['Date'])
# ensure date column is datetime
df['time'] = pd.to_datetime(df['Date'])


# sort properly
df = df.sort_values(['Region', 'time'])

# calculate MoM growth by region
df['MoM_Growth'] = (
    df.groupby('Region')['Revenue']
      .pct_change() * 100)

df

# ### Challenge 3: 
# #### Generate a comprehensive business intelligence report with multiple views.


Total=df.groupby(['Revenue','Region']).agg({'Revenue':['sum','count','mean']})

# Revenue by Region
region_summary = df.groupby('Region').agg(
    TotalRevenue=('Revenue', 'sum'),
    AvgRevenue=('Revenue', 'mean'),
    TransactionCount=('Revenue', 'count')
).round(2).reset_index()
print("Region_Summary:")
region_summary

# monthly revenue by trend
monthly_summary = (df.groupby('Month')['Revenue'].sum().reset_index())
print("Monthly_Summary:")
monthly_summary

# Region-Month Pivot Table
region_month_pivot = pd.pivot_table(df,
    values='Revenue',
    index='Region',
    columns='Month',
    aggfunc='sum',)


region_month_pivot