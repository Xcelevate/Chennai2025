class Shape:
    def describe(self):
        return "I am a shape"
 
class Circle(Shape):
    def describe(self):
        result=super().describe()
        return f"{result} with radius 5"
 