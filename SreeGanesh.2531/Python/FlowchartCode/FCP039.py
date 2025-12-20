n=int(input())
num=[]
for i in range(n):
    x=int(input())
    num.append(x)
sort=sorted(num)
print(sort[-1])
print(sort[0])   