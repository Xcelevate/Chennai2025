#Exercise1
print("1.Mix 500g of Flour, 10g Yeast and 300ml water in bowl.")
print("2.knead the dough for 10 minutes.")
print("3.Add 3g of salt.")
print("4.Leave to rise for 2 hours.")
print("5.Bake at 200 degree C for 30  minutes.")


#Exercise2
print("Notes from Day 1") #unterminated string literal
print("The print statemnet is used to output strings") #unexpected intend 
print("Strings are strings of character") # incomplete input
print("Strinig concatenation is done with the + sign") #name 'priint' is not defined
print(("New lines can be created with a\ and the letter n")) #incomplete input



#exercise3
glass1="milk"
glass2="juice"
temp = glass1
glass1=glass2
glass2=temp
print(glass1)


#exercise3
height = 1.65
weight = 84
c= weight / (height *height )
print(round(c))

# Function to calculate sum
def find_sum(numbers):
    total = sum(numbers)
    return total
    
n = int(input("Enter how many numbers: "))

numbers = [] 
for i in range(n):
    mark = int(input(f"Enter number {i+1}: "))
    numbers.append(mark) 
total = find_sum(numbers)
print(f"Sum of the {n} numbers: {total}")


# FIZZZBUZZZ PROGRAM
num = int(input("Enter a number: "))

for i in range(1, num + 1):
    if i % 3 == 0 and i % 5 == 0:
        print("FIZZBUZZ")
    elif i % 3 == 0:
        print("FIZZ")
    elif i % 5 == 0:
        print("BUZZ")
    else:
        print(i)

# BMI Calculator

weight = float(input("ENTER YOUR WEIGHT IN KG'S:"))
height = float(input("ENTER YOUR HEIGHT IN METER:"))

bmi = weight / (height * height)
print(f"YOUR BMI: {bmi:.2f}")
if( bmi < 18.5):
    print("Under weight")
elif 18.5 <= bmi <= 24.9:
    print("Normal weight")
elif( 25 <= bmi <=29.9):
    print("Over weight")
elif( bmi >= 30):
    print("Obesity")
else:
    print("please give me the valid number")

#Anagrams
s1 = input("Enter your 1st word:").lower()
s2 = input("Enter your 2nd word:").lower()
c=0

if(s1.isalpha() and s2.isalpha()):
    if( len(s1) == len(s2)):
        for i in range(len(s1)):
            if(s1[i] in s2):
                c=c+1
                continue
            else:
                break
        if c == len(s1) and len(s2):
            print("Yes")
        else:
            print("No")
    else:
        print("Please give same length of alphabet")
else:
    print("Please give Alphabet only")


# Password checker
import sys

password = input("enter the pass: ")

password = str(password)
list_chr = ['!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '+', '=', ':', ';']
num = ['0','1','2','3','4','5','6','7','8','9']

c = 0
nc = 0

if len(password) >= 8:
    for i in password:
        if i in list_chr:
            c += 1
        elif i in num:
            nc += 1
        else:
            continue
    if nc == 0:
        print("num is missing")
    elif c == 0:
        print("spl is missing")
else:
    print("pass >= 8")
    sys.exit()

if 2 < c <= 4:
    print("strong")
if c > 4:
    print("very strong")
