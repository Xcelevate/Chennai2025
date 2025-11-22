# ATM 
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

# Exception Handling 

try:
    result = 10/0
    print(result)
except ZeroDivisionError:
    print("Cannot divide by zero") 
    # output Cannot divide by zero
    

try:
    list = [1,2,3]
    print(list[4])
except IndexError:
    print(f"please enter the number with in the range of list: {len(list)}")
    # output please enter the number with in the range of list: 3

try:
    result = 10/0
    print(result)
    list = [1,2,3]
    print(list[4])
except IndexError:
    print(f"please enter the number with in the range of list: {len(list)}")
except ZeroDivisionError:
    print("Cannot divide by zero")
    # output Cannot divide by zero

def divide(x,y):
    try:
        result=x/y
        print(result)
    except ZeroDivisionError:
        print("cannot divide by zero")
    except TypeError:
        print("Give only integer")    

divide(10,0) # output Cannot divide by 

divide(10,"a") # output Give only integer


def divideNew(x,y):
    try:
        result=x/y
        print(result)
    except (ZeroDivisionError, TypeError):
        print("Invalid input")

divideNew(10,0) # output  Invalid input

divideNew(10,"a") # output Invalid input


# reading a file

def read_file_demo(filename):
    file = None
    try:
        file = open(filename, 'r')
        content = file.read()
        print(f"Read {len(content)} characters")
    except FileNotFoundError:
        print("File not found")
    finally:
        # This always executes
        if file:
            file.close()
            print("File closed")

read_file_demo("") # file not found

read_file_demo("car.csv") #  output Read 0 characters File closed

#custom exception 

class ValidationError(Exception):
    """ Custom exception for validation failures """
    pass

def validate_email(email):
    if "@" not in email:
        raise ValidationError("Email must contain '@' symbol")
    print(f"Email '{email}' is valid")
 

validate_email("aswin147@gmail.com") #output  Email 'aswin147@gmail.com' is valid

try:
    validate_email("abc@xyz.com")
except ValidationError as e:
    print(f"Error: {e}")
# output Email 'abc@xyz.com' is valid


# insufficientvalueerror

class InsufficientBalanceError(Exception):
    """Custom exception for insufficient balance."""
    pass

def Bank_Account(withdraw_amount):
    if withdraw_amount == 0.00:
        print("Don't enter 0₹ in your withdraw amount.")
        return
    if withdraw_amount < 500 :
        raise InsufficientBalanceError("Your account balance is 500₹.Don't enter below 500₹.Please maintain a minimum balance.")
    elif withdraw_amount >= 500000:
        print("Withdraw limit below and equal 5 lakhs only.")
    else:
        print(f"₹ Your amount {withdraw_amount} withdrawn successfully.")


try:
    withdraw_amount = float(input("Enter withdrawal amount: ₹"))
    Bank_Account(withdraw_amount)
except (InsufficientBalanceError, ValueError, TypeError, NameError) as e:
    print(f"Error: {e}")
finally:
    print("Transaction process completed!")    