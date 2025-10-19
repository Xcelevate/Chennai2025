print("Welcome to Treasure Island.")
print("Your mission is to find the treasure.")
print("You're at a cross road. Where do you want to go?")
print("Type left or right ")
a1 = input().lower()
if a1 == "left":
    print("You've come to a lake. There is an island in the middle of the lake.")
    print("Type wait to wait for a boat. Type swim to swim across.")
    a2 = input().lower()
    if a2 == "wait":
        print("You arrive at the island unharmed. There is a house with 3 doors.")
        print("One red, one yellow and one blue. Which colour do you choose?")
        a3 = input().lower()
        if a3 == "yellow":
            print("You found the treasure! You Win!")
        elif a3 == "red":
            print("It's a room full of fire. Game Over.")
        elif a3 == "blue":
            print("You enter a room of beasts. Game Over.")
        else:
            print("Invalid input, only red, yellow and blue")
    elif a2 == "swim":
        print("You get attacked by an angry trout. Game Over.")
    else:
        print("Invalid input, wait or swim")
elif a1 == "right":
    print("You fell into a hole. Game Over.")
else:
    print("Invalid input, left or right")
