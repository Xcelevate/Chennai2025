import matplotlib.pyplot as plt
import numpy as np
import pandas as pd

df = pd.read_csv('assignment5_monthly_trends(in).csv')
df

# ### Q5.1: Line Plot - Monthly Revenue
# #### Create a line plot showing total monthly revenue for 2024 with proper labels and grid.


df['Month'] = pd.to_datetime(df['Month'])

df

plt.figure(figsize=(10, 6))
plt.plot(df['Month'], df['TotalRevenue'], marker='o', linewidth=2, color='blue')
plt.xlabel('Month', fontsize=12)
plt.ylabel('Total Revenue ($)', fontsize=12)
plt.title('Monthly revenue Trend - 2024', fontsize=14, fontweight='bold')
plt.grid(True, alpha=0.3)
plt.xticks(rotation = 45)
plt.tight_layout()
plt.show()

# ### Q5.2: Grouped Bar Chart
# #### Create a bar chart comparing ProductA, ProductB, and ProductC revenues across all months


df['MonthName'] = df['Month'].dt.strftime('%b')

df

x = np.arange(len(df['Month']))
width = 0.25

plt.figure(figsize=(12, 6))

plt.bar(x - width, df['ProductA_Revenue'], width, label='Product A')
plt.bar(x, df['ProductB_Revenue'], width, label='Product B')
plt.bar(x + width, df['ProductC_Revenue'], width, label='Product C')

plt.xlabel('Month')
plt.ylabel('Revenue')
plt.title('Monthly Revenue Comparison by Product - 2024')
plt.xticks(x, df['MonthName'], rotation=45)
plt.legend()
plt.grid(axis='y', alpha=0.3)

plt.tight_layout()
plt.show()

# ### Q5.3: Subplots for Products
# #### Plot ProductA and ProductB on the same figure using subplots (2 separate plots).


fig, axes = plt.subplots(1,2, figsize=(12,5))

axes[0].plot(df['Month'], df['ProductA_Revenue'])
axes[0].set_title('Product A Revenue')
axes[0].set_xlabel('Month')
axes[0].set_ylabel('Revenue')
axes[0].tick_params(axis='x', rotation=45)

axes[1].plot(df['Month'], df['ProductB_Revenue'])
axes[1].set_title('Product B Revenue')
axes[1].set_xlabel('Month')
axes[1].set_ylabel('Revenue')
axes[1].tick_params(axis='x',  rotation=45)

plt.tight_layout()
plt.show()

# ### Q5.4: Multi-line Plot with Legend
# ####Create a line plot with markers showing all three products and a legend.


plt.figure(figsize=(10, 6))

plt.plot(df['Month'], df['ProductA_Revenue'], marker='o', label='Product A')
plt.plot(df['Month'], df['ProductB_Revenue'], marker='s', label='Product B')
plt.plot(df['Month'], df['ProductC_Revenue'], marker='^', label='Product C')

plt.xlabel('Month')
plt.ylabel('Revenue')
plt.title('Monthly Revenue Trend by Product - 2024')
plt.legend()
plt.grid(True, alpha=0.3)
plt.xticks(df['Month'], df['MonthName'], rotation=45)

plt.tight_layout()
plt.show()

# ### Q5.5: Customized Bar Chart
# #### Customize a bar chart with different colors for each month and a bold title.


import matplotlib.pyplot as plt
import numpy as np

x = np.arange(len(df['Month']))

colors = plt.cm.tab20(x)   # automatic distinct colors

plt.figure(figsize=(10, 6))
plt.bar(x, df['TotalRevenue'], color=colors)

plt.xlabel('Month')
plt.ylabel('Total Revenue')
plt.title('Monthly Total Revenue - 2024', fontweight='bold')
plt.xticks(x, df['MonthName'], rotation=45)
plt.grid(axis='y', alpha=0.3)

plt.tight_layout()
plt.show()

# ### Q5.6: Complex Subplot Layout
# #### Create a figure with multiple subplots: line plot, bar chart, and scatter plot.


fig, axes = plt.subplots(2, 2, figsize=(12, 8))

# Line plot
axes[0, 0].plot(df['Month'], df['TotalRevenue'], marker='o')
axes[0, 0].set_title('Total Revenue Trend')
axes[0, 0].set_xlabel('Month')
axes[0, 0].set_ylabel('Revenue')
axes[0, 0].tick_params(axis='x', rotation=45)

# Bar chart
x = np.arange(len(df['Month']))
axes[0, 1].bar(x, df['ProductA_Revenue'])
axes[0, 1].set_title('Product A Revenue')
axes[0, 1].set_xlabel('Month')
axes[0, 1].set_ylabel('Revenue')
axes[0, 1].set_xticks(x)
axes[0, 1].set_xticklabels(df['MonthName'], rotation=45)

# Scatter plot
axes[1, 0].scatter(df['TotalRevenue'], df['AvgOrderValue'])
axes[1, 0].set_title('Avg Order Value vs Total Revenue')
axes[1, 0].set_xlabel('Total Revenue')
axes[1, 0].set_ylabel('Avg Order Value')

# Empty subplot
axes[1, 1].axis('off')

plt.tight_layout()
plt.show()

# ### Q5.7: Annotations
# #### Add annotations to show the highest revenue month on a line plot.


plt.figure(figsize=(10, 6))
plt.plot(df['Month'], df['TotalRevenue'], marker='o')

max_revenue = df['TotalRevenue'].max()
max_month = df.loc[df['TotalRevenue'] == max_revenue, 'Month'].values[0]

plt.annotate(
    'Highest Revenue',
    xy=(max_month, max_revenue),
    xytext=(max_month, max_revenue + 20000),
    arrowprops=dict(arrowstyle='->')
)

plt.xlabel('Month')
plt.ylabel('Total Revenue')
plt.title('Monthly Revenue Trend with Highest Month', fontweight='bold')
plt.xticks(rotation=45)
plt.grid(True, alpha=0.3)

plt.tight_layout()
plt.show()


# ### Q5.8: Stacked Bar Chart
# #### Create a stacked bar chart showing the contribution of each product per month.


x = np.arange(len(df['Month']))

plt.figure(figsize=(10, 6))

plt.bar(x, df['ProductA_Revenue'], label='Product A')
plt.bar(
    x,
    df['ProductB_Revenue'],
    bottom=df['ProductA_Revenue'],
    label='Product B'
)
plt.bar(
    x,
    df['ProductC_Revenue'],
    bottom=df['ProductA_Revenue'] + df['ProductB_Revenue'],
    label='Product C'
)

plt.xlabel('Month')
plt.ylabel('Revenue')
plt.title('Monthly Revenue Contribution by Product', fontweight='bold')
plt.xticks(x, df['MonthName'], rotation=45)
plt.legend()
plt.grid(axis='y', alpha=0.3)

plt.tight_layout()
plt.savefig('monthly_analysis.png', dpi=300)
plt.show()

# ### Q5.10: Dual-Axis Plot
# #### Create a dual-axis plot: line for TotalRevenue and bars for AvgOrderValue.


x = np.arange(len(df['Month']))

fig, ax1 = plt.subplots(figsize=(11, 6))

# Line plot (Total Revenue)
ax1.plot(x, df['TotalRevenue'], marker='o', color='blue', label='Total Revenue')
ax1.set_xlabel('Month')
ax1.set_ylabel('Total Revenue')
ax1.set_xticks(x)
ax1.set_xticklabels(df['MonthName'], rotation=45)

# Second axis
ax2 = ax1.twinx()

# Bar plot (Avg Order Value)
ax2.bar(x, df['AvgOrderValue'], width=0.4, alpha=0.5, color='orange', label='Avg Order Value')
ax2.set_ylabel('Avg Order Value')

# Title
plt.title('Total Revenue vs Avg Order Value', fontweight='bold')

# Legends (important!)
ax1.legend(loc='upper left')
ax2.legend(loc='upper right')

plt.tight_layout()
plt.show()

# ### Challenge Extension
# #### Challenge 1: Create a dashboard-style figure with 4 different visualizations.


x = np.arange(len(df['Month']))

fig, axes = plt.subplots(2, 2, figsize=(14, 10))

# 1. Line plot
axes[0, 0].plot(x, df['TotalRevenue'], marker='o')
axes[0, 0].set_title('Total Revenue Trend')
axes[0, 0].set_ylabel('Revenue')
axes[0, 0].set_xticks(x)
axes[0, 0].set_xticklabels(df['MonthName'], rotation=45)

# 2. Bar chart
axes[0, 1].bar(x, df['ProductA_Revenue'])
axes[0, 1].set_title('Product A Revenue')
axes[0, 1].set_ylabel('Revenue')
axes[0, 1].set_xticks(x)
axes[0, 1].set_xticklabels(df['MonthName'], rotation=45)

# 3. Stacked bar chart
axes[1, 0].bar(x, df['ProductA_Revenue'], label='Product A')
axes[1, 0].bar(x, df['ProductB_Revenue'],
               bottom=df['ProductA_Revenue'], label='Product B')
axes[1, 0].bar(x, df['ProductC_Revenue'],
               bottom=df['ProductA_Revenue'] + df['ProductB_Revenue'],
               label='Product C')
axes[1, 0].set_title('Product Contribution')
axes[1, 0].set_ylabel('Revenue')
axes[1, 0].set_xticks(x)
axes[1, 0].set_xticklabels(df['MonthName'], rotation=45)
axes[1, 0].legend()

# 4. Scatter plot
axes[1, 1].scatter(df['TotalRevenue'], df['AvgOrderValue'])
axes[1, 1].set_title('Revenue vs Avg Order Value')
axes[1, 1].set_xlabel('Total Revenue')
axes[1, 1].set_ylabel('Avg Order Value')

plt.tight_layout()
plt.show()

# ### Challenge 2: Animate a chart showing progressive revenue growth.


# ### Challenge 3: Create histograms with overlapping transparency.


plt.figure(figsize=(10, 6))

plt.hist(df['ProductA_Revenue'], bins=8, alpha=0.6, label='Product A')
plt.hist(df['ProductB_Revenue'], bins=8, alpha=0.6, label='Product B')
plt.hist(df['ProductC_Revenue'], bins=8, alpha=0.6, label='Product C')

plt.xlabel('Revenue')
plt.ylabel('Frequency')
plt.title('Revenue Distribution by Product')
plt.legend()
plt.grid(axis='y', alpha=0.3)

plt.tight_layout()
plt.show()