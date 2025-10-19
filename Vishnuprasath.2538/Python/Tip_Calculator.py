print("Welcome to the tip calculator!")

amount = input("What was the total bill? ")
a = amount.replace(".", "")

if a.isdigit():
    amount = float(amount)
    if amount > 0:
        print("How much tip would you like to give? 10, 12, or 15?")
        tip = input("Enter your tip: ")
        b = tip.replace(".", "")
        if b.isdigit():
            tip = float(tip)
            if tip > 0 and tip <= 30:
                tip_amount = amount * (tip / 100)
                new_amount = amount + tip_amount
                print("How many people to split the bill?")
                split = input()
                if split.isdigit():
                    split = int(split)
                    if split >= 1 and split <= 20:
                        if (tip_amount / split) >= 5:
                            print("Each person should pay: Rs", round(new_amount / split, 2))
                        else:
                            print("Tip amount per person should be at least 5")
                    else:
                        print("Number of people to split is out of range (1–20)")
                else:
                    print("Invalid input for split")
            else:
                print("Tip percentage should be between 0 and 30")
        else:
            print("Invalid tip input")
    else:
        print("Bill amount should be greater than 100")
else:
    print("Invalid amount input")
