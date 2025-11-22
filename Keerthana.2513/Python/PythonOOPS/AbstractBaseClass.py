# Define an Abstract Base Class for a 'Shape'
from abc import ABC, abstractmethod
class Shape(ABC):
    @abstractmethod
    def area(self):
        """Calculates and returns the area of the shape."""
        
    @abstractmethod
    def perimeter(self):
        """Calculates and returns the perimeter of the shape."""
        pass
 
# Concrete subclass: Circle
class Circle(Shape):
    def __init__(self, radius):
        self.radius = radius
 
    #def area(self):
      #  return 3.14159 * self.radius ** 2
 
    def perimeter(self):
        return 2 * 3.14159 * self.radius
 
# Concrete subclass: Rectangle
class Rectangle(Shape):
    def __init__(self, length, width):
        self.length = length
        self.width = width
 
   # def area(self):
      #  return self.length * self.width
 
    def perimeter(self):
        return 2 * (self.length + self.width)
 
