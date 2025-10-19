print("Welcome to Treasure Island.\nYour mission is to find the treasure.\nYou\'re at a cross road.\nWhere do you want to go?\n");
value = input("Type \"left\" or \"right\" : ");
modifyvalue = value.lower();

if(modifyvalue == "left"):
    print("You've come to a lake.\nThere is an island in the middle of the lake.\n");
    
    value2 = input("Type \"wait\" to wait for a boat. Type \"swim\" to swim across : ");
    modifyvalue2 = value2.lower();
    
    if(modifyvalue2 == "wait"):
        print("You arrive at the island unharmed. There is a house with 3 doors.\n One Red, one Yellow and one Blue.");
        
        value3 = input("Which colour do you choose?");
        modifyvalue3 = value3.lower();
        
        if(modifyvalue3 == "red"):
            print("It's a room full of fire.\n !!!Game Over🎮!!!");
        elif(modifyvalue3 == "yellow"):
            print("Hurrah🎉🥳! You found the treasure! You Win! 💫🌟");
        elif(modifyvalue3 == "blue"):
            print("You enter a room of beasts.\n !!!Game Over🎮!!!");
        else:
            print("Don't Enter invalid things, Please! Follow the Instructions Carefuly");
    elif(modifyvalue2 == "swim"):
        print("You get attacked by an angry trout.\n !!!Game Over🎮!!!");

    else:
        print("Don't Enter invalid things, Please! Follow the Instructions Carefuly");
        

elif(modifyvalue == "right"):
    print("You fell into a hole.\n !!!Game Over🎮!!!");
else:
    print("Don't Enter invalid things, Please! Follow the Instructions Carefuly");