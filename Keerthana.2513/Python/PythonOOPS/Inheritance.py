#Multiple Inheritance

class Base1:
    def method1(self):
        print("Method from Base1")
 
class Base2:
    def method2(self):
        print("Method from Base2")
 
class Derived(Base1, Base2):
    def method3(self):
        print("Method from Derived")
 
 
 ### Multilevel Inheritance
 
 ##implement multilevel inheritance with examples one grandparent,one parent,one chid##
class Grandparent:
    def __init__(self,name,age):
        self.name=name
        self.age=age
        
    def grand(self):
        return f"GrandParent name is {self.name} his age is {self.age}"

class Parents(Grandparent):
    def __init__(self,name,age):
        super().__init__(name,age)
    def parents(self):
        return f"Parent name is {self.name} his age is {self.age}"

class Childs(Parents):
    def __init__(self,name,age):
        super().__init__(name,age)
    def childs(self):
        return f"My name is {self.name} my age is {self.age}"
