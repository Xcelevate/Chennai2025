#Randomization

import random # import random package in python


import random
randomInt = random.randint(1,100)
print(randomInt) # 98

randomInt = random.randint(11,100)
print(randomInt) # 70


bike =["MT","DUKE","KTM","PULSAR","FZ"]
print(random.choice(bike)) # DUKE

# implement my module

import aswin_module
aswin_module.Name # Print thr output

#Randomization

import random
randomInt = random.random()*10
print(randomInt)

randomfloat = random.random()*10
print(randomfloat) # 2.5170501050392167

randomInt = random.random()
print(randomInt) # 0.3356430771396447 random.random gives lessthan 1

randomInt = random.uniform(1,10)
print(round(randomInt,2)) # 9.39 Round off with 2 decimal place 

#print head and tails

randomBinary = random.randint(0,1)
if(randomBinary ==0):
    print("Head")
else:
    print("Tails")
