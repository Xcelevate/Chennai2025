num1=int(input())
num2=int(input())
num3=int(input())
numbers=[num1,num2,num3]
second=sorted(list(set(numbers)))[-2]
print(second)
