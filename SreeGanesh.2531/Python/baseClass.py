class Base1:
    def method1(self):
        print("Method from Base1")
 
class Base2:
    def method2(self):
        print("Method from Base2")
 
class Derived(Base1, Base2):
    def method3(self):
        print("Method from Derived")
 
