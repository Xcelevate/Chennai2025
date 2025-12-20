n=int(input())
add=0
for i in range(1,n+1):
    if i%2==0:
        continue
    else:
        add+=i
print(add)