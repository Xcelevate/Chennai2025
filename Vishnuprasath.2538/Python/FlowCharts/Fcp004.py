#Basic Arithmatic Ops

while True:
    try:
        a = int(input("Enter the first number: "))
        break
    except ValueError:
        print("Enter the numerical value")

while True:
    try:
        b = int(input("Enter the second number: "))
        if b>=1 or b<=-1:
            break
        else:
            print("cannot be zero")
    except ValueError:
        print("ENTER NUMERIC NUMBER")
    
add = a+b
sub = a-b
mul = a*b
div = a/b
int_div = a//b
mod = a%b

print(add)
print(sub)
print(mul)
print(div)
print(int_div)
print(mod)
