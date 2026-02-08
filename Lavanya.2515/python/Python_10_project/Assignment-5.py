# Generated from: Assignment-5.ipynb
# Converted at: 2025-12-20T10:51:51.099Z
# Next step (optional): refactor into modules & generate tests with RunCell
# Quick start: pip install runcell

# # ASSIGNMENT 5: Matplotlib Visualization


# ## Questions


# ### Q5.1: Line Plot - Monthly Revenue


# #### Create a line plot showing total monthly revenue for 2024 with proper labels and grid.


import pandas as pd
import numpy as np
import matplotlib.pyplot as plt

df=pd.read_csv('assignment5_monthly_trends(in).csv')

df

plt.figure(figsize=(10, 6))
plt.plot(df['Month'], df['TotalRevenue'], marker='o', linewidth=2, color='green')
plt.xlabel('Month', fontsize=12)
plt.ylabel('Total Revenue ($)', fontsize=12)
plt.title('Monthly Revenue Trend - 2024', fontsize=14, fontweight='bold')
plt.grid(True, alpha=0.3)
plt.xticks(rotation=45)
plt.tight_layout()
plt.show()


# ### Q5.2: Grouped Bar Chart


# #### Create a bar chart comparing ProductA, ProductB, and ProductC revenues across all months.
# 


df['Month'] = pd.to_datetime(df['Month'])

plt.figure(figsize=(12, 6))
x = range(len(df))
width = 0.25
plt.bar([i - width for i in x], df['ProductA_Revenue'], width, label='Product A', color='green')
plt.bar([i for i in x], df['ProductB_Revenue'], width, label='Product B', color='blue')
plt.bar([i + width for i in x], df['ProductC_Revenue'], width, label='Product C', color='pink')
plt.xlabel('Month', fontsize=12)
plt.ylabel('Revenue ($)', fontsize=12)
plt.title('Product Revenue Comparison', fontsize=14, fontweight='bold')
plt.xticks(x, [d.strftime('%b') for d in df['Month']])
plt.legend()
plt.tight_layout()
plt.show()


# ### Q5.3: Subplots for Products


# #### Plot ProductA and ProductB on the same figure using subplots (2 separate plots).


fig, (ax1, ax2) = plt.subplots(1, 2, figsize=(14, 5))
ax1.plot(df['Month'], df['ProductA_Revenue'], marker='o', color='green', linewidth=2)
ax1.set_title('Product A Revenue', fontsize=12, fontweight='bold')
ax1.set_xlabel('Month')
ax1.set_ylabel('Revenue ($)')
ax1.grid(True, alpha=0.3)
ax2.plot(df['Month'], df['ProductB_Revenue'], marker='s', color='red', linewidth=2)
ax2.set_title('Product B Revenue', fontsize=12, fontweight='bold')
ax2.set_xlabel('Month')
ax2.set_ylabel('Revenue ($)')
ax2.grid(True, alpha=0.3)
plt.tight_layout()
plt.show()

# ### Q5.4: Multi-line Plot with Legend


# #### Create a line plot with markers showing all three products and a legend


plt.figure(figsize=(12, 6))
plt.plot(df['Month'],df['ProductA_Revenue'],marker='o',label='Product A',linewidth=2)
plt.plot(df['Month'], df['ProductB_Revenue'], marker='s', label='Product B', linewidth=2)
plt.plot(df['Month'], df['ProductC_Revenue'], marker='^',label='Product C', linewidth=2)
plt.xlabel('Month', fontsize=12)
plt.ylabel('Revenue ($)', fontsize=12)
plt.title('Product Revenue Trends', fontsize=14, fontweight='bold')
plt.legend(loc='best', fontsize=10)
plt.grid(True, alpha=0.3)
plt.xticks(rotation=45)
plt.tight_layout()
plt.show()

# ### Q5.5: Customized Bar Chart


# #### Customize a bar chart with different colors for each month and a bold title.


colors = plt.cm.Set3(range(len(df)))
plt.figure(figsize=(12, 6))
bars = plt.bar(range(len(df)), df['TotalRevenue'],
               color=colors, edgecolor='black', linewidth=1)
plt.title('Total Monthly Revenue 2024', fontsize=14, fontweight='bold')
plt.xlabel('Month', fontsize=12)
plt.ylabel('Revenue ($)', fontsize=12)
plt.xticks(range(len(df)),[d.strftime('%B') for d in df['Month']],rotation=45)
for bar in bars:
    height = bar.get_height()
    plt.text(bar.get_x() + bar.get_width()/2., height,
             f'${height:,.0f}', ha='center', va='bottom', fontsize=9)
plt.tight_layout()
plt.show()


# ### Q5.6: Complex Subplot Layout


# #### Create a figure with multiple subplots: line plot, bar chart, and scatter plot.


fig, axes = plt.subplots(2, 2, figsize=(14, 10))

# line chart
axes[0, 0].plot(df['Month'], df['TotalRevenue'], marker='o',color='blue', linewidth=2)
axes[0, 0].set_title('Total Revenue Trend')
axes[0, 0].set_ylabel('Revenue ($)')
axes[0, 0].grid(True, alpha=0.3)

# Bar chart 
axes[0, 1].bar(df['Month'], df['ProductA_Revenue'], color='coral')
axes[0, 1].set_title('Product A Revenue')
axes[0, 1].set_ylabel('Revenue ($)')

#Scatter plot
axes[1, 0].scatter(df['Month'], df['AvgOrderValue'], s=80, color='green', alpha=0.6)
axes[1, 0].set_title('Average Order Value')
axes[1, 0].set_xlabel('Month')
axes[1, 0].set_ylabel('Avg Order Value ($)')

# Line plot 
axes[1, 1].plot(df['Month'], df['ProductB_Revenue'], marker='s', color='purple', linewidth=2)
axes[1, 1].set_title('Product B Revenue Trend')
axes[1, 1].set_xlabel('Month')
axes[1, 1].set_ylabel('Revenue ($)')

plt.tight_layout()
plt.show()


# ### Q5.7: Annotations


# #### Add annotations to show the highest revenue month on a line plot


max_revenue_index = df['TotalRevenue'].idxmax()
max_month = df.loc[max_revenue_index , 'Month']
max_revenue = df.loc[max_revenue_index ,'TotalRevenue']

plt.figure(figsize=(12, 6))
plt.plot(df['Month'], df['TotalRevenue'],marker='o', linewidth=2, color='maroon')

plt.annotate(
    f"Peak Value : ${max_revenue:,.0f}",xy=(max_month, max_revenue),xytext=(max_month, max_revenue * 1.05),  
    arrowprops=dict(arrowstyle='->', color='maroon'))

plt.xlabel('Month', fontsize=12)
plt.ylabel(' Total Revenue ($)', fontsize=12)
plt.title('Monthly Revenue with Peak Annotation',fontsize=12, fontweight='bold')
plt.grid(True, alpha=0.3)
plt.tight_layout()
plt.show()


# ### Q5.8: Stacked Bar Chart


# #### Create a stacked bar chart showing the contribution of each product per month.


plt.figure(figsize=(12, 6))
bottom_a = df['ProductA_Revenue']
bottom_ab = bottom_a + df['ProductB_Revenue']
plt.bar(range(len(df)), df['ProductA_Revenue'], label='Product A', color='skyblue')
plt.bar(range(len(df)), df['ProductB_Revenue'], bottom=bottom_a, label='Product B', color='blue')
plt.bar(range(len(df)), df['ProductC_Revenue'], bottom=bottom_ab, label='Product C', color='red')
plt.xlabel('Month', fontsize=12)
plt.ylabel('Revenue ($)', fontsize=12)
plt.title('Stacked Revenue by Product', fontsize=14, fontweight='bold')
plt.xticks(range(len(df)), [d.strftime('%b') for d in df['Month']])
plt.legend()
plt.tight_layout()
plt.show()

# #### Q5.9: Save Chart as Image


# #### Save a visualization as 'monthly_analysis.png' with 300 DPI.


plt.figure(figsize=(12, 6))
plt.plot(df['Month'], df['TotalRevenue'], marker='o', linewidth=2, color='darkblue')

plt.title('Monthly Revenue Analysis', fontsize=14, fontweight='bold')
plt.xlabel('Month', fontsize=12)
plt.ylabel('Revenue ($)', fontsize=12)
plt.grid(alpha=0.3)
plt.xticks(rotation=45)

plt.savefig('monthly_analysis.png', dpi=300, bbox_inches='tight')   #dpi---quality  , bbox_inches---prevents the over lapping
print("Chart saved as 'monthly_analysis.png' (DPI: 300)")
plt.show()


# ### Q5.10: Dual-Axis Plot


# #### Create a dual-axis plot: line for TotalRevenue and bars for AvgOrderValue


fig, ax1 = plt.subplots(figsize=(12, 6))

# Line plot
ax1.plot(df['Month'],df['TotalRevenue'],marker='o',color='blue',linewidth=2.5,label='Total Revenue')
ax1.set_xlabel('Month', fontsize=12)
ax1.set_ylabel('Total Revenue ($)', color='blue', fontsize=12)
ax1.tick_params(axis='y', labelcolor='blue')  #tick_params---It changes how the numbers and marks on your graph axes look 
                                               # y -- left Y-axis

# Bar chart
ax2 = ax1.twinx()
ax2.bar(df['Month'],df['AvgOrderValue'],alpha=0.3,color='green',label='Avg Order Value')
ax2.set_ylabel('Avg Order Value ($)', color='green', fontsize=12)
ax2.tick_params(axis='y', labelcolor='green')               # y-- right Y-axis

# Title and legend
plt.title('Dual-Axis: Revenue and Average Order Value', fontsize=14, fontweight='bold')
fig.legend(loc='upper left')

plt.tight_layout()
plt.show()


# ### Challenge Extension


# ### Challenge 1:


# #### Create a dashboard-style figure with 4 different visualizations.


# multiple subplots
fig, axs = plt.subplots(2,2, figsize=(12,8))
# line plot
axs[0,0].plot(df['Month'], df['TotalRevenue'],marker = 'o', linewidth = 2, markersize = 8, color = 'lime')
axs[0,0].set_xlabel('Month', fontsize = 12)
axs[0,0].set_ylabel('Total Revenue ($)', fontsize = 12)
axs[0,0].set_title('Monthly Revenue Trend - Line Chart',fontsize = 12 )
axs[0,0].grid(True, alpha=0.3)

# Bar chart
axs[0, 1].bar(range(len(df)),df['TotalRevenue'], color='red')
axs[0, 1].set_title('Monthly Revenue Trends - Bar chart',fontsize = 12)
axs[0, 1].set_xlabel('Month')
axs[0, 1].set_ylabel('Total Revenue ($)')

# Scatter plot                                       
axs[1, 0].scatter(range(len(df)),df['TotalRevenue'],s=50, color='yellow', marker='o')
axs[1, 0].set_title('Monthly Revenue Trends - Scatter plot',fontsize = 12 )
axs[1, 0].set_xlabel('Month')
axs[1, 0].set_ylabel('Total Revenue ($)')       

# Another line plot
axs[1, 1].plot(df['Month'],df['ProductA_Revenue'], color='green', marker='o')
axs[1, 1].set_title('Monthly Revenue Trends - Line plot',fontsize = 12 )
axs[1, 1].set_xlabel('Month')
axs[1, 1].set_ylabel('Total Revenue ($)')  
plt.suptitle('Sales Dashboard Overview', fontsize=16, fontweight='bold')

plt.tight_layout()
plt.show()

# ### Challenge 3:


# #### Create histograms with overlapping transparency.


plt.figure(figsize=(10, 6))

plt.hist(df['ProductA_Revenue'], bins=10, alpha=0.6, label='Product A', color='purple')
plt.hist(df['ProductB_Revenue'], bins=10, alpha=0.6, label='Product B', color='green')
plt.hist(df['ProductC_Revenue'],bins=10,alpha=0.6,label='Product C', color='blue')

plt.title('Revenue Distribution by Product', fontsize=14, fontweight='bold')
plt.xlabel('Revenue ($)')
plt.ylabel('Frequency')
plt.legend(loc='best')
plt.grid(alpha=0.3)

plt.show()