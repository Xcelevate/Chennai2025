# Welcome to Treasure Island.

print("Welcome to Treasure Island.")
print("Your mission is to find the treasure.")
print("You're at a crossroads. Where do you want to go?")

print("Type left or right?")
treasure = input().lower()
left = "You've come to a lake. There is an island in the middle of the lake."
right = "You fell into a hole. Game Over."

if treasure == "left": 
    print(left)
elif treasure == "right": 
    print(right)
else:
    print("Invalid choice. Please type 'left' or 'right'.")

print("Type 'wait' to wait for a boat. Type 'swim' to swim across: ")
boat= input().lower()
wait = "You arrive at the island unharmed. There is a house with 3 doors."
swim = "You get attacked by an angry trout. Game Over."

if (boat == "wait"):
    print(wait)
elif( boat == "swim"):
    print(swim)
else:
    print("Invalid choice. Please type 'wait' or 'swim'.")

print("One red, one yellow and one green. Which colour do you choose?")
door = input().lower()
red ="It's a room full of fire. Game Over."
yellow = "You enter a room of beasts. Game Over."
green = "You found the treasure! You Win!"

if( door == "red"):
    print(red)
elif( door == "yellow"):
    print(yellow)
elif( door == "green"):
    print(green)
else:
    print("Invalid choice. Please type 'red' or 'yellow' or 'green'.")

    
