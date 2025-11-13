class Parent:
    def __init__(self, name):
        self.name = name
    def greet(self):
        print(f"Hello, I'm {self.name}")
        
class Child(Parent):
    # Inherits name attribute and greet() method
    pass
