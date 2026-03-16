a=int(input())
b=int(input())
c=int(input())
d=int(input())
number=[a,b,c,d]
numbers=list(set(number))
numbers.sort(reverse=True)
print(numbers[1])