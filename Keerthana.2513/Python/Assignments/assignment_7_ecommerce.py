# Generated from: assignment_7_ecommerce.ipynb
# Converted at: 2025-12-20T11:31:00.958Z
# Next step (optional): refactor into modules & generate tests with RunCell
# Quick start: pip install runcell

# ## ASSIGNMENT 7: E-commerce Orders Analysis


# ### Questions
# ### Q7.1: Data Loading and Verification


import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns

df=pd.read_csv('assignment7_ecommerce_orders.csv')

df

if 'TotalAmount' not in df.columns:
    df['TotalAmount']=(df['ItemQuantity']*df['ItemPrice'])+df['ShippingCost']-df['DiscountApplied']
else:
    check=df['TotalAmount'].isnull().sum()
    if check>0:
        df['TotalAmount']=(df['ItemQuantity']*df['ItemPrice'])+df['ShippingCost']-df['DiscountApplied']




# ### Q7.2: Order Status Analysis
# 


order_completed=df[df['OrderStatus']=='Completed'].groupby('PaymentMethod')['TotalAmount'].agg({'mean','count'})
print("Average order value by payment method:")
print(order_completed)

# ### Q7.3: Category Summary


summary=df.groupby('ProductCategory').agg({'OrderID':'count','TotalAmount':'sum'}).rename(columns=({'OrderID':'Count'}))

print(summary)

# ### Q7.4: Payment Method Analysis


common=df['PaymentMethod'].value_counts()

print(f" Most common payment method is {common.index[0]}")

# ### Q7.5: Discount Analysis


discount_analysis=df.groupby('OrderStatus')['DiscountApplied'].mean()

print(f" Average discount applied per status is {discount_analysis}")

# ### Q7.6: Pivot Analysis


pivot_table=pd.crosstab(df['OrderStatus'],df['PaymentMethod'])

print(pivot_table)

# ### Q7.7: Order Export


completed_orders=df[df['OrderStatus']=='Completed']

completed_orders.to_csv('completed_orders.csv')

# ### Q7.8: Top Dates


df['OrderDate']=pd.to_datetime(df['OrderDate'])

top_dates=df.groupby('OrderDate')['TotalAmount'].sum().nlargest(5)

print(f"  The top 5 dates by total revenue is {top_dates}")

# ### Q7.9: Discount by Category


avg_discount=df.groupby('ProductCategory')['DiscountApplied'].mean()

print(f" The average discount percentage by product category is {avg_discount}") 

# ### Q7.10: Visualizations


fig,(ax1,ax2)=plt.subplots(1,2,figsize=(14,5))
sns.countplot(data=df,x='OrderStatus',ax=ax1,palette='Set3',hue='OrderStatus')
ax1.set_title('Order Status Distribution',fontsize=12,fontweight='bold')
ax1.set_ylabel('Count')
sns.countplot(data=df, x='PaymentMethod',ax=ax2,palette='Set1',hue='OrderStatus')
ax2.set_title('Payment Method Distribution',fontsize=12,fontweight='bold')
ax2.set_ylabel('Count')
ax2.tick_params(axis='x')
plt.tight_layout()
plt.show()