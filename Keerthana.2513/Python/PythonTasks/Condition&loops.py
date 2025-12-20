
Python program using if / elif / else
## Write a program that checks a person’s marks and their grade based on rule:
marks=int(input("Enter your mark"))
if marks>=0 and marks<=100:
    if marks>=90:
        print("A")
    elif marks>=75:
        print("B")
    elif marks>=50:
        print("C")
    else:
        print("Fail")
else:
    print("Invalid mark")
Invalid mark
## Write a Python program that checks if a person is eligible to vote.
age=int(input("Enter your age:"))
if age>0 and age<120:
    if age<18:
        print("Not eligible to vote")
    else:
        print("Eligible to vote")
else:
    print("Invalid age")
Eligible to vote
for i in range(5):
    for j in range(i+1):
        print("*", end="")
    print()
        
*
**
***
****
*****
print("*", end="")                      ##without loops
print("*", end="")
print("*", end="")
print("*", end="")
print("*", end="")
print()
print("*", end="")
print("*", end="")
print("*", end="")
print("*", end="")
print()
print("*", end="")
print("*", end="")
print("*", end="")
print()
print("*", end="")
print("*", end="")
print()
print("*", end="")
*****
****
***
**
*
for i in range(5):
    for j in range(5-i):
        print("*", end="")
    print()
*****
****
***
**
*
 
