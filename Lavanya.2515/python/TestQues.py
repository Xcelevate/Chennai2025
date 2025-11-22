
1.custom Exception:

class NegativeValueError(ValueError):
    pass
    
def validate_positive(value):
    if(value<0):
        raise NegativeValueError( "Input value is negative")
    return value



2.Anagram Intrusion Detector:
def group_anagrams(input_list):
    anagram_groups = {}
    
    for word in input_list:
        sorted_word = ''.join(sorted(word))
        
        if sorted_word in anagram_groups:
            anagram_groups[sorted_word].append(word)
        else:
            anagram_groups[sorted_word] = [word]
    
    return list(anagram_groups.values())

