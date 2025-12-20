# import a car.csv dataset.- Filter top-performing products.- Save clean data as filtered_sales.csv¶
import pandas as pd
df=pd.read_csv("car.csv")
print(df)

print(df.Kms_Driven)

most_kms_driven=df.sort_values(by='Kms_Driven', ascending=False)

most_kms_driven.to_excel("filtered_car_csv.xlsx")
df2=pd.read_excel("filtered_car_csv.xlsx")
df2

df1=df2.query('Transmission=="Manual"')
print(df1)

df2.count()

df1.count()

df3=df[df['Transmission']=="Manual"]
df3

df4=df.filter(items=['Transmission'])
df4

# filter with selling price greater than 5 and seller_type = dealer and kms_driven < 20000¶
filtered_df = df[(df['Selling_Price'] > 5) & (df['Seller_Type'] == 'Dealer')&(df['Kms_Driven'] < 20000)]
filtered_df.count()

# Given a sales DataFrame with 'Date', 'Product', 'Revenue', calculate monthly total revenue
import pandas as pd
salesData1 = {
'Date': pd.date_range(start='2025-01-01', periods=12, freq='W'),
'Product': ['A', 'B', 'C'] * 4,
'Revenue': [100, 200, 150, 120, 220, 130, 110, 180, 170, 115, 235, 175]
}
df = pd.DataFrame(salesData1)  
df['Month'] = df['Date'].dt.to_period('M')
df

monthly_total = df.groupby('Month')['Revenue'].sum()
print(monthly_total)

monthly_total = df.groupby('Month')['Revenue'].sum().reset_index()
print(monthly_total)

monthly_total = df.groupby('Month').agg({'Revenue':'sum'}).rename(columns={'Revenue':'TotalRevenue'})
print(monthly_total)

# Data Wrangling

import pandas as pd
data = {'Name': ['Jai', 'Princi', 'Gaurav','Anuj', 'Ravi', 'Natasha', 'Riya'],'Age': [17, 17, 18, 17, 18, 17, 17],'Gender': ['M', 'F', 'M', 'M', 'M', 'F', 'F'],'Marks': [90, 76, 'NaN', 74, 65, 'NaN', 71]}
df=pd.DataFrame(data)
df   ## NaN-Not a Number- if a NaN is present you should solve with mean and median

import numpy as np
add=0
c=0
for i in df["Marks"]:
    if str(i).isnumeric():
        add=add+i
        c+=1
    else:
       continue 
add  

c

avg=round(add/c)
avg

df=df.replace(to_replace="NaN",value=avg)
df
