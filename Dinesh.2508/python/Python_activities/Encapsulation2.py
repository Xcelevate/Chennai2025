Encapsulation
Access Modifiers

class Device:
    def __init__(self,model,storage,device_id):
        self.model = model         #public access modifier
        self._storage = storage    #protected access modifier
        self.__deviceid = device_id #private access modifier
    def display_info(self):
        print(f"This is the new model {self.model}")     #public access modifier
        print(f"This is the storage space of {self._storage} GB") #protected access modifier     
        print(f"This is the device ID {self.__deviceid}") #private access modifier

D = Device("F10", 128,"FB0123")
D.display_info()

class Employee:
    def __init__(self,name,salary,setSalary):
       self.__name = name
       self._salary = salary
        self.setSalary = setSalary
    @property 
    def getSalary(self):
        """Getter method"""
        return self.__salary
    @salary.setter
    def salary(self, value):
        """Setter with validation"""  

e = Employee("Dinesh",100000)  
s = Employee("Dinesh",100000000000)

class Employee:

    def __init__(self, name, salary):

        self._name = name

        self._salary = None

        self.salary = salary  # Use setter for initial validation

    @property

    def salary(self):

        return self._salary

    @salary.setter

    def salary(self, value):

        """Setter with validation"""
        try:
            value = float(value)
        except ValueError:
            raise TypeError("Salary must be a numberic value")
            
        if value < 0:

            raise ValueError("Salary cannot be negative")
            
        if value <= 5000:
            raise ValueError("Salary must be greater than 5000")
            
        self._salary = value

try:
    emp1 = Employee("Dinesh", 1000000)
    print(f"{emp1._name}'s salary is ₹{emp1.salary}")

    emp2 = Employee("Ravi", "abc")  
except (TypeError, ValueError) as e:
    print("Error:", e)

class InvalidCopiesError(Exception):
    """When an invalid (negative) number of copies is set"""
    pass

class OutOfStockError(Exception):
    """When no copies are available for borrowing"""
    pass
 class Book:
    def __init__(self,title,author,copies):
        self.title = title
        self.author = author
        self.copies = copies

    # Getter for copies
    @property
    def copies (self):
        return self.copies

    # Setter for copies
    @copies.setter
    def copies(self,value):
        if value < 0:
            raise InvalidCopiesError("Copies cannot be negative")
        self._copies = value
    def info(self):
        return f"{self.title} by {self.author} - copies available :{self.copies}]"
        
class LibraryBook(Book):
    def __init__(self,title,author,copies):
        super().__init__(title,author,copies)
        self.borrowed = 0

    def borrow_book(self):
        if self.borrowed < self.copies:
            self.borrowed += 1
            print(f"You borrowed {self.title} Borrowed copies:{self.borrowed}")
        else:
            raise OutOfStockError(f"{self.title} is out of stock")

    def return_book(self):
        if self.borrowed > 0:
            self.borrowed -= 1
            print(f" You returned {self.title} Borrowed copies now:{self.borrowed}")
        else:
            print(f"No borrowed copies of {self.title} to return")

    def status(self):
        return(f"{self.title} by {self.author}\n"
               f"Total copies:{self.copies}\n" 
               f"Borrowed:{self.borrowed}\n" 
               f"Available:{self.copies - self.borrowed}\n")

try:
    # Creating a LibraryBook instance
    book1 = LibraryBook("The Alchemist", "Paulo Coelho", 2)
    print(book1.info())
    print()

    # Borrow books
    book1.borrow_book()
    book1.borrow_book()

    # Try borrowing more than available (should raise OutOfStockError)
    book1.borrow_book()

except InvalidCopiesError as e:
    print("InvalidCopiesError:", e)

except OutOfStockError as e:
    print("OutOfStockError:", e)

finally:
    print("\nFinal status of the book:")
    print(book1.status())
        
class InvalidCopiesError(Exception):
    """Raised when an invalid (negative) number of copies is set."""
    pass
class OutOfStockError(Exception):
    """Raised when no copies are available for borrowing."""
    pass
class Book:
    def __init__(self, title, author, copies):
        self.title = title
        self.author = author
        self._copies = None       
        self.copies = copies     

    # Getter
    @property
    def copies(self):
        return self._copies

    # Setter 
    @copies.setter
    def copies(self, value):
        if value < 0:
            raise InvalidCopiesError("Number of copies cannot be negative.")
        self._copies = value

    def info(self):
        return f" {self.title} by {self.author} — Copies available: {self.copies}"

class LibraryBook(Book):
    def __init__(self, title, author, copies):
        super().__init__(title, author, copies)
        self.borrowed = 0  # starts at 0

    
    def borrow_book(self):
        if self.borrowed < self.copies:
            self.borrowed += 1
            print(f"You borrowed {self.title}. Borrowed copies: {self.borrowed}")
        else:
            raise OutOfStockError(f"{self.title}' is out of stock!")

    
    def return_book(self):
        if self.borrowed > 0:
            self.borrowed -= 1
            print(f"You returned {self.title}. Borrowed copies now: {self.borrowed}")
        else:
            print(f"No borrowed copies of '{self.title}' to return.")

    
    def status(self):
        return (f"{self.title} by {self.author}\n"
                f"Total copies: {self.copies}\n"
                f"Borrowed: {self.borrowed}\n"
                f"Available: {self.copies - self.borrowed}\n")

try:
    
    book1 = LibraryBook("The Alchemist", "Paulo Coelho", 2)
    print(book1.info())
    print()

    
    book1.borrow_book()
    book1.borrow_book()


    
    book1.borrow_book()

except InvalidCopiesError as e:
    print("InvalidCopiesError:", e)

except OutOfStockError as e:
    print("OutOfStockError:", e)

finally:
    print("\nFinal status of the book:")
    print(book1.status())

#InvalidCopiesError 
try:
    book2 = LibraryBook("Python Basics", "John Smith", -3)
except InvalidCopiesError as e:
    print("\nInvalidCopiesError caught:", e)

class Book:
    def __init__(self,title,author,copies)
       self.title = title
       self.author = author
       self.copies = copies

   