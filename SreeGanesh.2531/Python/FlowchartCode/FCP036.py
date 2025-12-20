m=int(input())
n=int(input())
m1=0
m2=0
if m>n:
    m1=m
    m2=n
else:
    m1=n
    m2=m
lcm=m1
while lcm%m2!=0:
    lcm+=m1
hcf= (m*n)//lcm
print(hcf)
print(lcm)