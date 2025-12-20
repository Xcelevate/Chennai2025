## Custom Exception
class NegativeValueError(ValueError):
    def __init__(self,message):
        super().__init__(message)

def validate_positive(value):
    if value < 0:
        raise NegativeValueError("Input value is negative")
    return value
validate_positive(86)
# o/p :8
 

def validate_positive(value):
    try:
        value < 0 
        raise NegativeValueError("Input value is negative")
    except NegativeValueError as e:
        print(f"Error: {e}")

validate_positive(-8)
# o/p: Error: Input value is negative


# Anagram Instruction Detector
def group_anagrams(words_list):
    anagram={}
    for word in words_list:
        key=tuple(sorted(word))  
        if key in anagram:
            anagram[key].append(word)
        else:
            anagram[key]=[word]
    return list(anagram.values())

group_anagrams(["listen","silent"])
#o/p:[['listen', 'silent']]
   
# Book Popularity Tracker
class Book:
    def __init__(self, title, genre, rating):
        self.title = title
        self.genre = genre
        self.rating = rating

class LibraryManagement:
    def __init__(self):
        self.books = [] 

    def add_book(self, book):
        self.books.append(book)

    def get_highest_rated_books(self, x):
        sorted_books = sorted(self.books, key=lambda b: (b.rating, b.title), reverse=True)
        return sorted_books[:x]

    def recommend_top_book_by_genre(self, genre):
        genre_books = {b for b in self.book if b.genre.lower() == genre.lower()}
        if not genre_books:
          return None
        return max(genre_books, key=lambda b: (b.rating, b.title))  