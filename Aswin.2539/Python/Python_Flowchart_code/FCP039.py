n = int(input())
list1 = []
for i in range(n):
    x = int(input())
    list1.append(x)
    
sort = sorted(list1)
print(sort[-1])
print(sort[0]) 