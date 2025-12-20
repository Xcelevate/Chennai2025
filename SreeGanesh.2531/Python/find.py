find:
text="I love python programming.python is a snake"
print(text.find("python"))...I/p
7...O/p

findAll:
import re 
text="I love python programming.python is a snake"
print(re.findall('r/b/w+/b',text))...I/p
[]...O/p

Regular expression:
import re 
text="I love python programming.python is a snake"
print(re.findall("python",text))...I/p
['python', 'python']...O/p

finditer:
import re 
text="I love python programming.python is a snake"
words=re.findall("python",text) 
iteration=re.finditer("rpython",text) 
print(words)
print(iteration)...I/p
['python', 'python']
<callable_iterator object at 0x000001462381D990>...O/p
