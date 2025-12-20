Coding Questions
1. Load and Inspect the Data
a) Read the CSV into a Pandas DataFrame and display the first 5 rows.
import pandas as pd 
df = pd.read_csv('sales_data_raw.csv')
df
print(df.head(5))
missing_values = df.isnull().sum()
print(missing_values)

2. Missing Values
a) Fill missing Region and SalesRep values with the string "Unknown".
df['Region'] = df['Region'].fillna('Unknown')
df['SalesRep'] = df['SalesRep'].fillna('Unknown')
df
print(df[['Region','SalesRep']].isnull().sum())

b) For missing PaymentMethod, fill with the mode method.
mode_value = df['PaymentMethod'].mode()[0]   # It finds the most common value (mode) in paymentmethod
df['PaymentMethod'] = df['PaymentMethod'].fillna(mode_value)
print(df['PaymentMethod'].isnull().sum())  # Should show zeros after filling

3. Duplicates
a) Count the number of duplicate rows in the dataset.¶
duplicated_count = df.duplicated().sum()
print (duplicated_count)

b) Drop complete duplicates and reset the DataFrame index.
df = df.drop_duplicates()
df = df.reset_index(drop = True)
duplicated_count = df.duplicated().sum()
print (duplicated_count)


4. Text Cleaning and Standardization
a) Remove leading/trailing spaces and set the 'Product' names to proper case (e.g., "Phone").¶

df['Product'] = df['Product'].str.strip().str.title()
print(df['Product'])

b) Standardize 'Region' to title case (e.g., "North")
df['Region'] = df['Region'].str.title()
print(df['Region'])

5. Outlier Identification & Treatment
a) Calculate mean and standard deviation of Quantity. Identify rows where Quantity is more than 3 std deviations above the mean.¶

mean_quantity = df['Quantity'].mean()
std_quantity = df['Quantity'].std()
rows = df[df['Quantity'] > 3 * std_quantity + mean_quantity]
print(rows)

6. Feature Engineering
a) Extract the month and year from the Date column into new columns.
df['Date'] = pd.to_datetime (df['Date'])
df['Year'] = df['Date'].dt.year
df['Month'] = df['Date'].dt.month
print(df.head())

b) Flag orders larger than the 95th percentile of TotalAmount with a boolean 'HighValue' column.
percentile_95 = df['TotalAmount'].quantile(0.95)
df['HighValue'] = df['TotalAmount'] > percentile_95
print(df.head())

7. Aggregations & Grouping¶
a) Compute total and average revenue per Region and Product combination.
result = df.groupby(['Region','Product'])['TotalAmount'].agg(['sum', 'mean'])
print(result.head())

b) For each month, show the best-selling product by total quantity.
monthly_sales = df.groupby(['Year','Month','Product'])['Quantity'].sum().reset_index()

best_selling = monthly_sales.sort_values(["Year", "Month", "Quantity"], ascending=[True, True, False])

best_per_month = best_selling.groupby(["Year", "Month"]).head(1).reset_index(drop=True)

8. Pivot and Reshape
a) Create a pivot table with Region as rows, Product as columns, and sum of TotalAmount as values.¶
pivot = df.pivot_table(index = 'Region',columns = 'Product',values = 'TotalAmount',aggfunc= 'sum')
pivot

9. SalesRep Analytics
a) Which SalesRep handled the highest revenue overall? Show their total revenue.¶

salesrep_total = df.groupby('SalesRep')['TotalAmount'].sum()
top_salesrep = salesrep_total.sort_values(ascending = False)
print(top_salesrep.head(1))

b) List the top 3 SalesReps by total orders handled each.
order_counts = df.groupby('SalesRep')['SalesRep'].count()
top3_salesreps = order_counts.sort_values(ascending = False)
print(top3_salesreps.head(3))


10. Export the Cleaned Data Save the fully cleaned and engineered DataFrame to sales_data_cleaned.csv.¶

df.to_csv('sales_data_cleaned.csv',index = False)


