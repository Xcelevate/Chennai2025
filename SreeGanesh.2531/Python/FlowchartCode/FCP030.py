n=int(input())
i=1
s=0
while (i*i<=n):
    s=i*i
    i+=1
if(s==n):
    print("Yes")
else:
    print("No")
