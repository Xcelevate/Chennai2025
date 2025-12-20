import random
rock = """
    _______
---'   ____)
      (_____)
      (_____)
      (____)
---.__(___)
"""

paper = """
     _______
---'    ____)____
           ______)
          _______)
         _______)
---.__________)
"""

scissors = """
    _______
---'   ____)____
          ______)
       __________)
      (____)
---.__(___)
"""

game_images = [rock, paper, scissors]
print("Hello welcome to Great kirikalan game")
print("What do you choose? Type 0 for rock, 1 for paper or 2 for Scissors")
a=input()
if a.isdigit():
    a=int(a)
    if a>=0 and a<=2:
         print("You chose:")
         print(game_images[a])

         comp = random.randint(0,2)
         print("computer choose chose:")
         print(game_images[comp])

         if a == comp:
            print("Its draw")
         elif (a==0 and a==2) or (a==1 and a==0) or (a==2 and a==1):
                print("Hoorey you win")
         else:
                print("Oh no you lose")
    else:
      print("Invaild number, Please choose 0,1, and 2")
else:
  print("Invalid input numbers only")
