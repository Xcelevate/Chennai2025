# Swap with Temp Variable
a = int(input())
b = int(input())
temp = 0
temp = b
b = a
a = temp
print(a)
print(b)