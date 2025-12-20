# Generated from: assignment_4_grouping.ipynb
# Converted at: 2025-12-20T11:29:34.656Z
# Next step (optional): refactor into modules & generate tests with RunCell
# Quick start: pip install runcell

# ## ASSIGNMENT 4: Data Summarization & Grouping


# ## Q4.1: Basic GroupBy


import pandas as pd

df=pd.read_csv('assignment4_sales_transactions.csv')

df

df.groupby('Region')['Revenue'].sum()

# ### Q4.2: Multi-column GroupBy


df.groupby(['Region','Category'])['Revenue'].agg({'count','sum'})

# ### Q4.3: Average Quantity Analysis


df.groupby('Region')['Quantity'].mean().sort_values(ascending=False)

# ### Q4.4: Pivot Table Creation


pivot=pd.pivot_table(data=df,values='Revenue',index='Region',columns='Category',aggfunc='sum')

print(pivot)

# ### Q4.5: Calculated Columns


df['RevenuePerUnit']=df['Revenue'] /df['Quantity']

df['RevenuePerUnit']=round(df['RevenuePerUnit'],2)

print(df)

# ### Q4.6: Top Products


top_products=df.groupby('ProductName')['Revenue'].sum().nlargest(3)

ph_count=df[df['ProductName']=='Phone']['TransactionID'].count()
ph_rev=df[df['ProductName']=='Phone']['Revenue'].sum()
avg_val1=ph_rev/ph_count
avg_val1=round((avg_val1))

key_count=df[df['ProductName']=='Keyboard']['TransactionID'].count()
key_rev=df[df['ProductName']=='Keyboard']['Revenue'].sum()
avg_val2=key_rev/key_count
avg_val2=round((avg_val2))

tab_count=df[df['ProductName']=='Tablet']['TransactionID'].count()
tab_rev=df[df['ProductName']=='Tablet']['Revenue'].sum()
avg_val3=tab_rev/tab_count
avg_val3=round((avg_val3))

print(top_products)
print(f"""
Details for phone
Total revenue: ${ph_rev}
transaction count: {ph_count}
average order value $:{avg_val1} """)
print(f"""
Details for Keyboard
Total revenue: ${key_rev}
transaction count: {key_count}
average order value $:{avg_val2} """)
print(f"""
Details for Tablet
Total revenue: ${tab_rev}
transaction count: {tab_count}
average order value $:{avg_val3} """)

# ### Q4.7: Customer Type Analysis


customer_analysis=df.groupby('CustomerType').agg({'Revenue':['sum','mean','count'],
                                'Quantity':'sum'  })


print(customer_analysis)

# ### Q4.8: Composite Analysis


composite_analysis=df.groupby(['Region','Category'])['Revenue'].mean().nlargest(1)

print(round(composite_analysis))

# ### Q4.9: Summary Report Export


summary_statistics=df.groupby('Region')[['Revenue','TransactionID','Quantity']].describe()

print(summary_statistics)

# ### Q4.10: Quarterly Summary


df['Date']=pd.to_datetime(df['Date'],format='mixed',dayfirst=True)

df

df['Year']=df['Date'].dt.year
df['Month']=df['Date'].dt.month
df['Day']=df['Date'].dt.day
df['Quarter']=df['Date'].dt.quarter

quarterly_summary=df.groupby(['Region','Quarter'])['Revenue'].sum().unstack()

print(quarterly_summary)

# ## Challenge Extension


# ### Challenge 1: Create a rolling 7-day revenue analysis.


daily_revenue=df.groupby('Date')['Revenue'].sum()

rolling_7_day_avg=daily_revenue.rolling(window=7).mean()

print(rolling_7_day_avg.head(7))