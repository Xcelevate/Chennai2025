# Subscripting
text = "Python"
print(text[0])    # First character → 'P'
print(text[3])    # Fourth character → 't'
print(text[-1])   # Last character → 'n'
print(text[-3])   # Third character from end → 'h'

# Slicing
text = "Python"
print(text[0:4])  # 'Pyth' → index 0 to 3
print(text[2:])   # 'thon' → index 2 to end
print(text[:3])   # 'Pyt' → start to index 2
print(text[::2])  # 'Pto' → every 2nd character
print(text[::-1]) # 'nohtyP' → reverse the string


numbers = [10, 20, 30, 40, 50]
print(numbers[0])    # First element → 10
print(numbers[2:4])  # Slice of list → [30, 40]
print(numbers[-1])   # Last element → 50


numbers[1] = 25
print(numbers)       # [10, 25, 30, 40, 50]


colors = ("red", "green", "blue")
print(colors[0])     # 'red'
print(colors[-1])    # 'blue'
print(colors[1:])    # ('green', 'blue')


matrix = [[1,2,3], [4,5,6], [7,8,9]]
print(matrix[0][1])  # First row, second column → 2
print(matrix[2][0])  # Third row, first column → 7


words = ["apple", "banana", "cherry"]
print(words[1][0])   # First character of 'banana' → 'b'
print(words[2][-1])  # Last character of 'cherry' → 'y'

# List slicing with step
print(numbers[::2])   # Every 2nd element → [10, 30, 50]
print(numbers[::-1])  # Reverse list → [50, 40, 30, 25, 10]

# Combining subscripting with print formatting
name = "Aswin"
print(f"First letter of name: {name[0]}")
print(f"Last letter of name: {name[-1]}")
print(f"Name reversed: {name[::-1]}")