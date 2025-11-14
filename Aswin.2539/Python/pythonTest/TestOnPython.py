### Implement a custom exception class called NegativeValueError 
that inherits from the built-in ValueError exception, and a function validate_positive.



class NegativeValueError(ValueError):
    """
    Custom exception for negative values
    """
    pass

def validate_positive(value):
    if value < 0 :
        raise NegativeValueError("Input value is negative")
    else:
        return value


validate_positive(86)



### Using Exception Handling to handle that Error

def validate_positive(value):
    try:
        value < 0 
        raise NegativeValueError("Input value is negative")
    except NegativeValueError as e:
        print(f"Error: {e}")

validate_positive(-8)

### Write a Python function named groupAnagrams that takes a list of words 
(network log entries) as input and groups them into sets of anagrams.


def groupAnagrams(word_list):
    result = {}
    for word in word_list:
        key = "".join(sorted(word))

        if key not in result:
            result[key] = []

        result[key].append(word)

    return list(result.values())


groupAnagrams(["eat", "tea", "tan", "ate", "nat", "bat"])