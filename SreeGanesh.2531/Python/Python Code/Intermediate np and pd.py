# Generated from: Intermediate np and pd.ipynb
# Converted at: 2026-01-10T09:21:39.117Z
# Next step (optional): refactor into modules & generate tests with RunCell
# Quick start: pip install runcell

# ## NumPy Section


# ####  Question 1: Matrix Slicing and Submatrix Extraction


#  ##### Create a 6×6 matrix with values from 0 to 35. Extract the central 4×4 submatrix.


import numpy as np

arr=np.arange(36).reshape(6,6)
arr

center=arr[1:5,1:5]
center

# #### Question 2: Percentile-Based Filtering


# ##### Generate a random 1D array of 20 elements. Replace all values below the 25th percentile with zero.


arr1=np.random.randn(20)
arr1

q25=np.percentile(arr1,25)
arr1[arr1<q25]=0
arr1

# #### Question 3: Min-Max Normalization


# ##### Given an array of integers, normalize all values between 0 and 1 using min-max normalization


import numpy as np

data=np.random.randint(10,100,size=12)
norm=(data-np.min(data))/(np.max(data)-np.min(data))
print("Original:", data)
print("Normalized:", norm)

# #### Question 4: 3D Array Stacking


# ##### Stack two random matrices of shape (4,3) and (4,3) along a new third dimension.


a=np.random.randn(4,3)
b=np.random.randn(4,3)
stacked=np.stack([a,b],axis=2)
print("Shape of stacked array:", stacked.shape)

print("First element:\n", stacked[:, :, 0])

 stacked?

# ####  Question 5: Unique Value Frequency Count


# ##### For a random array of integers, count unique values and their frequency efficiently.


import numpy as np

arr = np.random.randint(1, 10, size=50)
values, counts = np.unique(arr, return_counts=True)
frequency_dict = {int(val): int(cnt) for val, cnt in zip(values, counts)}
print("Unique values and frequencies:")
print(frequency_dict)

arr = np.random.randint(1, 10, size=50)
values, counts = np.unique(arr, return_counts=True)
frequency_dict = dict(zip(values, counts))
print("Unique values and frequencies:")
print(frequency_dict)