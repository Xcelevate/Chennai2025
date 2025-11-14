1.Custom exception
	class NegativeValueError(ValueError):
    		pass

	def validate_positive(value):
    	if value<0:
        	raise NegativeValueError("Input value is negative")
    	else:
        	return value

2.Anagram intrusion detector
def group_anagrams(value_list):
    anagram_groups = {}   
    
    for word in value_list:
        sorting = ''.join(sorted(word))  
        
        if sorting in anagram_groups:
            anagram_groups[sorting].append(word)  
        else:
            anagram_groups[sorting] = [word]  
    
    return list(anagram_groups.values())  

    pass
