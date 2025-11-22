"string with placeholders {}".format(values) 

name = "max"
print("Hello {}".format(name)) # Output: Hello max

name = "max"
age = 21
print("{} is {} years old".format(name, age))  # Output: max is 21 years old

print("{1} is older than {0}".format("Alice", "Bob")) # Output: Bob is older than Alice

print("Name: {n}, Age: {a}".format(n="Aswin", a=21))  # Output: Name: Aswin, Age: 21

pi = 3.141592
print("Pi rounded to 2 decimals: {:.2f}".format(pi))  # Output: Pi rounded to 2 decimals: 3.14

name = input("Enter your name: ")
print("Hello {}".format(name)) # Hello + name input

age = int(input("Enter your age: "))
city = input("Enter your city: ")
print("{} is {} years old and lives in {}".format(name, age, city)) # Multiple inputs

price = float(input("Enter price: "))
print("Price: {:.2f}".format(price)) # Float formatting

height = 1.65
weight = 84
c = weight / (height * height)
print(f"{c:.2f}")
