import re # Import regular expressions


text = "I have 2 apples and 5 bananas, also 10 mangoes."
matches = re.findall(r"\d+", text)   # \d+ means "one or more digits"
print(matches)

a = "I love Python because  10 Python is powerful"
print(re.findall(r"\s+",a)) # \s+ means give spaces


a = "I love Python because  10 Python is powerful"
print(re.findall(r"\w+",a)) # \w+ means give words


a = "I love Python because Python is powerful"
matches = re.finditer(r"Python", a)
for match in matches:
print(match.start(), match.end(), match.group()) # 7 13 Python
22 28 Python
