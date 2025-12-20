# Generated from: Assignment_09_python.ipynb
# Converted at: 2025-12-20T08:56:05.430Z
# Next step (optional): refactor into modules & generate tests with RunCell
# Quick start: pip install runcell

import pandas as pd

df=pd.read_csv('assignment9_stock_market_data(in).csv')

df

# ### Q9.1: Data Summary
# #### Load stock data and display price statistics (open, close, high, low) per stock.
# #### Hint: groupby Stock and describe()


data_summary=df.groupby('Stock').describe()

data_summary

# ### Q9.2: Daily Change
# #### Calculate daily price change (ClosePrice - OpenPrice) and add as new column.
# #### Hint: Element-wise subtraction


df['daily_price']=df['ClosePrice'] - df['OpenPrice']

df.head()

# ### Q9.3: Stock Metrics
# #### Group by stock and calculate average volume and volatility (HighPrice - LowPrice).
# #### Hint: groupby and agg


df['volatity']=df['HighPrice'] - df['LowPrice']

df.groupby('Stock').agg({'Volume':'mean','volatity':'mean'})

# ### Q9.4: Single Stock Plot
# #### Filter data for one stock and plot its closing price trend over time.
# #### Hint: line plot with date on x-axis


import matplotlib.pyplot as plt

filtered = df[df['Stock'] == 'HCL']  
filtered

plt.figure(figsize=(12,4))
plt.plot(filtered['Date'], filtered['ClosePrice'], marker='o',color='red')
plt.xlabel('Stock',fontsize=12)
plt.ylabel('closing',fontsize=12)
plt.title('Single stock Plot',fontsize=14,fontweight='bold')
plt.grid(True,alpha=0.5)
plt.xticks(rotation=90)
plt.tight_layout()
plt.show()

stock_name = df['Stock'].unique()[0]
stock_data = df[df['Stock'] == stock_name].sort_values('Date')
plt.figure(figsize=(12, 6))
plt.plot(stock_data['Date'], stock_data['ClosePrice'], marker='o', linewidth=2, color='blue')
plt.title(f'{stock_name} Closing Price Trend', fontsize=14, fontweight='bold')
plt.xlabel('Date')
plt.ylabel('Closing Price ($)')
plt.grid(True, alpha=0.3)
plt.xticks(rotation=45)
plt.tight_layout()
plt.show()

# ### Q9.5: Monthly Averages
# #### Calculate monthly average closing price for each stock.
# #### Hint: Extract month, groupby Stock and Month


df['Date']=pd.to_datetime(df['Date'])

df['Month'] = df['Date'].dt.to_period('M')
df.groupby(['Stock','Month']).agg({'ClosePrice':'mean'})

# ### Q9.6: Best & Worst Performers
# #### Identify best (highest return) and worst (lowest return) performing stocks.
# #### Hint: groupby and mean of DailyChange


perform=df.groupby('Stock')['daily_price'].mean()
best=perform.idxmax()
worst=perform.idxmin()
print(f'Best performer:{best} and avg value: {perform['Wipro']:.2f}')
print(f'Worst performer:{worst} and avg value: {perform['Tech Mahindra']:.2f}')

# ### Q9.7: Pivot Table
# #### Create a pivot table showing average closing price by stock and month.
# #### Hint: pivot_table with values, index, columns


pivot_table=pd.pivot_table(df, values='ClosePrice', index='Stock',columns='Month',aggfunc='mean')
pivot_table

# ### Q9.8: Multi-Stock Plot
# #### Visualize closing prices for all stocks on same plot with legend.
# #### Hint: Multiple line plots


import seaborn as sns
import matplotlib.pyplot as plt

plt.figure(figsize=(14, 6))
sns.lineplot(data=df, x='Date', y='ClosePrice', hue='Stock', marker='o')

plt.xlabel('Date', fontsize=12)
plt.ylabel('Closing Price', fontsize=12)
plt.title('Stock Closing Price', fontsize=14, fontweight='bold')
plt.xticks(rotation=90)
plt.grid(alpha=0.3)
plt.tight_layout()
plt.show()


# ### Q9.9: Correlation Matrix
# #### Calculate correlation between stocks' closing prices using NumPy.
# #### Hint: np.corrcoef on price array


import numpy as np

pivot=pd.pivot_table(df,values='ClosePrice' ,index='Date',columns='Stock')
corr=pivot.corr()
corr

plt.figure(figsize=(10,6))
sns.heatmap(corr, annot=True, fmt='.2f', cmap='Set1', square=True)
plt.title('Stock Price', fontweight='bold')
plt.tight_layout()
plt.show()


# 
# #### Create a dashboard with multiple subplots showing various stock metrics.
# #### Hint: Multiple subplots


sns.set_style("whitegrid") 
fig, axs = plt.subplots(2, 2, figsize=(12, 8))

sns.lineplot(data=df,x='Date',y='ClosePrice',marker='o',ax=axs[0,0],color='blue')
axs[0,0].set_title('Line plot',fontsize=14)
axs[0,0].set_xlabel('Date',fontsize=12)
axs[0,0].set_ylabel('Close Price',fontsize=12)
axs[0,0].grid(True, alpha=0.3)
axs[0,0].tick_params(axis='x', rotation=45)

sns.scatterplot(data=df,x='Date',y='ClosePrice',ax=axs[0,1],color='violet')
axs[0,1].set_title('Scatter plot',fontsize=14)
axs[0,1].set_xlabel('Date',fontsize=12)
axs[0,1].set_ylabel('Close Price',fontsize=12)
axs[0,1].grid(True, alpha=0.3)
axs[0,1].tick_params(axis='x', rotation=45)
 
sns.barplot(data=df,x='Stock',y='ClosePrice',hue='Stock',ax=axs[1,0],errorbar=('ci', 95),palette='Set1')
axs[1,0].set_title('Bar plot',fontsize=14)
axs[1,0].set_xlabel('Date',fontsize=12)
axs[1,0].set_ylabel('Close Price',fontsize=12)
axs[1,0].grid(True, alpha=0.3)
axs[1,0].tick_params(axis='x', rotation=90)
 
sns.histplot(data=df,x='ClosePrice',bins=20,kde = True,ax=axs[1,1],color='maroon')
axs[1,1].set_title('Hist Plot',fontsize=14)
axs[1,1].set_xlabel('Date',fontsize=12)
axs[1,1].set_ylabel('Close Price',fontsize=12)
axs[1,1].grid(True, alpha=0.3)
axs[1,1].tick_params(axis='x', rotation=45)
 
plt.suptitle('Dashboard of multiple plot-ClosePrice VS Date',fontsize=16,fontweight='bold')
plt.tight_layout()
plt.show()