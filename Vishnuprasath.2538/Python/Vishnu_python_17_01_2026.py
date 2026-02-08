# Generated from: Vishnu_python_17_01_2026.ipynb
# Converted at: 2026-01-17T06:58:01.190Z
# Next step (optional): refactor into modules & generate tests with RunCell
# Quick start: pip install runcell

# ### Question 1


# Problem statement:
# create class ProductLoader that performs the following operations:
# 1. Loads Product.csv file with comprehensive error handling using try-except-finally 
# block.
# 2. implements string manipulation to convert all productname values to uppercase
# 3. creates a function using loops to filter Product where Price > 20000 AND Rating > 4.0
# 4. returns filtered products as a list of dictionaries containing Product ID
# implements custom exception LowRatingError that is raised when any product has Rating < 2.0


import pandas as pd
import numpy as np
import matplotlib as plt
import seaborn as sn

a = pd.read_csv("Product.csv")

a

a.describe()

a.info

class LowRatingError(Exception):
    pass

class ProductLoader:
    def __init__(self, name):
        self.name = name
        self.products = []

    def load_products(self):
        try:
            file = open(self.name, 'r')
            reader = csv.DictReader(file)
        except FileNotFoundError:
            print('Your file is not foumd here')
        except LowRatingError as e:
            print(e)

    def filter_products(self):
        result=[]
        for p in self.products:
            if p['Price'] > 20000 and p['Rating'] > 4.0:
                result.append({ 'ProductID': p['ProductID'], 'ProductName': p['ProductName'], 'Price': p['Price']})
        return result

loader = ProductLoader('Product.csv')
loader.load_products()
filtered = loader.filter_products()
print(filtered)

# ## Question 2


df = pd.read_csv('Sales.csv')

df

def categorize(self):
        amount = []
        for s in self.sales:
            if (['SaleAmount'] > 50000):
                print('High')
            elif (10000<=['SaleAmount']<=50000):
                print('Medium')
            elif (['SaleAmount']<10000):
                result.append({ 'ProductID': s['ProductID'], 'ProductName': p['ProductName'], 'Price': p['Price']})
        return amount

categorize()

Total_sales_amount = df['SaleAmount'].sum()

Total_sales_amount

print(Total_sales_amount)

payment_method = df.groupby('PaymentMethod')['SaleAmount'].sum()

payment_method

# ## Question 3


df = pd.read_csv('SalesChurn.csv')

df

def risk_category(ChurnProbability):
    for p in df['ChurnProbability']:
        if df['ChurnProbability'] > 0.8:
            print('Critical')
        elif 0.5 <= df['ChurnProbability'] <= 0.8:
            print('High')
        elif df['ChurnProbability'] < 0.5:
            print('Low')

risk_category

# ## Question 4


# Problem Statement: 
# Create a data analysis program using NumPy: 
# 1. Extract Price and StockQuantity columns from Product.csv as NumPy arrays 
# 2. Create 2D NumPy array using np.column_stack([prices, 
# stock_quantities]) 
# 3. Calculate statistical measures using NumPy functions: 
# o Mean price and mean stock 
# o Median values 
# o Standard deviation 
# o Percentiles: 25th, 50th, 75th for prices 
# 4. Use NumPy boolean indexing to filter: products where StockQuantity > 75th 
# percentile 
# 5. Implement error handling for data type conversion with ValueError exception 
# 6. Return comprehensive statistics dictionary 


df = pd.read_csv('Product.csv')

df

prices = df['Price'].to_numpy(dtype=float)
stocks = df['StockQuantity'].to_numpy(dtype = float)
data = np.column_stack([prices, stocks])

prices

stocks

data

mean_price = np.mean(prices)
mean_stock = np.mean(stocks)
median_price = np.median(prices)
median_stock = np.median(stocks)
std_price = np.std(prices)
p25 = np.percentile(prices, 25)
p50 = np.percentile(prices, 50)
p75 = np.percentile(prices, 75)

stats = {"MeanPrice": mean_price, "MeanStock": mean_stock, "MedianPrice": median_price, "MedianStock": median_stock, "StdPrice": std_price, "25thPercentile": p25, "50thPercentile": p50, "75thPercentile": p75}
print('Price Statistics:')
print(stats)

# ## Question 6


product = pd.read_csv('Product.csv')
sales = pd.read_csv('Sales.csv')
churn = pd.read_csv('SalesChurn.csv')

product

sales

churn