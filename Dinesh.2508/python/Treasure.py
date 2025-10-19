print("""
                    ____...------------...____
               _.-"` /o/__ ____ __ __  __ \ o\_`"-._
             .'     / /                    \ \     '.
             |=====/o/======================\ o\=====|
             |____/_/________..____..________\_\____|
             |  _/ \_     <_o#\__/#o_>     _/ \_   |
                    \_________\####/_________/
              |===\!/========================\!/===|
              |   |=|          .---.         |=|   |
              |===|o|=========/     \========|o|===|
              |   | |         \() ()/        | |   |
              |===|o|======{'-.) A (.-'}=====|o|===|
              | __/ \__     '-.------.-'    __/ \__ |
              |==== .'.'^'.'.====|
          jgs |  _\o/   __  {.' __  '.} _   _\o/  _|
              `""""-""""""""""""""""""""""""""-""""""")
print("Welcome to Treasure Island")
print("Your task is to find the treasure")
option_1 = input("""You're at crossroad,where do you want to go?'Type Left or Right.""").lower()

if option_1 == 'left'.lower():
    option_2 = input("You've come to lake\nThere is an island in the middle of the lake\nType 'wait' to wait for a boat or Type 'swim' to swim across. ").lower()
    if option_2 == 'wait'.lower():
        option_3 = input("You arrived at Island\nThere are 3 boxes with colour of 'Red','Green','Blue' choose one of them ").lower()

        if option_3 == ("Red").lower():
            print("It's a room full of fire.Game Over ")
        elif option_3 == ("Green").lower():
            print("You found the treasure. You Win! ")
        elif option_3 == ("Blue").lower():
            print("You enter a room of snakes.Game Over ")
        else:
            print("The Box colour does not exist.Game Over ")
    else:
        print("You got attacked.Game Over!")

elif option_1 == 'right'.lower():
    print("You fell into Hole.Game Over!")
else:
    print("You typed the wrong word and got shot! Game Over!")