#Custom Exception

class NegativeValueError(ValueError):
    pass

def validate_positive(value):
    if value < 0:
        raise NegativeValueError("Input value is negative")
    else:
        return value



# Anagram
def group_anagrams(words_list):
    from collections import defaultdict

    anagram_groups = defaultdict(list)
     for word in words_list:
       key = ''.join(sorted(word))
        anagram_groups[key].append(word)
    
    
    return list(anagram_groups.values())

