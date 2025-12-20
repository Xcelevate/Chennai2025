result = 10 // 0
result
try:
    result = 10/0
    print (result)
except ZeroDivisionError:
    print("Cannot Divide By Zero")
numbers = [1, 2, 3]
print(numbers[3]) 

try:
    numbers = [1,2,3]
    print(numbers[4])
except IndexError:
    print(f"Please enter the number within the range of the list : {len(numbers)}")

try:
    result=10//2
    print(result)
    a=[1,2,3]
    print(a[4])
 
except IndexError:
    print(f"please enter the number with in the range of list:{len(a)}")
except ZeroDivisionError:
    print("cannot divide by zero")

def divide(x,y):
    try:
        result = x//y
        print(result)
    except ZeroDivisionError:
        print("Cannot Divide By Zero")
    except TypeError:
        print("Give only integer")

divide(10,2)

def divideNew(x,y):
    try:
        result=x/y
        print(result)
    except (ZeroDivisionError,TypeError):
        print("Invalid Input")

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
        else:
            print("No File To Be Closed")

read_file_demo("")

read_file_demo("Sample.txt")

read_file_demo("")

class ValidationError(Exception):
    """Custom exception for validation failures"""
    pass

def validate_email(email):
    if "@" not in email:
        raise ValidationError("Email must contain '@' symbol")
    print(f"Email '{email}' is valid")

try:
    validate_email("invalid-email")
except ValidationError as e:
    print(f"Error: {e}")

class Dog:
    species = "Canis familiaris"  # class variable

    def __init__(self, name, age):
        self.name = name          # instance variable
        self.age = age

    def bark(self):
        return f"{self.name} says: Woof!"

class InsufficientBalanceError(Exception):
    
    def __init__(self, message="Insufficient balance in your account"):
        self.message = message   
        

    def __str__(self):
        return self.message


class BankAccount:
    def __init__(self, owner, balance):
        self.owner = owner
        self.balance = balance

    def withdraw(self, amount):
        try:
            print(f"\nAttempting to withdraw ₹{amount}...")
            if amount > self.balance:
                raise InsufficientBalanceError(
                    f"Cannot withdraw ₹{amount}. Available balance: ₹{self.balance}"
                )
            self.balance -= amount
            print(f"Withdrawal successful! New balance: ₹{self.balance}")
        except InsufficientBalanceError as e:
            print("Withdrawal failed:", e)
        finally:
            print("Transaction completed.\n")



account = BankAccount("Dinesh", 5000)

account.withdraw(2000)   
account.withdraw(7000)   
account.withdraw(4000)
account.withdraw(2000)

    