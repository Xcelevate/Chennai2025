# Generated from: NumpyPandasOV.ipynb
# Converted at: 2026-01-10T09:03:33.050Z
# Next step (optional): refactor into modules & generate tests with RunCell
# Quick start: pip install runcell

# #### Create a NumPy array of integers from 1 to 12 and reshape it into a 3×4 matrix.


import numpy as np

arr=np.array([1,2,3,4,5,6,7,8,9,10,11,12])
newarr=arr.reshape(4,3)
print(newarr)

arr1=np.arange(1,13).reshape(4,3)
print(arr1)

# #### Compute the mean, median, and standard deviation of a random array of size 10 drawn from a uniform distribution between 0 and 1.


speed=np.random.rand(10)
print(speed)

print(f"Mean:{np.mean(speed)}")

print(f"Median:{np.median(speed)}")

print(f"Std_Deviation:{np.std(speed)}")

print(f"Sum:{np.sum(speed)}")

print(f"Maximum:{np.max(speed)}")

print(f"Minimum:{np.min(speed)}")

np.min?

np.max?

np.sum?

np.mean?

np.median?

np.std?

# #### Given two NumPy arrays a = [1,2,3,4] and b = [2,2,10,4], find the element-wise comparison(equal, greater, less).


arr1=np.array([1,2,3,4])
arr2=np.array([2,2,10,4])

print(f"Equal:{np.equal(arr1,arr2)}")

print(f"Greater:{np.greater(arr1,arr2)}")

print(f"Less:{np.less(arr1,arr2)}")

arr1 = np.array([[1, 2, 3],[4, 5, 6]])

np.transpose(arr1)

print("Vertical Stack:\n", np.vstack((arr1, arr2)))
print("Horizontal Stack:\n", np.hstack((arr1, arr2)))

# #### Create a 5×5 matrix where each element is the sum of its row and column indices.


col=np.arange(5).reshape(5,1)

print(col)

row=np.arange(5)

print(row)

Sum=row + col

print(Sum)

# #### Create a Pandas DataFrame from a dictionary containing columns 'Name', 'Age', and 'City'.


import pandas as pd

data = {'Name': ['Asha', 'Ravi', 'Seema'],
'Age': [25, 30, 28],
'City': ['Bangalore', 'Chennai', 'Pune']}

print(data["Name"])

print(data["City"])

data["City"]=['Bangalore', 'Chennai', 'Pune']
print(data["City"])

for city in data["City"]:
    print(city)

(data["City"].append("Kolkata"))

print(data["City"])

print(pd.DataFrame(data))

# #### Filter rows from a DataFrame where Age are greater than 50


df=pd.DataFrame(data)

print(df)

Filtered_df=df[(df['Age'] > 26)]

Filtered_df

# #### Given a DataFrame with columns ['Region', 'Sales', 'Profit'], compute total sales and average profit by region.


Sales_data = {
'Region': ['North', 'South', 'North', 'East', 'South'],
'Sales': [5000, 7000, 6000, 4500, 8000],
'Profit': [500, 700, 600, 450, 800]}

Sales_df=pd.DataFrame(Sales_data)

Sales_df

# ## SQL query connected with dataframe as pandas


# select Region,sum(Sales),avg(Profit) from Sales_df group by Region

summary = Sales_df.groupby('Region').agg({'Sales': 'sum', 'Profit': 'mean'})

summary