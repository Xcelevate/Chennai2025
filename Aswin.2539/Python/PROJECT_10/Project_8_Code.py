# ## ASSIGNMENT 8: HR Employee Analytics

# ### Dataset: assignment8_hr_employee_data.csv

# ### Q8.1: Department Headcount

# #### Load HR data and display department-wise employee count.
import pandas as pd
df = pd.read_csv('assignment8_hr_employee_data(in).csv')
df
df.info()
employee_count = df['Department'].value_counts()
print("Department wise Count:")
print(employee_count)

# ### Q8.2: Salary Analysis

# #### Calculate average salary by department and designation.

avg_salary = df.groupby(['Department','Designation'])['Salary'].mean()
print("Average Salary By Department and Destignation:")
print(avg_salary)

# ### Q8.3: Location Analysis

# ####  Group employees by location and calculate total and average salary

employee_location = df.groupby('Location')['Salary'].agg(['sum','mean'])
employee_col_rename = employee_location.rename(columns=({'sum':'TotalSalary','mean':'AvgSalary'}))
print("Location based Total and Avergae salary:")
print(employee_col_rename)

# ## Q8.4: Pivot Table

# #### Create a pivot table showing department vs designation with salary totals.

pivot_table = pd.pivot_table(df,
                             index = 'Department',
                             columns = 'Designation',
                             values = 'Salary',
                             aggfunc = 'sum'
                            )
print("Department vs Designation with Salary:")
print(pivot_table)

# ### Q8.5: Service Years

# #### Add a calculated column for service years (current year - JoiningYear).

if 'ServiceYear' not in df.columns:
    df['ServiceYear'] = 2024 - df['JoiningYear']
print("Calculated Service Years Colums with relavent columns:")
print(df[['EmployeeID','Department','Designation','Salary','JoiningYear','ServiceYear']])

# ### Q8.6: Top Earners

# #### Find top 10 employees by salary and display their details.

top_10 = df.nlargest(10,'Salary')[['EmployeeID','EmployeeName','Department','Designation','Salary']]
print("Top 10 salaried Employees:")
print(top_10)

# ### Q8.7: Performance Analysis

# #### Identify underperformers (PerformanceRating < 3.0) by department.

under_performance = df[df['PerformanceRating'] < 3.0]
identify = under_performance.groupby('Department').size()
print("Underperformers by Department:")
print(identify)
print(f'No of underperformers:{len(under_performance)}')

# ### Q8.8: Projects Analysis

# #### Create a summary showing projects completed by department

summary = df.groupby('Department')['ProjectsCompleted'].agg(['sum','mean','count']).rename(columns=({'sum':'Total','mean':'Avg','count':'Count'}))
print("Projects completed by Departments:")
print(summary)

# ### Q8.9: Export Report

# #### Export a comprehensive HR summary to hr_summary_report.csv.

hr_summary = df.groupby('Department').agg(
    {'Salary':['sum','mean','count'],
     'PerformanceRating':'mean',
     'EmployeeID':'count',
    })
hr_summary_to_csv = hr_summary.to_csv('hr_summary_report.csv',index=False)
print("Exported the Hr summary CSV file.")
print(hr_summary)

# ### Q8.10: Visualizations

# #### Create visualizations for salary distribution and performance ratings.

import matplotlib.pyplot as plt

import seaborn as sns

# Create figure
fig, (ax1,ax2) = plt.subplots(1,2, figsize=(12,6))

# Create box plot
sns.boxplot(data = df , x='Department',y='Salary', ax= ax1,palette='RdBu')
ax1.set_xlabel('Department',fontsize=12)
ax1.set_ylabel('Salary',fontsize=12)
ax1.set_title('Salary Distribution',fontsize=12,fontweight='bold')

# Create Violin Plot
sns.violinplot(data = df , x='Department',y='PerformanceRating', ax= ax2,palette='dark')
ax2.set_xlabel('Department',fontsize=12)
ax2.set_ylabel('PerformanceRating',fontsize=12)
ax2.set_title('PeformanceRating Distribution',fontsize=12,fontweight='bold')

plt.suptitle('Salary Distribution and performance Rating',fontsize=14,fontweight='bold')
plt.tight_layout()
plt.show()