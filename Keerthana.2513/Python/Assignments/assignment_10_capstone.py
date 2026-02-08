# Generated from: assignment_10_capstone.ipynb
# Converted at: 2025-12-20T11:32:02.422Z
# Next step (optional): refactor into modules & generate tests with RunCell
# Quick start: pip install runcell

# ## ASSIGNMENT 10: Product Performance Analysis


# ## Questions
# ## Q10.1: Profit Calculation


import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns

df=pd.read_csv('assignment10_product_performance.csv')

df

df['profit']=(df['SellingPrice']-df['ManufacturingCost'])*df['UnitsSold']

df[['ProductID','ProductName','Category','UnitsProduced','ManufacturingCost','profit']]

# ## Q10.2: Category Filtering


standard_category=df[df['Category']=='Standard']

print("Standard category sales performance:")
print(standard_category[['ProductID','ProductName','UnitsProduced','UnitsSold','profit']])

# ### Q10.3: Profitability by Category


profitability=df.groupby('Category').agg({
    'profit':['sum','mean'],
    'UnitsProduced':'sum',
    'SellingPrice':'mean'})

print("Profitability by Category:")
print(round(profitability))

# ### Q10.4: Top 10 Products


top_10=df.nlargest(10,'profit')
top_10

plt.figure(figsize=(12,6))
colors=['green','yellow','red','pink','purple','orange','lightblue','lightgreen','blue','maroon']
plt.barh(range(len(top_10)),top_10['profit'],color=colors)
plt.xlabel('Profit ($)',fontsize=12)
plt.title('Top 10 products by profit',fontsize=14,fontweight='bold')
plt.yticks(range(len(top_10)),top_10['ProductName'],fontsize=10)
plt.tight_layout()
plt.show()

# ### Q10.5: Relationship Analysis


correlation=df['CustomerSatisfaction'].corr(df['ReturnRate'])
print(f" Correlation between CustomerSatisfaction and ReturnRate is {correlation:.4f}")

plt.figure(figsize=(12,6))
plt.scatter(df['CustomerSatisfaction'],df['ReturnRate'],s=90,alpha=0.9,color='lightgreen')
plt.xlabel('CustomerSatisfaction',fontsize=12)
plt.ylabel('ReturnRate',fontsize=12)
plt.title('Correlation between Satisfaction vs ReturnRate',fontsize=14,fontweight='bold')
plt.grid(True, alpha=0.3)
plt.tight_layout()
plt.show()

# ### Q10.6: Pivot Analysis


df['MarketShareBrackets']=pd.cut(df['MarketShare'],bins=3,labels=['Low','Medium','High'])

pivot_value=df.pivot_table(values='profit',
                           index='Category',
                           columns='MarketShareBrackets',
                           aggfunc='mean',
                           observed=True)

print(round(pivot_value))

# ### Q10.7: Performance Metrics


df['ProfitMargin%']=round(df['SellingPrice']-df['ManufacturingCost']/df['SellingPrice'])
df['Sellthrough%']=round(df['UnitsSold']-df['UnitsProduced']/df['UnitsSold'])

print("Performance metrics:")
print(df)

# ### Q10.8: Ranking Report


ranking_report=df.sort_values('profit',ascending=False).head(10)

ranking_report[['ProductID','ProductName','Category','MarketShareBrackets','ProfitMargin%','Sellthrough%']]

# ### Q10.9: Multi-visualization Dashboard


fig, axes = plt.subplots(2, 2, figsize=(14, 10))
 

category_profit = df.groupby('Category')['profit'].sum() 
axes[0, 0].bar(category_profit.index, category_profit.values, color='lightblue')
axes[0, 0].set_title('Total Profit by Category',fontweight='bold')
axes[0, 0].set_ylabel('Profit ($)')

axes[0, 1].scatter(df['CustomerSatisfaction'],df['ReturnRate'], alpha=0.6, s=80,color='green')
axes[0, 1].set_title('Satisfaction vs Return Rate',fontweight='bold')
axes[0, 1].set_xlabel('Satisfaction')
axes[0, 1].set_ylabel('Return Rate(%)')
 
axes[1, 0].hist(df['MarketShare'],bins=15,color='aqua',alpha=0.7)
axes[1, 0].set_title('Market Share Distribution',fontweight='bold')
axes[1, 0].set_xlabel('Market Share')
 
profit_val= df.groupby('Category')['profit'].sum()
axes[1, 1].pie(profit_val, labels=profit_val.index,autopct='%1.1f%%')
axes[1, 1].set_title('Profit Distribution by Category',fontweight='bold')
plt.tight_layout()
plt.show()
 


# ### Q10.10: Executive Summary


best=df.loc[df['profit'].idxmax()]
worst=df.loc[df['profit'].idxmin()]
print(' Executive Summary ')
print("\nBest Product Summary:")

print(f' \nBest performing Product:{best['ProductName']}')
print(f' Profit of Best Product: {best['profit']:.2f}')
print(f' SellThrough of Best Product: {best['Sellthrough%']:.2f}')

print("\nWorst Product Summary:")

print(f' worst performing Product:{worst['ProductName']}')
print(f' Profit of Worst Product: {worst['profit']:.2f}')
print(f' SellThrough of Worst Product: {worst['Sellthrough%']:.2f}')

print("\nCategory Summary:")

for i in df['Category'].unique():
    category = df[df['Category'] == i]
    print(f"{i}: {category['profit'].sum():,.0f} ")

print("\nRecommendation:")

high_returns = df[df['ReturnRate'] > df['ReturnRate'].quantile(0.75)]
print(f"Average Satisfication Rate: {high_returns['CustomerSatisfaction'].mean():.2f}%")
print(f"Recommendation: Review quality/customer fit")

print("\nOverall Performance:")

print(f'Total Profit:{df['profit'].sum()}')
print(f'Average Profit: {df['profit'].mean()}')
print(f'Satifications of Products:{df['CustomerSatisfaction'].mean()}')