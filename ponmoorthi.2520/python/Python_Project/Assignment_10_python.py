# Generated from: Assignment_10_python.ipynb
# Converted at: 2025-12-20T09:23:33.071Z
# Next step (optional): refactor into modules & generate tests with RunCell
# Quick start: pip install runcell

import pandas as pd

df=pd.read_csv('assignment10_product_performance(in).csv')

df

# ### Q10.1: Profit Calculation
# #### Load product data and calculate profit per product (SellingPrice - ManufacturingCost) × UnitsSold.
# #### Hint: Element-wise arithmetic


df['profit']=(df['SellingPrice']-df['ManufacturingCost'])*df['UnitsSold']

df['profit']

# ### Q10.2: Category Filtering
# #### Filter products by category and analyze sales performance (UnitsSold vs UnitsProduced).
# #### Hint: Boolean indexing and comparison


filtered=df[df['Category']=='Budget']

perform=filtered['UnitsSold']/filtered['UnitsProduced']

perform.head(10)

# ### Q10.3: Profitability by Category
# #### Group by category and calculate total profit, average profit, and profit margin.
# #### Hint: groupby with multiple agg functions


df.groupby('Category').agg({'profit':['mean','sum']})

# ### Q10.4: Top 10 Products
# #### Identify top 10 products by profit and create bar chart visualization.
# #### Hint: nlargest and barplot


top_10=df['profit'].nlargest(10)

import matplotlib.pyplot as plt

top_10 = df.nlargest(10, 'profit')
top_10

top_10 = df.nlargest(10, 'profit')
bars = plt.barh(top_10['ProductName'],top_10['profit'],color='red')
plt.xlabel('Profit ($)', fontsize=12)
plt.title('Top 10 Products by Profit', fontsize=14, fontweight='bold')
plt.bar_label(bars, fmt=' $%.0f',fontsize=9)

plt.tight_layout()
plt.show()


# ### Q10.5: Relationship Analysis
# #### Analyze correlation between CustomerSatisfaction and ReturnRate using correlation.
# #### Hint: .corr() between columns


correlation=df[['CustomerSatisfaction','ReturnRate']]
correlation

relation = df['CustomerSatisfaction'].corr(df['ReturnRate'])

plt.figure(figsize=(10, 6))
plt.scatter(df['CustomerSatisfaction'], df['ReturnRate'], alpha=0.6, s=100)
plt.xlabel('Customer Satisfaction', fontsize=12)
plt.ylabel('Return Rate', fontsize=12)
plt.title(f"Satisfaction vs Return Rate{round(relation,2)}",fontweight='bold')
plt.grid(True, alpha=0.3)
plt.tight_layout()
plt.show()

# ### Q10.6: Pivot Analysis
# #### Create pivot table showing average profit by category and market share brackets.
# #### Hint: pd.cut() for brackets, pivot_table


df['MarketShare_Bracket'] = pd.cut(
    df['MarketShare'],
    bins=3,
    labels=['Low','medium','high']
)


pivot=pd.pivot_table(df,values='profit',index='Category',columns='MarketShare_Bracket',aggfunc='mean',observed=True).round(2)
pivot

# ### Q10.7: Performance Metrics
# #### Add calculated columns: ProfitMargin%, Sellthrough% (UnitsSold/UnitsProduced).
# #### Hint: Column arithmetic


df['ProfitMargin%'] = ((df['SellingPrice'] - df['ManufacturingCost']) / df['SellingPrice'])
df['Sellthrough%'] = (df['UnitsSold'] / df['UnitsProduced'] * 100)

df

# ### Q10.8: Ranking Report
# #### Export a summary report with product rankings by profitability and performance.
# #### Hint: sort_values and to_csv


ranking = df.sort_values(by='profit',ascending = False)[['ProductID','ProductName','Category','profit','ProfitMargin%','Sellthrough%']]

print(ranking.head(10))
ranking_to_csv = ranking.to_csv('Ranking_Report.csv',index=False)

# ### Q10.9: Multi-visualization Dashboard
# #### Create 4 different visualizations: profit by category, satisfaction vs returns, market share, pie chart.
# #### Hint: Multiple subplots


fig, axes = plt.subplots(2, 2, figsize=(14, 10))

# bar
category_profit = df.groupby('Category')['profit'].sum()

axes[0, 0].bar(category_profit.index, category_profit.values, color='aqua')
axes[0, 0].set_title('Total Profit by Category', fontweight='bold')
axes[0, 0].set_ylabel('Profit ($)')

# Scatter
axes[0, 1].scatter(df['CustomerSatisfaction'], df['ReturnRate'], alpha=0.6, s=80,color='maroon')
axes[0, 1].set_title('Satisfaction vs Return Rate', fontweight='bold')
axes[0, 1].set_xlabel('Satisfaction')
axes[0, 1].set_ylabel('Return Rate (%)')

# Histogrm
axes[1, 0].hist(df['MarketShare'], bins=15, color='blue', alpha=0.7)
axes[1, 0].set_title('Market Share Distribution', fontweight='bold')
axes[1, 0].set_xlabel('Market Share')

#pie chart
pro= df.groupby('Category')['profit'].sum()
axes[1, 1].pie(pro, labels=pro.index, autopct='%1.1f%%')
axes[1, 1].set_title('Profit Distribution by Category', fontweight='bold')

plt.tight_layout()
plt.show()

# ### Q10.10: Executive Summary
# #### Generate comprehensive insights: best/worst products, opportunities, and recommendations.
# #### Hint: Text-based analysis with calculations


best_product = df.loc[df['profit'].idxmax()]
worst_product = df.loc[df['profit'].idxmin()]
print(f'Best Product{best_product['profit']}')
print(f'Worst Product {worst_product['profit']}')

high_performance = df[df['profit'] >= df['profit'].mean()]
low_performance = df[df['profit'] < df['profit'].mean()]

high_performance

best_product = df.loc[df['profit'].idxmax()]
worst_product = df.loc[df['profit'].idxmin()]

print(' Executive Summary ')
print('='*35)
print("Best Product Summary:")
print('='*35)
print(f' Best performing Product:{best_product['ProductName']}')
print(f' Profit of Best Product: {best_product['profit']:.2f}')
print(f' SellThrough of Best Product: {best_product['Sellthrough%']:.2f}')

print('='*35)
print("Worst Product Summary:")
print('='*35)
print(f' worst performing Product:{worst_product['ProductName']}')
print(f' Profit of Worst Product: {worst_product['profit']:.2f}')
print(f' SellThrough of Worst Product: {worst_product['Sellthrough%']:.2f}')

print('='*35)
print("Category Summary:")

print('='*35)
for i in df['Category'].unique():
    category = df[df['Category'] == i]
    print(f"{i}: {category['profit'].sum():,.0f} ")
    
print('='*35)
print("Recommendation:")

print('='*35)
high_returns = df[df['ReturnRate'] > df['ReturnRate'].quantile(0.75)]
print(f"Average Satisfication Rate: {high_returns['CustomerSatisfaction'].mean():.2f}%")
print(f"Recommendation: Review quality/customer fit")
print('='*35)
print("Overall Performance:")
print('='*35)
print(f'Total Profit:{df['profit'].sum()}')
print(f'Average Profit: {df['profit'].mean()}')
print(f'Satifications of Products:{df['CustomerSatisfaction'].mean()}')


# ### Challenge Extension
# #### Challenge 1: Predict which products will be top performers next quarter based on trends.