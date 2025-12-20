# ## ASSIGNMENT 7: E-commerce Orders Analysis

# ### Dataset: assignment7_ecommerce_orders.csv

# #### Q7.1: Data Loading and Verification

import pandas as pd
df = pd.read_csv('assignment7_ecommerce_orders(in).csv') # Load the data
df # display the data
df.info() # display the information about that table

##### Load the e-commerce orders data and calculate the total order amount.

df['TotalOrderAmount'] = df['ItemQuantity']* df['ItemPrice'] + df['ShippingCost'] - df['DiscountApplied']
total_revenue = df['TotalOrderAmount'] .sum()
print("E-Commorce Orders:")
df.head(10)
print(f'Total Orders:{len(df)}')
print(f'Total Order Amount:{total_revenue}')

# ### Q7.2: Order Status Analysis

# #### Filter completed orders and calculate average order value by payment method

filter_order = df[df['OrderStatus'] == 'Completed'] # fltered only completed status
print("Order Status Analysis:")
order_status = filter_order.groupby('PaymentMethod').agg({'TotalAmount':['mean','count']})
rename = order_status.rename(columns=({'mean':'AvgOrderValue','count':'CompletedCount'})) # rename the columns
print(rename) # display the result

# ### Q7.3: Category Summary

# #### Create a summary showing order count and total revenue by product category.

summary = df.groupby('ProductCategory').agg({'OrderID':'count','TotalAmount':'sum'})
summary_rename = summary.rename(columns=({'OrderID':'orderCount','TotalAmount':'TotalRevenue'}))
print("Category Summary:")
print(summary_rename)

# ### Q7.4: Payment Method Analysis

# #### Identify the most common payment method and calculate its usage percentage

common_payment = df['PaymentMethod'].value_counts()
credit_card = (df['PaymentMethod'] == 'Credit Card').sum()
total_count = df['PaymentMethod'].count()
percentage = (credit_card / total_count) * 100
print("Most Common Payment:")
print(common_payment)
print(f'Percentage Calculaion of Common Payment: {percentage:,.2f}%')

# ### Q7.5: Discount Analysis

# #### Group orders by status and calculate average discount applied per status.

discount = df.groupby('OrderStatus').agg({'DiscountApplied':['mean','count','sum']})
analysis = discount.rename(columns=({'mean':'AvgDiscount','sum':'TotalDiscount','count':'StatusCount'}))
print("Discount Analysis by order status:")
print(analysis)

# ### Q7.6: Pivot Analysis

# #### Create a pivot table with OrderStatus as rows and PaymentMethod as columns (count of orders).

pivot_table = pd.pivot_table(df,
                             index='OrderStatus',
                             columns = 'PaymentMethod',
                             values='OrderID',
                             aggfunc = 'count'
                            )
print("Pivot Analysis to count the orders:")
print(pivot_table)

# ### Q7.7: Order Export

# #### Export all completed orders to completed_orders.csv with relevant columns.

filtered = df[df['OrderStatus'] == 'Completed']
completed = filtered[['OrderID','OrderDate','CustomerName','OrderStatus','ProductCategory','PaymentMethod','TotalAmount']]
completed_csv = completed.to_csv('completed_orders.csv',index= False)
print(f'Exported the Completed Status Datas length of :{len(completed)}')

# ### Q7.8: Top Dates

# #### Find the top 5 dates by total revenue

top_dates = df.groupby('OrderDate')['TotalAmount'].sum().nlargest(5)
print("Top 5 Date Data By total revenue:")
print(top_dates)

# ### Q7.9: Discount by Category

# #### Calculate the average discount percentage by product category

discount_category = df.groupby('ProductCategory')['DiscountApplied'].mean()
print("Discount By category:")
print(discount_category)

# ### Q7.10: Visualizations

# #### Create visualizations comparing order status and payment method distributions.
import matplotlib.pyplot as plt

import seaborn as sns

# Create Count PLot
fig, (ax1,ax2) = plt.subplots(1, 2, figsize=(17, 8))
sns.countplot(x='OrderStatus',ax=ax1,data=df,palette='dark')
ax1.set_xlabel('OrderStatus',fontsize=12)
ax1.set_ylabel('Count',fontsize=12)
ax1.set_title('Distribution of OrderStatus ',fontsize=14,fontweight='bold')

sns.countplot(x='PaymentMethod',ax=ax2,data=df,palette='bright')
ax2.set_xlabel('PaymentMethod',fontsize=12)
ax2.set_ylabel('Count',fontsize=12)
ax2.set_title('Distribution of PaymentMethod ',fontsize=14,fontweight='bold')

plt.suptitle('Distribution of OrderStatus vs PaymentMethod',fontsize=14,fontweight='bold')
plt.tight_layout()
plt.show()