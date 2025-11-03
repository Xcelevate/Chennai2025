yearCheck = int(input())
if yearCheck % 400 == 0:
    print("Yes")
elif yearCheck % 100 == 0:
    print("No")
elif yearCheck % 4 == 0:
    print("Yes")
else:
    print("No")