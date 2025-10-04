# logical expressions
# A and B
# A or B
# not A
# It returns true or False


a=bool(input("True or False:"))
b=bool(input("True or False:"))
print(type(a)) # <class 'bool'>
print(a) # True / False
print(b)  # True / False


not(False or ((False and True) and ( True and False)) and False) # True

not(False or ((False and True) and ( True and False)) and False) # False

a=bool(input("0 or 1:"))
b=bool(input("0 or 1:"))
print(type(a)) # <class 'bool'>
print(a) # True / False
print(b) # True / False
(not a and not b) # False


not(2!=3) # False

