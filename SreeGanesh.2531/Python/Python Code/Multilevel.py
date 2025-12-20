##implement multilevel inheritance with examples one grandparent,one parent,one chid
from grandClass import Grandparent,Parents,Childs
obj=Grandparent("petchi",86)
obj1=Parents("muthu",50)
obj2=Childs("moorthi",22)
print(obj.grand())

print(obj1.parents())

print(obj2.childs())
