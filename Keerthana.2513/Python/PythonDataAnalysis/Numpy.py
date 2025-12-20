NUMPY

import numpy as np
arr=np.array([[1,2,3],[4,5,6]])
print(arr)
print(type(arr))

arr = np.array((1,2,3,4))
print(arr)

arr = np.array(42)
print(arr)

arr = np.array([[1,2,3,4],[1,2,3,4]])
print(arr)

a = np.array(42)
b = np.array([1,2,3,4,5])
c = np.array([[1,2,3],[4,5,6]])
d = np.array([[[1,2,3],[4,5,6]], [[1,2,3],[4,5,6]]])

print(a.ndim)
print(b.ndim)
print(c.ndim)
print(d.ndim)


arr=np.array([[1,2,3,4,5],[6,7,8,9,10]])
print("2nd element on 1st row:",arr[0,1])

np.zeros?

arr=np.array([1,2,3,4,5,6,7])
print(arr[0:2])


arr=np.array([[1,2,3,4,5,7],[8,9,10,11,12,13]])
print(arr[0:2,2])

arr=np.array([1,2,3,4,5])
x=arr.copy()
arr[0]=42
print(arr)
print(x)

arr=np.array([1,2,3,4,5])
x=arr.view()
arr[0]=42
print(arr)
print(x)

arr=np.array([[1,2,3,4,5,7],[8,9,10,11,12,13]])
print(arr.shape)

arr=np.array([[1,2,3],[5,6,7]])
newarr=arr.reshape(-1)
print(newarr)

import numpy
speed=[65,34,11,24,35,14,35,69,4,8]
x=numpy.median(speed)
print(x)

from scipy import stats
speed=[99,86,54,87,44,5,54,88,48,44]
x=stats.mode(speed).
print(x)

