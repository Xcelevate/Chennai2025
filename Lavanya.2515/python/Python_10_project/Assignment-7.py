# Generated from: Assignment-7.ipynb
# Converted at: 2025-12-20T10:52:08.549Z
# Next step (optional): refactor into modules & generate tests with RunCell
# Quick start: pip install runcell

# # ASSIGNMENT 7: E-commerce Orders Analysis


# ## Questions


# ### Q7.1: Data Loading and Verification


# #### Load the e-commerce orders data and calculate the total order amount.


import pandas as pd
import numpy as np

df=pd.read_csv('assignment7_ecommerce_orders(in).csv')

df.head(10)

if 'TotalAmount' not in df.columns:
    df['TotalAmount'] = (df['ItemQuantity'] * df['ItemPrice']) + df['ShippingCost'] - df['DiscountApplied']	
print("E-commerce Orders Dataset:")
print(df.head())

# ### Q7.2: Order Status Analysis


# #### Filter completed orders and calculate average order value by payment method


completed = df[df['OrderStatus'] == 'Completed']
avg_payment = completed.groupby('PaymentMethod')['TotalAmount'].agg(['mean', 'count']).rename(columns={'mean': 'Avg'})
avg_payment


# ### Q7.3: Category Summary


# #### Create a summary showing order count and total revenue by product category


summary_category = (df.groupby('ProductCategory').agg({'OrderID':'count','TotalAmount':'sum'})
                   .rename(columns={'OrderID': 'OrderCount', 'TotalAmount': 'TotalRevenue'}))    
summary_category

# ### Q7.4: Payment Method Analysis


# #### Identify the most common payment method and calculate its usage percentage.


payment_count=df.value_counts('PaymentMethod')
most_common = payment_count.index[0]
percentage = (payment_count.iloc[0] / len(df)) * 100
print(f'Most common payment Method : {most_common} ({percentage:.1f}%)')

# ### Q7.5: Discount Analysis


# #### Group orders by status and calculate average discount applied per status


avg_discount = df.groupby('OrderStatus')['DiscountApplied'].mean().reset_index(name='AvgDiscount')
avg_discount

# ### Q7.6: Pivot Analysis


# #### Create a pivot table with OrderStatus as rows and PaymentMethod as columns (count of orders).


pivot_table = pd.pivot_table(df,index='OrderStatus',columns='PaymentMethod',values='OrderID',aggfunc='count',fill_value=0)
pivot_table

# ### Q7.7: Order Export


# #### Export all completed orders to completed_orders.csv with relevant columns.


completed = df[df['OrderStatus'] == 'Completed'][['OrderID', 'OrderDate', 'CustomerName', 'ProductCategory', 
'ItemQuantity', 'ItemPrice', 'TotalAmount', 'PaymentMethod']]
completed.head()

completed.to_csv('completed_orders.csv',index=False)

# ### Q7.8: Top Dates


# #### Find the top 5 dates by total revenue.


df['OrderDate']=pd.to_datetime(df['OrderDate'])
top_5=df.groupby('OrderDate')['TotalAmount'].sum().nlargest(5)
top_5

# ### Q7.9: Discount by Category


# #### Calculate the average discount percentage by product category


discount = df.groupby('ProductCategory')['DiscountApplied'].mean()

discount

# ### Q7.10: Visualizations


# #### Create visualizations comparing order status and payment method distributions.


import seaborn as sns
import matplotlib.pyplot as plt

fig,(ax1,ax2)=plt.subplots(1,2,figsize=(12,6))
# Order status distribution
sns.countplot(data=df, x='OrderStatus', ax=ax1, palette='RdBu',hue='OrderStatus')
ax1.set_title('Order Status Distribution', fontsize=12, fontweight='bold')

# Payment method distribution
sns.countplot(data=df, x='PaymentMethod', ax=ax2, palette='Set3',hue='PaymentMethod')
ax2.set_title('Payment Method Distribution', fontsize=12, fontweight='bold')
plt.tight_layout()
plt.show()