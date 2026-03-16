a=int(input())
b=int(input())
if a%b==0:
    large_div=a-b
else:
    c=a%b
    large_div=a-c

print(large_div)