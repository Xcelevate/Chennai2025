# Generated from: Reborg.ipynb
# Converted at: 2026-01-10T09:05:14.040Z
# Next step (optional): refactor into modules & generate tests with RunCell
# Quick start: pip install runcell

#alone
for i in range(0,4):
    move() or move() or turn_left()

#Home1
move()
move()

#Home2
move()
move()

#Home3
move()
move()
turn_left()
move()

#Home4
move()
move()
move()
turn_left()
move()
move()
move()
turn_left()
turn_left()
turn_left()
move()
turn_left()
turn_left()
turn_left()
move()
move()
move()
turn_left()
move()
move()
move()
turn_left()
turn_left()
turn_left()
move()
turn_left()
turn_left()
turn_left()
move()
move()
move()
turn_left()
move()
move()
move()
turn_left()
turn_left()
turn_left()
move()
turn_left()
turn_left()
turn_left()
move()
move()
move()
turn_left()
move()
move()
move()




#Hurdle1
# Helper function to simplify turning right
def turn_right():
    turn_left()
    turn_left()
    turn_left()

# Function to execute a single jump over a hurdle
def jump():
    turn_left()   # Face North
    move()
    turn_right()  # Face East
    move()
    turn_right()  # Face South
    move()
    turn_left()   # Face East again, back on the path

# The main program loop
while not at_goal():
    if wall_in_front(): # Or maybe 'not front_is_clear()'
        jump()
    else:
        move()

 



#Hurdle1 and #Hurdle2
def turn_right():
    turn_left()
    turn_left()
    turn_left()
def jump():
    turn_left()  
    move()
    turn_right() 
    move()
    turn_right()  
    move()
    turn_left()   
while not at_goal():
    if wall_in_front(): 
        jump()
    else:
        move()


#Hurdle 4
def turn_right():
    turn_left()
    turn_left()
    turn_left()
def climb():
    turn_left()
    while wall_on_right():
        move()
    turn_right()
    move()
    turn_right()
    while front_is_clear():
        move()
    turn_left()


while not at_goal():
    
    if wall_in_front():
        climb()
   
    else:
        move()

# Helper function for turning right
def turn_right():
    turn_left()
    turn_left()
    turn_left()

# Function to dynamically climb and cross a variable-height hurdle
def climb():
    # 1. Start the climb
    turn_left()
    
    # 2. Climb up: Keep moving up as long as there is a wall to the right.
    # This automatically finds the top of the variable-height wall.
    while wall_on_right():
        move()
    
    # 3. Cross the top of the wall
    turn_right()
    move()
    
    # 4. Start the descent
    turn_right()
    
    # 5. Climb down: Keep moving down until the ground is reached.
    # We stop when 'front_is_clear()' is no longer True (i.e., we hit the boundary).
    while front_is_clear():
        move()
    
    # 6. Turn back to face East (the path)
    turn_left()

# The main program loop
while not at_goal():
    # If a wall is in front, execute the climb function
    if wall_in_front():
        climb()
    # Otherwise, simply move forward
    else:
        move()

#Hurdle3
def turn_right():
    turn_left()
    turn_left()
    turn_left()
def jump():
    turn_left()  
    move()
    turn_right() 
    move()
    turn_right()  
    move()
    turn_left()   
while not at_goal():
    if wall_in_front(): 
        jump()
    else:
        move()