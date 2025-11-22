string.find(substring, start, end)

a=("Python love programming language")
print(a.find("Java")) # Output: -1

text = "Hello Python World"
print(text.find("Java"))  # Output: -1


text = "Hello Python World"
print(text.find("o", 5)) # Output: 10 

a=("Python love programming language")
print(a.find("Python")) # Output: 0

a=("Python love programming language")
print(a.find("121",76)) # Output: -1
