n=int(input())
sum1=0
while n>0:
    i=n%10
    sum1+=i
    n=n//10
print(sum1)