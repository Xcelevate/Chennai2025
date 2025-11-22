num1=int(input())
num2=int(input())
num3=int(input())
num4=int(input())
num5=int(input())
numbers=[num1,num2,num3,num4,num5]
unique=set(numbers)
for num in unique:
    count=numbers.count(num)
    print(f" {num} = {count}")
    