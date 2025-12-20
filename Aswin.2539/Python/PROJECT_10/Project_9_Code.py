# ## ASSIGNMENT 9: Stock Market Time Series

# ###  Dataset: assignment9_stock_market_data.csv

# ### Q9.1: Data Summary

# #### Load stock data and display price statistics (open, close, high, low) per stock.

import pandas as pd
df = pd.read_csv('assignment9_stock_market_data(in).csv')
df
df.info()
data_summary = df.groupby('Stock').describe()
print("Data Summary Of Price Statistics:")
print(data_summary)

# ### Q9.2: Daily Change

# #### Calculate daily price change (ClosePrice - OpenPrice) and add as new column.

if 'DailyChange' not in df.columns:
    df['DailyChange'] = df['ClosePrice'] - df['OpenPrice']
print('='*40)
print("Calculated DailyChange:")
print('='*40)
print(df[['OpenPrice','ClosePrice','DailyChange']])

# ### Q9.3: Stock Metrics

# #### Group by stock and calculate average volume and volatility (HighPrice - LowPrice).

df['Volatility'] = df['HighPrice'] - df['LowPrice']
stock_metrics = df.groupby('Stock').agg({'Volume':'mean','Volatility':'mean'})
filter_data = stock_metrics.rename(columns=({'Volume':'AvgVolume'}))
print("Stock Metrics of the each metrics:")
print(filter_data)

# ### Q9.4: Single Stock Plot

# #### Filter data for one stock and plot its closing price trend over time

import matplotlib.pyplot as plt

line_plot = df[df['Stock'] == 'Tech Mahindra'].sort_values('Date')
# Create lineplot
plt.figure(figsize=(10,6))
plt.plot(line_plot['Date'],line_plot['ClosePrice'],marker='o',lw=2,color = 'green')
plt.xlabel('Stock',fontsize = 12)
plt.ylabel('Close Price',fontsize=12)
plt.title('Single Line plot in Tech Mahindra Stock',fontsize=14,fontweight='bold')
plt.grid(True, alpha = 0.7)
plt.tight_layout()
plt.show()

# ### Q9.5: Monthly Averages

# ### Calculate monthly average closing price for each stock.

df['Date'] = pd.to_datetime(df['Date'])
df['Month'] = df['Date'].dt.month
monthly_avg = df.groupby(['Month','Stock'])['ClosePrice'].mean()
print("Monthly Average ClosingPrice For each stock:")
print(monthly_avg)

# ### Q9.6: Best & Worst Performers

# #### Identify best (highest return) and worst (lowest return) performing stocks.

performers = df.groupby('Stock')['DailyChange'].mean()
best_performer = performers.nlargest(1)
worst_performer = performers.nsmallest(1)
print("Identify the Performers Based On Dailychange:")
print(f'Best Performers:{best_performer} and average daily change:{performers['Wipro']}')
print(f'Worst Performers:{worst_performer} and average daily change:{performers['Tech Mahindra']:.2f}')

# ### Q9.7: Pivot Table

# #### Create a pivot table showing average closing price by stock and month.

pivot_table = pd.pivot_table(df,
                             index = 'Stock',
                             columns = 'Month',
                             values = 'ClosePrice',
                             aggfunc = 'mean'
                            )
print("Average closing price by Each Stocks and Month Wise:")
print(pivot_table)

# ### Q9.8: Multi-Stock Plot

# #### Visualize closing prices for all stocks on same plot with legend.

# Create a multiline plot 

plt.figure(figsize=(12,6))
sns.lineplot(data=df, x='Date',y='ClosePrice',hue='Stock',marker='o')
plt.xlabel('Stock',fontsize = 12)
plt.ylabel('Close Price',fontsize=12)
plt.title('Multiple Line plot in the Stock',fontsize=14,fontweight='bold')
plt.legend(loc='best')
plt.grid(True, alpha = 0.7)
plt.tight_layout()
plt.show()

# ### Q9.9: Correlation Matrix

# #### Calculate correlation between stocks' closing prices using NumPy.

import numpy as np
import pandas as pd
import seaborn as sns
pivot_table = pd.pivot_table(df,
                             values = 'ClosePrice',
                             index = 'Date',
                             columns = 'Stock'
                            )
corr = pivot_table.corr()
plt.figure(figsize=(10, 6))
sns.heatmap(corr, annot=True, fmt='.2f', cmap='RdBu')
plt.title('Correlation between Stock and ClosePrice',fontsize = 14, fontweight='bold')
plt.tight_layout()
plt.show()

# ### Q9.10: Comprehensive Dashboard

# #### Create a dashboard with multiple subplots showing various stock metrics.

df['Date'] = pd.to_datetime(df['Date'])
# Create a subplot
sns.set_style("whitegrid")
fig, axs = plt.subplots(2, 2, figsize=(12, 8))
sns.lineplot(data=df,x='Date',y='ClosePrice',marker='o',ax=axs[0,0],color='tab:orange')
axs[0,0].set_title('Line plot: ClosePrice vs Date',fontsize=14)
axs[0,0].set_xlabel('Date',fontsize=12)
axs[0,0].set_ylabel('Close Price',fontsize=12)
axs[0,0].grid(True, alpha=0.3)
axs[0,0].tick_params(axis='x', rotation=45)

sns.histplot(data=df,x='ClosePrice',bins=20,kde = True,ax=axs[0,1],color='tab:green')
axs[0,1].set_title('Hist plot: ClosePrice vs Date',fontsize=14)
axs[0,1].set_xlabel('Date',fontsize=12)
axs[0,1].set_ylabel('Close Price',fontsize=12)
axs[0,1].grid(True, alpha=0.3)
axs[0,1].tick_params(axis='x', rotation=45)

sns.barplot(data=df,x='Stock',y='ClosePrice',hue='Stock',ax=axs[1,0],errorbar=('ci', 95),palette='RdBu')
axs[1,0].set_title('Bar plot: ClosePrice vs Date',fontsize=14)
axs[1,0].set_xlabel('Date',fontsize=12)
axs[1,0].set_ylabel('Close Price',fontsize=12)
axs[1,0].grid(True, alpha=0.3)
axs[1,0].tick_params(axis='x', rotation=90)

sns.scatterplot(data=df,x='Date',y='ClosePrice',ax=axs[1,1],color='tab:red')
axs[1,1].set_title('Scatter Plot: Close Price vs Date',fontsize=14)
axs[1,1].set_xlabel('Date',fontsize=12)
axs[1,1].set_ylabel('Close Price',fontsize=12)
axs[1,1].grid(True, alpha=0.3)
axs[1,1].tick_params(axis='x', rotation=45)

plt.suptitle('Dashboard of multiple plot: ClosePrice VS Date',fontsize=16,fontweight='bold')
plt.tight_layout()
plt.show()