s1 = input("Enter a Year: ")

if (s1.isdigit()):  
    yearLen = len(s1)  
    year = int(s1)

    if (yearLen != 4):  
        print("Enter a valid year.")

    elif (year % 4 == 0 and year % 100 != 0) or (year % 400 == 0):
        print("This is a leap Year")

    else:
        print("This is not a leap Year")
        
else:
    print("Kindly, insert a valid year in digits (positive numbers only).")