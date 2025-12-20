ENCAPSULATION


class Device:
    def __init__(self,model,storage,device):
        self.model=model        # public access modifier
        self._storage=storage   #protected access modifier
        self.__device=device    #private access modifier
    def display_info(self):
        print(f"This model name is {self.model}")
        print(f"This storage is {self._storage}GB") #protecte access modifier
        print(f"This is the device {self.__device}")
		
d=Device("Intel","99","10FGD987")

d.display_info()

print(d.model)

print(d._storage)

### PROBLEM


class InsufficientBalanaceError(Exception):
    pass

class Employees:
    def __init__(self, name, salary):
        self._name = name
        self._salary = None
        self.salary = salary  # Use setter for initial validation
    @property
    def salary(self):
        return self._salary
    @salary.setter
    def salary(self, value):
        """Setter with validation"""
       

        if not isinstance(value, int):
            raise TypeError("Salary should be integer")
        if value < 0:
            raise ValueError("Salary cannot be negative")
          
        if value<5000:
            raise InsufficientBalanceError("You should give greater than 5000")
            self._salary = value
            
s=Employees("Moorthi",7000000)

try:
    s.salary=-46565 
except ValueError as e:
    print(e)
except TypeError as t:
    print(t)
except InsufficientBalanceError as i:
    print(i)



e=Employees("Moorthi",100000)

print(e.__salary)