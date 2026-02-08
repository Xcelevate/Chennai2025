# Generated from: assignment_5_matplotlib.ipynb
# Converted at: 2025-12-20T11:29:56.949Z
# Next step (optional): refactor into modules & generate tests with RunCell
# Quick start: pip install runcell

# ## ASSIGNMENT 5: Matplotlib Visualization


# ### Questions
# ### Q5.1: Line Plot - Monthly Revenue


import pandas as pd
import matplotlib.pyplot as plt

df=pd.read_csv('assignment5_monthly_trends.csv')

df

df['Month'] = pd.to_datetime(df['Month'])

plt.figure(figsize=(18,6))
plt.plot(df['Month'],df['TotalRevenue'],marker='o',linewidth=3,color='blue')
plt.xlabel('Month',fontsize=12)
plt.ylabel('Total revenue ($)',fontsize=12)
plt.title('Total monthly revenue',fontsize=14)
plt.grid(True,alpha=0.3)
plt.xticks(rotation=45)
plt.tight_layout()
plt.show()

# ### Q5.2: Grouped Bar Chart


plt.figure(figsize=(12, 6))
x = range(len(df))      
width = 0.25  
plt.bar([i - width for i in x], df['ProductA_Revenue'],width, label='Product A')
plt.bar(x, df['ProductB_Revenue'],width, label='Product B')
plt.bar([i + width for i in x], df['ProductC_Revenue'],width, label='Product C')
plt.xlabel('Month', fontsize=12)
plt.ylabel('Revenue ($)', fontsize=12)
plt.title('Product Revenue Comparison', fontsize=14, fontweight='bold')
months = ['Jan','Feb','Mar','Apr','May','Jun','Jul','Aug','Sep','Oct','Nov','Dec']
plt.xticks(x, months)
plt.legend()
plt.tight_layout()
plt.show()


# ### Q5.3: Subplots for Products


fig,(ax1, ax2)=plt.subplots(1, 2, figsize=(14, 5))
ax1.plot(df['Month'],df['ProductA_Revenue'],marker='^',color='red',linewidth=1)
ax1.set_title('Product A Revenue', fontsize=12, fontweight='bold')
ax1.set_xlabel('Month')
ax1.set_ylabel('Revenue ($)')
ax1.grid(True, alpha=0.5)
ax2.plot(df['Month'],df['ProductB_Revenue'],marker='o',color='green',linewidth=1)
ax2.set_title('Product B Revenue', fontsize=12, fontweight='bold')
ax2.set_xlabel('Month')
ax2.set_ylabel('Revenue ($)')
ax2.grid(True, alpha=0.5)
plt.tight_layout()
plt.show()


# ### Q5.4: Multi-line Plot with Legend


plt.figure(figsize=(12,6))
plt.plot(df['Month'],df['ProductA_Revenue'],marker='o',linewidth=2,label='Product A',color='blue')
plt.plot(df['Month'],df['ProductB_Revenue'],marker='^',linewidth=2,label='Product B',color='green')
plt.plot(df['Month'],df['ProductC_Revenue'],marker='s',linewidth=2,label='Product C',color='purple')
plt.xlabel('Month',fontsize=12)
plt.ylabel('Revenue($)',fontsize=12)
plt.title('Product Revenue Trends',fontsize=14,fontweight='bold')
plt.legend(loc='best')
plt.grid(True,alpha=0.3)
plt.xticks(rotation=45)
plt.tight_layout()
plt.show()

# ### Q5.5: Customized Bar Chart


plt.figure(figsize=(10,6))
colors = plt.cm.Set3(range(len(df)))
months=['Jan','Feb','Mar','Apr','May','June','July','Aug','Sep','Oct','Nov','Dec']
plt.bar(range(len(df)),df['TotalRevenue'],color=colors,edgecolor='black',linewidth=1)
plt.xlabel('Months', fontsize=12)
plt.ylabel('Total Revenue', fontsize=12)
plt.title('Monthly revenue trend 2024', fontsize=14, fontweight='bold')
plt.xticks(range(len(months)),months,rotation=45)
plt.tight_layout()
plt.show()

# ### Q5.6: Complex Subplot Layout


fig,axes=plt.subplots(2,2,figsize=(25,15))
axes[0,0].plot(df['Month'], df['TotalRevenue'], marker='o')
axes[0,0].set_title('Total Revenue')
axes[0,0].set_ylabel('Revenue ($)')
axes[0,0].set_xlabel('Months')
axes[0,0].grid(True)

x = range(len(df))      
width = 0.2
axes[0, 1].bar([i - width for i in x], df['ProductA_Revenue'],width, label='Product A')
axes[0, 1].bar(x, df['ProductB_Revenue'],width, label='Product B')
axes[0, 1].bar([i + width for i in x], df['ProductC_Revenue'],width, label='Product C')
axes[0, 1].set_xlabel('Month', fontsize=12)
axes[0, 1].set_ylabel('Revenue ($)', fontsize=12)
axes[0, 1].set_title('Product Revenue Comparison', fontsize=14, fontweight='bold')
axes[0, 1].legend()

axes[1, 0].scatter(range(len(df)), df['AvgOrderValue'], s=120, color='blue', alpha=0.6)
axes[1, 0].set_title('Scatter: Avg Order Value')
axes[1, 0].set_ylabel('Avg Order Value ($)')
axes[1, 0].set_xlabel('Month')

axes[1, 1].plot(df['Month'], df['ProductB_Revenue'], marker='o',color='red')
axes[1, 1].set_title('Product B Revenue')
axes[1, 1].set_ylabel('Revenue ($)')
axes[1, 1].set_xlabel('Month')
axes[0,0].grid(True)
plt.tight_layout()
plt.show()

# ### Q5.7: Annotations


plt.figure(figsize=(12, 6))
plt.plot(df['Month'],df['TotalRevenue'],marker='o')
maximum_idx=df['TotalRevenue'].idxmax()
maximum_month=df.loc[maximum_idx,'Month']
maximum_value=df.loc[maximum_idx,'TotalRevenue']
plt.annotate(
    f"Highest:{maximum_value}",
    xy=(maximum_month,maximum_value),
    xytext=(10, 10),
    textcoords='offset points',
    bbox=dict(boxstyle='round,pad=0.5', facecolor='lightgreen', alpha=0.7),
    arrowprops=dict(arrowstyle='->')
)
plt.xlabel('Month')
plt.ylabel('Revenue')
plt.title('Monthly Revenue')
plt.grid(True,alpha=0.4)
plt.tight_layout()
plt.show()

# ### Q5.8: Stacked Bar Chart


plt.figure(figsize=(12, 6))
bottom_a=df['ProductA_Revenue']
bottom_ab=bottom_a+df['ProductB_Revenue']

plt.bar(range(len(df)),df['ProductA_Revenue'],label='Product A')
plt.bar(range(len(df)),df['ProductB_Revenue'],bottom=bottom_a,label='Product B')
plt.bar(range(len(df)),df['ProductC_Revenue'],bottom=bottom_ab,label='Product C')
plt.xlabel('Month',fontsize=12)
plt.ylabel('Revenue',fontsize=12)
plt.title('Stack Revenue by Product',fontsize=14,fontweight='bold')
plt.xticks(range(len(df)), df['Month'])
plt.legend()
plt.tight_layout()
plt.show()


# ### Q5.9: Save Chart as Image


plt.figure(figsize=(18,6))
plt.plot(df['Month'],df['TotalRevenue'],marker='o',linewidth=3,color='blue')
plt.xlabel('Month',fontsize=12)
plt.ylabel('Total revenue ($)',fontsize=12)
plt.title('Total monthly revenue',fontsize=14)
plt.grid(True,alpha=0.3)
plt.xticks(rotation=45)
plt.savefig('monthly_analysis.png', dpi=300, bbox_inches='tight')
print("Chart saved as 'monthly_analysis.png' ")
plt.show()

# ### Q5.10: Dual-Axis Plot


fig, ax1 = plt.subplots(figsize=(12, 6))
ax1.plot(df['Month'],df['TotalRevenue'],marker='o',label='Total Revenue',color='green')
ax1.set_xlabel('Month')
ax1.set_ylabel('Total Revenue ($)')
ax1.tick_params(axis='y')

ax2 = ax1.twinx()
ax2.bar(df['Month'],df['AvgOrderValue'],alpha=0.5,label='Avg Order Value',color='lightgreen')
ax2.set_ylabel('Avg Order Value ($)')
ax2.tick_params(axis='y')

plt.title('Revenue and Avg Order Value')
fig.legend(loc='upper left')
plt.tight_layout()
plt.show()


# ## Challenge 1: Create a dashboard-style figure with 4 different visualizations.


fig,axes=plt.subplots(2,2,figsize=(25,15))
axes[0,0].plot(df['Month'], df['TotalRevenue'], marker='o')
axes[0,0].set_title('Total Revenue')
axes[0,0].set_ylabel('Revenue ($)')
axes[0,0].set_xlabel('Months')
axes[0,0].grid(True)

x = range(len(df))      
width = 0.2
axes[0, 1].bar([i - width for i in x], df['ProductA_Revenue'],width, label='Product A')
axes[0, 1].bar(x, df['ProductB_Revenue'],width, label='Product B')
axes[0, 1].bar([i + width for i in x], df['ProductC_Revenue'],width, label='Product C')
axes[0, 1].set_xlabel('Month', fontsize=12)
axes[0, 1].set_ylabel('Revenue ($)', fontsize=12)
axes[0, 1].set_title('Product Revenue Comparison', fontsize=14, fontweight='bold')
axes[0, 1].legend()

axes[1, 0].scatter(range(len(df)), df['AvgOrderValue'], s=120, color='blue', alpha=0.6)
axes[1, 0].set_title('Scatter: Avg Order Value')
axes[1, 0].set_ylabel('Avg Order Value ($)')
axes[1, 0].set_xlabel('Month')

axes[1, 1].plot(df['Month'], df['ProductB_Revenue'], marker='o',color='red')
axes[1, 1].set_title('Product B Revenue')
axes[1, 1].set_ylabel('Revenue ($)')
axes[1, 1].set_xlabel('Month')
axes[0,0].grid(True)
plt.tight_layout()
plt.show()

# ### Challenge 3: Create histograms with overlapping transparency.


plt.figure(figsize=(10, 6))

plt.hist(df['ProductA_Revenue'],bins=10,alpha=0.6,label='Product A',color='red')
plt.hist(df['ProductB_Revenue'],bins=10,alpha=0.6,label='Product B',color='yellow')
plt.hist(df['ProductC_Revenue'],bins=10,alpha=0.6,label='Product C',color='blue')

plt.title('Revenue Distribution by Product', fontsize=14, fontweight='bold')
plt.xlabel('Revenue ($)')
plt.ylabel('Frequency')
plt.legend(loc='best')
plt.grid(alpha=0.3)

plt.show()