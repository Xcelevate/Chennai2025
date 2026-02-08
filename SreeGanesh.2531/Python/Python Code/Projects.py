# Generated from: Projects.ipynb
# Converted at: 2026-01-10T09:04:36.845Z
# Next step (optional): refactor into modules & generate tests with RunCell
# Quick start: pip install runcell

#Rock,Paper,Scissors
import random
print("Welcome to Rock, Paper, Scissors Game!")
print("What do you choose?")
print("Type 0 for Rock ")
print("Type 1 for Paper ")
print("Type 2 for Scissors ")
user_choice = input("Enter your choice (0/1/2): ")
if(user_choice.isdigit()):
    user_choice=str(user_choice)
if user_choice.isalpha()==False:
    print("Invalid choice. You lose ")
else:
    computer_choice = random.randint(0, 2)
    choices = ["Rock ", "Paper ", "Scissors "]
    print(f"\nYou chose: {choices[user_choice]}")
    print(f"Computer chose: {choices[computer_choice]}")
    if user_choice == computer_choice:
        print("It's a draw ")
    elif (user_choice == 0 and computer_choice == 2) or \
         (user_choice == 1 and computer_choice == 0) or \
         (user_choice == 2 and computer_choice == 1):
        print("You win! ")
    else:
        print("You lose! ")


#Treasure Island
print("Welcome to Treasure Island.")
print("Your mission is to find the treasure.") 
choice1 = input('You\'re at a cross road. Where do you want to go? Type "left" or "right": ').lower()
if choice1 == "left":
    choice2 = input('You\'ve come to a lake. There is an island in the middle of the lake. '
                    'Type "wait" to wait for a boat. Type "swim" to swim across: ').lower()
    if choice2 == "wait":
        choice3 = input("You arrive at the island unharmed. "
                        "There is a house with 3 doors: one red, one yellow, and one blue. "
                        "Which colour do you choose? ").lower()
        if choice3 == "red":
            print("It's a room full of fire. Game Over.")
        elif choice3 == "blue":
            print("You enter a room of beasts. Game Over.")
        elif choice3 == "yellow":
            print("You found the treasure! You Win!")
        else:
            print("You chose a door that doesn't exist. Game Over.")
    elif choice2=="swim": 
        print("You got attacked by an angry trout. Game Over.")
    else:
        print("Invalid choice.Game Over.")
elif choice1 =="right":
    print("You fell into a hole. Game Over.")
else:
    print("Oh,See you next time!")

#Tip Calculator
print("Welcome to the Tip Calculator!")
print("\nHello I am here to help to you calculate the bills!")
total_bill = input("What was the total bill? ₹")
tips = input("What percentage tip would you like to give? 10, 12, or 15? ")
peoples = input("How many people to split the bill? ")
if total_bill.replace(".","" ).isdigit() and tips.replace(".","").isdigit() and peoples.replace(".","").isdigit():
    total_bill = float(total_bill)
    tips = float(tips)
    peoples = int(peoples)
    if(total_bill > 0 and tips>0 and peoples > 0):
        tip_amount=total_bill*(tips/100)
        peoples_tip_amount=tip_amount/peoples
        peoples_bill_amount=total_bill/peoples
        peoples_amount=(peoples_tip_amount + peoples_bill_amount)
        if(peoples_amount>=100 and tips>0 and tips<50 and peoples_tip_amount>5 and total_bill>100):
            print(peoples_amount)
        else:
            print("peoples amount",peoples_amount)
            print("peoples tip amount",peoples_tip_amount)
            print("peoples total bill amount",peoples_bill_amount)
            print("tips",tips)
            print("tip amount",tip_amount)
            print("You have entered some invalid data recheck with it")
    else:
        print("Values must be grater than zero")
       
else:
    print("Invalid input! Please enter numeric values only.")