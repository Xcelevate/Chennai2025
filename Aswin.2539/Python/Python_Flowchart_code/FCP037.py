n = int(input())
add = 0

for i in range(1, n):   
    if n % i == 0:     
        add += i 

if n == add:
    print("Yes")
else:
    print("No")