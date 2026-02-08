# ### ASSIGNMENT 7: E-commerce Orders Analysis


import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns
df = pd.read_csv('assignment7_ecommerce_orders(in).csv')
df

# ### Q7.1: Data Loading and Verification
# #### Load the e-commerce orders data and calculate the total order amount.


###  (Quantity × Price) + Shipping - Discount
df['TotalAmount'] = (df['ItemQuantity']*df['ItemPrice'])+df['ShippingCost']-df['DiscountApplied']
df

df['TotalAmount']

# ### Q7.2: Order Status Analysis
# #### Filter completed orders and calculate average order value by payment method


completed = df[df['OrderStatus']=='completed']
avg_order = completed.groupby('PaymentMethod')['TotalAmount'].mean()

df

# ### Q7.3: Category Summary
# #### Create a summary showing order count and total revenue by product category.


summary = df.groupby('ProductCategory').agg({'OrderID':'count', 'TotalAmount':'sum'}).rename(columns={'OrderID':'OrderCount', 'TotalAmount':'TotalRevenue'})

summary

# ### Q7.4: Payment Method Analysis
# #### Identify the most common payment method and calculate its usage percentage.


payment_count = df['PaymentMethod'].value_counts()

payment_count

most_common = payment_count.index[0]

most_common

percentage = (payment_count.iloc[0]*len(df))/100

percentage

# ### Q7.5: Discount Analysis
# #### Group orders by status and calculate average discount applied per status


avg_dis = df.groupby('OrderStatus')['DiscountApplied'].agg(['mean','sum'])
avg_dis

# ### Q7.6: Pivot Analysis
# #### Create a pivot table with OrderStatus as rows and PaymentMethod as columns (count of orders).


pivot_tabel = pd.pivot_table(df, index='OrderStatus', columns='PaymentMethod', values= 'OrderID', aggfunc= 'count')
pivot_tabel

pivot_tabel1 = pd.crosstab(index=df['OrderStatus'], columns=df['PaymentMethod'], values=df['OrderID'], rownames=['OrderStatus'], colnames=['PaymentMethod'], aggfunc='count').reset_index()
pivot_tabel1

# ### 7.7: Order Export
# #### Export all completed orders to completed_orders.csv with relevant columns.


df

completed = df[df['OrderStatus'] == 'Completed']
cols = ['OrderID', 'OrderDate', 'CustomerName', 'ProductCategory', 'ItemQuantity', 'ItemPrice', 'TotalAmount', 'PaymentMethod']

completed[cols].to_csv('completed_orders.csv')

# ### Q7.8: Top Dates
# #### Find the top 5 dates by total revenue.


df['OrderDate'] = pd.to_datetime(df['OrderDate'])

df

Top_5 = df.groupby('OrderDate')['TotalAmount'].sum().nlargest(5)

Top_5

# ### Q7.9: Discount by Category
# #### Calculate the average discount percentage by product category


avg_dis_category = df.groupby('ProductCategory')['DiscountApplied'].mean()
avg_dis_category

# ### Q7.10: Visualizations
# #### Create visualizations comparing order status and payment method distributions.


plt.figure(figsize=(8,5))
sns.countplot(data=df, x='OrderStatus')
plt.title("Order Status Distribution")
plt.xlabel("Order Status")
plt.ylabel("Count")
plt.show()

plt.figure(figsize=(8,5))
sns.countplot(data=df, x='PaymentMethod')
plt.title("Payment Method Distribution")
plt.xlabel("Payment Method")
plt.ylabel("Count")
plt.show()