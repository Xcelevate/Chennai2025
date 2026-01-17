# Generated from: Aswin_Python_Jan17.ipynb
# Converted at: 2026-01-17T06:55:37.199Z
# Next step (optional): refactor into modules & generate tests with RunCell
# Quick start: pip install runcell

# ### Question 1  [10 Marks]
# ### Problem Statement:
# ### Create a class ProductLoader that performs the following operations:
# #### 1.	Loads Product.csv file with comprehensive error handling using try-except-finally block
# #### 2.	Implements string manipulation to convert all ProductName values to uppercase
# #### 3.	Creates a function using loops to filter products where Price > 20000 AND Rating > 4.0
# #### 4.	Returns filtered products as a list of dictionaries containing ProductID, ProductName, Price
# #### 5.	Implements custom exception LowRatingError that is raised when any product has Rating < 2.0
# 


import pandas as pd

class LowRatingError(Exception):
    """Check if the rating is less than 2"""
    pass
    
class ProductLoader:
    def load_data(self,path):
        try:
            df = pd.read_csv(path)
            print(f'Product data length:{len(df)} Successfully loaded.')
            return df
        except FileNotFoundError :
            print(f'Check the file path: {path}')
            return None
        finally:
            print(f'File operation Completed.')

    def string_manipulation(df):
        for _,productname in df['ProductName'].values:
            upper = productname.upper()
        return upper

    def filter_product(self,df):
        try:
            for price,rating in zip(df['Price'],df['Rating']):
                if rating < 2.0:
                    raise LowRatingError (f'This product is low rating')
                elif price > 20000 and rating > 4.0:
                    return ( price, rating)
                else:
                    return None
        except LowRatingError as e:
            print(e)

if __name__ == "__main__":
    df = ProductLoader()
    df.filter_product(df)
    df.load_data('Product.csv')


# ### Question 2  [10 Marks]
# ### Problem Statement:
# ### Write a program that analyzes Sales.csv data using Python collections:
# #### 1.	Load Sales.csv into Pandas DataFrame
# #### 2.	Extract unique PaymentMethod values and convert to immutable tuple
# #### 3.	Use dictionary comprehension to count total transactions per Region
# #### 4.	Implement function with explicit loops to calculate total SaleAmount for each payment method
# #### 5.	Use if-elif-else branching to categorize sales:
# #### o	High: SaleAmount > 50,000
# #### o	Medium: 10,000 ≤ SaleAmount ≤ 50,000
# #### o	Low: SaleAmount < 10,000
# #### 6.	Return dictionary with payment methods and their totals
# 


import pandas as pd
df1 = pd.read_csv('Sales.csv')
print(f'Sales datas:{len(df1)} successfully loaded.')

# unique values

duplicate = df1['PaymentMethod'].duplicated()
duplicate_count = duplicate.isnull().sum()
print(f'No of duplicates: {(duplicate_count)}')

# extract value

payment = df1['PaymentMethod'].values
result = []
for i in payment:
    result.append(i)
print("immutable type unique payment method:")
print(set(result))

# calculate saleamount
def total_amout(df1):
    calculate = df1.groupby('PaymentMethod')['SaleAmount'].sum()
    for saleamount in calculate:
        if saleamount > 50000:
            total = "High"
        elif 10000 <= saleamount  <= 50000:
            total = "Medium"
        else:
            total = "Low"
        return calculate[::], total

total_amout(df1)

# ### Question 3 [10 Marks]
# ### Problem Statement:
# ### Implement a program using functional programming concepts:
# #### 1.	Load SalesChurn.csv into DataFrame
# #### 2.	Define function risk_category(probability) that returns:
# #### o	"Critical" if probability > 0.8
# #### o	"High" if 0.5 ≤ probability ≤ 0.8
# #### o	"Low" if probability < 0.5
# #### 3.	Use list comprehension to apply this function: [risk_category(p) for p in df['ChurnProbability']]
# #### 4.	Create frequency dictionary using collections.Counter to count each risk category
# #### 5.	Raise custom exception InvalidProbabilityError if any probability value is outside [0, 1] range
# #### 6.	Implement proper error handling with try-except
# 


class InvalidProbabilityError(Exception):
    """
    check if the probability is outside range.
    """
    pass
f2 = pd.read_csv('SalesChurn.csv')
print(f'SalesChurn Datas:{len(df2)} successfully added.')

def ristcategory(df2):
    try:
        for p in df2['ChurnProbability']:
            if 1 < p > 0:
                raise InvalidProbabilityError (f'Invalid probability range morethan 1 or negative')
            elif p > 0.8:
                print("Critical")
            elif 0.5 <= p <= 0.8:
                print("High")
            else:
                print("Low")

    except InvalidProbabilityError as e:
        print(e)

# ### Question 4  [12 Marks]
# ### Problem Statement:
# ### Create a data analysis program using NumPy:
# #### 1.	Extract Price and StockQuantity columns from Product.csv as NumPy arrays
# #### 2.	Create 2D NumPy array using np.column_stack([prices, stock_quantities])
# #### 3.	Calculate statistical measures using NumPy functions:
# #### o	Mean price and mean stock
# #### o	Median values
# #### o	Standard deviation
# #### o	Percentiles: 25th, 50th, 75th for prices
# #### 4.	Use NumPy boolean indexing to filter: products where StockQuantity > 75th percentile
# #### 5.	Implement error handling for data type conversion with ValueError exception
# #### 6.	Return comprehensive statistics dictionary
# 


# question 4

df3 = pd.read_csv('Product.csv')
print(f'Product data length:{len(df3)} Successfully loaded.')

# extraction

arr1 = df3[['Price','StockQuantity']].values
print("Extracted arrray:")
print(arr1)

# create 2d array
import numpy as np
arr_2d = np.column_stack(df3[['Price','StockQuantity']].values)
print("The created 2d array:")
print(arr_2d)
print("Price statistics:")
print(f'mean : ${round(np.mean(arr_2d),2)}')
print(f'Median : ${round(np.median(arr_2d),2)}')
print(f'std Dev : ${round(np.std(arr_2d),2)}')
print(f'25th Percentile : ${round(np.quantile(arr_2d,0.25),2)}')
print(f'75th Percentile : ${round(np.quantile(arr_2d,0.75),2)}')


# boolean masking

boolean_masking = df3[df3['StockQuantity'] > df3['StockQuantity'].quantile(0.75)]
print(f'High Stock Products(above 75th percentile: {len(boolean_masking)}')

# ### Question 5 [12 Marks]
# ### Problem Statement:
# ### Design and implement an object-oriented solution with inheritance:
# ### Base Class Transaction:
# #### •	Private attributes: __sale_id, __amount, __date
# #### •	Public properties (getters/setters) for accessing private attributes
# #### •	Method validate_amount() raises InvalidAmountError if amount ≤ 0
# #### •	Method calculate_tax(rate) returns tax amount
# ### Derived Class ProductTransaction(Transaction):
# #### •	Inherits from Transaction
# #### •	Additional attributes: product_id, quantity
# #### •	Override __str__() method to include product details
# #### •	Method calculate_unit_price() returns amount/quantity
# #### •	Method get_transaction_summary() returns formatted string
# ### Implementation Requirements:
# #### 1.	Define custom exception InvalidAmountError and InvalidTransactionError
# #### 2.	Encapsulate all attributes with private scope
# #### 3.	Implement property decorators for safe access
# #### 4.	Read Sales.csv and create ProductTransaction objects
# #### 5.	Use try-except-finally in constructor for error handling
# #### 6.	Validate each transaction during creation
# #### 7.	Count and report valid vs invalid transactions


class InvalidAmountError(Exception):
    """
    check if the amount is valid or invalid
    """
    pass

class InvalidTransactionError(Exception):
    """
    check if the transcation is valid or invalid
    """
    pass

    
class Transcation:
    def __init__(self,sale_id,amount,date):
        self.__sale_id = sale_id
        self.__amount = amount
        self.__date = date

    @property
    def sale_id(self):
        return self.__sale_id

    @property
    def amount(self):
        return self.__amount

    @property
    def date(self):
        return self.__date

    @sale_id.setter
    def sale_id(self,new_id):
        self.__sale_id = new_id

    @date.setter
    def date(self,new_date):
        self.__date = new_date

    @validateamount.setter
    def validateamount(self,amount):
        try:
            if amount <= 0:
                raise InvalidAmountError (f'Amount cannot less than 0')
        except InvalidAmountError as e:
            print(e)

    @ caluculate_tax.setter
    def calculate_tax(self,rate):
        return self.__amount  * rate

class ProductTranscation(Transcation):
    def __init__(self,sale_id,amount,date,product_id,quantity):
        super().__init__(self,sale_id,amount,date)
        self.product_id = product_id
        self.quantity = quantity

    def load_data(path):
        try:
            df = pd.read_csv(path)
            return df
        except FileNotFoundError as e:
            print(e)
        finally:
            print("File operation completed")
        
    def __str__(self):
        return ({
            f'Productid: {self.product_id}'
            f'Amount: {self.amount}'
            f'Quantity:{self.quantity}'
            f'Date: {self.date}'
        })

    def calculate_unit_price(self):
        return self.__amount * self.quantity

    def get_transaction_summary(self):
        return (f' Transaction Processing Report:'
                f' Total Records : {len(df)}'
        )

if __name__ == "__main__":
    a = Transaction()

# ### Question 6  [12 Marks]
# ### Problem Statement:
# ### Implement comprehensive data integration and analysis:
# ### 1.	Load all three datasets into Pandas DataFrames
# ### 2.	Merge operations:
# #### o	Merge Sales.csv with Product.csv on ProductID
# #### o	Merge result with SalesChurn.csv on CustomerID (left join strategy)
# ### 3.	Create derived columns:
# #### o	revenue_per_unit = SaleAmount / QuantitySold
# #### o	risk_adjusted_value = CustomerValue × ChurnProbability
# ### 4.	Data filtering
# #### o	Filter for Region == 'South' AND ChurnStatus == 'At Risk'
# ### 5.	Aggregation:
# #### o	Group by Category
# #### o	Calculate: total_revenue, avg_rating, customer_count
# ### 6.	Sorting and output:
# #### o	Sort by total_revenue in descending order
# #### o	Display top 5 categories
# ### 7.	Error handling:
# #### o	Catch KeyError for missing columns
# #### o	Handle merge-related exceptions
# #### ### o	Validate row counts at each operation
# 


import pandas as pd

df5 = pd.read_csv('Product.csv')
df6 = pd.read_csv('Sales.csv')
df7 = pd.read_csv('SalesChurn.csv')

# merge

merge_sales_product = pd.merge(df6,df5 ,on='ProductID')
merge_saleschurn = merge_sales_product.merge(df7, on = 'CustomerID')
print(merge_saleschurn)


# derived column

revenue_per_unit = merge_saleschurn['SaleAmount'] / merge_saleschurn['QuantitySold']
risk_adjusted_value = merge_saleschurn['CustomerValue'] *  merge_saleschurn['ChurnProbability']
print("Revenue per unit:")
print(revenue_per_unit)
print("Risk adjusted value:")
print(risk_adjusted_value)


# data filtering 

filter_data = merge_saleschurn[(merge_saleschurn['Region'] == 'South') and (merge_saleschurn['ChurnStatus'] == 'At Risk')]


# aggegration

calculation = merge_saleschurn.groupby('Category').agg({'SaleAmount':'sum',
                                                       'Rating':'mean',
                                                       'CustomerID':'count'})
print(calculation)


# sorting

total_revenue = merge_saleschurn.groupby('Category').sum().sort_values(by ='SaleAmount',ascending = False)
top_5 = merge_saleschurn.nlargest(5,'SaleAmount')
print("Top_5 categories:")
print(top_5['Category'])

# ### Question 7 [12 Marks]
# ### Problem Statement:
# ### Create comprehensive product visualizations using Matplotlib and Seaborn:
# ###  1.	Load Product.csv and prepare data for visualization
# ### 2.	Create 2×2 subplot layout with following charts:
# #### o	Subplot 1: Histogram of product ratings with mean line overlay
# #### o	Subplot 2: Box plot showing price distribution by category
# #### o	Subplot 3: Scatter plot of Price vs Rating with regression line
# #### o	Subplot 4: Bar plot showing product count per category
# ### 3.	Apply formatting:
# #### o	Add titles and axis labels to each subplot
# #### o	Include legends where appropriate
# #### o	Apply grid and alpha transparency for clarity
# ### 4.	Statistical analysis:
# #### o	Calculate Pearson correlation between Price and Rating
# #### o	Interpret correlation results
# ### 5.	Save visualization:
# #### o	Export final figure as PNG at 300 DPI
# #### o	Use proper figure sizing (14×10 inches)
# ### 6.	Error handling:
# #### o	Handle missing data gracefully
# #### o	Catch ValueError exceptions
# 


import matplotlib.pyplot as plt

import seaborn as sns

df8 = pd.read_csv('Product.csv')

# subplot

fig, axes = plt.subplots(2,2,figsize=(12,8))
sns.histplot( data = df8, x='Rating', ax=axes[0, 0], bins = 5 )
axes[0, 0].set_title('Rating Distribution')

sns.boxplot(data = df8 , x='Category',y='Price',ax = axes[0,1])
axes[0, 1].set_title('Price Distribution by category')

sns.scatterplot(data = df8, x = 'Price' , y = 'Rating',ax=axes[1,0])
axes[1, 0].set_title('Price vs category')

sns.barplot(data = df8, x = 'Price' , y = 'Rating',ax=axes[1,1])
axes[1, 1].set_title('Product count on category')

# ### Question 8  [12 Marks]
# ### Problem Statement:
# ### Design a class-based sales analyzer with date filtering and custom exceptions:
# ### Requirements:
# ### 1.	Create SalesAnalyzer class:
# #### o	Constructor accepts filename
# #### o	Private method __parse_date() to convert SaleDate to datetime
# #### o	Method load_data() with try-except-finally for CSV loading
# ### 2.	Implement custom exceptions:
# #### o	DateRangeError – raised when start_date > end_date
# #### o	DataLoadError – raised when file cannot be loaded
# ### 3.	Core methods:
# #### o	filter_date_range(start_date, end_date) – returns filtered DataFrame
# #### o	region_metrics() – returns dict with count and total_sales per region
# #### o	top_products(n=10) – returns top N products by revenue
# #### o	calculate_metrics() – returns total, average, and count of sales
# ### 4.	Date filtering:
# #### o	Validate date range
# #### o	Support multiple date formats
# #### o	Apply filters to DataFrame
# ### 5.	Metrics calculation:
# #### o	Sum and count operations per region
# #### o	Product revenue ranking
# #### o	Overall statistics reporting
# ### 6.	Error handling:
# #### o	Catch FileNotFoundError, ValueError, DateRangeError
# #### o	Provide meaningful error messages
# 


class DateRangeError(Exception):
    pass

class  DateRangeError(Exception):
    pass
    
class SalesAnalyzer:
    def __init__(self,file_name,parse_date):
        try:
            self.file_name = file_name
            self.__parse_date = parse_date

    def load_data(self,path):
       try:
            df10 = pd.read_csv(path)
            print(f'Product data length:{len(df10)} Successfully loaded.')
            return df
       except FileNotFoundError:
            print(f'Check the file path: {path}')
            return None
       finally:
            print(f'File operation Completed.')