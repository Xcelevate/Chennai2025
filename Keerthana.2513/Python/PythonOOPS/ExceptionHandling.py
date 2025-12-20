
result=10//0
---------------------------------------------------------------------------
ZeroDivisionError                         Traceback (most recent call last)
Cell In[3], line 1
----> 1 result=10//0

ZeroDivisionError: integer division or modulo by zero
result
5
try:
    result=10//0
    print(result)
except ZeroDivisionError:
    print("cannot divide by zero")
    
cannot divide by zero
arr=[4,5,2]
print(arr[4])
---------------------------------------------------------------------------
IndexError                                Traceback (most recent call last)
Cell In[6], line 2
      1 arr=[4,5,2]
----> 2 print(arr[4])

IndexError: list index out of range
try:
    arr=[4,5,2]
    print(arr[4])
except IndexError:
    print(f"please enter the number within the range of list:{len(arr)}")
    
please enter the number within the range of list:3
try:
    arr=[4,5,2]
    result=10//2
    print(result)
    print(arr[4])
  
except IndexError:
    print(f"please enter the number within the range of list:{len(arr)}")
except ZeroDivisionError:
    print("cannot divide by zero")    
    
    
5
please enter the number within the range of list:3
def divide(x,y):
    try:
        result=x/y
        print(result)
    except ZeroDivisionError:
        print("cannot divide by zero")
    except TypeError:
        print("Give only integer")
divide(10,2)
5.0
divide(10,0)
cannot divide by zero
divide(10,"a")
Give only integer
def divideNew(x,y):
    try:
        result=x/y
        print(result)
    except (ZeroDivisionError,TypeError):
        print("Invalid Input")
        
   
divideNew(10,0)
Invalid Input
divideNew(10,"a")
Invalid Input
def read_file_demo(filename):
    file = None
    try:
        file = open(filename, 'r')
        content = file.read()
        print(f"Read {len(content)} characters")
    except FileNotFoundError:
        print("File not found")
    finally:
        if file:
            file.close()
            print("File closed")
 
read_file_demo("Car.csv")
Read 16907 characters
File closed
class ValidationError(Exception):
    """Custom exception for validation failures"""
    pass
def validate_email(email):
    if "@" not in email:
        raise ValidationError("Email must contain '@' symbol")
    print(f"Email '{email}' is valid")
try:
    validate_email("ABC@xyz.com")
except ValidationError as e:
    print(f"Error: {e}")
Email 'ABC@xyz.com' is valid
class InsufficientError(Exception):
    """Custom exception for validation failures"""
    pass
def BankAccount(RequiredAmount):
    
    if RequiredAmount<500:
        raise InsufficientError("Do you have less than 500 amount")
    print(f"Amount {RequiredAmount} is valid")
try:
    BankAccount(400)
except InsufficientError as e:
    print(f"Error: {e}")
finally:
    print("Remove the ATM card")
Error: Do you have less than 500 amount
Remove the ATM card
class InsufficientError(Exception):
    """Custom exception for validation failures"""
    pass
def BankAccount(RequiredAmount):
    if RequiredAmount<500:
        raise InsufficientError("Do you have less than 500 amount")
    print(f"Email {RequiredAmount} is valid")
try:
    BankAccount(4000)
except InsufficientError as e:
    print(f"Error: {e}")
finally:
    print("Remove the ATM card")
Email 4000 is valid
Remove the ATM card

 
 
