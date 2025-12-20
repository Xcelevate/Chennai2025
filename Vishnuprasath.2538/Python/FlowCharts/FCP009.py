#Largest Divisible Less Than A
# Take input from the user
A = int(input())
B = int(input())

# Find the remainder when A is divided by B
remainder = A % B

# Calculate the largest number less than A that is divisible by B
largest_divisible = A - remainder

# Check if largest_divisible is not less than A, adjust by subtracting B
if largest_divisible >= A:
    largest_divisible -= B

print(largest_divisible)
