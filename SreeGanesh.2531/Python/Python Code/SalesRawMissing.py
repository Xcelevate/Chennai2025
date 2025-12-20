# 1. Load and Inspect the Data
# a) Read the CSV into a Pandas DataFrame and display the first 5 rows.
# b) Display the number of missing values for each column.
# 2. Missing Values
# a) Fill missing Region and SalesRep values with the string "Unknown".
# b) For missing PaymentMethod, fill with the mode method.
# 3. Duplicates
# a) Count the number of duplicate rows in the dataset.
# b) Drop complete duplicates and reset the DataFrame index.
# 4. Text Cleaning and Standardization
# a) Remove leading/trailing spaces and set the 'Product' names to proper case (e.g., "Phone").
# b) Standardize 'Region' to title case (e.g., "North")
#  5. Outlier Identification & Treatment
# a) Calculate mean and standard deviation of Quantity. Identify rows where Quantity is more than
# 3 std deviations above the mean.
# b) Replace these outlier Quantity values with the median Quantity for their 'Product' group.6. Feature Engineering
# a) Extract the month and year from the Date column into new columns.
# b) Flag orders larger than the 95th percentile of TotalAmount with a boolean 'HighValue' column.
# 7. Aggregations & Grouping
# a) Compute total and average revenue per Region and Product combination.
# b) For each month, show the best-selling product by total quantity.
# 8. Pivot and Reshape
# a) Create a pivot table with Region as rows, Product as columns, and sum of TotalAmount as values.
# 9. SalesRep Analytics
# a) Which SalesRep handled the highest revenue overall? Show their total revenue.
# b) List the top 3 SalesReps by total orders handled each.
# 10. Export the Cleaned Data
# Save the fully cleaned and engineered DataFrame to sales_data_cleaned.csv.

import pandas as pd
df = pd.read_csv('sales_data_raw.csv')
df

df.describe()

df.head()

# Display the number of missing values for each column
print(df.isnull().sum())

# 2. Missing Values
# a) Fill missing Region and SalesRep values with the string "Unknown".
df['Region'].fillna("Unknown",inplace = True)

df['SalesRep'].fillna("Unknown",inplace = True)
df

print(df['Region'].isnull().sum())


# b) For missing PaymentMethod, fill with the mode method
df['PaymentMethod'].fillna(df['PaymentMethod'].mode()[0], inplace = True)

print(df['PaymentMethod'].isnull().sum())

#3. Duplicates
# a) Count the number of duplicate rows in the dataset
df[df["OrderID"].isin(df["OrderID"][df["OrderID"].duplicated()])].sort_values("OrderID")


# b) Drop complete duplicates and reset the DataFrame index
df = df.drop_duplicates().reset_index(drop = True)
df[df["OrderID"].isin(df["OrderID"][df["OrderID"].duplicated()])].sort_values("OrderID")

# 4. Text Cleaning and Standardization
# a) Remove leading/trailing spaces and set the 'Product' names to proper case (e.g., "Phone").
df['Product'] = df['Product'].str.strip().str.title()
df['Product'].reset_index()

# b) Standardize 'Region' to title case (e.g., "North")
df['Region'] = df['Region'].str.title()
df['Region']

# 5. Outlier Identification & Treatment
# a) Calculate mean and standard deviation of Quantity. Identify rows where Quantity is more than 3 std deviations above the mean.
quantity_mean = df['Quantity'].mean()
quantity_std = df['Quantity'].std()
print(quantity_mean)
print(quantity_std)
df['Outlier_mask'] = df['Quantity'] > (quantity_mean + (3 * quantity_std))
df

df.sort_values(by='Outlier_mask')

# b) Replace these outlier Quantity values with the median Quantity for their 'Product' group
product_median=df.groupby('Product')['Quantity'].transform('median')
product_median

df['Outliermask'] = df['Quantity'] > (quantity_mean + (3 * quantity_std))
df

df.loc[df['Outliermask'],'Quantity'] = product_median[df['Outliermask']]
df.sort_values(by='Outlier_mask')

# 6. Feature Engineering
# a) Extract the month and year from the Date column into new columns.
df['Date']=pd.to_datetime(df['Date'])
df['Month']=df['Date'].dt.month
df['Year']=df['Date'].dt.year
df

# b) Flag orders larger than the 95th percentile of TotalAmount with a boolean 'HighValue' column.
df['HighValue']=df['TotalAmount']>df['TotalAmount'].quantile(0.95)
df.sort_values(by="HighValue")

# 7.Aggregations & Grouping
# a) Compute total and average revenue per Region and Product combination.
total_average = df.groupby(['Region', 'Product']).agg({'TotalAmount':['sum', 'mean']}).reset_index()
total_average.rename(columns={'sum':'Total','mean':'Average'})

# b) For each month, show the best-selling product by total quantity.
sales_per_month=df.groupby(['Year','Month','Product']).agg({'Quantity':'sum'})
sales_per_month.head(20)
best_selling_product = sales_per_month.loc[sales_per_month.groupby(['Year','Month'])['Quantity'].idxmax()]
best_selling_product

# 8.Pivot and Reshape
# a) Create a pivot table with Region as rows, Product as columns, and sum of TotalAmount as values.
pivot_table_example = pd.pivot_table(df, 
                                     values='TotalAmount', 
                                     index='Region', 
                                     columns='Product', 
                                     aggfunc='sum', 
                                     fill_value=0)
pivot_table_example
# 9.SalesRep Analytics
# a) Which SalesRep handled the highest revenue overall? Show their total revenue.
total_revenue=df.groupby('SalesRep')['TotalAmount'].sum()
total_revenue.head(20)

best_sales_rep=total_revenue.idxmax()
best_sales_rep

(best_sales_rep,total_revenue[best_sales_rep].item())

#b) List the top 3 SalesReps by total orders handled each.
top_3_salesreps=df.groupby('SalesRep').agg({'OrderID':'count'})
top_3_salesreps.nlargest(3,'OrderID')

# 10.Export the Cleaned Data Save the fully cleaned and engineered DataFrame to sales_data_cleaned.csv.
df.to_csv('sales_data_cleaned.csv', index=False)