#Gross salary cal
basic_salary = int(input())

if basic_salary <= 10000:
    hra = 0.20 * basic_salary
    da = 0.80 * basic_salary
elif basic_salary <= 20000:
    hra = 0.25 * basic_salary
    da = 0.90 * basic_salary
else:
    hra = 0.30 * basic_salary
    da = 0.95 * basic_salary

gross_salary = basic_salary + hra + da
print(int(gross_salary))
