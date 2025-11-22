# Create a NumPy array of integers from 1 to 12 and
# reshape it into a 3×4 matrix.

import numpy as np

arr = np.arange(1, 13).reshape(3, 4)

print(arr) 

# Output
# [[ 1  2  3  4]
#  [ 5  6  7  8]
#  [ 9 10 11 12]]

# Compute the mean, median, and standard deviation of a random array of size 10 
# drawn from an uniform distribution between 0 and 1.

random = np.random.rand(10)

print(random)
#[0.06033909 0.11974834 0.50172039 0.05103959 0.03996316 0.14907819
# 0.99138541 0.20230015 0.40624024 0.59710702]

print(f"Mean: {np.mean(random)}")
# Mean: 0.31189215592097386 

print(f"Median: {np.median(random)}")
# Standard Deviation: 0.29473739923245185

# Given two NumPy arrays a = [1,2,3,4] and b = [2,2,10,4], 
# find the element-wise comparison (equal, greater, less).

arr3 = np.array(a)

print(arr3)
# [1 2 3 4]

arr4 = np.array(b)

print(b)
# [2, 2, 10, 4]

print(f"Equal: {np.equal(arr3,arr4)}")
#Equal: [False  True False  True]

print(f"Greater: {np.greater(arr3,arr4)}") 
 # Greater: [False False False False]

print(f"Less: {np.less(arr3,arr4)}")
# less : [ True False  True False]

np.transpose(arr1)
# array([ 1,  2,  3,  4,  5,  6,  7,  8,  9, 10])

# Stack two arrays vertically and horizontally.

arr1 = np.array([[1, 2, 3],
                              [4, 5, 6]])

np.transpose(arr1)
#array([[1, 4],
#      [2, 5],
#      [3, 6]])

print("Vertical Stack:\n", np.vstack((a, b)))
print("Horizontal Stack:\n", np.hstack((a, b)))

# Vertical Stack:
#[[ 1  2  3  4]
#[ 2  2 10  4]] 
#Horizontal Stack:
# 1  2  3  4  2  2 10  4]

# Create a 5×5 matrix where each element is the sum of its row and column indices.

col = np.arange(5).reshape(5,1)

print(col)
# [[0]
# [1]
# [2]
# [3]
#[4]]

add = row + col

print(add)
#  [[0 1 2 3 4]
#[1 2 3 4 5]
#[2 3 4 5 6]
#[3 4 5 6 7]
#[4 5 6 7 8]]

