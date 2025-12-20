n=int(input())
r=0
p=n
while n>0:
    digit=n%10
    r=r*10+digit
    n=n//10
if p==r:
    print("Yes")
else:
    print("No")