#Print Birth Date in Order

while True:
    a = int(input("date: "))
    if 1<=a<=31:
        break
    else:
        print("1-31")

valid_months = ["jan", "feb", "mar", "apr", "may", "jun", 
                "jul", "aug", "sep", "oct", "nov", "dec"]

while True:
    b = str(input("month: "))
    if b in valid_months:
        break
    else:
        print("jan to dec")

while True:
    c = int(input("year: "))
    if 1800 <= c <= 2200:
        break
    else:
        print("1800 to 2200")

print("\nYour birth details are:")
print("Date : ",a)
print("Month: ",b.capitalize())
print("Year : ",c)
