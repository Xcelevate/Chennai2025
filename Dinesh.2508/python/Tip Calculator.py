print("Welcome to tip calculator")
bill = float(input("Enter the total bill amount "))
if bill > 0:
     tip = int(input("------------------Enter what tip would you like to give?In percentage %---------------------\nNote: The tip should be lesser than or equal to 50% "))
if tip == 0 or tip <0 or tip >= 50:
    print("Invalid tip percentage! Tip amount must be greater than or equal to 50%")
people = int(input("Enter number of people to split the bill? "))
if people <= 0:
    print("Number of people must be greater than zero")

else:

    tip_percentage = tip/100
    total_tip_amount = bill * tip_percentage
    total_bill = bill + total_tip_amount
    bill_per_person = total_bill / people
    final_amount = round(bill_per_person,2)

    print(f"Each person should pay:{final_amount}")
