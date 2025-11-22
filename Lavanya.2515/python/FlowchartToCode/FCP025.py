n=int(input())
c=0
for i in range(1,n+1):
    if(i%2==1):
        c=c+i
        i+=2
print(c)