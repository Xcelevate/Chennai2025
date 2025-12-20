# Correct the data set by filing the missing Values. Based on the class notes.
# Steps:
# Identification Display the count of missing values for each column in the dataset.
# Imputation (Categorical Columns) Fill missing values in the each column. Fill missing values in dataset with the most frequent value for that column in the data.
# Imputation (Numerical Columns) If numeric column have any missing values, fill them with their respective column means/median.
import pandas as pd
df1=pd.read_csv("demo_sales_missing.csv")
df1

df1['UnitPrice']=df1['UnitPrice'].round()
df1['UnitPrice'].reset_index()

import numpy as np 
add=0
c=0
for i in df1['UnitPrice']:
    if pd.notna(i):
        add=add+i
        c+=1
    else:
        continue
add

c

avg=int(add/c)
avg

df1['UnitPrice']=df1['UnitPrice'].fillna(avg)
df1['UnitPrice'].reset_index()

import numpy as np
a=0
d=0
for i in df1['Quantity']:
    if pd.notna(i):
        a=a+i
        d+=1
    else:
        continue
a

d

avg_quantity=int(a/d)
avg_quantity

df1['Quantity']=df1['Quantity'].fillna(avg_quantity)
df1['Quantity'].reset_index()

most_common_region=df1['Region'].mode()[0]
df1['Region']=df1['Region'].fillna(most_common_region)
df1['Region'].reset_index()
  
most_common_product=df1['Product'].mode()[0]
df1['Product']=df1['Product'].fillna(most_common_product)
df1['Product'].reset_index()


most_common_product=df1['Product'].mode()[0]
df1['Product']=df1['Product'].fillna(most_common_product)
df1['Product'].reset_index()

most_common_salesrep=df1['SalesRep'].mode()[0]
df1['SalesRep']=df1['SalesRep'].fillna(most_common_salesrep)
df1['SalesRep'].reset_index()

most_common_paymentmethod=df1['PaymentMethod'].mode()[0]
df1['PaymentMethod']=df1['PaymentMethod'].fillna(most_common_paymentmethod)
df1['PaymentMethod'].reset_index()

df1
