string.replace(old, new, count) 

new_text = text.replace("Python", "Java")
print(new_text) # Output: I love Java. Java is powerful.

new_text = text.replace("Python", "Java", 1)
print(new_text) # Output: I love Java. Python is powerful.

a=("Python  is a  programming language")
print(a.replace("Python","java")) # Output: java  is a  programming language

a=("Python is a programming language")
print(a.replace("Python","go")) # Output: go  is a  programming language

a=("Python is a programming language")
print(a.replace("Python","javascript"))  # Output: javascript  is a  programming language

