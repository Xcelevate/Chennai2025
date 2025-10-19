import random
Rock ='''
    _______
---'   ____)
      (_____)
      (_____)
      (____)
---.__(___)
'''

Paper ='''
     _______
---'    ____)____
           ______)
          _______)
         _______)
---.__________)
'''

Scissors = """
    _______
---'   ____)____
          ______)
       __________)
      (____)
---.__(___)
"""
sy_choice = random.randint(0, 2)



user_choice = input("What do you choose? Type 0 for rock, 1 for paper or 2 for scissors.\n")
print(f"Computer chose {sy_choice}")
user_choice = int(user_choice)
if user_choice >= 3 or user_choice < 0:
    print("You typed an invalid number. You lose.")

if user_choice == sy_choice:
    print("It's a draw.")
elif user_choice == 0 and sy_choice == 2:
    print("You win!")
elif sy_choice == 0 and user_choice == 2:
    print("You lose.")
elif user_choice > sy_choice:
    print("You win!")
else:
    print("You lose.")

game_images = [Rock, Paper, Scissors]
if 0 <= user_choice <= 2:
    print(game_images[user_choice])
    print("Computer chose:")
    print(game_images[sy_choice])