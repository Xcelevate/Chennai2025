A=int(input())
B=int(input())
C=int(input())
if(A>=B and A<=C)or (A<=B and A>=C):
    second_max=A
elif(B>=C and B<=A)or(B<=C and B>=A):
    second_max=B
else:
    second_max=C

print(second_max)        