import numpy as np
import pandas as pd 
import matplotlib.pyplot as plt
import seaborn as sns

df = pd.read_csv('assignment5_monthly_trends.csv')
df

## Q5.1: Line Plot - Monthly Revenue
#### Create a line plot showing total monthly revenue for 2024 with proper labels and grid
df['Month'] = pd.to_datetime(df['Month'])

plt.figure (figsize = (10,6))
plt.plot(df['Month'],df['TotalRevenue'],marker = 'o')
plt.xlabel ('Month')
plt.ylabel('Total Revenue ($)')
plt.title ('Monthly Revenue Trend - 2024',fontsize = 12 , fontweight = 'bold')
plt.grid(True,alpha = 0.7)
plt.tight_layout()
plt.show()

## Q5.2: Grouped Bar Chart
#### Create a bar chart comparing ProductA, ProductB, and ProductC revenues across all months.
df['Month'] = df['Month'].dt.strftime('%b')
x = np.arange(len(df['Month']))   
bar_width = 0.25                  
plt.figure(figsize=(10, 6))
plt.bar(x - bar_width, df['ProductA_Revenue'], width=bar_width, label='ProductA_Revenue')
plt.bar(x,df['ProductB_Revenue'], width=bar_width, label='ProductB_Revenue')
plt.bar(x + bar_width, df['ProductC_Revenue'], width=bar_width, label='ProductC_Revenue')
plt.xticks(x, df['Month'] )
plt.xlabel('Month')
plt.ylabel('Revenue ($)')
plt.title('Monthly Revenue by Product - 2024', fontsize=12, fontweight='bold')
plt.legend()
plt.grid(axis='y', alpha=0.3)
plt.tight_layout()
plt.show()


## Q5.3: Subplots for Products
#### Plot ProductA and ProductB on the same figure using subplots (2 separate plots).
fig,(ax1,ax2) = plt.subplots(1,2,figsize = (14,5))

ax1.plot(x,df['ProductA_Revenue'],marker = 'o',color = 'red')
ax1.set_xlabel('Month')
ax1.set_ylabel('Product-A Revenue ($)')
ax1.set_title('Product-A Revenue - 2024')
ax1.grid(True,alpha = 0.4)



ax2.plot(x,df['ProductB_Revenue'],marker = 'o',color = 'red')
ax2.set_xlabel('Month')
ax2.set_ylabel('Product-B Revenue ($)')
ax2.set_title('Product-B Revenue - 2024')
ax2.grid(True,alpha = 0.4)



plt.tight_layout()
plt.show()


## Q5.4: Multi-line Plot with Legend


#### Create a line plot with markers showing all three products and a legend
plt.figure(figsize=(10, 6))

plt.plot(df['Month'], df['ProductA_Revenue'],marker='o', label='Product A')
plt.plot(df['Month'], df['ProductB_Revenue'],marker='s', label='Product B')
plt.plot(df['Month'], df['ProductC_Revenue'],marker='^', label='Product C')

plt.xlabel('Month')
plt.ylabel('Revenue ($)')
plt.title('Monthly Revenue by Product - 2024', fontsize=12, fontweight='bold')
plt.legend()           
plt.grid(True, alpha=0.4)
plt.tight_layout()
plt.show()


## Q5.5: Customized Bar Chart
#### Customize a bar chart with different colors for each month and a bold title.
colors = plt.cm.Set3(range(len(df)))
plt.figure(figsize =(10,6))
plt.bar(df['Month'],df['TotalRevenue'],color = colors)

plt.xlabel('Month')
plt.ylabel('Total Revenue ($)')
plt.title('Monthly Revenue - 2024', fontsize = 14 , fontweight = 'bold')
plt.grid(axis = 'y',alpha = 0.3)
plt.tight_layout()
plt.show()

## Q5.6: Complex Subplot Layout
#### Create a figure with multiple subplots: line plot, bar chart, and scatter plot.


fig, axs = plt.subplots(2,2,figsize = (10,8))
# Line plot
axs[0,0].plot(df['Month'],df['ProductA_Revenue'],marker = 'o',label = 'Product A')
axs[0,0].set_title('Product A - Line')
axs[0,0].legend()

# Bar chart
axs[0,1].bar(df['Month'],df['ProductB_Revenue'],color = 'green',label = 'Product B')
axs[0,1].set_title('Product B - Bar')
axs[0,1].legend()

# Scatter plot
axs[1,0].scatter(df['Month'],df['ProductC_Revenue'],color = 'red',marker = 'x',label = 'Product C')
axs[1,0].set_title('Product C - Scatter')
axs[1,0].legend()

# Total Revenue line plot 
axs[1, 1].plot(df['Month'], df['TotalRevenue'], marker='s', color='purple', label='Total')
axs[1, 1].set_title('Total Revenue - Line')
axs[1, 1].legend()

for ax in axs.flat:
    ax.set_xlabel('Month')
    ax.set_ylabel('Revenue ($)')
    ax.grid(True,alpha = 0.5)

plt.tight_layout()
plt.show()


## Q5.7: Annotations
#### Add annotations to show the highest revenue month on a line plot.
plt.figure(figsize = (10,6))
plt.plot(df['Month'],df['TotalRevenue'],marker = 'o')

max_index = df['TotalRevenue'].idxmax()
max_x = df.loc[max_index,'Month']
max_y = df.loc[max_index,'TotalRevenue']

plt.annotate(
    f'Max:{max_y}',xy = (max_x,max_y),xytext =(max_x,max_y * 1.05),arrowprops = dict(arrowstyle ='->',color = 'red'))

plt.xlabel('Month')
plt.ylabel('Total Revenue ($)')
plt.title('Monthly Revenue - 2024', fontsize=12, fontweight='bold')
plt.grid(True, alpha=0.4)
plt.tight_layout()
plt.show()


## Q5.8: Stacked Bar Chart


#### Create a stacked bar chart showing the contribution of each product per month.
plt.figure(figsize=(10, 6))

# bottom layer
plt.bar(x,
        df['ProductA_Revenue'],
        label='Product A')

# middle layer, stacked on A
plt.bar(x,
        df['ProductB_Revenue'],
        bottom=df['ProductA_Revenue'],
        label='Product B')

# top layer, stacked on A + B
plt.bar(x,
        df['ProductC_Revenue'],
        bottom=df['ProductA_Revenue'] + df['ProductB_Revenue'],
        label='Product C')

plt.xticks(x, df['Month'])   
plt.xlabel('Month')
plt.ylabel('Revenue ($)')
plt.title('Stacked Monthly Revenue by Product - 2024', fontsize=12, fontweight='bold')
plt.legend()
plt.grid(axis='y', alpha=0.3)
plt.tight_layout()
plt.show()


## Q5.9: Save Chart as Image
#### Save a visualization as 'monthly_analysis.png' with 300 DPI.
plt.figure(figsize=(10, 6))
plt.plot(df['Month'], df['TotalRevenue'], marker='o', linewidth=2, color='blue')

plt.xlabel('Month')
plt.ylabel('Revenue ($)')
plt.grid(True,alpha = 0.5)
plt.title('Monthly Revenue Analysis - 2024', fontsize=12, fontweight='bold')
plt.tight_layout()

plt.savefig('monthly_analysis.png', dpi=300) 



## Q5.10: Dual-Axis Plot
#### Create a dual-axis plot: line for TotalRevenue and bars for AvgOrderValue
fig, ax1 = plt.subplots(figsize = (10,6))
ax1.bar(x,df['AvgOrderValue'],color = 'skyblue',label = 'Avg Order Value')
ax1.set_xlabel('Month')
ax1.set_ylabel('Avg Order Value ($)', color = 'darkblue')
ax1.tick_params(axis = 'y',labelcolor = 'skyblue')


ax2 = ax1.twinx()
ax2.plot(x,df['TotalRevenue'],color = 'red',marker = 'o',label = 'Total Revenue')
ax2.set_xlabel('Month')
ax2.set_ylabel('Total Revenue ($)',color = 'red')
ax2.tick_params(axis = 'y',labelcolor = 'red')

plt.title('Total Revenue and Avg Order Value - 2024',fontsize = 12,fontweight = 'bold')

plt.tight_layout()
plt.show()

## Challenge Extension


#### Challenge 1: Create a dashboard-style figure with 4 different visualizations 
fig, axs = plt.subplots(2, 2, figsize=(12, 8))
fig.suptitle('Monthly Sales Dashboard - 2024', fontsize=14, fontweight='bold')

# 1) Line plot: Total revenue
axs[0, 0].plot(df['Month'], df['TotalRevenue'], marker='o', color='tab:blue')
axs[0, 0].set_title('Total Revenue')
axs[0, 0].set_ylabel('Revenue ($)')
axs[0, 0].grid(True, alpha=0.3)

# 2) Bar chart: Product A
axs[0, 1].bar(df['Month'], df['ProductA_Revenue'], color='tab:orange')
axs[0, 1].set_title('Product A Revenue')
axs[0, 1].grid(True, axis='y', alpha=0.3)

# 3) Scatter: Product B vs Product C
axs[1, 0].scatter(df['ProductB_Revenue'], df['ProductC_Revenue'], color='tab:green')
axs[1, 0].set_title('Product B vs Product C')
axs[1, 0].set_xlabel('Product B Revenue')
axs[1, 0].set_ylabel('Product C Revenue')
axs[1, 0].grid(True, alpha=0.3)

# 4) Stacked bar:
axs[1, 1].bar(df['Month'], df['ProductA_Revenue'], label='A')
axs[1, 1].bar(df['Month'], df['ProductB_Revenue'],bottom=df['ProductA_Revenue'], label='B')
axs[1, 1].bar(df['Month'], df['ProductC_Revenue'],bottom=df['ProductA_Revenue'] + df['ProductB_Revenue'], label='C')
axs[1, 1].set_title('Stacked Revenue by Product')
axs[1, 1].legend()
axs[1, 1].grid(True, axis='y', alpha=0.3)

for ax in axs.flat:
    ax.set_xlabel('Month')
    ax.tick_params(axis='x')

plt.tight_layout()
plt.show()


#### Challenge 2: Animate a chart showing progressive revenue growth.





#### Challenge 3: Create histograms with overlapping transparency
plt.figure(figsize=(10, 6)) 
sns.histplot(data=df, x='ProductA_Revenue', kde=True, bins=20, color='yellow')
sns.histplot(data=df, x='ProductB_Revenue', kde=True, bins=20, color='red')
plt.xlabel('Revenue', fontsize=12)
plt.ylabel('Frequency', fontsize=12)
plt.title('Overlapping Revenue ', fontsize=14, fontweight='bold')
plt.tight_layout()
plt.show()