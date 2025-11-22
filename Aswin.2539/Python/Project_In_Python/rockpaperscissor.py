# rock paper scissor
import random

print("Rock Paper Scissors!")
choices = ["rock", "paper", "scissor"]

computer = random.choice(choices)

print("type 'rock' or 'paper' or 'scissor'")
player = input().lower()
print(f"\nYou chose: {player}")
print(f"Computer chose: {computer}")
rock ="rock"
paper ="paper"
Scissor="scissor"
if(( player == "rock" and computer == "rock") or (player == "paper" and computer == "paper") or (player == "scissor" and computer == "scissor")) :
    print("it is draw")
elif(( player == "rock" and computer == "scissor") or (player == "paper" and computer == "rock") or (player == "scissor" and computer == "paper")):
    print("You Won")
elif(( player == "scissor" and computer == "rock") or (player == "paper" and computer == "scissor") or (player == "rock" and computer == "paper")):
    print("You lose")
else:
    print("Please type rock or, paper, or scissors")
