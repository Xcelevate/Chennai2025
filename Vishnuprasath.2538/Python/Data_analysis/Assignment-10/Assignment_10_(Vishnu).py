# ## ASSIGNMENT 10: Product Performance Analysis


# ### Q10.1: Profit Calculation
# #### Load product data and calculate profit per product (SellingPrice - ManufacturingCost) × UnitsSold.


import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
import seaborn as sns

df = pd.read_csv('assignment10_product_performance(in).csv')
df

df['Profit'] = (df['SellingPrice']-df['ManufacturingCost'])*df['UnitsSold']

df['Profit']

df

# ### Q10.2: Category Filtering
# #### Filter products by category and analyze sales performance (UnitsSold vs UnitsProduced)


premium = df[df['Category'] == 'Premium']
premium

standard = df[df['Category'] == 'Standard']
standard

budget = df[df['Category'] == 'Budget']
budget

performance = premium[['ProductName', 'UnitsProduced', 'UnitsSold', 'Profit']]
performance

performance_value = df.groupby('Category').agg({'UnitsProduced':['sum', 'mean'], 'UnitsSold':['sum', 'mean']}).reset_index()
performance_value

df['Sales_Percentage'] = round(df['UnitsSold']/df['UnitsProduced']*100,2)
df['Sales_Percentage']

df

performance_value_sales = round((performance_value['UnitsSold']/performance_value['UnitsProduced'])*100,2)

performance_value_sales

# ### Q10.3: Profitability by Category
# #### Group by category and calculate total profit, average profit, and profit margin.


profitability = round(df.groupby('Category').agg({'Profit':['sum', 'mean'], 'UnitsSold':'sum', 'SellingPrice':'mean'}),2).reset_index()
profitability

# ### Q10.4: Top 10 Products
# #### Identify top 10 products by profit and create bar chart visualization.


Top_10 = df.nlargest(10, 'Profit')

Top_10

plt.figure(figsize=(12, 6))

bars = plt.barh(Top_10['ProductName'], Top_10['Profit'])

plt.xlabel('Profit ($)')
plt.title('Top 10 Products by Profit')

plt.figure(figsize=(12, 6))
plt.barh(Top_10['ProductName'], Top_10['Profit'])

plt.xlabel('Profit ($)')
plt.title('Top 10 Products by Profit')

for index, value in enumerate(Top_10['Profit']):
    plt.text(value, index, f'{value}', va='center')

plt.tight_layout()
plt.show()

# ### Q10.5: Relationship Analysis
# #### Analyze correlation between CustomerSatisfaction and ReturnRate using correlation


correlation_value = df['CustomerSatisfaction'].corr(df['ReturnRate'])
correlation_value

plt.figure(figsize=(8, 5))

plt.scatter(
    df['CustomerSatisfaction'],
    df['ReturnRate']
)

plt.xlabel('Customer Satisfaction')
plt.ylabel('Return Rate')
plt.title('Customer Satisfaction vs Return Rate')

plt.tight_layout()
plt.show()


plt.figure(figsize=(10, 6))

plt.scatter(
    df['CustomerSatisfaction'],
    df['ReturnRate'],
    alpha=0.6,
    s=100
)

plt.xlabel('Customer Satisfaction', fontsize=12)
plt.ylabel('Return Rate (%)', fontsize=12)

plt.title(
    f'Satisfaction vs Return Rate (r={correlation_value:.2f})',
    fontweight='bold'
)

plt.grid(True, alpha=0.3)
plt.tight_layout()
plt.show()

# ### Q10.6: Pivot Analysis
# #### Create pivot table showing average profit by category and market share brackets.


df['MarketShareBracket'] = pd.cut(
    df['MarketShare'],
    bins=[0, 5, 10, df['MarketShare'].max()],
    labels=['Low', 'Medium', 'High']
)

pivot_table = round(pd.pivot_table(df, index='Category', columns='MarketShareBracket', values='Profit', aggfunc= 'mean'),2)
pivot_table

# ### Q10.7: Performance Metrics
# #### Add calculated columns: ProfitMargin%, Sellthrough% (UnitsSold/UnitsProduced).


df

df['ProfitMargin%'] = round(((df['SellingPrice']-df['ManufacturingCost'])/df['SellingPrice'])*100,2)

df['Sellthrough%'] = round((df['UnitsSold']/df['UnitsProduced'])*100,2)

df

# ### Q10.8: Ranking Report
# #### Export a summary report with product rankings by profitability and performance.


summary_df = df[
    [
        'ProductID',
        'ProductName',
        'Category',
        'Profit',
        'Sellthrough%',
        'ProfitMargin%'
    ]
]

ranking_df = summary_df.sort_values(
    by=['Profit', 'Sellthrough%'],
    ascending=[False, False]
)

ranking_df.to_csv('product_ranking_report.csv', index=False)

ranking_df.head()

# ### Q10.9: Multi-visualization Dashboard
# #### Create 4 different visualizations: profit by category, satisfaction vs returns, market share, pie chart.


fig, axes = plt.subplots(2, 2, figsize=(12, 10))

# 1. Profit by Category
profit_by_category = df.groupby('Category')['Profit'].sum()
axes[0, 0].bar(profit_by_category.index, profit_by_category.values)
axes[0, 0].set_title('Profit by Category')

# 2. Satisfaction vs Return Rate
axes[0, 1].scatter(df['CustomerSatisfaction'], df['ReturnRate'])
axes[0, 1].set_title('Satisfaction vs Return Rate')
axes[0, 1].set_xlabel('Customer Satisfaction')
axes[0, 1].set_ylabel('Return Rate')

# 3. Market Share
market_share = df.groupby('Category')['MarketShare'].mean()
axes[1, 0].bar(market_share.index, market_share.values)
axes[1, 0].set_title('Average Market Share')

# 4. Pie Chart
category_counts = df['Category'].value_counts()
axes[1, 1].pie(category_counts.values, labels=category_counts.index, autopct='%1.1f%%')
axes[1, 1].set_title('Category Distribution')

plt.tight_layout()
plt.show()

# ### Q10.10: Executive Summary
# #### Generate comprehensive insights: best/worst products, opportunities, and recommendations.


best_product = df.loc[df['Profit'].idxmax()]
best_product

worst_product = df.loc[df['Profit'].idxmin()]
worst_product


# Products with high sell-through (good demand)
high_sellthrough = df[df['Sellthrough%'] > 100]
high_sellthrough

# Products with high return rate (potential problem)
high_returns = df[df['ReturnRate'] > df['ReturnRate'].mean()]
high_returns

print("EXECUTIVE SUMMARY")
print("-----------------")
print(f"Best Product: {best_product['ProductName']} (Profit: ${best_product['Profit']})")
print(f"Worst Product: {worst_product['ProductName']} (Profit: ${worst_product['Profit']})")
print()
print(f"Number of products with high sell-through: {len(high_sellthrough)}")
print(f"Number of products with high return rate: {len(high_returns)}")
print("-----------------")