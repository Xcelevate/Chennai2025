string.ljust(width, fillchar) # Syntax

a = "Hello"
print(a.ljust(10, '-')) # Hello-----

a = "Aswin"
print(a.ljust(10, '%')) # Aswin%%%%%

a = "Encylopedia"
print(a.ljust(15, '*')) # Encylopedia****

string.rjust(width, fillchar) # Syntax 

a = "Hello"
print(a.rjust(10, '*')) # *****Hello

a = "Aswin"
print(a.rjust(10, '&')) # &&&&&Aswin


a = "collegemate"
print(a.rjust(14, '@')) # @@@collegemate