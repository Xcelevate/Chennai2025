date=int(input())
month=input()
year=int(input())


#month=input()
valid_month=["January","February","March","April","May","June","July","August",
             "September","October","November","December"]

if 1<=date<=31 and month in valid_month and 1900<=year<=2100:
    print(date)
    print(month.title())
    print(year)

