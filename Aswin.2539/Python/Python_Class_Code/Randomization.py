# Import the random module which provides functions for generating random numbers
import random

# Generate a random integer between 1 and 100 (inclusive)
randomInt = random.randint(1, 100)
print(randomInt)  # Outputs a random number like 98

# Generate a random integer between 11 and 100 (inclusive)
randomInt = random.randint(11, 100)
print(randomInt)  # Outputs a random number like 70

# Create a list of bike models
bike = ["MT", "DUKE", "KTM", "PULSAR", "FZ"]
# Choose a random item from the list
print(random.choice(bike))  # Outputs a random bike like "DUKE"

# This would import a custom module named aswin_module
# import aswin_module
# aswin_module.Name  # This would access the Name variable/attribute from the module

# Generate a random float between 0 and 10
randomInt = random.random() * 10
print(randomInt)  # Outputs something like 2.5170501050392167

# Another example of generating a random float between 0 and 10
randomfloat = random.random() * 10
print(randomfloat)  # Outputs something like 2.5170501050392167

# Generate a random float between 0 and 1
randomInt = random.random()
print(randomInt)  # Outputs something like 0.3356430771396447

# Generate a random float between 1 and 10 using uniform distribution
randomInt = random.uniform(1, 10)
# Round the result to 2 decimal places
print(round(randomInt, 2))  # Outputs something like 9.39

# Simulate a coin flip (Head or Tails)
randomBinary = random.randint(0, 1)
if randomBinary == 0:
    print("Head")
else:
    print("Tails")

# Create a list of friends
friends = ["siri", "suresh", "rabik", "jose", "logu", "pratheen", "pushpa"]
# Choose a random friend from the list
print(random.choice(friends))

# This would import a module named friend from python package
# from python import friend
# friend.friends  # This would access the friends variable/attribute

# Generate a random integer between 0 and 6
a = random.randint(0, 6)
print(a)

# Create lists of fruits and vegetables
fruits = ["apple", "orange", "grapes", "guava", "cherries"]
vegetables = ["drumstick", "brinjal", "onion", "potato", "tomato", "chilli"]

# Create a nested list (list of lists)
dirty_dozen = [fruits, vegetables]

# Access an item from the nested list (tomato)
print(dirty_dozen[1][4])  # Outputs "tomato"

# Create a list of fruits
my_list = ['apple', 'banana', 'cherry', 'date', 'elderberry']

# Choose random items from the list (with replacement)
random_items = random.choices(my_list)
print(f"Random item: {random_items}")  # Outputs a list with one random item

# Choose unique random items from the list (without replacement)
random_sample_unique = random.sample(my_list, 2)
print(f"Random sample (unique): {random_sample_unique}")  # Outputs a list with 2 unique items

# Updated fruits and vegetables lists
fruits = ["apple", "orange", "grapes", "guava", "cherries", "banana"]
vegetables = ["drumstick", "brinjal", "onion", "potato", "tomato", "chilli"]

# Get the length of each list
a = len(fruits)
b = len(vegetables)

# Create a nested list
dirty_dozen = [fruits, vegetables]

# Generate random indices
index1 = random.randint(0, 1)  # Either 0 (fruits) or 1 (vegetables)
index2 = random.randint(0, 5)  # Index within the selected list

# This would prompt the user for indices and print the corresponding item
# print(dirty_dozen[int(input("index1: "))][int(input("index2: "))])

# Generate a list of 5 random integers between 1 and 100 using list comprehension
random_numbers = [random.randint(1, 100) for _ in range(5)]
print(f"List of numbers: {random_numbers}")  # Outputs something like [42, 87, 23, 56, 91]
