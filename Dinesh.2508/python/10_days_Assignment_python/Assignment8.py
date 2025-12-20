import numpy as np
import pandas as pd
import matplotlib.pyplot as plt 
import seaborn as sns 

df = pd.read_csv('assignment8_hr_employee_data.csv')
df

##  Q8.1: Department Headcount
#### Load HR data and display department-wise employee count.
 emp_count = df['Department'].value_counts()
print(emp_count)

## Q8.2: Salary Analysis


#### Calculate average salary by department and designation.
avg_salary = df.groupby(['Department','Designation'])['Salary'].mean()
print(avg_salary)

## Q8.3: Location Analysis
#### Group employees by location and calculate total and average salary.
location_summary = df.groupby('Location')['Salary'].agg(['sum','mean','count'])
location_summary

## Q8.4: Pivot Table
#### Create a pivot table showing department vs designation with salary totals.
pivot_table = pd.pivot_table(df, values = 'Salary',index = 'Department',columns = 'Designation',aggfunc = 'sum')
pivot_table 

## Q8.5: Service Years
#### Add a calculated column for service years (current year - JoiningYear)
df['ServiceYears'] =2024 - df['JoiningYear']
print(df[['EmployeeID','EmployeeName','JoiningYear','ServiceYears']].head(10))

## Q8.6: Top Earners
#### Find top 10 employees by salary and display their details.
top_10_emp = df.nlargest(10,'Salary')[['EmployeeID','EmployeeName','Department','Salary',]]
top_10_emp

## Q8.7: Performance Analysis
#### Identify underperformers (PerformanceRating < 3.0) by department.
low_perform = df[df['PerformanceRating'] < 3.0]
underperformance = low_perform.groupby('Department').size()
underperformance 

## Q8.8: Projects Analysis
#### Create a summary showing projects completed by department
completed_summary = df.groupby('Department')['ProjectsCompleted'].agg(['sum','count','mean'])
completed_summary

## Q8.9: Export Report
#### Export a comprehensive HR summary to hr_summary_report.csv
hr_summary = df.groupby('Department').agg({'Salary' :['mean','sum','min','max'],
                                          'PerformanceRating': 'mean',
                                          'ProjectsCompleted': 'sum',
                                          'EmployeeID':'count'})
hr_summary.to_csv('hr_summary_report.csv')
print('File Exported')

## Q8.10: Visualizations
#### Create visualizations for salary distribution and performance ratings
fig, (ax1, ax2) = plt.subplots(1, 2, figsize=(12,8))
# Salary distribution by department
sns.boxplot(data=df, x='Designation', y='EmployeeID', ax=ax1)
ax1.set_title('Salary Distribution by Department', fontweight='bold')
ax1.set_ylabel('Salary ')

# Performance rating by location
sns.violinplot(data=df, x='Location', y='PerformanceRating', ax=ax2)
ax2.set_title('Performance Rating by Location', fontweight='bold')
ax2.set_ylabel('Performance Rating')
plt.tight_layout()
plt.show()