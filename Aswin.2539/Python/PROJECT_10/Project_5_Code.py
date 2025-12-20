# ## ASSIGNMENT 5: Matplotlib Visualization

# ### Dataset: assignment5_monthly_trends.csv
import matplotlib.pyplot as plt

import pandas as pd

df = pd.read_csv('assignment5_monthly_trends(in).csv')

df

# ### Q5.1: Line Plot - Monthly Revenue

# #### Create a line plot showing total monthly revenue for 2024 with proper labels and grid

# Create a line plot
df['Month'] = pd.to_datetime(df['Month'])
plt.figure(figsize=(10,6))
plt.plot(df['Month'],df['TotalRevenue'],marker = 'o', linewidth = 2, markersize = 6,color = 'blue')
plt.xlabel('Month', fontsize = 12)
plt.ylabel('Total Revenue ($)', fontsize = 12)
plt.title('Monthly Revenue Trends (2024)', fontsize = 12, fontweight = 'bold')
plt.grid(True, alpha= 0.7)
plt.tight_layout()
plt.show()

# ### Q5.2: Grouped Bar Chart

# ### Create a bar chart comparing ProductA, ProductB, and ProductC revenues across all months.

# Create bar Chart
plt.figure(figsize=(10,6))
x = range(len(df))
width = 0.25
plt.bar([i - width for i in range(len(df))], df['ProductA_Revenue'],width, label = 'Product A', color = 'purple')
plt.bar([i for i in range(len(df))], df['ProductB_Revenue'],width, label = 'Product B', color = 'silver')
plt.bar([i + width for i in range(len(df))], df['ProductC_Revenue'],width, label = 'Product C', color = 'olive')
plt.xlabel('Month', fontsize = 12)
plt.ylabel('Revenue ($)',fontsize = 12)
plt.title('Product Comparison Across All Months', fontsize = 12, fontweight ='bold')
plt.legend(loc='best')
plt.xticks(x, [d.strftime('%b') for d in df['Month']])
plt.tight_layout()
plt.show()

# ### Q5.3: Subplots for Products

# #### Plot ProductA and ProductB on the same figure using subplots (2 separate plots)

# Create  subplots
fig, (ax1, ax2) = plt.subplots(1, 2, figsize=(14, 6))

ax1.plot(df['Month'],df['ProductA_Revenue'],marker = 'o', linewidth = 3, markersize = 8, color = 'black')
ax1.set_xlabel('Month', fontsize = 12)
ax1.set_ylabel('Product A Revenue ($)', fontsize = 12)
ax1.set_title('Product A Revenue Across All Months',fontsize = 12 , fontweight = 'bold')
ax1.grid(True, alpha=0.3)

ax2.plot(df['Month'],df['ProductB_Revenue'],marker = 'o', linewidth = 3, markersize = 8, color = 'maroon')
ax2.set_xlabel('Month', fontsize = 12)
ax2.set_ylabel('Product B Revenue ($)', fontsize = 12)
ax2.set_title('Product B Revenue Across All Months',fontsize = 12 , fontweight = 'bold')
ax2.grid(True, alpha=0.3)
plt.tight_layout()
plt.show()

# ### Q5.4: Multi-line Plot with Legend

# #### Create a line plot with markers showing all three products and a legend.

# Create multi-line chart

plt.figure(figsize=(12, 6))
plt.plot(df['Month'], df['ProductA_Revenue'], marker='o', label='Product A', linewidth=2,markersize=6,color = 'black')
plt.plot(df['Month'], df['ProductB_Revenue'], marker='s', label='Product B', linewidth=2, markersize=6,color = 'red')
plt.plot(df['Month'], df['ProductC_Revenue'], marker='^', label='Product C', linewidth=2, markersize=6,color = 'blue')
plt.xlabel('Month', fontsize=12)
plt.ylabel('Revenue ($)', fontsize=12)
plt.title('Three Product Comparison', fontsize=14, fontweight='bold')
plt.legend(loc='best', fontsize=10)
plt.grid(True, alpha=0.5)
plt.xticks(rotation = 45)
plt.tight_layout()
plt.show()
 

# ### Q5.5: Customized Bar Chart

# #### Customize a bar chart with different colors for each month and a bold title.

# Create bar Chart
colors = plt.cm.tab20(range(len(df)))
plt.figure(figsize=(10,6))
bars = plt.bar(range(len(df)), df['TotalRevenue'], color = colors)
for bar in bars:
    height = bar.get_height()
    plt.text(
    bar.get_x() + bar.get_width() / 2,
    height,
    f'${height:,.0f}',
    ha='center',
    va='bottom',
    fontsize=9
)
plt.xlabel('Month', fontsize = 12)
plt.ylabel('Total Revenue ($)', fontsize = 12)
plt.title('Total monthly revenue 2024', fontsize = 12, fontweight ='bold')
plt.xticks(range(len(df)),[d.strftime('%B') for d in df['Month']],rotation=45)
plt.tight_layout()
plt.show()

# ### Q5.6: Complex Subplot Layout

# #### Create a figure with multiple subplots: line plot, bar chart, and scatter plot

# multiple subplots
fig, axs = plt.subplots(2,2, figsize=(12,8))
# line plot
axs[0,0].plot(df['Month'], df['TotalRevenue'],marker = 'o', linewidth = 2, markersize = 8, color = 'lime')
axs[0,0].set_xlabel('Month', fontsize = 12)
axs[0,0].set_ylabel('Total Revenue ($)', fontsize = 12)
axs[0,0].set_title('Monthly Revenue Trend - Line Chart',fontsize = 12 , fontweight = 'bold')
axs[0,0].grid(True, alpha=0.3)
# Bar chart
axs[0, 1].bar(range(len(df)),df['TotalRevenue'], color='orange')
axs[0, 1].set_title('Monthly Revenue Trends - Bar chart',fontsize = 12 , fontweight = 'bold')
axs[0, 1].set_xlabel('Month')
axs[0, 1].set_ylabel('Total Revenue ($)')
# Scatter plot                                       
axs[1, 0].scatter(range(len(df)),df['TotalRevenue'],s=50, color='purple', marker='o')
axs[1, 0].set_title('Monthly Revenue Trends - Scatter plot',fontsize = 12 , fontweight = 'bold')
axs[1, 0].set_xlabel('Month')
axs[1, 0].set_ylabel('Total Revenue ($)')        
# Another line plot
axs[1, 1].plot(df['Month'],df['ProductA_Revenue'], color='blue', marker='o')
axs[1, 1].set_title('Monthly Revenue Trends - Line plot',fontsize = 12 , fontweight = 'bold')
axs[1, 1].set_xlabel('Month')
axs[1, 1].set_ylabel('Total Revenue ($)')   

plt.tight_layout()
plt.show()

# ### Q5.7: Annotations

# #### Add annotations to show the highest revenue month on a line plot.

max_revenue_index = df['TotalRevenue'].idxmax()
max_month = df.loc[max_revenue_index , 'Month']
max_revenue = df.loc[max_revenue_index , 'TotalRevenue']
plt.figure(figsize=(12, 6))
plt.plot(df['Month'], df['TotalRevenue'],marker='o', linewidth=2, color='maroon')

plt.annotate(
    f"Peak Value: ${max_revenue:,.0f}",xy=(max_month, max_revenue),xytext=(max_month, max_revenue * 1.05),arrowprops=dict(arrowstyle='->', color='maroon'))

plt.xlabel('Month', fontsize=12)
plt.ylabel(' Total Revenue ($)', fontsize=12)
plt.title('Monthly Revenue with Peak Annotation',fontsize=12, fontweight='bold')
plt.grid(True, alpha=0.3)
plt.tight_layout()
plt.show()

# ### Q5.8: Stacked Bar Chart

# #### Create a stacked bar chart showing the contribution of each product per month.

# Create stack bar chart

plt.figure(figsize=(12,6))
bottom_a = df['ProductA_Revenue']
bottom_ab = bottom_a + df['ProductB_Revenue']
plt.bar(range(len(df)) , df['ProductA_Revenue'], label='Product A', color = 'cyan')
plt.bar(range(len(df)) , df['ProductB_Revenue'], bottom = bottom_a , label='Product A', color = 'olive')
plt.bar(range(len(df)) , df['ProductC_Revenue'], bottom = bottom_ab , label='Product A', color = 'silver')
plt.xlabel('Month', fontsize=12)
plt.ylabel('Revenue ($)', fontsize=12)
plt.title('Stacked Revenue by Product', fontsize=14, fontweight='bold')
df['Month'] = pd.to_datetime(df['Month'])
plt.xticks(range(len(df)), [d.strftime('%b') for d in df['Month']])
plt.legend()

# ### Q5.9: Save Chart as Image
# #### Save a visualization as 'monthly_analysis.png' with 300 DPI.

plt.figure(figsize=(12, 6))
plt.plot(df['Month'], df['TotalRevenue'], marker='o', linewidth=2, color='green')
plt.xlabel('Month', fontsize=12)
plt.ylabel('Revenue ($)', fontsize=12)
plt.title('Monthly Revenue Trends', fontsize=14, fontweight='bold')
plt.grid(True, alpha=0.3)
plt.xticks(rotation=45)
#save the visual to image
plt.savefig('monthly_analysis.png', dpi=300, bbox_inches='tight')
print("Monthly_Analysis_Png is saved succesfully with dpi=300")
plt.show()

# ### Q5.10: Dual-Axis Plot

# #### Create a dual-axis plot: line for TotalRevenue and bars for AvgOrderValue.

fig, ax1 = plt.subplots(figsize=(12, 6))
ax1.plot(df['Month'],df['TotalRevenue'],marker='o',linewidth=2,label='Total Revenue')
ax1.set_xlabel('Month', fontsize=12)
ax1.set_ylabel('Total Revenue ($)', fontsize=12)
ax1.tick_params(axis='y')
ax2 = ax1.twinx()
ax2.bar(df['Month'],df['AvgOrderValue'],alpha=0.35,label='Avg Order Value')
ax2.set_ylabel('Avg Order Value ($)', fontsize=12)
ax2.tick_params(axis='y')
plt.title('Dual-Axis Plot: Total Revenue vs Avg Order Value',fontsize=14, fontweight='bold')
ax1.legend(loc='upper left')
plt.tight_layout()
plt.show()

# ### Challenge Extension

# #### Challenge 1: Create a dashboard-style figure with 4 different visualizations

# multiple subplots
fig, axs = plt.subplots(2,2, figsize=(14,10),dpi = 300)
# line plot
axs[0,0].plot(df['Month'], df['TotalRevenue'],marker = 'o', linewidth = 2, markersize = 8, color = 'lime')
axs[0,0].set_xlabel('Month', fontsize = 12)
axs[0,0].set_ylabel('Total Revenue ($)', fontsize = 12)
axs[0,0].set_title('Monthly Revenue Trend - Line Chart',fontsize = 12 , fontweight = 'bold')
axs[0,0].grid(True, alpha=0.3)
    
# Bar chart
axs[0, 1].bar(range(len(df)),df['TotalRevenue'], color='orange')
axs[0, 1].set_title('Monthly Revenue Trends - Bar chart',fontsize = 12 , fontweight = 'bold')
axs[0, 1].set_xlabel('Month')
axs[0, 1].set_ylabel('Total Revenue ($)')
# Scatter plot                                       
axs[1, 0].scatter(range(len(df)),df['TotalRevenue'],s=50, color='purple', marker='o')
axs[1, 0].set_title('Monthly Revenue Trends - Scatter plot',fontsize = 12 , fontweight = 'bold')
axs[1, 0].set_xlabel('Month')
axs[1, 0].set_ylabel('Total Revenue ($)')        
# Another line plot
axs[1,1].plot(df['Month'], df['ProductA_Revenue'], marker='o', label='Product A', linewidth=2,markersize=6,color = 'yellow')
axs[1,1].plot(df['Month'], df['ProductB_Revenue'], marker='s', label='Product B', linewidth=2, markersize=6,color = 'red')
axs[1,1].plot(df['Month'], df['ProductC_Revenue'], marker='^', label='Product C', linewidth=2, markersize=6,color = 'blue')
axs[1,1].set_xlabel('Month', fontsize=12)
axs[1,1].set_ylabel(' Total Revenue ($)', fontsize=12)
axs[1,1].set_title('Three Product Comparison', fontsize=14, fontweight='bold')
axs[1,1].legend(loc='best', fontsize=10)
axs[1,1].grid(True, alpha=0.5)
 
plt.suptitle('Sales Performance Dashboard', fontsize=16, fontweight='bold')
plt.tight_layout(rect=[0, 0, 1, 0.95])
plt.show()

# #### `Challenge 3: Create histograms with overlapping transparency.

plt.figure(figsize=(10, 6))
plt.hist(df['ProductA_Revenue'], bins=10, alpha=0.6, label='Product A', color='red')
plt.hist(df['ProductB_Revenue'], bins=10, alpha=0.6, label='Product B', color='aqua')
plt.hist(df['ProductC_Revenue'],bins=10,alpha=0.6,label='Product C', color='maroon')
plt.xlabel('Reveneue ($)')
plt.ylabel('Frequency')
plt.title('Overlapping Histograms with Transparency')
plt.legend()
plt.grid(axis='y', alpha=0.3)
plt.show()

# ### Thank You