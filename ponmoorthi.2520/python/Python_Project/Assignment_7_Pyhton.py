# Generated from: Assignment_7_Pyhton.ipynb
# Converted at: 2025-12-20T08:55:26.445Z
# Next step (optional): refactor into modules & generate tests with RunCell
# Quick start: pip install runcell

import pandas as pd

# ### Q7.1: Data Loading and Verification
# #### Load the e-commerce orders data and calculate the total order amount.
# #### Hint: Formula: (Quantity × Price) + Shipping - Discount


df=pd.read_csv('assignment7_ecommerce_orders(in).csv')

df

# Formula: (Quantity × Price) + Shipping - Discount


if 'TotalAmount' not in df.columns:
    df['Total_amount']=df['ItemQuantity']*df['ItemPrice']+df['ShippingCost'] - df['DiscountApplied']	

df.head()

df['Total_amount']=df['ItemQuantity']*df['ItemPrice']+df['ShippingCost'] - df['DiscountApplied']	

df.head()

df.head()

df.drop(columns=['Total_amount'])

# ### Q7.2: Order Status Analysis
# #### Filter completed orders and calculate average order value by payment method.
# #### Hint: Filter by OrderStatus, groupby, mean aggregation


ordered=df[df['OrderStatus']=='Completed']  

ordered

avg=ordered.groupby('PaymentMethod').agg({'TotalAmount':'mean'})

avg

# ### Q7.3: Category Summary
# #### Create a summary showing order count and total revenue by product category.
# #### Hint: Use groupby and agg with multiple functions


order_count=df['OrderID'].count()

df.groupby('ProductCategory').agg({'OrderID':'count','TotalAmount':'sum'}).rename(columns=({'OrderID':'Count','TotalAmount':'TotalRevenue'}))

# ### Q7.4: Payment Method Analysis
# #### Identify the most common payment method and calculate its usage percentage.
# #### Hint: value_counts() and percentage calculation
# 


most_common_pay=df['PaymentMethod'].value_counts()

percentage=len(df[df['PaymentMethod']=='Credit Card']) / len(df['PaymentMethod'])*100

print(f"The most common percentage : {round(percentage,2)}%")
print(most_common_pay)

# ### Q7.5: Discount Analysis
# #### Group orders by status and calculate average discount applied per status.
# #### Hint: groupby OrderStatus and mean of DiscountApplied


Discount=df.groupby('OrderStatus')['DiscountApplied'].mean()

Discount

# ### Q7.6: Pivot Analysis
# #### Create a pivot table with OrderStatus as rows and PaymentMethod as columns (count of orders).
# #### Hint: pd.crosstab() or pivot_table


pivot=pd.pivot_table(df,
                     index='OrderStatus',
                     columns='PaymentMethod',
                     values='OrderID',
                     aggfunc='count')

pivot

# ### Q7.7: Order Export
# #### Export all completed orders to completed_orders.csv with relevant columns
# 


ordered=df[df['OrderStatus']=='Completed']  

export=ordered[['OrderID','OrderDate','CustomerName','OrderStatus','ProductCategory','PaymentMethod','TotalAmount']]

export

# ### Q7.8: Top Dates
# #### Find the top 5 dates by total revenue.
# #### Hint: groupby Date, sum, nlargest(5)


Top_Dates=df.groupby('OrderDate')['TotalAmount'].sum().nlargest(5)

Top_Dates

# ### Q7.9: Discount by Category
# #### Calculate the average discount percentage by product category.
# #### Hint: groupby Category and mean discount


Discount_category=df.groupby('ProductCategory').agg({'DiscountApplied':'mean'})

Discount_category

# ### Q7.10: Visualizations
# #### Create visualizations comparing order status and payment method distributions.
# #### Hint: Use matplotlib or seaborn countplot


import matplotlib.pyplot as plt
import seaborn as sns

plt.figure(figsize=(12,5))
sns.countplot(data=df,x='OrderStatus',color='red')
plt.xlabel('OrderStatus',fontsize=12)
plt.ylabel('Payment Method',fontsize=12)
plt.legend(loc='best')

plt.figure(figsize=(12,5))
sns.countplot(data=df,x='PaymentMethod',color='green')
plt.xlabel('OrderStatus',fontsize=12)
plt.ylabel('Payment Method',fontsize=12)
plt.legend(loc='best')
plt.tight_layout()
plt.show()



fig, (ax1, ax2) = plt.subplots(1, 2, figsize=(14, 5))
sns.countplot(data=df, x='OrderStatus', ax=ax1, palette='Set1')
ax1.set_title('Order Status', fontsize=12, fontweight='bold')
ax1.set_ylabel('Count')


sns.countplot(data=df, x='PaymentMethod', ax=ax2, palette='Set5')
ax2.set_title('Payment Method', fontsize=12, fontweight='bold')
ax2.set_ylabel('Count')
ax2.tick_params(axis='x', rotation=45)