# - Create a `Student` class with attributes (`name`, `age`, `marks`)
# and methods to calculate grade.
# 
# - Display student info using methods.
 
class Student:
    def __init__(self,name,age,marks):
        self.name=name
        self.age=age
        self.marks=marks
    def Calculate_grade(self):
        if self.marks>90:
            return "A+"
        elif 70<=self.marks<=80:
            return "A"
        elif 50<=self.marks<=70:
            return "B"
        elif 45<=self.marks<=50:
            return "c"
        else:
            return "Fail"
    def display_info(self):
        print("Name:",self.name)
        print("Age:",self.age)
        print("Marks:",self.marks)
        print("Grade:",self.Calculate_grade())

#class and object
class FriedRice:
    def __init__(self,id,ricename,piecesize):
        self.id=id
        self.ricename=ricename
        self.piecesize=piecesize

f1=FriedRice(1,"Pasmathi","Normal")
f2=FriedRice(2,"Sergasamba","Medium")
f3=FriedRice(3,"Ponni","Long")
print(f1.id)
print(f2.ricename)
print(f3.piecesize)

#Multiple objects
class FireCrackers:
    def __init__(self):
        self.name = ""
        self.price = 0.0
        self.types = ""
        self.noise = True
        self.sky = True
        self.qualityIsGood = True
        self.itsExpensive = True
        self.itsCertified = True
        self.lessWeight = True
        self.size = 0.0

f1 = FireCrackers()
f1.name = "Atom Bomb"
f1.price = 700
f1.types = "Day"
f1.noise = False
f1.sky = False
f1.qualityIsGood = True
f1.itsExpensive = True
f1.itsCertified = True
f1.lessWeight = True
f1.size = 0.04

f2 = FireCrackers()
f2.name = "Flower Pot"
f2.price = 400
f2.types = "Night"
f2.noise = True
f2.sky = False
f2.qualityIsGood = True
f2.itsExpensive = False
f2.itsCertified = True
f2.lessWeight = True
f2.size = 0.02

f3 = FireCrackers()
f3.name = "Thousand Wall"
f3.price = 300
f3.types = "Day"
f3.noise = False
f3.sky = False
f3.qualityIsGood = True
f3.itsExpensive = False
f3.itsCertified = True
f3.lessWeight = True
f3.size = 0.02

print(f1.name)
print(f2.types)
print(f3.price)
print(f1.noise)
print(f2.sky)
print(f3.size)

