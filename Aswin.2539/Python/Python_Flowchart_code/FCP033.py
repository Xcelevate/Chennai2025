n = int(input())
reverse_digits = 0
palindrome = n
while n > 0:
    digit =  n % 10
    reverse_digits = reverse_digits * 10 + digit
    n = n // 10
if palindrome == reverse_digits:
    print("Yes")
else:
    print("No")