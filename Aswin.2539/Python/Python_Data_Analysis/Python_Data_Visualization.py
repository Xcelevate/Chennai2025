import pandas as pd
df = pd.read_csv('sales_visualization_data.csv')

df

df.describe()

df.head(10)


# Date: Transaction date
# Product: Product name (Laptop, Phone, Tablet, etc.)
# Region: Sales region (North, South, East, West, Central)
# Quantity: Number of units sold
# UnitPrice: Price per unit
# CustomerAge: Age of the customer
# Rating: Product rating (3.5 to 5.0)
# Revenue: Total revenue (Quantity × UnitPrice)
# Month: Month number (1-12)
# Quarter: Quarter number (1-4)


# ! pip install Matplotlib


# Basic Line Plot¶
# Create a line plot showing the total revenue per month for the year 2024.
# X-axis: Month
# Y-axis: Total Revenue
# Add appropriate labels and title
# Add a grid for better readability

total_revenue = df.groupby('Month').agg({'Revenue':'sum'})

total_revenue.rename(columns ={'Revenue':'Total_revenue'})

import matplotlib.pyplot as plt


# Create line plot
plt.figure(figsize=(10, 6))
plt.plot(total_revenue.index, total_revenue.values,marker='o', linewidth=2, markersize=8, color='red')
plt.xlabel('Month', fontsize=12)
plt.ylabel('Total Revenue ($)', fontsize=12)
plt.title('Monthly Revenue Trend - 2024', fontsize=14, fontweight='bold')
plt.grid(True, alpha=1)
plt.xticks(range(1, 13))
plt.tight_layout()
plt.show()
 