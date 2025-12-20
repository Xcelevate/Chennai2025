# Calculator

num1 = input("Enter first number: ")
if num1.replace('.', '', 1).isdigit():
    con = "continue"
    num1 = float(num1)
    while con != "stop" and con != "start":
        print("""choose the operator:
        
        +
        -
        *
        /
        %
        //
        **""")

        pick = input("Enter the operator: ")
        num2 = float(input("Enter next number: "))

        if pick == '+':
            f = num1 + num2
        elif pick == '-':
            f = num1 - num2
        elif pick == '*':
            f = num1 * num2
        elif pick == '/':
            f = num1 / num2
        elif pick == '%':
            f = num1 % num2
        elif pick == '//':
            f = num1 // num2
        elif pick == '':
            f = num1 ** num2
        else:
            print("Invalid operator!")
            continue

        print("Result:", f)
        print("Do you want to 'continue' or 'stop' or 'start' the calculation?")
        con= input().lower()

        if con== "stop":
            print("Thank you!!!...FOR CALCULATION...")
        elif con == "continue":
            num1 = f
        elif con == "start":
            num1 = input("Enter new number: ")
            if num1.replace('.', '', 1).isdigit():
                num1 = float(num1)
                con = "continue"
                continue
            else:
                print("Invalid input")
                break

else:
    print("Invalid input")