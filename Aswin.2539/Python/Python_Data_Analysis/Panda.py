# Create a Pandas DataFrame from a dictionary containing
# columns 'Name', 'Age', and 'City'

import pandas as pd

data = {'Name': ['Asha', 'Ravi', 'Seema'],
'Age': [25, 30, 28],
'City': ['Bangalore', 'Chennai', 'Pune']}

print(data["Name"])
# ['Asha', 'Ravi', 'Seema']

print(data["City"])
# ['Bangalore', 'Chennai', 'Pune']

print(data["Age"])
 # [25, 30, 28]

for City in data["City"]:
    print(City)

# Bangalore
#Chennai
#Pune

data["City"].append("Delhi")

print(data["City"])
# ['Bangalore', 'Chennai', 'Pune', 'Delhi']

print(pd.DataFrame(data))
#       Name  Age       City
#   0   Asha   25  Bangalore
#   1   Ravi   30    Chennai
#   2  Seema   28       Pune


#Filter rows from a DataFrame where Age are greater than 26.

filterd_df = df[(df['Age'] > 26)]

df = pd.DataFrame(data)

print(df)

#       Name  Age       City
#   0   Asha   25  Bangalore
#   1   Ravi   30    Chennai
#   2  Seema   28       Pune


print(filterd_df)
#       Name  Age     City
#   1   Ravi   30  Chennai
#   2  Seema   28     Pune


# Given a DataFrame with columns ['Region', 'Sales', 'Profit'], 
#compute total sales and average profit by region.

Sales_data = {
'Region': ['North', 'South', 'North', 'East', 'South'],
'Sales': [5000, 7000, 6000, 4500, 8000],
'Profit': [500, 700, 600, 450, 800]
}

sales_df = pd.DataFrame(Sales_data)

sales_df

summary = sales_df.groupby('Region').agg({'Sales': 'sum', 'Profit': 'mean'})

summary

#       	Sales	Profit
#   Region		
#   East	4500	450.0
#   North	11000	550.0
#   South	15000	750.0

# mean(), std(), sum(), min(), max()`.

import numpy as np
array1 = np.arange(1,8)
print(array1)

print(f"Mean: {np.mean(array1)}")

print(f"Standard deviation: {np.std(array1)}")

print(f"Sum: {np.sum(array1)}")

print(f"Minimum: {np.min(array1)}")

print(f"Maxmimum: {np.max(array1)}")


#Import a car.csv dataset.- 
#Filter top-performing products.
# Save clean data as filtered_sales.csv.

import pandas as pd

df = pd.read_csv('car (2).csv')

print(df)

most_kms_driven = df.sort_values(by='Kms_Driven', ascending=False)
print(most_kms_driven)

most_kms_driven.to_excel('filtered_car.xlsx')

df2 = pd.read_excel('filtered_car.xlsx')

df2

df1 = df('Transmission=="Manual"')

print(df1)

df.count()

df3 = df[df['Transmission'] == "Manual"]

df3

# filter with selling price greater than 5 and 
# seller_type = dealer and kms_driven < 20000


df5 = df.query('(Selling_Price > 5) & (Seller_Type == "Dealer") & (Kms_Driven < 20000)')

df5

df5.count()

filtered_df = df[(df['Selling_Price'] > 5) & (df['Seller_Type'] == 'Dealer')&(df['Kms_Driven'] < 20000)]

filtered_df

filtered_df.count()

# Given a sales DataFrame with 'Date', 'Product', 'Revenue', 
# calculate monthly total revenue.

import pandas as pd
salesData1 = {
'Date': pd.date_range(start='2025-01-01', periods=12, freq='W'),
'Product': ['A', 'B', 'C'] * 4,
'Revenue': [100, 200, 150, 120, 220, 130, 110, 180, 170, 115, 235, 175]
}

salesData1

df7 = pd.DataFrame(salesData1)

df7

df7['Month'] = df7['Date'].dt.month

monthly_sales =df7.groupby('Month').agg({'Revenue':'sum'}).rename(columns ={'Revenue':'Total_Revenue'})

monthly_sales

# Data Wrangling

data = {'Name': ['Jai', 'Princi', 'Gaurav','Anuj', 'Ravi', 'Natasha', 'Riya'],
        'Age': [17, 17, 18, 17, 18, 17, 17],
        'Gender': ['M', 'F', 'M', 'M', 'M', 'F', 'F'],
        'Marks': [90, 76, 'NaN', 74, 65, 'NaN', 71]}

df6 = pd.DataFrame(data)

df6

import numpy as np
add = 0
c=0
for i in df6['Marks']:
    if str(i).isnumeric():
        add = add+i
        c+=1
    else:
        continue
    
add

c

avg = int(add/c)

avg

df0= df6.replace(to_replace='NaN',value=avg)

df0


# Correct the data set by filing the missing Values. 
# Based on the class notes.


import pandas as pd
df1 = pd.read_csv('demo_sales_missing.csv')

df1

df1['UnitPrice'] = df1['UnitPrice'].round(0)

df1['UnitPrice'].reset_index()

df1['UnitPrice'].fillna(df1['UnitPrice'].median(), inplace=True)
 

import numpy as np
add = 0
c=0
for i in df1['UnitPrice']:
    if pd.notna(i):
        add = add+i
        c+=1
    else:
        continue
    
add

c

avg = int(add/c)

avg

df1['UnitPrice'] = df1['UnitPrice'].fillna(avg)

import numpy as np
g = 0
d=0
for i in df1['Quantity']:
    if pd.notna(i):
        g=g+i
        d+=1
    else:
        continue
    
g

d

avg_quantity = g/d

avg_quantity

df1['Quantity'] = df1['Quantity'].fillna(avg_quantity)


most_common_region = df1['Region'].mode()[0]
df1['Region'] = df1['Region'].fillna(most_common_region)


df1['Region'].reset_index()

most_common_product = df1['Product'].mode()[0]
df1['Product'] = df1['Product'].fillna(most_common_product)


df1['Product'].reset_index()

most_common_salesrep = df1['SalesRep'].mode()[0]
df1['SalesRep'] = df1['SalesRep'].fillna(most_common_salesrep)


df1['SalesRep'].reset_index()

most_common_paymentmethod = df1['PaymentMethod'].mode()[0]
df1['PaymentMethod'] = df1['PaymentMethod'].fillna(most_common_paymentmethod)


df1['PaymentMethod'].reset_index()


df1.describe() #50 percentage = median

 
percentile = (4.75  / 8) * 100

print(percentile)