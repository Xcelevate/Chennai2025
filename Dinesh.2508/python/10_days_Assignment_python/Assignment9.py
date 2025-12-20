import numpy as np
import pandas as pd
import seaborn as sns 
import matplotlib.pyplot as plt 

df = pd.read_csv('assignment9_stock_market_data.csv')
df

## Q9.1: Data Summary
#### Load stock data and display price statistics (open, close, high, low) per stock.
price_statistics = df.groupby('Stock')[['OpenPrice','HighPrice','LowPrice','ClosePrice']].sum()
price_statistics

## Q9.2: Daily Change
#### Calculate daily price change (ClosePrice - OpenPrice) and add as new column
df['DailyChange'] = df['ClosePrice'] - df['OpenPrice']
df.head(10)

## Q9.3: Stock Metrics
#### Group by stock and calculate average volume and volatility (HighPrice - LowPrice)
df['Volatility'] = df['HighPrice'] - df['LowPrice']
stock_metrics = df.groupby('Stock').agg({'Volume':'mean','Volatility':'mean'})
stock_metrics

## Q9.4: Single Stock Plot
#### Filter data for one stock and plot its closing price trend over time.
df['Date'] = pd.to_datetime(df['Date'])
df = df.sort_values(['Date','Stock'])
stock_name = 'TCS'
stock_df = df[df['Stock'] == stock_name].copy()

plt.figure(figsize = (20,5))
plt.plot(df['Date'],df['ClosePrice'],marker = 'o')
plt.title(f'{stock_name} Closing Price Over Time')
plt.xlabel('Date')
plt.ylabel('Closing Price')
plt.grid(True,alpha = 0.3)
plt.tight_layout()
plt.show()

## Q9.5: Monthly Averages
#### Calculate monthly average closing price for each stock
df['Date'] = pd.to_datetime(df['Date'])
df['Month'] = df['Date'].dt.to_period('M')
monthly_avg = df.groupby(['Stock','Month'])['ClosePrice'].mean().reset_index()
monthly_avg

## Q9.6: Best & Worst Performers
#### Identify best (highest return) and worst (lowest return) performing stocks
avg_return = df.groupby('Stock')['DailyChange'].mean()
best_stock = avg_return.idxmax()
worst_stock = avg_return.idxmin()
print(best_stock)
print(worst_stock)

## Q9.7: Pivot Table
#### Create a pivot table showing average closing price by stock and month.
pivot_table = pd.pivot_table(df, values ='ClosePrice', index = 'Stock', columns = 'Month',aggfunc = 'mean' )
print(pivot_table)

## Q9.8: Multi-Stock Plot
#### Visualize closing prices for all stocks on same plot with legend
pivot_table = pd.pivot_table(df, values ='ClosePrice', index = 'Stock', columns = 'Month',aggfunc = 'mean' )
plt.figure(figsize =(22,10))
pivot_table.plot(ax =plt.gca(),marker = 'o')
plt.xlabel('Month')
plt.ylabel('Average Closing Price')
plt.title('Closing Prices of All Stocks')
plt.legend(title = 'Stock')
plt.grid(True)
plt.tight_layout()
plt.show()

## Q9.9: Correlation Matrix
#### Calculate correlation between stocks' closing prices using NumPy
pivot_table = df.pivot_table(index ='Date',columns ='Stock',values = 'ClosePrice')
corr = pivot_table.corr()
print(corr)

plt.figure(figsize=(10,6))
sns.heatmap(corr,annot = True,fmt = '.2f',cmap = 'coolwarm')
plt.title('Stock Price Correlations', fontweight = 'bold')
plt.tight_layout()
plt.show()

## Q9.10: Comprehensive Dashboard
#### Create a dashboard with multiple subplots showing various stock metrics
df = df.sort_values(['Date','Stock'])
stock_name = 'TCS'
df = df[df['Stock'] == stock_name].copy()

fig,axes = plt.subplots(2,1,figsize = (10,8))
# Closing price
axes[0].plot(df['Date'],df['ClosePrice'],marker ='o')
axes[0].set_title(f'{stock_name} Closing Price',fontsize =14,fontweight = 'bold')
axes[0].set_ylabel('Price')

# Trading Volume
axes[1].bar(df['Date'],df['Volume'])
axes[1].set_title(f'{stock_name} Volume',fontsize = 14,fontweight = 'bold')
axes[1].set_ylabel('Volume')

for ax in axes.flat:
    ax.grid(True)
plt.tight_layout()
plt.show()