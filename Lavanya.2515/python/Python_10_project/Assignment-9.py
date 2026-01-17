# Generated from: Assignment-9.ipynb
# Converted at: 2025-12-20T10:52:26.894Z
# Next step (optional): refactor into modules & generate tests with RunCell
# Quick start: pip install runcell

# # ASSIGNMENT 9: Stock Market Time Series


# ## Questions


# ### Q9.1: Data Summary


# #### Load stock data and display price statistics (open, close, high, low) per stock.


import pandas as pd

df=pd.read_csv('assignment9_stock_market_data(in).csv')
df.head()

stock=df.groupby('Stock')[['OpenPrice','HighPrice','LowPrice','ClosePrice']].describe()

stock

# ### Q9.2: Daily Change


# #### Calculate daily price change (ClosePrice - OpenPrice) and add as new column


df['DailyChange']=df['ClosePrice'] -df['OpenPrice']
df['Date']=pd.to_datetime(df['Date'])

df[['Date', 'Stock', 'OpenPrice', 'ClosePrice', 'DailyChange']].head(10)

# ### Q9.3: Stock Metrics


# #### Group by stock and calculate average volume and volatility (HighPrice - LowPrice).


df['Volatility'] = df['HighPrice'] - df['LowPrice']
stock_metrics = df.groupby('Stock').agg(
    AvgVolume=('Volume', 'mean'),
    AvgVolatility=('Volatility', 'mean'))
stock_metrics


# ### Q9.4: Single Stock Plot


# #### Filter data for one stock and plot its closing price trend over time


import matplotlib.pyplot as plt
import seaborn as sns

data = df[df['Stock'] == 'Wipro'][['Date', 'ClosePrice']]
plt.figure(figsize=(12, 6))
sns.lineplot(data=data, x='Date', y='ClosePrice', marker='o',color='green')
plt.title('Wipro Closing Price Trend', fontsize=14, fontweight='bold')
plt.grid(True, alpha=0.3)
plt.tight_layout()
plt.show()


# ### Q9.5: Monthly Averages


# #### Calculate monthly average closing price for each stock.


df['Date'] = pd.to_datetime(df['Date'])
df['YearMonth'] = df['Date'].dt.to_period('M')
avg_monthly = df.groupby(['YearMonth','Stock'])['ClosePrice'].mean().unstack()
avg_monthly


# ### Q9.6: Best & Worst Performers


# #### Identify best (highest return) and worst (lowest return) performing stocks.


avg_stock = df.groupby('Stock')['DailyChange'].mean()
best_stock = avg_stock.idxmax()
worst_stock = avg_stock.idxmin()
print(f"Best Performer: {best_stock} (Avg daily change: ${avg_stock[best_stock]:.2f})")
print(f"Worst Performer: {worst_stock} (Avg daily change: ${avg_stock[worst_stock]:.2f})")

# ### Q9.7: Pivot Table


# #### Create a pivot table showing average closing price by stock and month.


month_order = ['January','February','March','April','May','June',
               'July','August','September','October','November','December']
df['Month']=df['Date'].dt.month_name()
pivot=df.pivot_table(values='ClosePrice',
                     index='Stock',
                     columns='Month',
                     aggfunc='mean'
                    )
pivot = pivot.reindex(columns=month_order)
pivot

# ### Q9.8: Multi-Stock Plot


# #### Visualize closing prices for all stocks on same plot with legend


import seaborn as sns

plt.figure(figsize=(14, 6))
sns.lineplot(data=df, x='Date', y='ClosePrice', hue='Stock', marker='o', alpha=0.7)
plt.title('Stock Closing Prices Comparison', fontsize=14, fontweight='bold')
plt.tight_layout()
plt.show()


# ### Q9.9: Correlation Matrix


# #### Calculate correlation between stocks' closing prices using NumPy.


import numpy as np

pivot= df.pivot_table(values='ClosePrice', index='Date', columns='Stock')
corr_matrix = pivot.corr()
plt.figure(figsize=(12, 6))
sns.heatmap(corr_matrix, annot=True, fmt='.2f', cmap='RdBu', square=True)
plt.title('Stock Price Correlations', fontweight='bold')
plt.tight_layout()
plt.show()


# ### Q9.10: Comprehensive Dashboard


# #### Create a dashboard with multiple subplots showing various stock metrics.


sns.set_style("whitegrid") 
fig, axs = plt.subplots(2, 2, figsize=(12, 8))
 
sns.lineplot(data=df,x='Date',y='ClosePrice',marker='o',ax=axs[0,0],color='green')
axs[0,0].set_title('Line plot',fontsize=14)
axs[0,0].set_xlabel('Date',fontsize=12)
axs[0,0].set_ylabel('Close Price',fontsize=12)
axs[0,0].grid(True, alpha=0.3)
axs[0,0].tick_params(axis='x', rotation=45)
 

sns.barplot(data=df,x='Stock',y='ClosePrice',hue='Stock',ax=axs[0,1],errorbar=('ci', 95),palette='Set3')
axs[0,1].set_title('Bar plot',fontsize=14)
axs[0,1].set_xlabel('Date',fontsize=12)
axs[0,1].set_ylabel('Close Price',fontsize=12)
axs[0,1].grid(True, alpha=0.3)
axs[0,1].tick_params(axis='x', rotation=90)

sns.scatterplot(data=df,x='Date',y='ClosePrice',ax=axs[1,0],color='red')
axs[1,0].set_title('Scatter plot',fontsize=14)
axs[1,0].set_xlabel('Date',fontsize=12)
axs[1,0].set_ylabel('Close Price',fontsize=12)
axs[1,0].grid(True, alpha=0.3)
axs[1,0].tick_params(axis='x', rotation=45)

sns.histplot(data=df,x='ClosePrice',bins=20,kde = True,ax=axs[1,1],color='purple')
axs[1,1].set_title('Hist Plot',fontsize=14)
axs[1,1].set_xlabel('Date',fontsize=12)
axs[1,1].set_ylabel('Close Price',fontsize=12)
axs[1,1].grid(True, alpha=0.3)
axs[1,1].tick_params(axis='x', rotation=45)
plt.suptitle('Dashboard of multiple plot-ClosePrice VS Date',fontsize=16,fontweight='bold')
plt.tight_layout()
plt.show()