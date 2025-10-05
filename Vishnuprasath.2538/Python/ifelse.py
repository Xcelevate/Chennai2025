# Check whether the digit is even or odd
A = int(input())  # Get integer input from user
if(A % 2 == 0):   # Check if number is divisible by 2 (even)
    print("Even") # Print "Even" if the condition is true
else:
    print("odd")  # Print "odd" if the condition is false

#Check whether to compare two numbers 
A= int(input()) # get an input from an user
B= int(input()) # get an input from an user
if(A>B): # compare A and B - print A if it's greater
    print(A) 
elif(A<B): # compare A and B - print B if it's greater
    print(B)
else: # if A and B are equal
    print("Equal")

# Grading system
M = int(input())  # Get the marks as integer input from user
if(M >= 90):  # If marks are 90 or above
    print("A+")  # Print A+ grade
elif(75 <= M > 90):  # If marks are between 75 and 90 (exclusive)
    print("A")  # Print A grade
elif(60 < M > 75):  # Note: This condition is logically incorrect (should be 60 < M <= 75)
    print("B")  # Print B grade
elif(40 <= M >= 60):  # Note: This condition is logically incorrect (should be 40 <= M <= 60)
    print("c")  # Print C grade (note lowercase 'c')
else:  # If marks are below 40
    print("Fail")  # Print Fail

# Check if a palindrome or not
a = input()  # Get input from the user
b = str(a)[::-1]  # Convert input to string and reverse it using slicing
if(a == b):  # Compare original input with its reverse
    print("Palindrome")  # If they match, it's a palindrome
else:
    print("Not a palindrome")  # If they don't match, it's not a palindrome

### Check a leap year or not
A = input()  # Get input from user
C = len(A)   # Calculate length of input string
if(A.isdigit() and len(A) ==4 and int(A)>0):  # Check if input is a 4-digit positive number
    D = int(A)  # Convert string to integer
    if( D % 400 ==0 or D % 4 ==0 and D % 100 !=0 ): 
      
# Check leap year conditions:
# 1. Divisible by 400, or
# 2. Divisible by 4 but not by 100
        print("leap year")  # Output if it's a leap year
    else:
        print("Not a leap year")  # Output if it's not a leap year
else:
    print("Invalid")  # Output if input is not a valid 4-digit positive number

# Get user input for the three sides of a triangle
A= input("A:")
B= input("B:")
C= input("C:")

# Check if all inputs are digits
if A.isdigit() and B.isdigit() and C.isdigit():
    # Convert string inputs to integers
    A = int(A)
    B = int(B)
    C = int(C)

# Check if the three sides can form a triangle using the triangle inequality theorem
if (A+B > C) and (A+C > B) and (B+C > A):
    # Check if all sides are equal (Equilateral triangle)
    if(A == B and A == C and B == c):  # Note: there's a typo here, 'c' should be 'C'
        print("Equilateral")
    # Check if exactly two sides are equal (Isosceles triangle)
    elif(A == B != C or A != B == C or A == C != B):
            print("Isoceles")  # Note: there's a typo here, should be "Isosceles"
    # Check if all sides are different (Scalene triangle)
    elif( A != B != C):
            print("Scalane")  # Note: there's a typo here, should be "Scalene"
else:
    # If triangle inequality theorem is not satisfied, it's not a triangle
    print("It is not a triangle")