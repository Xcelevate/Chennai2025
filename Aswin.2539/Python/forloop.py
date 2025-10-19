# Example 1: Converting a string to a sorted list of characters
my_word = "LISTEN"
charlist = []
for c in my_word:  # Iterate through each character in the string
    charlist.append(c)  # Add each character to the list
    charlist.sort()  # Sort the list after each addition (inefficient but works)
print(charlist)  # Outputs ['E', 'I', 'L', 'N', 'S', 'T']

# Example 2: More efficient way to sort characters in a string
my_word = "LISTEN"
sorted_word = ''.join(sorted(my_word))  # Sort the characters and join them back into a string
print(sorted_word)  # Outputs 'EILNST'

# Example 3: Loop with break and pass statements
my_list = [1, 2, 3, 4, 5]
for element in my_list:
    print(element)  # Print the current element
    if(element == 4):
        break  # Exit the loop when element is 4
    else:
        pass  # Do nothing (pass is a no-operation placeholder)
    print(element)  # This line only executes if element is not 4
# Outputs: 1, 1, 2, 2, 3, 3, 4 (then breaks)

# Example 4: Loop with break and continue statements
my_list = [1, 2, 3, 4, 5]
for element in my_list:
    print(element)  # Print the current element
    if(element == 4):
        break  # Exit the loop when element is 4
    else:
        continue  # Skip to the next iteration
    print(element)  # This line never executes because of continue/break
# Outputs: 1, 2, 3, 4 (then breaks)

# Example 5: Nested loops with nested lists
fruits = ["apple", "orange", "grapes", "guava", "cherries", "banana"]
vegetables = ["drumstick", "brinjal", "onion", "potato", "tomato", "chilli"]

dirty_dozen = [fruits, vegetables]  # Create a list containing two lists

for index in range(0, len(dirty_dozen)):  # Loop through the outer list indices
    for fruit in dirty_dozen[index]:  # Loop through each item in the inner list
        print(dirty_dozen)  # Print the entire nested list each time (inefficient)
# This will print the entire dirty_dozen list 12 times (6 fruits + 6 vegetables)

# Example 6: Simple loop with string concatenation
fruits = ["apple", "orange", "grapes", "guava", "cherries", "banana"]

for fruit in fruits:  # Iterate through each fruit
    print(fruit)  # Print the fruit name
    print(fruit + "pie")  # Print the fruit name with "pie" appended
# Outputs each fruit name followed by the fruit name with "pie" appended

# Example 7: Input validation with nested lists
fruits = ["apple", "orange", "grapes", "guava", "cherries", "banana"]
vegetables = ["drumstick", "brinjal", "onion", "potato", "tomato", "chilli"]

dirty_dozen = [fruits, vegetables]

index1 = int(input(" "))  # Get first index from user
index2 = int(input(" "))  # Get second index from user

# Check if indices are valid and print the corresponding item
if(0 <= index1 < len(dirty_dozen)):
    if(0 <= index2 < len(fruits) and index1 == 0):
        print(dirty_dozen[index1][index2])  # Print the fruit at index2
    elif(0 <= index2 < len(vegetables) and index1 == 1):
        print(dirty_dozen[index1][index2])  # Print the vegetable at index2
    else:
        print("out of index")  # Second index is out of range
else:
    print("out of index")  # First index is out of range

# Example 8: Loop with pass statement
for i in range(6):  # Loop from 0 to 5
    pass  # Do nothing (no-operation)
    print(i)  # Print the current number
# Outputs: 0, 1, 2, 3, 4, 5

# Example 9: Modifying a list while iterating (dangerous pattern)
nums = [1, 2, 3]
for n in nums[::2]:  # Iterate through every other element (1, 3)
    nums.remove(n)  # Remove the current element from the list
print(nums)  # Outputs [2] because 1 and 3 were removed

# Example 10: Bubble sort implementation with user input
a = input("Enter the word?:")  # Get a word from the user
my_var = list(a)  # Convert the word to a list of characters
if(a.isalpha()):  # Check if the input contains only alphabetic characters
    # Implement bubble sort algorithm
    for i in range(len(my_var)):
        for j in range(i+1, len(my_var)):
            if my_var[i] > my_var[j]:  # Compare characters and swap if needed
                my_var[i], my_var[j] = my_var[j], my_var[i]  # Swap characters
    print(my_var)  # Print the sorted list of characters
else:
    print("Give me alphabet only")  # Error message for non-alphabetic input
