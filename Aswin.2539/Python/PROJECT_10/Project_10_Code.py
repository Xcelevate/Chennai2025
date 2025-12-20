# ## ASSIGNMENT 10: Product Performance Analysis

# ### Dataset: assignment10_product_performance.csv

# ### Q10.1: Profit Calculation

# #### Load product data and calculate profit per product (SellingPrice - ManufacturingCost) × UnitsSold.

import pandas as pd
df = pd.read_csv('assignment10_product_performance(in).csv')
df
df.info()
df['Profit'] = (df['SellingPrice'] - df['ManufacturingCost']) * df['UnitsSold']
print("Profit Per Product:")
print('='*70)
print(df[['ProductID','ProductName','SellingPrice','ManufacturingCost','Profit']])

# ### Q10.2: Category Filtering

# #### Filter products by category and analyze sales performance (UnitsSold vs UnitsProduced).

filter_product = df[df['Category'] == 'Standard']
print("Stadarad Category Performance:")
print('='*45)
print(filter_product[['ProductID','ProductName','Category','Profit']].head(10))
print('='*45)
sales_performance = (filter_product['UnitsSold'] / filter_product['UnitsProduced'])
print("Sales performance of Standard category(10 Records):")
print('='*45)
print(sales_performance.head(10))
print('='*45)

# ### Q10.3: Profitability by Category

# #### Group by category and calculate total profit, average profit, and profit margin

df['Revenue'] = df['UnitsSold'] * df['SellingPrice']
df['ProfitMargin'] = (df['Profit'] / df['Revenue']) * 100
profit_category = df.groupby('Category').agg({'Profit':['sum','mean'],'ProfitMargin':'mean'}).rename(columns=({'sum':'TotalProfit','mean':'Averageprofit','mean':'ProfitMargin'})).round(2)
print("Category wise Total and Average Profit:")
print('='*47)
print(profit_category)
print('='*47)

# ### Q10.4: Top 10 Products

# #### Identify top 10 products by profit and create bar chart visualization

top_10_product = df.nlargest(10,'Profit')
top_10_product
import seaborn as sns

import matplotlib.pyplot as plt

# Bar Plot
plt.figure(figsize=(12,6))
plt.barh(range(len(top_10_product)),top_10_product['Profit'],color = 'red')
plt.xlabel('Profit',fontsize=12)
plt.ylabel('ProductName', fontsize=12)
plt.yticks(range(len(top_10_product)),top_10_product['ProductName'],fontsize=12)
plt.title('Top 10 Product Based on Profit',fontsize=14,fontweight='bold')
for i, text in enumerate(top_10['Profit']):
    plt.text(text, i, f'{text:.0f}', va='center', fontsize=9)
plt.tight_layout()
plt.show()

# ### Q10.5: Relationship Analysis

# #### Analyze correlation between CustomerSatisfaction and ReturnRate using correlation

relationship = df[['CustomerSatisfaction','ReturnRate']]
corr = relationship.corr()
corr
plt.figure(figsize=(10, 6))
plt.scatter(df['CustomerSatisfaction'], df['ReturnRate'], s=100)
plt.xlabel('Customer Satisfaction', fontsize=12)
plt.ylabel('Return Rate', fontsize=12)
plt.title('Correlation: Relationship between customersatisfaction vs returnrate',fontsize = 14,fontweight='bold')
plt.grid(True, alpha=0.3)
plt.tight_layout()
plt.show()

# ### Q10.6: Pivot Analysis

# #### Create pivot table showing average profit by category and market share brackets.

df['MarketShareBracket'] = pd.cut(
    df['MarketShare'], 
    bins=3,
    labels=['low','medium','high'])
pivot_table = pd.pivot_table(df,
                             index = 'Category',
                             columns = 'MarketShareBracket',
                             values = 'Profit',
                             aggfunc = 'mean',
                             observed=False
                            ).round(2)
print("AvgProfit And MarketShareBrackets:")
print(pivot_table)

# ### Q10.7: Performance Metrics

# #### Add calculated columns: ProfitMargin%, Sellthrough% (UnitsSold/UnitsProduced).

df['ProfitMargin%'] = (df['SellingPrice'] - df['ManufacturingCost']) / df['SellingPrice']
df['SellThrough%'] = (df['UnitsSold'] / df['UnitsProduced'] * 100)
added_columns = df[['ProductID','ProductName','ProfitMargin%','SellThrough%']]
print("ProfitMargin% and SellThrough%")
print('='*55)
print(added_columns)
print('='*55)

# ### Q10.8: Ranking Report

# #### Export a summary report with product rankings by profitability and performance

ranking = df.sort_values(by='Profit',ascending = False)[['ProductID','ProductName','Category','Profit','ProfitMargin%','SellThrough%']]
print("Product Ranking Based on Profit:")
print(ranking.head(10))
ranking_to_csv = ranking.to_csv('Ranking_Report.csv',index=False)
print("Ranking Report Exported in  New CSV Named 'Ranking_Report.csv.'")

# ### Q10.9: Multi-visualization Dashboard

# #### Create 4 different visualizations: profit by category, satisfaction vs returns, market share, pie chart

fig, axes = plt.subplots(2, 2, figsize=(12, 8))

# Bar Chart 
axes[0, 0].bar(profit_category.index, profit_category.values, color='blue')
axes[0, 0].set_xlabel('Category', fontsize=12)
axes[0, 0].set_ylabel('Profit ($)', fontsize=12)
axes[0, 0].set_title('Profit By Category Wise', fontsize=14, fontweight='bold')
axes[0, 0].grid(True, alpha=0.3)

# Scatter plot
axes[0, 1].scatter(df['CustomerSatisfaction'], df['ReturnRate'], s=100, color='indigo')
axes[0, 1].set_xlabel('Customer Satisfaction', fontsize=12)
axes[0, 1].set_ylabel('Return Rate', fontsize=12)
axes[0, 1].set_title('Relationship between Customer Satisfaction vs Return Rate', fontsize=14, fontweight='bold')
axes[0, 1].grid(True, alpha=0.3)

# Histogram
axes[1, 0].hist(df['MarketShare'], bins=30, color='orange', alpha=0.7)
axes[1, 0].set_xlabel('Market Share', fontsize=12)
axes[1, 0].set_title('Histogram: Market Share', fontsize=14, fontweight='bold')
axes[1, 0].grid(True, alpha=0.3)

# Pie Chart
profit_by_category = df.groupby('Category')['Profit'].sum()
axes[1, 1].pie(profit_by_category, labels=profit_by_category.index, autopct='%1.1f%%')
axes[1, 1].set_title('Pie Chart: Profit Distribution by Category', fontsize=14, fontweight='bold')
plt.tight_layout()
plt.show()

# ### Q10.10: Executive Summary

# #### Generate comprehensive insights: best/worst products, opportunities, and recommendations.

best_product = df.loc[df['Profit'].idxmax()]

worst_product = df.loc[df['Profit'].idxmin()]

print('=+'*8 + ' Executive Summary ' + '+='*8)
print('='*35)
print("Best Product Summary:")
print('='*35)
print(f' Best performing Product:{best_product['ProductName']}')
print(f' Profit of Best Product: {best_product['Profit']:.2f}')
print(f' Margin of Best Product: {best_product['ProfitMargin%']:.2f}')
print(f' SellThrough of Best Product: {best_product['SellThrough%']:.2f}')
print('='*35)
print("Worst Product Summary:")
print('='*35)
print(f' worst performing Product:{worst_product['ProductName']}')
print(f' Profit of Worst Product: {worst_product['Profit']:.2f}')
print(f' Margin of Worst Product: {worst_product['ProfitMargin%']:.2f}')
print(f' SellThrough of Worst Product: {worst_product['SellThrough%']:.2f}')
print('='*35)
print("Category Summary:")
print('='*35)
for i in df['Category'].unique():
    category = df[df['Category'] == i]
    print(f"{i}: {category['Profit'].sum():,.0f} ")
print('='*35)
print("Recommendation:")
print('='*35)
high_returns = df[df['ReturnRate'] > df['ReturnRate'].quantile(0.75)]
print(f"Average Satisfication Rate: {high_returns['CustomerSatisfaction'].mean():.2f}%")
print(f"Recommendation: Review quality/customer fit")
print('='*35)
print("Overall Performance:")
print('='*35)
print(f'Total Profit:{df['Profit'].sum()}')
print(f'Average Profit: {df['Profit'].mean()}')
print(f'Satifications of Products:{df['CustomerSatisfaction'].mean()}')
print('=+'*25)