#Last Digit of Number

while True:
    try:
        number = int(input("Enter a positive number: "))
        if number > 0:
            last_digit = number % 10
            print(f"Last digit of the number is: {last_digit}")
            break
        else:
            print("Please enter a positive number.")
    except ValueError:
        print("Only numerical input is allowed.")
