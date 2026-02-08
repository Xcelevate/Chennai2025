# Generated from: assignment_8_hr_analytics.ipynb
# Converted at: 2025-12-20T11:31:20.217Z
# Next step (optional): refactor into modules & generate tests with RunCell
# Quick start: pip install runcell

# ## ASSIGNMENT 8: HR Employee Analytics


# ## Q8.1: Department Headcount


import pandas as pd

df=pd.read_csv('assignment8_hr_employee_data.csv')

df

dept_count=df.groupby('Department')['EmployeeID'].count().sort_values(ascending=False)
print(f" The department-wise employee count : {dept_count}")

# ## Q8.2: Salary Analysis


salary_analysis=df.groupby(['Department','Designation'])['Salary'].mean()

print("Average salary by department and designation:")
print(round(salary_analysis))

# ### Q8.3: Location Analysis


location_analysis=df.groupby('Location')['Salary'].agg(['sum','mean'])

print("The location based Analysis:")
print(round(location_analysis))

# ### Q8.4: Pivot Table


pivot=df.pivot_table(values='Salary',
                          index='Department',
                          columns='Designation',
                          aggfunc='sum')

print(pivot)

# ### Q8.5: Service Years


df['ServiceYears']=2024-df['JoiningYear']

df

# ### Q8.6: Top Earners


top_10_emp=df.sort_values('Salary',ascending=False).nlargest(10,'Salary')

top_10_emp

# ### Q8.7: Performance Analysis


under_performers=df[df['PerformanceRating']<3.0]

print("Based on the Performance Analysis the under performers are:")
print(under_performers)

# ### Q8.8: Projects Analysis


project_completed=df.groupby('Department')['ProjectsCompleted'].agg(['sum','mean','count'])

print("summary statistics of projects completed by department:")
print(project_completed)

# ### Q8.9: Export Report


hr_summary=round(df.groupby('Department').agg({'Salary':['sum','mean'],
                                'ProjectsCompleted':'count',
                                        'PerformanceRating':'count'}))

hr_summary.to_csv('hr_summary_report.csv')

print("Hr summary report exported")

# ### Q8.10: Visualizations


import matplotlib.pyplot as plt
import seaborn as sns

fig, (ax1, ax2) = plt.subplots(1, 2, figsize=(14, 5))
sns.violinplot(data=df,x='Department',y='Salary',palette='Set3',ax=ax1,hue='Department')
plt.title("Department wise salary distribution",fontsize=14,fontweight='bold')
ax1.set_title('Salary Distribution by Department', fontweight='bold')

sns.boxplot(data=df, x='Department', y='PerformanceRating', ax=ax2, palette='coolwarm')
plt.title("Department wise salary distribution",fontsize=14,fontweight='bold')
ax1.set_title('Salary Distribution by Department', fontweight='bold')


plt.tight_layout()
plt.show()