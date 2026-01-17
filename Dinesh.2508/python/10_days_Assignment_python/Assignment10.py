import numpy as np
import pandas as pd 
import matplotlib.pyplot as plt 
import seaborn as sns

df = pd.read_csv('assignment10_product_performance.csv')
df

## Q10.1: Profit Calculation
#### Load product data and calculate profit per product (SellingPrice - ManufacturingCost) × UnitsSold
df['Profit'] = df['SellingPrice'] - df['ManufacturingCost']
df

## Q10.2: Category Filteringm
#### Filter products by category and analyze sales performance (UnitsSold vs UnitsProduced).
standard_product = df[df['Category'] == 'Standard']
df['SalesPerformance'] = df['UnitsSold']  / df['UnitsProduced']
category_perf = df.groupby('Category').agg(TotalUnitsProduced =('UnitsProduced','sum'),
                                          TotalUnitssold = ('UnitsSold', 'sum'),
                                          AvgPerformance = ('SalesPerformance','mean')).reset_index()
print(category_perf)

## Q10.3: Profitability by Category
#### Group by category and calculate total profit, average profit, and profit margin
df['TotalRevenue'] = df['SellingPrice']*df['UnitsSold']
df['ProfitMargin'] = df['Profit'] / df['TotalRevenue']

category_profit = df.groupby('Category').agg(Total_Profit = ('Profit','sum'),
                                             Average_Profit =('Profit','mean'),
                                              Total_Revenue = ('TotalRevenue','sum')).reset_index()
category_profit

## Q10.4: Top 10 Products
#### Identify top 10 products by profit and create bar chart visualization.
top_10_products = df.sort_values('Profit',ascending = False).head(10)
top_10_products
plt.figure(figsize=(15,5))
plt.bar(top_10_products['ProductName'],
       top_10_products['Profit'])
plt.xlabel('Product')
plt.ylabel('Profit')
plt.title('Top 10 Products by Profit')
plt.tight_layout()
plt.show()

## Q10.5: Relationship Analysis
#### Analyze correlation between CustomerSatisfaction and ReturnRate using correlation.
corr_value = df['CustomerSatisfaction'].corr(df['ReturnRate'])
print(corr_value)

plt.figure(figsize=(10,6))
plt.scatter(df['CustomerSatisfaction'],df['ReturnRate'])
plt.xlabel('Customer Satisfaction')
plt.ylabel('Return Rate')
plt.title('Customer Satisfaction vs Return Rate')
plt.tight_layout()
plt.show()


plt.figure(figsize=(10, 6))
sns.boxplot(data=df,x='CustomerSatisfaction',y='ReturnRate')
plt.title('Return Rate by Customer Satisfaction Level')
plt.tight_layout()
plt.show()


## Q10.6: Pivot Analysis
#### Create pivot table showing average profit by category and market share brackets
df['MarketShareBracket'] = pd.cut(df['MarketShare'], bins=3, labels=['Low', 'Medium', 'High'])
pivot = pd.pivot_table(df, values='Profit', index='Category', columns='MarketShareBracket')
print(pivot)

## Q10.7: Performance Metrics
#### Add calculated columns: ProfitMargin%, Sellthrough% (UnitsSold/UnitsProduced)
df['Sellthrough'] = df['UnitsSold'] / df ['UnitsProduced']
df

## Q10.8: Ranking Report
#### Export a summary report with product rankings by profitability and performance
rank_report = df.sort_values('Profit',ascending = False)
rank_report.to_csv('Product_rank_report.csv',index = False)
print('Ranking report exported ')
print(rank_report.head(10))

## Q10.9: Multi-visualization Dashboard
#### Create 4 different visualizations: profit by category, satisfaction vs returns, market share, pie chart.
profit_by_cat = (
    df.groupby('Category')['Profit'].sum().reset_index())

marketshare_by_cat = (
    df.groupby('Category')['MarketShare'].sum().reset_index())

fig, axes = plt.subplots(2, 2, figsize=(10, 10))
sns.barplot(
    data=profit_by_cat,
    x='Category',
    y='Profit',
    ax=axes[0, 0]
)
axes[0, 0].set_title('Total Profit by Category')
axes[0, 0].set_xlabel('Category')
axes[0, 0].set_ylabel('Total Profit')

sns.regplot(
    data=df,
    x='CustomerSatisfaction',
    y='ReturnRate',
    ax=axes[0, 1]
)
axes[0, 1].set_title('Customer Satisfaction vs Return Rate')
axes[0, 1].set_xlabel('Customer Satisfaction')
axes[0, 1].set_ylabel('Return Rate')

sns.barplot(
    data=marketshare_by_cat,
    x='Category',
    y='MarketShare',
    ax=axes[1, 0]
)
axes[1, 0].set_title('Market Share by Category')
axes[1, 0].set_xlabel('Category')
axes[1, 0].set_ylabel('Market Share')


axes[1, 1].pie(
    marketshare_by_cat['MarketShare'],
    labels=marketshare_by_cat['Category'],
    autopct='%1.1f%%',
    startangle=90
)
axes[1, 1].set_title('Market Share Distribution')
axes[1, 1].axis('equal')  

plt.tight_layout()
plt.show()


## Q10.10: Executive Summary
#### Generate comprehensive insights: best/worst products, opportunities, and recommendations.
# Best Products
top_products_profit = df.nlargest(5, 'Profit')[['ProductName', 'Category', 'Profit', 'TotalRevenue']]
# Worst Products
worst_products_profit = df.nsmallest(5, 'Profit')[['ProductName', 'Category', 'Profit', 'TotalRevenue']]
# Opportunities & Recommendations
profit_median = df['Profit'].median()
share_median = df['MarketShare'].median()
# High share, low profit
high_share_low_profit = df[(df['MarketShare'] >= share_median) &(df['Profit'] < profit_median)][['ProductName', 'Category', 'Profit', 'MarketShare']]
#  Low share, high profit
low_share_high_profit = df[(df['MarketShare'] < share_median) &(df['Profit'] >= profit_median)][['ProductName', 'Category', 'Profit', 'MarketShare']]
# Overall Summary
summary = df[['ProductName', 'Category','Profit', 'TotalRevenue','CustomerSatisfaction', 'ReturnRate','MarketShare']].copy()
summary_sorted = summary.sort_values(['Profit', 'CustomerSatisfaction'],ascending=[False, False])
summary_sorted.head(10)


## Challenge Extension


#### Challenge 1: Predict which products will be top performers next quarter based on trends.
 




#### Challenge 2: Create a recommendation engine for product improvements




#### Challenge 3: Segment products into strategic groups for portfolio management.