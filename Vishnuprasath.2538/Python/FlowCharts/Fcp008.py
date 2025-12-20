#Swap Without Temp
a = int(input())
b = int(input())
temp = 0
temp = a
a = a+b
b = a-b
a = a-b
print(a)
print(b)
