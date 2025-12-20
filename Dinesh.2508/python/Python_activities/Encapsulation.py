from Grade import Student
s1 = Student("Dinesh",21,100)
s1.display()
s1.update_marks(95)
s1.update_marks(100)
s1.display()
s1.update_marks(80)
s1.display()
s1.update_marks(100)
s1.display()


from shapes import Shape,Circle
s1 = Circle(5)
s1.describe()
s1.display()

from methodoverriding import Animal,Dog,Cat
d1 = Dog()
c1 = Cat()
animals = [d1,c1]
for animal in animals:
    print(animal.speak())  # Different behavior, same method
type(animals)
animal1 = Animal()
animal1.speak()