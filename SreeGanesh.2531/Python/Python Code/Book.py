class Book: #create a class

    def __init__(self,book_name,author_name,book_id,available_copies,copies): #define the constructor 
        self.book_name = book_name
        self.author_name = author_name
        self.book_id = book_id
        self.available_copies = available_copies
        self.copies = copies 
        
    def borrow_Book(self):        # instance method 1
        if self.available_copies > 0: 
            self.available_copies -= 1 
            return f"Borrowed '{self.book_name}' successfully! Copies left: {self.available_copies}."
        else:
            return f"Sorry, '{self.book_name}' is currently unavailable."

    def return_Book(self):       # instance method 2
        if self.available_copies < self.copies :
            self.available_copies += 1
            return f"Return {self.book_name} successfully! Copies available: {self.available_copies}."
        else:
            return f"All copies available {self.available_copies}"

    def display_Info(self):    # instance method 3
        print(f"Book name: {self.book_name}")
        print(f"Book author name: {self.author_name}")
        print(f"Book id: {self.book_id}")
        print(f"Available copies: {self.available_copies}")
        print(f"Copies: {self.copies}") 


from myclass import Book

book1 = Book("Python Programming", "John Smith", "978-1234567890")

book1 # output  <myclass.Book at 0x180f66a9550>

print(book1.book_name) #output Python Programming

print(book1) # output <myclass.Book object at 0x00000180F66A9550>

book2 = Book("Java Programming", "Herbert Schildt", "978-0987654321", copies=5,available_copies=0)

print(book2.available_copies)

newbook1 = Book("C Programming", "Michael", "683-9853067890",3,1)
newbook2 = Book("C++ Programming", "Joseph", "583-985375602",5,7)
newbook3 = Book("R Programming", "Henrich", "253-4534769346",4,2)

newbook1.borrow_Book() # output "Borrowed 'C Programming' successfully! Copies left: 2."

newbook1.borrow_Book() # output "Borrowed 'C Programming' successfully! Copies left: 1."

newbook1.borrow_Book() #output "Borrowed 'C Programming' successfully! Copies left: 0."

newbook1.return_Book() #output 'Return C Programming successfully! Copies available: 1.'

newbook1.return_Book() #output 'All copies available 1'

newbook2.return_Book() #output 'All copies available 7'