from parentClass import Parent,Child
child = Child("Priya")
child.greet()  # Inherited method works

from vehicleClass import Vehicle,Car
car=Car("Toyota","V10",5)
car.display_info()

from baseClass import Base1,Base2,Derived
derived=Derived()

# Create an instance of the Derived class
obj = Derived()
 
# Access methods from all base classes and the derived class
obj.method1()
obj.method2()
obj.method3()

#Inheritance
class Friedrice:
    def __init__(self):
        self.ricetype = ""
        self.price = 0.0
        self.color = ""
        self.taste = ""
        self.brand = ""
        self.quality = ""
        self.quantity = 0.0

class ChickenFr(Friedrice):
    def __init__(self):
        super().__init__()  
        self.chickenquantity = 0.0

c = ChickenFr()
c.ricetype = "Basmati"
c.price = 199.99
c.color = "Brown"
c.taste = "Spicy"
c.brand = "DTB"
c.quality = "Average"
c.quantity = 1.0
c.chickenquantity = 100.00

print(c.price)
print(c.brand)
