import numpy as np
import pandas as pd 
import matplotlib.pyplot as plt
import seaborn as sns 

df = pd.read_csv('assignment7_ecommerce_orders.csv')
df

## Q7.1: Data Loading and Verification
#### Load the e-commerce orders data and calculate the total order amount.
df['TotalAmount'] = (df['ItemQuantity'] * df['ItemQuantity']) + df['ShippingCost'] - df['DiscountApplied']
df

## Q7.2: Order Status Analysis
#### Filter completed orders and calculate average order value by payment method


# Completed orders
c_orders = df[df['OrderStatus'] == 'Completed']

# Average order value 
avg_order_value = c_orders.groupby('PaymentMethod')['TotalAmount'].mean().reset_index(name =  'AvgOrderValue')
avg_order_value

## Q7.3: Category Summary


## Create a summary showing order count and total revenue by product category


category_summary = (
    df
    .groupby('ProductCategory')
    .agg(
        OrderCount=('OrderID', 'count'),
        TotalRevenue=('TotalAmount', 'sum')).reset_index())

print(category_summary)


## Q7.4: Payment Method Analysis
#### Identify the most common payment method and calculate its usage percentage.


pm_counts = df['PaymentMethod'].value_counts()
most_common_method = pm_counts.idxmax()
most_common_count = pm_counts.max()
usage_percentage = (most_common_count) / len(df) * 100
print('Most Common Payment Method :',most_common_method)
print(f'Usage Percentage: {usage_percentage:.2f}%')

## Q7.5: Discount Analysis
#### Group orders by status and calculate average discount applied per status.
status_per_order = (df.groupby('OrderStatus').agg(
    Avg_discount = ('DiscountApplied','mean')).reset_index())
print(status_per_order)

## Q7.6: Pivot Analysis
#### Create a pivot table with OrderStatus as rows and PaymentMethod as columns (count of orders).
pivot_table = pd.pivot_table(df,index='OrderStatus',columns = 'PaymentMethod', values ='OrderID',aggfunc = 'count',fill_value = 0)
pivot_table

## Q7.7: Order Export
#### Export all completed orders to completed_orders.csv with relevant columns.


completed_orders = df[df['OrderStatus'] == 'Completed']
cols = ['OrderID','CustomerName','OrderDate','PaymentMethod','TotalAmount','DiscountApplied']
completed_orders = completed_orders[cols]
completed_orders.to_csv('completed_orders.csv',index = False)
print('File Exported')

## Q7.8: Top Dates
#### Find the top 5 dates by total revenue.
top_dates = (df.groupby('OrderDate')['TotalAmount'].sum().sort_values(ascending = False).head(5))
top_dates

## Q7.9: Discount by Category
#### Calculate the average discount percentage by product category.
avg_discount_by_category = (
    df.groupby('ProductCategory')['DiscountApplied'].mean())
avg_discount_by_category


## Q7.10: Visualizations
#### Create visualizations comparing order status and payment method distributions
fig, axes = plt.subplots(1, 2, figsize=(12, 5))
sns.countplot(data=df, x='OrderStatus',ax=axes[0])
axes[0].set_title('Order Status Distribution')
sns.countplot(data=df, x='PaymentMethod',ax =axes[1])
axes[1].set_title('Payment Method Distribution')
plt.tight_layout()
plt.show()