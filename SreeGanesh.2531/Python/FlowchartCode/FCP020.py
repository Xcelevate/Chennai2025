a=int(input())
b=int(input())
c=int(input())
d=int(input())
if a>b:
    m1=a
    m2=b
else:
    m1=b
    m2=a
if c>m1:
    m2=m1
    m1=c
elif c>m2:
    m2=c
if d>m1:
    m2=m1
    m1=d
elif d>m2:
    m2=d
print(m2)
