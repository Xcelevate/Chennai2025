# Generated from: Assignment-8.ipynb
# Converted at: 2025-12-20T10:52:18.407Z
# Next step (optional): refactor into modules & generate tests with RunCell
# Quick start: pip install runcell

# # ASSIGNMENT 8: HR Employee Analytics


# ## Questions


# ### Q8.1: Department Headcount


# #### Load HR data and display department-wise employee count.


import pandas as pd

df=pd.read_csv('assignment8_hr_employee_data(in).csv')

df

Dep_count=df.value_counts('Department')
Dep_count

# ### Q8.2: Salary Analysis


# #### Calculate average salary by department and designation.


avg_salary = df.groupby(['Department','Designation'])['Salary'].mean().round(2)
avg_salary


# ### Q8.3: Location Analysis


# #### Group employees by location and calculate total and average salary.


emp_location=df.groupby('Location')['Salary'].agg(['sum','mean']).round(2)
emp_location

# ### Q8.4: Pivot Table


# #### Create a pivot table showing department vs designation with salary totals.


pivot=pd.pivot_table(df,index='Department',columns='Designation',values='Salary',aggfunc='sum')

pivot

# ### Q8.5: Service Years


# #### Add a calculated column for service years (current year - JoiningYear).


df['ServiceYears']=2024-df['JoiningYear']
df[['EmployeeID', 'EmployeeName', 'JoiningYear', 'ServiceYears']].head()

# ### Q8.6: Top Earners


# #### Find top 10 employees by salary and display their details


top_10=df.nlargest(10,'Salary').reset_index()
top_10

# ### Q8.7: Performance Analysis


# #### Identify underperformers (PerformanceRating < 3.0) by department.


underperformers=df[df['PerformanceRating'] <3.0].groupby('Department').size()
underperformers

# ### Q8.8: Projects Analysis


# #### Create a summary showing projects completed by department.


summary_project=df.groupby('Department')['ProjectsCompleted'].agg(['sum','mean','count']).round(2)
summary_project

# ### Q8.9: Export Report


# #### Export a comprehensive HR summary to hr_summary_report.csv.


hr_report = df.groupby('Department', as_index=False).agg(
    AvgSalary=('Salary', 'mean'),
    TotalSalary=('Salary', 'sum'),
    MinSalary=('Salary', 'min'),
    MaxSalary=('Salary', 'max'),
    AvgPerformance=('PerformanceRating', 'mean'),
    TotalProjects=('ProjectsCompleted', 'sum'),
    EmployeeCount=('EmployeeID', 'count')
).round(2)
hr_report

hr_report.to_csv('hr_summary_report.csv',index=False)

# ### Q8.10: Visualizations


# #### Create visualizations for salary distribution and performance ratings.


import matplotlib.pyplot as plt
import seaborn as sns

fig,(ax1,ax2)=plt.subplots(1,2,figsize=(12,6))

# Salary distribution by department
sns.boxplot(data=df, x='Department', y='Salary', ax=ax1, palette='coolwarm',hue='Department')
ax1.set_title('Salary Distribution by Department', fontweight='bold')
ax1.set_ylabel('Salary ($)')

# Performance rating by location
sns.violinplot(data=df, x='Location', y='PerformanceRating', ax=ax2, palette='Set2',hue='Location')
ax2.set_title('Performance Rating by Location', fontweight='bold')
ax2.set_ylabel('Performance Rating')
plt.tight_layout()
plt.show()