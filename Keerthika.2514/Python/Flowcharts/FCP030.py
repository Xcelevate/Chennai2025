n=int(input())
j=0
while i*i<=n:
    if i*i==n:
        j=i
        break
if j==0:
    print("No")
else:
    print("Yes")

