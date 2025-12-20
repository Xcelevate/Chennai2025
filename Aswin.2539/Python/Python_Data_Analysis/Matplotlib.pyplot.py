
import pandas as pd
df = pd.read_csv('sales_visualization_data.csv')

df1 = df.drop(['Date','Product','Region'], axis = 1)

corr = df1.corr()

corr

pip install matlplotlib

import seaborn as sns
import matplotlib.pyplot as plt
plt.figure(figsize=(10, 8))
sns.heatmap(corr, annot=True, fmt='.2f',
cmap='coolwarm', center=0,
square=True, linewidths=1)
plt.title('Correlation Matrix of Sales Data', fontsize=14, fontweight='bold')
plt.tight_layout()
plt.show()

df.describe()

df.head(10)

# #### Date: Transaction date
# #### Product: Product name (Laptop, Phone, Tablet, etc.)
# #### Region: Sales region (North, South, East, West, Central)
# #### Quantity: Number of units sold
# #### UnitPrice: Price per unit
# #### CustomerAge: Age of the customer
# #### Rating: Product rating (3.5 to 5.0)
# #### Revenue: Total revenue (Quantity × UnitPrice)
# #### Month: Month number (1-12)
# #### Quarter: Quarter number (1-4)


! pip install Matplotlib

# ### Basic Line Plot
# 


# #### Create a line plot showing the total revenue per month for the year 2024.
# #### X-axis: Month
# #### Y-axis: Total Revenue
# #### Add appropriate labels and title
# #### Add a grid for better readability


total_revenue = df.groupby('Month').agg({'Revenue':'sum'})

total_revenue.rename(columns ={'Revenue':'Total_revenue'})

import matplotlib.pyplot as plt

plt.xticks?

range?

# Create line plot 
plt.figure(figsize=(10, 6))
plt.plot(total_revenue.index, total_revenue.values,marker='o', linewidth=2, markersize=8, color='red')
plt.xlabel('Month', fontsize=12)
plt.ylabel('Total Revenue ($)', fontsize=12)
plt.title('Monthly Revenue Trend - 2024', fontsize=14, fontweight='bold')
plt.grid(True, alpha=0.3)
plt.xticks(range(1, 13))
plt.tight_layout()
plt.show()

# ### monthly revenue trends for the top 3 products


monthly_revenue = df.groupby(['Month','Product']).agg({'Revenue':'sum'}).reset_index()

top_product = monthly_revenue.nlargest(3,'Revenue')

top_product

top3_products = df.groupby('Product')['Revenue'].sum().nlargest(3).index
 

top3_products

# #### Multiple line chart
# #### Plot the monthly/overall revenue trends for the top 3 products on the same chart.
# #### Use different colors and line styles for each product
# #### Add a legend
# #### Include markers on the lines
# #### Add title, labels, and grid


#Plot the graph
 
plt.figure(figsize=(12, 6))
line_styles = ['solid', '--', '-.']
markers = ['o', 's', '^']
for i, product in enumerate(top3_products):
 product_data = df[df['Product'] == product].groupby('Month')['Revenue'].sum()
 plt.plot(product_data.index, product_data.values,label=product, linewidth=2,linestyle=line_styles[i], marker=markers[i], markersize=6)
plt.xlabel('Month', fontsize=12)
plt.ylabel('Revenue ($)', fontsize=12)
plt.title('Top 3 Products - Monthly Revenue Trends', fontsize=14, fontweight='bold')
plt.legend(loc='best', fontsize=10)
plt.grid(True, alpha=0.5)
plt.xticks(range(1, 13))
plt.tight_layout()
plt.show()
 

# ### Create a horizontal bar chart showing the total revenue for each product.
# #### Sort the products by revenue in descending order
# #### Use different colors for each barAdd data labels on each bar
# #### Add a title and axis labels


total_revenue = df.groupby('Product')['Revenue'].sum().sort_values(ascending = False)

total_revenue

# Create horizontal bar chart
plt.figure(figsize=(10, 6))
colors = plt.cm.plasma(range(len(total_revenue)))
bars = plt.barh(total_revenue.index, total_revenue.values, color=colors)
# Add data labels
for bar in bars:
    width = bar.get_width()
    plt.text(width, bar.get_y() + bar.get_height()/2,
f'${width:,.0f}', ha='left', va='center', fontsize=9)
plt.xlabel('Total Revenue ($)', fontsize=12)
plt.ylabel('Product', fontsize=12)
plt.title('Product Revenue Comparison', fontsize=14, fontweight='bold')
plt.tight_layout()
plt.show()



# Create horizontal bar chart
plt.figure(figsize=(10, 6))
colors = plt.cm.plasma(range(len(total_revenue)))
bars = plt.barh(total_revenue.index, total_revenue.values, color=['lightblue', 'blue','pink','purple', 'red', 'yellow','lightgreen','orange'])
# Add data labels
for bar in bars:
    width = bar.get_width()
    print(bar.get_y())
    plt.text(width, bar.get_y() + bar.get_height()/2,
f'${width:,.0f}', ha='left', va='bottom', fontsize=9)
plt.xlabel('Total Revenue ($)', fontsize=12)
plt.ylabel('Product', fontsize=12)
plt.title('Product Revenue Comparison', fontsize=14, fontweight='bold')
plt.tight_layout()
plt.show()

# ### Customized Bar Plot
# #### Create a bar chart comparing total quantity sold across all 5 regions.
# #### Customize the bar colors
# #### Rotate x-axis labels if needed
# #### Add a title "Regional Sales Performance"
# #### Save the chart as 'regional_sales.png'


total_quantity = df.groupby('Region')['Quantity'].sum()

total_quantity

# Create horizontal bar chart
plt.figure(figsize=(10, 6))
colors = plt.cm.plasma(range(len(total_quantity)))
bars = plt.barh(total_quantity.index, total_quantity.values, color=['lightblue', 'blue','pink','purple', 'red', 'yellow','lightgreen','orange'])
# Add data labels
for bar in bars:
    width = bar.get_width()
    plt.text(width, bar.get_y() + bar.get_height()/2,
f'{width:,.0f}', ha='left', va='center', fontsize=9)
plt.xlabel('Total Quantity', fontsize=12)
plt.ylabel('Region', fontsize=12)
plt.title('Regional Sales Performance', fontsize=14, fontweight='bold')
plt.tight_layout()
plt.show()

# Create bar chart
plt.figure(figsize=(10, 6))
colors = ['#FF6B6B', '#4ECDC4', '#45B7D1', '#FFA07A', '#98D8C8']
plt.bar(total_quantity.index, total_quantity.values, color=colors, edgecolor='black')
plt.xlabel('Region', fontsize=12)
plt.ylabel('Total Quantity Sold', fontsize=12)
plt.title('Regional Sales Performance', fontsize=14, fontweight='bold')
plt.xticks(rotation=180)
plt.tight_layout()
# Save the chart
plt.savefig('regional_sales.png', dpi=300, bbox_inches='tight')
plt.show()
print("Chart saved as 'regional_sales.png'")
 

# ### Subplots
# #### Create a figure with 2 subplots:
# #### Subplot 1: Monthly revenue (line plot)
# #### Subplot 2: Top 5 products by revenue (bar plot)
# #### Both should have proper titles and labels


subplot1_data = df.groupby('Month').agg({'Revenue':'sum'})

subplot1_data

subplot2_data = df.groupby('Product')['Revenue'].sum().sort_values(ascending = False)

subplot2_data.head(5)

# Create figure with 2 subplots
fig, (ax1, ax2) = plt.subplots(1, 2, figsize=(14, 5))
ax1.plot(subplot1_data.index, subplot1_data.values,marker='o', linewidth=2, markersize=8, color='red')
ax1.set_xlabel('Month', fontsize=12)
ax1.set_ylabel('Total Revenue ($)', fontsize=12)
ax1.set_title('Monthly Revenue Trend', fontsize=14, fontweight='bold')
ax1.grid(True, alpha=0.3)
ax1.set_xticks(range(1, 13))
#ax1.tight_layout()
#ax1.show()
top5_products = df.groupby('Product')['Revenue'].sum().nlargest(5)
ax2.bar(range(len(top5_products)), top5_products.values, color='orange', edgecolor='black')
ax2.set_xticks(range(len(top5_products)))
ax2.set_xticklabels(top5_products.index, rotation=45, ha='right')
ax2.set_xlabel('Product', fontsize=11)
ax2.set_ylabel('Total Revenue ($)', fontsize=11)
ax2.set_title('Top 5 Products by Revenue', fontsize=12, fontweight='bold')
plt.tight_layout()
plt.show()

total_revenue.index

#Pie Charrt

plt.figure(figsize=(8, 8))
plt.pie(total_revenue, labels=total_revenue.index, autopct="%1.1f%%", startangle=90, shadow=False,explode = [0.1 if v == total_revenue.max() else 0 for v in total_revenue]
)
plt.axis("equal")
plt.title("Pie Chart")
plt.show()


#Pie Charrt

plt.figure(figsize=(8, 8))
plt.pie(total_revenue, labels=total_revenue.index, autopct="%1.1f%%", startangle=90, shadow=False,explode = [0.1, 0.1, 0.1] + [0] * 7)
plt.axis("equal")
plt.title("Pie Chart")
plt.savefig("my_plot.svg", dpi=300, bbox_inches='tight')
plt.show()


#Scatter plot 
plt.scatter(df['Month'], df['Product'], marker='o',color = 'red')
plt.title("Scatter Plot")
plt.xlabel("Month")
plt.ylabel("Product")
plt.show()


plt.figure(figsize=(8, 5))
plt.scatter(df['Month'], df['Revenue'], marker='o', color='red')
plt.title("Scatter Plot: Month vs Revenue")
plt.xlabel("Month")
plt.ylabel("Revenue")
plt.show()


product_codes = df['Product'].astype('category').cat.codes

plt.figure(figsize=(8, 5))
plt.scatter(product_codes, df['Revenue'], color='red')
plt.xticks(product_codes, df['Product'], rotation=90)
plt.title("Scatter Plot: Product vs Revenue",fontweight = 'bold')
plt.xlabel("Product")
plt.ylabel("Revenue")
plt.show()


#Histogram
plt.figure(figsize=(10, 5))
plt.hist(df['Product'], bins=10, edgecolor="black",color = 'green')
plt.title("Histogram")
plt.xlabel("Value")
plt.ylabel("Frequency")
plt.show()


plt.figure(figsize=(6, 5))

plt.boxplot(df['Revenue'], 
            patch_artist=True,
            boxprops=dict(facecolor='lightblue'),
            medianprops=dict(color='red'))

plt.title("Revenue Distribution (Box Plot)", fontweight='bold')
plt.ylabel("Revenue", fontweight='bold')

plt.show()


df.boxplot(column="Revenue", by="Product", figsize=(10,5))
plt.title("Revenue by Product")
plt.suptitle("")   # remove automatic title
plt.show()


plt.figure(figsize=(80,18))
plt.plot(df['Date'], df['Revenue'], marker='o',color = 'red')

plt.title("Revenue Over Time", fontweight="bold")
plt.xlabel("Date", fontweight="bold")
plt.ylabel("Revenue", fontweight="bold")

plt.xticks(rotation=45)
plt.tight_layout()
plt.show()