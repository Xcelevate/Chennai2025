# Base class (Parent)
class Animal:
    def __init__(self, name):            # Constructor
        self._name = name                 # Encapsulation (protected attribute)
    def speak(self):                      # Method to override
        print(f"{self._name} makes a sound.")

# Child class (Inheritance, method overriding)
class Dog(Animal):
    def __init__(self, name, breed):      # Constructor adds new attribute
        super().__init__(name)            # Inherit name from Animal
        self._breed = breed               # Encapsulation (protected attribute)
    def speak(self):                      # Polymorphism: overrides Animal.speak()
        print(f"{self._name} barks!")
    def get_breed(self):
        return self._breed                # Encapsulated getter

# Another child class
class Cat(Animal):
    def speak(self):                      # Polymorphism: different implementation
        print(f"{self._name} meows!")

# Usage
pet1 = Dog("Buddy", "Golden Retriever")    # Object of Dog
pet2 = Cat("Whiskers")                     # Object of Cat

# Demo of polymorphism
pets = [pet1, pet2]
for animal in pets:
    animal.speak()      # Calls correct version based on object type!

# Encapsulation demo
print("Dog breed:", pet1.get_breed())
# print(pet1._breed)   # Direct access possible (single underscore is just a hint!)
