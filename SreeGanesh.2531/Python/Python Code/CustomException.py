# custom exceptions for book handling

class InvalidCopiesError(Exception):
    pass

class OutOfStockError(Exception):
    pass

class Book:
    def __init__(self, title, author, copies):
        self.title = title
        self.author = author
        self._copies = copies  

    
    @property
    def copies(self):
        return self._copies

    @copies.setter
    def copies(self, value):
        if value < 0:
            raise InvalidCopiesError("Cannot set copies to a negative value.")
        self._copies = value


class LibraryBook(Book):
    def __init__(self, title, author, copies):
        super().__init__(title, author, copies)
        self.borrowed = 0  

    def borrow_book(self):
        available = self.copies - self.borrowed
        if available > 0:
            self.borrowed += 1
        else:
            raise OutOfStockError("No copies available to borrow.")

    def return_book(self):
        if self.borrowed > 0:
            self.borrowed -= 1
        else:
            print("No books to return.")


if __name__ == "__main__":
    try:
        lb = LibraryBook("Python Programming", "John Doe", 2)
        print(f"Created book: {lb.title}, Author: {lb.author}, Copies: {lb.copies}")

        lb.borrow_book()
        print(f"Borrowed 1 book. Currently borrowed: {lb.borrowed}, Remaining: {lb.copies - lb.borrowed}")

        lb.borrow_book()
        print(f"Borrowed another book. Currently borrowed: {lb.borrowed}, Remaining: {lb.copies - lb.borrowed}")

        
        lb.borrow_book()
    except InvalidCopiesError as ice:
        print("Error:", ice)
    except OutOfStockError as ose:
        print("Error:", ose)
