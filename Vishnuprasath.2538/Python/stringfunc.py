s1= "python"  # Define a string variable containing only alphabetic characters
s2= "12345"   # Define a string variable containing only numeric characters
print(s1.isalpha())  # Check if s1 contains only alphabetic characters (returns True)
print(s2.isdigit())  # Check if s2 contains only digits (returns True)
print(s1.startswith("py"))  # Check if s1 starts with the substring "py" (returns True)


s1= "python"  # Define a string variable containing only alphabetic characters
s2= "12345"   # Define a string variable containing only numeric characters
print(s1.isalpha())  # Check if s1 contains only alphabetic characters (returns True)
print(s2.isdigit())  # Check if s2 contains only digits (returns True)
print(s2.startswith("12"))  # Check if s2 starts with the substring "12" (returns True)

# Get input from the user
a = input()
# Check if the input consists only of alphabetic characters
if(a.isalpha()):
    print("it is alphabet")
else:
    print("it is not alphabet")


# Get input from the user
a=input()
# Check if the input consists only of digits
if( a.isdigit()):
    # Print message if input contains only digits
    print("it is digits")
else:
    # Print message if input contains non-digit characters
    print("it is not a digit")

# Define a string variable 'a' with value "0112345"
a = "0112345"
# Check if the string 'a' starts with the substring "011" and print the result (True or False)
print(a.startswith("011"))


a = "0112345"  # Define a string variable 'a' with value "0112345"
print(a.startswith("45",5))  # Check if the substring starting at index 5 begins with "45"

a = "0112345"
# Check if the substring of 'a' from index 3 to 5 (exclusive) starts with "2"
# This examines characters at positions 3 and 4 (i.e., "23") to see if they start with "2"
# Returns True because the character at index 3 is "2"
print(a.startswith("2",3,5))

# Define a string variable 'a' with value "0112345"
a = "0112345"
# Check if the string 'a' ends with the character "5" and print the result (True)
print(a.endswith("5"))

# Define a string variable 'a' with value "0112345"
a = "0112345"
# Check if string 'a' ends with "5" starting from index 0 (the beginning of the string)
# This will print True because the string does end with "5"
print(a.endswith("5",0))

a = "0112345"
# Create a string variable 'a' with value "0112345"

print(a.endswith("45",5,7))
# Check if the substring of 'a' from index 5 to 7 (exclusive) ends with "45"
# This checks if characters at positions 5 and 6 (which are "4" and "5") match "45"
# Returns True because the substring "45" does end with "45"

# Define a string variable 'a' containing alphanumeric characters
a = "dvzujgj387"
# Check if all characters in the string are alphanumeric (letters or numbers)
# Returns True because all characters in "dvzujgj387" are either letters or digits
print(a.isalnum())

# Define a string variable 'a' containing only numbers
a = "47958639746"
# Check if the string contains only alphanumeric characters (letters and numbers)
# Returns True because the string only contains numbers (which are alphanumeric)
print(a.isalnum())