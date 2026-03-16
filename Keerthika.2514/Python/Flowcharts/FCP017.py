a=int(input())
b=int(input())
c=int(input())
number=[a,b,c]
numbers=set(number)
number.sort(reverse=True)
print(number[1])