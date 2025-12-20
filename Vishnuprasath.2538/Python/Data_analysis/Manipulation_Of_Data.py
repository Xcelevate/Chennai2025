# Coding Questions
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
 
# 5. Outlier Identification & Treatment
# a) Calculate mean and standard deviation of Quantity. Identify rows where Quantity is more than
# 3 std deviations above the mean.
# b) Replace these outlier Quantity values with the median Quantity for their 'Product' group.

# 6. Feature Engineering
# a) Extract the month and year from the Date column into new columns.
# b) Flag orders larger than the 95th percentile of TotalAmount with a boolean 'HighValue' column.

# 7. Aggregations & Grouping
# a) Compute total and average revenue per Region and Product combination.
# b) For each month, show the best-selling product by total quantity.

# 8. Pivot and Reshape
# a) Create a pivot table with Region as rows, Product as columns, and sum of TotalAmount as
# values.

# 9. SalesRep Analytics
# a) Which SalesRep handled the highest revenue overall? Show their total revenue.
# b) List the top 3 SalesReps by total orders handled each.

# 10. Export the Cleaned Data
# Save the fully cleaned and engineered DataFrame to sales_data_cleaned.csv.

# 1. Load and Inspect the Data
# a) Read the CSV into a Pandas DataFrame and display the first 5 rows.

import pandas as pd
df1 = pd.read_csv('sales_data_raw.csv')

df1

df1.describe()

df1.head()

# b) Display the number of missing values for each column.

print(df1.isnull().sum())

# 2. Missing Values
# a) Fill missing Region and SalesRep values with the string "Unknown".

df1['Region'].fillna("Unknown",inplace = True)

df1['SalesRep'].fillna("Unknown",inplace = True)

df1

print(df1['Region'].isnull().sum())

# b) For missing PaymentMethod, fill with the mode method.

df1['PaymentMethod'].fillna(df1['PaymentMethod'].mode()[0], inplace = True)

print(df1['PaymentMethod'].isnull().sum())

# 3. Duplicates
# a) Count the number of duplicate rows in the dataset.

df1[df1["OrderID"].isin(df1["OrderID"][df1["OrderID"].duplicated()])].sort_values("OrderID")

# b) Drop complete duplicates and reset the DataFrame index.

df1 = df1.drop_duplicates().reset_index(drop = True)

df1[df1["OrderID"].isin(df1["OrderID"][df1["OrderID"].duplicated()])].sort_values("OrderID")

# 4. Text Cleaning and Standardization
# a) Remove leading/trailing spaces and set the 'Product' names to proper case (e.g., "Phone").

df1['Product'] = df1['Product'].str.strip().str.title()

df1['Product']

# b) Standardize 'Region' to title case (e.g., "North")

df1['Region'] = df1['Region'].str.title()

df1['Region']

# 5. Outlier Identification & Treatment
# a) Calculate mean and standard deviation of Quantity. Identify rows where Quantity is more than
# 3 std deviations above the mean.

quantity_mean = df1['Quantity'].mean()

quantity_std = df1['Quantity'].std()

print(quantity_mean)

print(quantity_std)

df1['Outlier_mask'] = df1['Quantity'] > (quantity_mean + (3 * quantity_std))
df1

df1.sort_values(by = "Outlier_mask")

# b) Replace these outlier Quantity values with the median Quantity for their 'Product' group.

product_median = df1.groupby('Product')['Quantity'].transform('median')


product_median

Outlier_mask = df1['Quantity'] > (quantity_mean + (3 * quantity_std))

df1.loc[Outlier_mask,'Quantity'] = product_median[Outlier_mask]

df1.sort_values(by = 'Outlier_mask')

# 6. Feature Engineering
# a) Extract the month and year from the Date column into new columns.

df1['Date'] = pd.to_datetime(df1['Date'])

df1['Month'] = df1['Date'].dt.month

df1['Year'] = df1['Date'].dt.year

df1

# b) Flag orders larger than the 95th percentile of TotalAmount with a boolean 'HighValue' column.

df1['HighValue'] = df1['TotalAmount'] > df1['TotalAmount'].quantile(0.95)

df1.sort_values(by = "HighValue" )


# 7. Aggregations & Grouping
# a) Compute total and average revenue per Region and Product combination.

total_average = df1.groupby(['Region', 'Product']).agg({'TotalAmount': ['sum', 'mean']}).reset_index()

total_average.rename(columns={'sum':'Total','mean':'Average'})

# b) For each month, show the best-selling product by total quantity.

sales_per_month = df1.groupby(['Year','Month','Product']).agg({'Quantity':'sum'}).reset_index()

sales_per_month.head(20)

best_selling_product = sales_per_month.loc[sales_per_month.groupby(['Year','Month'])['Quantity'].idxmax()]

best_selling_product

 # 8. Pivot and Reshape
# a) Create a pivot table with Region as rows, Product as columns, and sum of TotalAmount as
# values.

pivot_table_example = pd.pivot_table(df1, 
                                     values='TotalAmount', 
                                     index='Region', 
                                    columns='Product', 
                                     aggfunc='sum', 
                                     fill_value=0)

pivot_table_example

df1.columns

# 9. SalesRep Analytics
# a) Which SalesRep handled the highest revenue overall? Show their total revenue.

total_revenue = df1.groupby('SalesRep')['TotalAmount'].sum()

total_revenue.head(20)

best_sales_rep = total_revenue.idxmax()

best_sales_rep

(best_sales_rep,total_revenue[best_sales_rep].item())

# b) List the top 3 SalesReps by total orders handled each.

top_3_salesreps = df1.groupby('SalesRep').agg({'OrderID':'count'})

top_3_salesreps.nlargest(3,'OrderID')

# 10. Export the Cleaned Data Save the fully cleaned and engineered DataFrame to sales_data_cleaned.csv.


df1.to_csv('sales_data_cleaned.csv', index=False)