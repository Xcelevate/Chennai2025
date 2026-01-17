# Generated from: Dictionary.ipynb
# Converted at: 2026-01-10T09:22:17.031Z
# Next step (optional): refactor into modules & generate tests with RunCell
# Quick start: pip install runcell

items={}

items

items['apple']=5
items['mango']=6

items

values=items['apple']

values

values1=items['grapes']

# # 1. Create a dictionary from two lists
# ## Write a function that takes two lists of equal length and creates a dictionary mapping elements from the first list to elements from the second list.


def create_dictionary(list1,list2):
    return dict(zip(list1,list2))

list1=[1,2,3]
list2=['apple','mango','grapes']
print(create_dictionary(list1,list2))

dict?

def lists_to_dict(keys, values):
    if len(keys)!=len(values):
        raise ValueError(f"Your length of list1 and list2 should be equal.length of list1:{len(list1)} and length of list2:{len(list2)}")
    return dict(zip(keys, values))
keys = ["name", "age", "city","score"]
values = ["Alice", 30, "Boston"]
print(lists_to_dict(keys, values)) # {'name': 'Alice', 'age': 30, 'city': 'Boston'}

# ## Mixed Dictionary


mix_dict={'apple':1,2:('grapes','orange'),(1,2):"tuple"}

mix_dict

# ## Pair of tuples and how to convert a dictionary


pairs = [("a", 1), ("b", 2), ("c", 3)]
type(pairs)

key_values=dict(pairs)

key_values

# ## Create a Dictionary with default value 1


keys=['apple','grapes','orange']
default_dictionary=dict.fromkeys(keys,1)
default_dictionary

default_dictionary["orange"].append(3)

keys=['apple','grapes','orange']
default_dictionary=dict.fromkeys(keys,[])
default_dictionary

default_dictionary["orange"].append(3)

default_dictionary

squares = {x: x**2 for x in range(5)}
squares

squares = {x: x**3 for x in range(5)}
squares

even_squares1 = {x: x**2 for x in range(10) if x % 2 == 0}
even_squares1

even_squares2 = {x: x**3 for x in range(10) if x % 4 == 0}
even_squares2 

print(items.get("apple"))

print(even_squares2.get(8))

print(even_squares2.get(10,0))
print(even_squares2.get(10,'unknown'))

items

if 'banana' not in items:
    print("key does not exist")
else:
    print(items.get('banana'))

if 'mango' in items:
    print(items.get('apple'))
else:
    print("keys does not exist")

for i in range(1,6):
    print(i)

# # 2. Count character frequency
# ## Write a function that counts the frequency of each character in a string (case-insensitive, alphabetic characters only) and returns a dictionary sorted by frequency descending. 


def char_frequencies(name):
    key_values={}
    for i in name.lower():
        if i.isalpha():
            key_values[i]=key_values.get(i,0)+1
    return dict(sorted(key_values.items(), key=lambda x:x[1], reverse=True))     
print(char_frequencies('Ganesh'))
print(char_frequencies('supercalifragilisticexpialidocious'))

from collections import Counter
 
def char_frequency(text):

    """
    Counts frequency of alphabetic characters (case-insensitive).
    Returns dictionary sorted by frequency (descending), then alphabetically.
    Args:
       text: Input string
    Returns:
       Dictionary with characters as keys, frequencies as values
    """

    # Convert to lowercase and filter alphabetic characters only
    chars = [char.lower() for char in text if char.isalpha()]

    # Count frequencies using Counter
    freq = Counter(chars)

    # Sort by frequency (descending), then alphabetically for ties
    return dict(sorted(freq.items(), key=lambda x: (-x[1], x[0])))
  
# Usage Examples
print(char_frequency("Hello World!"))
print(char_frequency("The quick brown fox jumps over the lazy dog"))

# # 4.Invert a dictionary
# ## Write a function that swaps keys and values: if the original dictionary is {"a": 1, "b": 2}, the result should be {1: "a", 2: "b"}. Handle the case where values might not be unique.


def swapping(values):
    result={}
    for key,value in values.items():
        if value not in result:
            result[value]=[]
            result[value].append(key)
    return result  

print(swapping({"a":1,"b":2}))

def swap_dict_keys_values(input_dict):
    swapped = {}
    for key, value in input_dict.items():
        swapped[value] = key  # Last occurrence overwrites previous
    return swapped

print(swap_dict_keys_values({'a':1,'b':2,'c':3}))

print(swap_dict_keys_values({'a':2,'b':2,'c':3}))

print(swap_dict_keys_values({'a':3,'b':2,'c':3}))

# # 3.Merge two dictionaries
# ## Write a function that merges two dictionaries. If a key exists in both, sum the values.


def merge_dict(d1,d2):
    merge=d1|d2
    return merge

merge_dict({'a':1,'b':2},{'b':10,'c':3})

from collections import Counter
def merge_dict(d1,d2):
    return dict(Counter(d1)+Counter(d2))

merge_dict({'a':1,'b':2},{'b':10,'c':3})

def merge_dict(d1,d2):
    result=d1.copy()
    for key,value in d2.items():
        result[key]=result.get(key,0)+value
    return result

d1 = {'a': 1, 'b': 2, 'c': 3}
d2 = {'b': 3, 'c': 4, 'd': 5}
print(merge_dict(d1, d2))

# # 5. Nested dictionary operations
# 
# ## Given a dictionary of students with nested marks dictionary: {"Alice": {"Math": 85, "Science": 92}, "Bob": {"Math": 78, "Science": 88}}, compute the average score for each student and return a new dictionary.
# 


def avg_scores(students):
    result={}
    for student,marks in students.items():
        avg=sum(marks.values())/len(marks) 
        result[student]=avg
        #result.update({name:avg})
    return result

students = {
    "Alice": {"Math": 85, "Science": 92},
    "Bob": {"Math": 78, "Science": 88}
}
print(avg_scores(students))

# # 6. Deep update nested dictionaries
# 
# ## Write a function that recursively updates a nested dictionary. If both base and update have a dictionary value for the same key, merge them recursively.


def deep_update(base,update):
    result=base.copy()
    for key,value in update.items():
        if key in result and isinstance(result[key],dict)and isinstance(value,dict):
            result[key]=deep_update(result[key],value)
        else:
            result[key]=value
    return result

base = {"a": {"x": 1, "y": 2}, "b": 3}
update = {"a": {"y": 5, "z": 3}, "c": 4}
print(deep_update(base, update))

# recursion method
def adder(list1):
    if(len(list1)==0):
        return 0
    else:
        return list1[0] + adder(list1[1:])

print(adder([1, 3, 4, 2, 5]))

# # 7. Filter dictionary by criteria
# 
# ## Write a function that removes all key-value pairs from a dictionary where the value is None, an empty string, or an empty list. Return a new dictionary.
# 


def filter_dict(d):
    return {key: value for key, value in d.items() if value not in (None, "", [])}

d = {"a": 1, "b": None, "c": "", "d": [], "e": None, "f": [1, 2]}
print(filter_dict(d))

def remove_empty(d):
    result = {}
    for key,value in d.items():
        if (value is None or value == "" or value == []):
            continue
        else:
            result[key] = value
        return result

d = {"a": 1, "b": None, "c": "", "d": [], "e": None, "f": [1, 2]}
print(remove_empty(d))

# # 8. Convert list of dictionaries to dictionary of lists
# 
# ## Convert [{"name": "Alice", "age": 30}, {"name": "Bob", "age": 25}] to {"name": ["Alice", "Bob"], "age": [30, 25]}.
# 


def list_to_dict_of_lists(data):
    result = {}
    for d in data:
        for k, v in d.items():
            result.setdefault(k, []).append(v)
    return result

data = [{"name": "Alice", "age": 30}, {"name": "Bob", "age": 25}]
output = list_to_dict_of_lists(data)
output

# # 9. Build reverse index
# 
# ## Given a dictionary where values are lists of items, create a reverse dictionary mapping each item to a list of keys that contained it:
# 
# ## Input: {"a": [1, 2], "b": [2, 3], "c": [1, 3]}
# ## Output: {1: ["a", "c"], 2: ["a", "b"], 3: ["b", "c"]}


def build_reverse_index(d):
    result = {}
    for key, values in d.items():
        for item in values:
            result.setdefault(item, []).append(key)
    return result


d={"a": [1, 2], "b": [2, 3], "c": [1, 3]}
build_reverse_index(d)

# # 10. Dictionary with tuple keys and coordinate operations
# 
# ## Create a dictionary mapping coordinate tuples (x, y) to values. Given a list of coordinates and weights, compute:
# 
# ## The point with maximum weight
# 
# ## Group points by quadrant (I, II, III, IV, or "axis")
# 
# ## Count points and total weight in each quadrant


def coordinate_analysis(coords):
    coord_dict = dict(coords)
    quadrant_data = {
        "I": {"count": 0, "weight": 0},
        "II": {"count": 0, "weight": 0},
        "III": {"count": 0, "weight": 0},
        "IV": {"count": 0, "weight": 0},
        "axis": {"count": 0, "weight": 0}
    }
    max_point = None
    max_weight = float("-inf")

    for (x, y), w in coord_dict.items():
        if w > max_weight:
            max_weight = w
            max_point = (x, y)
        if x == 0 or y == 0:
            q = "axis"
        elif x > 0 and y > 0:
            q = "I"
        elif x < 0 and y > 0:
            q = "II"
        elif x < 0 and y < 0:
            q = "III"
        else:
            q = "IV"
        quadrant_data[q]["count"] += 1
        quadrant_data[q]["weight"] += w

    return max_point, quadrant_data


coords = [((2, 3), 10), ((-1, 4), 5), ((-2, -3), 8), ((4, -1), 12), ((0, 5), 3)]

max_point, quadrant_info = coordinate_analysis(coords)

print("Max weight point:", max_point)
print("Quadrant info:", quadrant_info)