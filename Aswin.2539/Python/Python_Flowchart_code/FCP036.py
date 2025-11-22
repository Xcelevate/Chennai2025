n = int(input())
m = int(input())
a = n
b = m
while m != 0:
    n,m = m,n%m
hcf = n
lcm = (a*b) // hcf
print(hcf)
print(lcm)
