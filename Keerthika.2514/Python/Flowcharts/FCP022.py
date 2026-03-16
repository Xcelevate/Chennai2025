a=int(input())
b=int(input())
c=int(input())
d=int(input())
e=int(input())
number=[a,b,c,d,e]
for i in set(number):
    count=0
    for j in number:
        if i==j:
            count+=1
    print(i," = ",count)
    
    