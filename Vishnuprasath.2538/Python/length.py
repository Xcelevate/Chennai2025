length? # Get the all information about this syntax

len(object) 

text = "Python"
print(len(text)) # Length of a string

text2 = "Hello World"
print(len(text2)) # String with spaces

numbers = [10, 20, 30, 40]
print(len(numbers)) # Length of a list

t = (1, 2, 3)
print(len(t)) # Length of a tuple

d = {"name": "Alice", "age": 20, "city": "Delhi"}
print(len(d)) # Length of a dictionary (counts KEYS only)

print(len(""))     # 0 (empty string)
print(len([]))     # 0 (empty list)
print(len({}))     # 0 (empty dict)

# Exercises 
word = "Programming"
print("Word:", word)
print("Length of word:", len(word))


subjects = ["Math", "Physics", "Biology", "English"]
print("Subjects:", subjects)
print("Number of subjects:", len(subjects))  