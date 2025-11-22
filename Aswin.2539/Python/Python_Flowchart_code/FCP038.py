n = int(input())
temp = n
add = 0

while n > 0:
    digit = n % 10
    add += digit ** 3
    n //= 10

if add == temp:
    print("Yes")
else:
    print("No")
