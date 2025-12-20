import pandas as pd
df=pd.read_csv("demo_sales_missing.csv")
df
most_region=df['Region'].mode()[0]
df['Region']=df['Region'].fillna(most_region)
df
Products=df['Product'].mode()[0]
df['Product']=df['Product'].fillna(Products)
df
most_region = df['Region'].mode()[0]
for i in range(len(df)):
    if pd.isna(df.at[i, 'Region']):
        df.at[i, 'Region'] = most_region
most_region

percentile = (2.25 / 8) * 100
percentile 