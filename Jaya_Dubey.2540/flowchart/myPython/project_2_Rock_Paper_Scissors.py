import random;
print("What do you choose? Type \"0\" for Rock, \"1\" for Paper or \"2\" for Scissors.");
computer = random.randint(0,2);
print(type(computer));
user = input("Enter a Number : "); 
print("Computer Choose = " + str(computer));
print("You Choose = " + str(user));

rock = 0;
paper = 1;
scissors = 2;

if(user.isdigit()):
    you = int(user); 

    if((you == rock and computer == rock) or (you == paper and computer == paper) or (you == scissors and computer == scissors)):
        print("It's Draw");
    elif((you == rock and computer == paper) or (you == paper and computer == scissors) or (computer == rock and you == scissors)):
        print("Computer Win!");
    elif((computer == rock and you == paper) or (computer == paper and you == scissors) or (you == rock and computer == scissors)):
        print("You Win!");
    else:
        print("Please! Take only between 0-2 Number for Playing this Game.");
else:
    print("Please Take only Numbers");