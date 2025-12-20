# Generated from: assignment_9_stock_analysis.ipynb
# Converted at: 2025-12-20T11:31:40.034Z
# Next step (optional): refactor into modules & generate tests with RunCell
# Quick start: pip install runcell

# ## ASSIGNMENT 9: Stock Market Time Series


# ### Questions
# ### Q9.1: Data Summary


import numpy as np
import pandas as pd
import seaborn as sns
import matplotlib.pyplot as plt

df=pd.read_csv('assignment9_stock_market_data.csv')

df

price_statistics=df.groupby('Stock')[['OpenPrice','ClosePrice','LowPrice','HighPrice']].describe()

print(" The price statistics per stock:")
print(price_statistics)

# ## Q9.2: Daily Change


df['DailyPriceChange']=df['ClosePrice']-df['OpenPrice']

print("Daily price change:")
print(df[['Date','Stock','OpenPrice','ClosePrice']].head(10))

# ### Q9.3: Stock Metrics


volatiliy=df['HighPrice']-df['LowPrice'].mean()

avg_value=round(df.groupby('Stock').agg({'Volume':['mean','sum'],
                                         'ClosePrice':['sum','mean','std']}),2)

print("Stock Metrics:")
print(avg_value)

# ### Q9.4: Single Stock Plot




new_df=df[df['Stock']=='Infosys'].sort_values('Date')
date=new_df['Date']
close_price=new_df['ClosePrice']

new_df

plt.figure(figsize=(12,6))
plt.plot(new_df['Date'],close_price,marker='o',linewidth=2,color='green')
plt.xlabel('Months',fontsize=12)
plt.ylabel('Closing Price',fontsize=12)
plt.title('Infosys closing price trend',fontsize=14,fontweight='bold')
plt.xticks(rotation=90)
plt.grid(True,alpha=0.5)
plt.tight_layout()
plt.show()

# ### Q9.5: Monthly Averages


df['Date']=pd.to_datetime(df['Date'])

df['Month']=df['Date'].dt.month

monthly_avg=round(df.groupby(['Stock','Month'])['ClosePrice'].mean(),2).unstack()

print("The monthly average closing price for each stock:")
print(monthly_avg)

# ### Q9.6: Best & Worst Performers


best_performer=round(df.groupby('Stock')['DailyPriceChange'].mean(),2)
best_stock=best_performer.idxmax()
best_avg=best_performer.max()

worst_performer=round(df.groupby('Stock')['DailyPriceChange'].mean(),2)
worst_stock=worst_performer.idxmin()
worst_avg=worst_performer.min()

print(f" The best performer is {best_stock} average value is {best_avg}" )
print(f" The wworst performer is {worst_stock} average value is {worst_avg}" )

# ### Q9.7: Pivot Table


pivot_value=round(df.groupby(['Stock','Month'])['ClosePrice'].mean())

df['Month']=df['Date'].dt.month_name()
month_order = ['January', 'February', 'March', 'April', 'May', 'June',
    'July', 'August', 'September', 'October', 'November', 'December']

df

pivot=df.pivot_table(values='ClosePrice',
                     index='Stock',
                     columns='Month',
                     aggfunc='mean'
                    )
pivot = pivot.reindex(columns=month_order)


pivot

# ### Q9.8: Multi-Stock Plot


print(stock_plot)

plt.figure(figsize=(12,6))
sns.lineplot(data=df,x='Month',y='ClosePrice',linewidth=2,marker='o',markersize='6',hue='Stock')
plt.xlabel('Months',fontsize=12)
plt.ylabel('Closing Price',fontsize=12)
plt.title('closing price trend',fontsize=14,fontweight='bold')
plt.xticks(rotation=45)
plt.grid(True,alpha=0.5)
plt.tight_layout()
plt.show()

# ### Q9.9: Correlation Matrix


pivot=df.pivot_table(values='ClosePrice',index='Date',columns='Stock')
correlation_matrix=pivot.corr()
plt.figure(figsize=(12,6))
sns.heatmap(correlation_matrix,annot=True,fmt='.2f',cmap='coolwarm',square=True)
plt.title('Stock Price Correlations',fontweight='bold')
plt.tight_layout()
plt.show()

# ### Q9.10: Comprehensive Dashboard