# Generated from: Assignment_5_Python.ipynb
# Converted at: 2025-12-20T08:54:51.035Z
# Next step (optional): refactor into modules & generate tests with RunCell
# Quick start: pip install runcell

import pandas as pd

df=pd.read_csv("assignment5_monthly_trends(in).csv")

df

# ### Q5.1: Line Plot - Monthly Revenue
# #### Create a line plot showing total monthly revenue for 2024 with proper labels and grid.
# Hint: Use 
# plt.plot(), plt.xlabel(),plt.ylabel(),plt.title(), plt.grid()


import matplotlib.pyplot as plt

plt.figure(figsize=(12,5))
plt.plot(df['Month'], df['TotalRevenue'], marker='o', linewidth=2, color='blue')
plt.xlabel('Month',fontsize=12)
plt.ylabel('TotalRevenue',fontsize=12)
plt.title('Monthly_Revenue',fontsize=12)
plt.grid(alpha=0.5)
plt.show()

# ### Q5.2: Grouped Bar Chart
# #### Create a bar chart comparing ProductA, ProductB, and ProductC revenues across all months.
# #### Hint: Use grouped bars with offset positions for each product


df['Month'] = pd.to_datetime(df['Month'])


plt.figure(figsize=(12,6))
width=0.25
plt.bar([i - width for i in range(len(df))],df['ProductA_Revenue'],width,label='ProductA',color='red')
plt.bar([i for i in range(len(df))], df['ProductB_Revenue'], width, label='ProductB', color='blue')
plt.bar([i + width for i in range(len(df))],df['ProductC_Revenue'],width,label='ProductC',color='green')
plt.xlabel('Month',fontsize=12)
plt.ylabel('ProductRevenue',fontsize=12)
plt.title('Grouped Bar Chart',fontsize=12)
plt.xticks(range(len(df)), [d.strftime('%b') for d in df['Month']])    #---d.strftime(%b)-->Converts date to short month name     #---%b → Jan, Feb, Mar…
plt.legend(loc='best')
plt.show()

# ### Q5.3: Subplots for Products
# #### Plot ProductA and ProductB on the same figure using subplots (2 separate plots).
# #### Hint: Use plt.subplots(1, 2) to create 1x2 grid


fig, (ax1, ax2) = plt.subplots(1, 2, figsize=(14, 5))
ax1.plot(df['Month'], df['ProductA_Revenue'], marker='o', color='green', linewidth=2)
ax1.set_title('Product A Revenue', fontsize=12, fontweight='bold')
ax1.set_xlabel('Month')
ax1.set_ylabel('Revenue')
ax1.grid(alpha=0.3)


ax2.plot(df['Month'], df['ProductB_Revenue'], marker='d', color='blue', linewidth=2)
ax2.set_title('Product B Revenue', fontsize=12, fontweight='bold')
ax2.set_xlabel('Month')
ax2.set_ylabel('Revenue')
ax2.grid(alpha=0.1)

plt.tight_layout()
plt.show()



# ### Q5.4: Multi-line Plot with Legend
# #### Create a line plot with markers showing all three products and a legend.
# #### Hint: Plot multiple lines with different colors and markers, use plt.legend()


plt.figure(figsize=(12, 6))
line_styles = ['-', '--','-']
markers = ['o', 's','^' ]

plt.plot(df['Month'], df['ProductA_Revenue'], marker='o', label='Product A', color='red',linewidth=2)
plt.plot(df['Month'], df['ProductB_Revenue'], marker='s', label='Product B',color='green', linewidth=2)
plt.plot(df['Month'], df['ProductC_Revenue'], marker='d', label='Product C', color='blue',linewidth=2)

plt.xlabel('Month', fontsize=12)
plt.ylabel('Products', fontsize=12)
plt.title('All three Products',fontsize=12)
plt.legend(loc='best', fontsize=10)
plt.grid(True, alpha=1)
plt.show()
    

# ### Q5.5: Customized Bar Chart
# ### Customize a bar chart with different colors for each month and a bold title.
# ### Hint: Use plt.cm color map or custom color list


df['Month'] = pd.to_datetime(df['Month'])


colors =['red','green','blue','orange','violet']
plt.figure(figsize=(12, 6))
bars = plt.bar( range(len(df)), df['TotalRevenue'], color=colors,edgecolor='black', linewidth=2)

plt.title('Total Monthly Revenue 2024', fontsize=14, fontweight='bold')
plt.xlabel('Month', fontsize=12)
plt.ylabel('Revenue ($)', fontsize=12)
plt.xticks(range(len(df)),[d.strftime('%b') for d in df['Month']])
for bar in bars:
    height = bar.get_height()
    plt.text(bar.get_x() + bar.get_width()/2, height,f'${height:,.0f}', ha='center', va='bottom', fontsize=9)
    
plt.tight_layout()
plt.show()



# ### Q5.6: Complex Subplot Layout
# #### Create a figure with multiple subplots: line plot, bar chart, and scatter plot.
# #### Hint: Use plt.subplots(2, 2) for 2x2 grid


# multiple subplots
fig, axs = plt.subplots(2,2, figsize=(12,8))

# line plot
axs[0,0].plot(df['Month'], df['TotalRevenue'],marker = 'o', linewidth = 2, markersize = 8, color = 'lime')
axs[0,0].set_xlabel('Month', fontsize = 12)
axs[0,0].set_ylabel('Total Revenue ($)', fontsize = 12)
axs[0,0].set_title('Monthly Revenue Trend - Line Chart',fontsize = 12 )
axs[0,0].grid(True, alpha=0.3)

# Bar chart
axs[0, 1].bar(range(len(df)),df['TotalRevenue'], color='orange')
axs[0, 1].set_title('Monthly Revenue Trends - Bar chart',fontsize = 12)
axs[0, 1].set_xlabel('Month')
axs[0, 1].set_ylabel('Total Revenue ($)')

# Scatter plot                                       
axs[1, 0].scatter(range(len(df)),df['TotalRevenue'],s=50, color='purple', marker='o')
axs[1, 0].set_title('Monthly Revenue Trends - Scatter plot',fontsize = 12 )
axs[1, 0].set_xlabel('Month')
axs[1, 0].set_ylabel('Total Revenue ($)')       

# Another line plot
axs[1, 1].plot(df['Month'],df['ProductA_Revenue'], color='blue', marker='o')
axs[1, 1].set_title('Monthly Revenue Trends - Line plot',fontsize = 12 )
axs[1, 1].set_xlabel('Month')
axs[1, 1].set_ylabel('Total Revenue ($)')  
plt.suptitle('Sales Dashboard Overview', fontsize=16, fontweight='bold')

plt.tight_layout()
plt.show()

# ### Q5.7: Annotations
# #### Add annotations to show the highest revenue month on a line plot.
# #### Hint: Use plt.annotate() with arrow and text


max_revenue_index = df['TotalRevenue'].idxmax()
max_month = df.loc[max_revenue_index , 'Month']
max_revenue = df.loc[max_revenue_index ,'TotalRevenue']

plt.figure(figsize=(12, 6))
plt.plot(df['Month'], df['TotalRevenue'],marker='o', linewidth=2, color='maroon')

plt.annotate(
    f"Peak Value : ${max_revenue:,.0f}",xy=(max_month, max_revenue),xytext=(max_month, max_revenue * 1.05),   # annotate--it pick the peak value
    arrowprops=dict(arrowstyle='->', color='maroon'))

plt.xlabel('Month', fontsize=12)
plt.ylabel(' Total Revenue ($)', fontsize=12)
plt.title('Monthly Revenue with Peak Annotation',fontsize=12, fontweight='bold')
plt.grid(True, alpha=0.3)
plt.tight_layout()
plt.show()

# ### Q5.8: Stacked Bar Chart
# #### Create a stacked bar chart showing the contribution of each product per month.
# #### Hint: Use plt.bar() with bottom parameter for stacking


plt.figure(figsize=(12, 6))
revenue = df['ProductA_Revenue']

x=range(len(df))
bottom_ab = revenue + df['ProductB_Revenue']
plt.bar(x, df['ProductA_Revenue'], label='Product A', color='silver')
plt.bar(x, df['ProductB_Revenue'], bottom=revenue, label='Product B', color='red')
plt.bar(x, df['ProductC_Revenue'], bottom=bottom_ab, label='Product C', color='green')

plt.xlabel('Month', fontsize=12)
plt.ylabel('Revenue ', fontsize=12)
plt.title('Stacked Revenue by Product', fontsize=12, fontweight='bold')
plt.xticks(x,[d.strftime('%b') for d in df['Month']])
plt.legend()

# ### Q5.9: Save Chart as Image
# #### Save a visualization as 'monthly_analysis.png' with 300 DPI.
# #### Hint: Use plt.savefig('filename.png', dpi=300)


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
# #### Create a dual-axis plot: line for TotalRevenue and bars for AvgOrderValue.
# #### Hint: Use ax2 = ax1.twinx() for secondary y-axis


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
# #### Challenge 1:
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
axs[0, 1].bar(range(len(df)),df['TotalRevenue'], color='orange')
axs[0, 1].set_title('Monthly Revenue Trends - Bar chart',fontsize = 12)
axs[0, 1].set_xlabel('Month')
axs[0, 1].set_ylabel('Total Revenue ($)')

# Scatter plot                                       
axs[1, 0].scatter(range(len(df)),df['TotalRevenue'],s=50, color='purple', marker='o')
axs[1, 0].set_title('Monthly Revenue Trends - Scatter plot',fontsize = 12 )
axs[1, 0].set_xlabel('Month')
axs[1, 0].set_ylabel('Total Revenue ($)')       

# Another line plot
axs[1, 1].plot(df['Month'],df['ProductA_Revenue'], color='blue', marker='o')
axs[1, 1].set_title('Monthly Revenue Trends - Line plot',fontsize = 12 )
axs[1, 1].set_xlabel('Month')
axs[1, 1].set_ylabel('Total Revenue ($)')  
plt.suptitle('Sales Dashboard Overview', fontsize=16, fontweight='bold')

plt.tight_layout()
plt.show()

# ### Challenge 2:
# #### Animate a chart showing progressive revenue growth.




# ### Challenge 3:
# #### Create histograms with overlapping transparency.


plt.figure(figsize=(10, 6))

plt.hist(df['ProductA_Revenue'], bins=10, alpha=0.6, label='Product A', color='blue')
plt.hist(df['ProductB_Revenue'], bins=10, alpha=0.6, label='Product B', color='green')
plt.hist(df['ProductC_Revenue'],bins=10,alpha=0.6,label='Product C', color='red')

plt.title('Revenue Distribution by Product', fontsize=14, fontweight='bold')
plt.xlabel('Revenue ($)')
plt.ylabel('Frequency')
plt.legend(loc='best')
plt.grid(alpha=0.3)

plt.show()


Thank you