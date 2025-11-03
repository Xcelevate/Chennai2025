num1 = int(input())
num2 = int(input())
num3 = int(input())
num4 = int(input())
if num1 > num2:
    max_a = num1
else:
    max_a = num2
if num3 > num4:
    max_b= num3
else:
    max_b= num4
if max_a > max_b:
    print(max_a)
else:
    print(max_b)