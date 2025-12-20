Import a car.csv dataset. - Filter top-performing products. - Save clean data as filtered_sales.csv.¶

import pandas as pd
df = pd.read_csv("car.csv")
print(df)

most_kms_driven = df.sort_values(by='Kms_Driven',ascending=False)
most_kms_driven

most_kms_driven.to_excel("filtered_car_csv.xlsx")
pd.read_excel("filtered_car_csv.xlsx")

manual_df =df.query('Transmission=="Manual"')
manual_df

df.count()
manual_df.count()
df[df['Transmission'] == "Manual"]
Filtered_df = df[(df['Selling_Price'] > 5) & (df['Seller_Type'] == 'Dealer')&(df['Kms_Driven'] < 20000)]
filtered_df.count()

Given a sales DataFrame with 'Date', 'Product', 'Revenue', calculate monthly total revenue
salesData1 = {
'Date': pd.date_range(start='2025-01-01', periods=12, freq='W'),http://localhost:8888/notebooks/Untitled6.ipynb?#Given-a-sales-DataFrame-with-'Date',-'Product',-'Revenue',-calculate-monthly%C2%A0total%C2%A0revenue
'Product': ['A', 'B', 'C'] * 4,
'Revenue': [100, 200, 150, 120, 220, 130, 110, 180, 170, 115, 235, 175]
}
df = pd.DataFrame(salesData1)
df['Month'] = df['Date'].dt.to_period('M')
df

salesDatadf = df.groupby('Month').agg({'Revenue' : 'sum'}).rename(columns ={'Revenue':'Total_Revenue'})
print(salesDatadf)

DataRangling
data = {'Name': ['Jai', 'Princi', 'Gaurav','Anuj', 'Ravi', 'Natasha', 'Riya'],'Age': [17, 17, 18, 17, 18, 17, 17],'Gender': ['M', 'F', 'M', 'M', 'M', 'F', 'F'],'Marks': [90, 76, 'NaN', 74, 65, 'NaN', 71]}
df = pd.DataFrame(data)
df

add = 0
c=0
for mark in df["Marks"]:
    if str(mark).isnumeric():
        add = add+mark
        c+=1
    else:
        continue
add
c
avg = int(add/c)
int(avg)
df = df.replace(to_replace="NaN",value = avg)
df
