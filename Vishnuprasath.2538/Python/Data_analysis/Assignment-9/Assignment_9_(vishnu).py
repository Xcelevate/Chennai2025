# ## ASSIGNMENT 9: Stock Market Time Series
# ### Sessions 6-9: Time Series & Technical Analysis


import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns
import numpy as np

df = pd.read_csv('assignment9_stock_market_data(in).csv')
df

df.describe()

# ### Q9.1: Data Summary
# #### Load stock data and display price statistics (open, close, high, low) per stock.


df['Date'] = pd.to_datetime(df['Date'])
df

stock_stats = df.groupby('Stock')[['OpenPrice', 'HighPrice', 'LowPrice', 'ClosePrice']].describe().reset_index()

stock_stats

# ### Q9.2: Daily Change
# #### Calculate daily price change (ClosePrice - OpenPrice) and add as new column.


df['Daily_price_change'] = df['ClosePrice']-df['OpenPrice']

df

# ### Q9.3: Stock Metrics
# #### Group by stock and calculate average volume and volatility (HighPrice - LowPrice).


df['volatility'] = df['HighPrice']-df['LowPrice']

avg_vol = round(df.groupby('Stock')[['Volume', 'volatility']].agg('mean'),2).reset_index()
avg_vol

# ### Q9.4: Single Stock Plot
# #### Filter data for one stock and plot its closing price trend over time.


stock_name = df['Stock'].unique()[0]
stock_name

stock_data = df[df['Stock']==stock_name].sort_values('Date')
stock_data

plt.figure(figsize=(16,10))
plt.plot(stock_data['Date'], stock_data['ClosePrice'], marker='o', linewidth=1, linestyle='-')
plt.xlabel('Date')
plt.ylabel('ClosePrice')
plt.title(f'{stock_name} Closing Price Trends')
plt.xticks(rotation=45)
plt.grid(True)
plt.show()

# ### Q9.5: Monthly Averages
# #### Calculate monthly average closing price for each stock.


df['Month'] = df['Date'].dt.to_period('M')

df

monthly_avg = round(df.groupby(['Month','Stock'])['ClosePrice'].mean(),2).reset_index()
monthly_avg

monthly_avg = round(df.groupby(['Month','Stock'])['ClosePrice'].mean(),2).unstack()
monthly_avg

# ### Q9.6: Best & Worst Performers
# #### Identify best (highest return) and worst (lowest return) performing stocks.


best = round(df.groupby('Stock')['Daily_price_change'].mean(),2)

best

Best_performer = best.nlargest(1)
Best_performer

Worst_performer = best.nsmallest(1)
Worst_performer

# ### Q9.7: Pivot Table
# #### Create a pivot table showing average closing price by stock and month.


pivot_table = round(pd.pivot_table(df, index ='Month', columns='Stock', values='ClosePrice', aggfunc='mean'),2)

pivot_table

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
# ### Calculate correlation between stocks' closing prices using NumPy


pivot_df = pd.pivot_table(df, index='Date', columns='Stock', values='ClosePrice')

pivot_df

pivot_table = pd.pivot_table(df, values = 'ClosePrice', index = 'Date', columns = 'Stock')
corr = pivot_table.corr()

corr

# ### Q9.10: Comprehensive Dashboard
# #### Create a dashboard with multiple subplots showing various stock metrics


fig, axs = plt.subplots(2, 2, figsize=(14,8))

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

fig, axes = plt.subplots(2, 2, figsize=(14, 10))
colors=['r','b','g','c']
linestyles = ['-', '--', '-.',':']
markers = ['o', 's', '^','D']
stocks = df['Stock'].unique()[:4]
for i, stock in enumerate(stocks):
    ax = axes[i//2, i%2]
    stock_data = df[df['Stock'] == stock].sort_values('Date')
    ax.plot(stock_data['Date'], stock_data['ClosePrice'],linestyle=linestyles[i],marker=markers[i], color=colors[i])
    ax.set_title(f'{stock} Closing Price', fontweight='bold')
    ax.set_ylabel('Price ($)')
    ax.grid(True, alpha=0.3)
plt.suptitle('Stock Closing Price Dashboard',fontsize=14,fontweight='bold')
plt.tight_layout()
plt.show()