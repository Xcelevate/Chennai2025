# Generated from: Assignment-10.ipynb
# Converted at: 2025-12-20T10:52:43.114Z
# Next step (optional): refactor into modules & generate tests with RunCell
# Quick start: pip install runcell

# # ASSIGNMENT 10: Product Performance Analysis


# ## Questions


# ### Q10.1: Profit Calculation


# ## Load product data and calculate profit per product (SellingPrice - ManufacturingCost) × UnitsSold.


import pandas as pd

df=pd.read_csv('assignment10_product_performance(in).csv')
df.head()

df['Profit']=(df['SellingPrice']-df['ManufacturingCost'])*df['UnitsSold']

df[['ProductName', 'UnitsSold', 'SellingPrice', 'ManufacturingCost', 'Profit']].head(10)

# ### Q10.2: Category Filtering


# #### Filter products by category and analyze sales performance (UnitsSold vs UnitsProduced).


fil_category=df[df['Category']=='Standard'][['UnitsSold','UnitsProduced','SellingPrice','Profit']]

fil_category.head(10).reset_index()

# ### Q10.3: Profitability by Category


# #### Group by category and calculate total profit, average profit, and profit margin.


df['Revenue'] = df['UnitsSold'] * df['SellingPrice']

category_profit=df.groupby('Category').agg(Total_Profit=('Profit','sum'),
                                 Avg_Profit=('Profit','mean'),
                                Total_Revenue=('Revenue', 'sum')).round(2)


category_profit['Profit_Margin (%)'] = (category_profit['Total_Profit'] /
                                         category_profit['Total_Revenue']) * 100
                                

category_profit

# ### Q10.4: Top 10 Products


# #### Identify top 10 products by profit and create bar chart visualization.


top_10=df.nlargest(10,'Profit')
top_10


import seaborn as sns
import matplotlib.pyplot as plt

top_10=df.nlargest(10,'Profit')

plt.figure(figsize=(12,6))
bars=plt.barh(top_10['ProductName'], top_10['Profit'], color='teal')
plt.title('Top 10 Products by Profit', fontsize=14, fontweight='bold')
plt.bar_label(bars, fmt=' $%.0f',fontsize=9)
plt.xlabel('profit')
plt.tight_layout()
plt.show()



# ### Q10.5: Relationship Analysis


# #### Analyze correlation between CustomerSatisfaction and ReturnRate using correlation.


corr_matrix = df['CustomerSatisfaction'] .corr(df['ReturnRate'])

plt.figure(figsize=(10, 6))
plt.scatter(df['CustomerSatisfaction'], df['ReturnRate'], alpha=0.6, s=100,color='purple')
plt.xlabel('Customer Satisfaction', fontsize=12)
plt.ylabel('Return Rate', fontsize=12)
plt.title(f"Satisfaction vs Return Rate{round(corr_matrix,2)}",fontweight='bold')
plt.grid(True, alpha=0.3)
plt.tight_layout()
plt.show()

# ### Q10.6: Pivot Analysis


# #### Create pivot table showing average profit by category and market share brackets.


df['MarketShareBracket'] = pd.cut(df['MarketShare'], bins=3,
                                  labels=['Low', 'Medium', 'Hight'], )

pivot=pd.pivot_table(df,index='Category',values='Profit',aggfunc='mean',columns='MarketShareBracket',
                    observed=False).round(2)
pivot

# ### Q10.7: Performance Metrics


# #### Add calculated columns: ProfitMargin%, Sellthrough% (UnitsSold/UnitsProduced).


df['ProfitMargin%'] = ((df['SellingPrice'] - df['ManufacturingCost']) / df['SellingPrice'])
df['Sellthrough%'] = (df['UnitsSold'] / df['UnitsProduced'] * 100).round(2)
df[['ProductName', 'ProfitMargin%', 'Sellthrough%', 'CustomerSatisfaction']].head(10)

# ### Q10.8: Ranking Report


# #### Export a summary report with product rankings by profitability and performance


ranking_report = (df.sort_values('Profit', ascending=False)
    [['ProductName', 'Category', 'Profit', 
      'ProfitMargin%', 'Sellthrough%', 'CustomerSatisfaction']])
ranking_report.head(10)

ranking_report.to_csv('product_ranking_report.csv', index=False)

# ### Q10.9: Multi-visualization Dashboard


# #### Create 4 different visualizations: profit by category, satisfaction vs returns, market share, pie chart.


fig,axes=plt.subplots(2,2,figsize=(14,10))

category_profit = df.groupby('Category')['Profit'].sum()
# 1. Profit by category 
axes[0, 0].barh(category_profit.index, category_profit.values, color=['maroon', 'purple'])
axes[0, 0].set_title('Total Profit by Category',fontsize=12,fontweight='bold')
axes[0, 0].set_xlabel('Profit ($)')
    
# 2. Satisfaction vs Return 
axes[0, 1].scatter(df['CustomerSatisfaction'], df['ReturnRate'],color='green',alpha=0.6, s=80)
axes[0, 1].set_title('Satisfaction vs Return Rate',fontsize=12,fontweight='bold')
axes[0, 1].set_xlabel('Satisfaction')
axes[0, 1].set_ylabel('Return Rate (%)')
    
# 3. Market Share Distribution
axes[1, 0].hist(df['MarketShare'], bins=15, color='steelblue', alpha=0.7)
axes[1, 0].set_title('Market Share Distribution',fontsize=12, fontweight='bold')
axes[1, 0].set_xlabel('Market Share (%)')
                                                                     
# 4. Profit by Category 
axes[1, 1].pie(category_profit, labels=category_profit.index, autopct='%1.1f%%', startangle=9)
axes[1, 1].set_title('Profit Distribution by Category',fontsize=12,fontweight='bold')
plt.tight_layout()
plt.show()

# ### Q10.10: Executive Summary


# #### Generate comprehensive insights: best/worst products, opportunities, and recommendations.


best_product = df.loc[df['Profit'].idxmax()]
worst_product = df.loc[df['Profit'].idxmin()]

print(' Executive Summary ')
print('*-'*17)
print("\nBest Product Summary:")
print('-'*35)
print(f' \nBest performing Product:{best_product['ProductName']}')
print(f' Profit of Best Product: {best_product['Profit']:.2f}')
print(f' SellThrough of Best Product: {best_product['Sellthrough%']:.2f}')

print('-'*35)
print("\nWorst Product Summary:")
print('-'*35)
print(f' worst performing Product:{worst_product['ProductName']}')
print(f' Profit of Worst Product: {worst_product['Profit']:.2f}')
print(f' SellThrough of Worst Product: {worst_product['Sellthrough%']:.2f}')

print('-'*35)
print("\nCategory Summary:")

print('-'*35)
for i in df['Category'].unique():
    category = df[df['Category'] == i]
    print(f"{i}: {category['Profit'].sum():,.0f} ")
    
print('-'*35)
print("\nRecommendation:")

print('-'*35)
high_returns = df[df['ReturnRate'] > df['ReturnRate'].quantile(0.75)]
print(f"Average Satisfication Rate: {high_returns['CustomerSatisfaction'].mean():.2f}%")
print(f"Recommendation: Review quality/customer fit")
print('-'*35)
print("\nOverall Performance:")
print('-'*35)
print(f'Total Profit:{df['Profit'].sum()}')
print(f'Average Profit: {df['Profit'].mean()}')
print(f'Satifications of Products:{df['CustomerSatisfaction'].mean()}')