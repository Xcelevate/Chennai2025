# Generated from: GradeTask-05-nov.ipynb
# Converted at: 2026-01-10T09:04:00.734Z
# Next step (optional): refactor into modules & generate tests with RunCell
# Quick start: pip install runcell

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