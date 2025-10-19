print("Welcome to the tip calculator!");
bill = input("What was the total bill? ₹");
tipcount = input("How much % would you like to give Tip of your Total Bill?");
people = input("How many people to split the bill? ");

a = bill.replace(".", "");
b = tipcount.replace(".", "");
c = people.replace(".", "");

if(a.isdigit() and b.isdigit() and c.isdigit()):
    bill = float(bill);
    tipcount = float(tipcount);
    people = float(people);
    if(bill >= 100):
        if(tipcount > 0 and tipcount <= 50):
            
            if(people.is_integer()):        
                tip = float(bill * tipcount / 100);
                validTip = float(tip / people);
                
                if(validTip >= 5):
                    totalBill = bill + tip;
                    eachPerson = float(totalBill / people);
                    afterround = round(eachPerson, 2);
                    print("Each Persion will pay = ₹", afterround);
                else:
                    print("from each person side Tip amount is less than ₹ 5 So we can't give the Tip. For Giving Tip you should increase the Tip amound")
                
            else:
                print("People number could not be in points. So please! enter valid Number.");
        else:
            print("You can't give the Tip more than 50% or less than 0. It's our Policy")
    else:
        print("Bill Should be Greater Than ₹ 100");
else:
    print("Please! Enter only valid Numbers. Number should be Positive only");

