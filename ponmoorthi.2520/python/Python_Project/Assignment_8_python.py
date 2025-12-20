# Generated from: Assignment_8_python.ipynb
# Converted at: 2025-12-20T08:55:46.885Z
# Next step (optional): refactor into modules & generate tests with RunCell
# Quick start: pip install runcell

import pandas as pd

# ### Q8.1: Department Headcount
# #### Load HR data and display department-wise employee count.
# #### Hint: value_counts() on Department column


df=pd.read_csv('assignment8_hr_employee_data(in).csv')

dept_count=df['Department'].value_counts()
dept_count

df

# ### Q8.2: Salary Analysis
# #### Calculate average salary by department and designation.
# #### Hint: groupby(['Department', 'Designation'])['Salary'].mean()


df.groupby(['Department','Designation']).agg({'Salary':'mean'})

# ### Q8.3: Location Analysis
# #### Group employees by location and calculate total and average salary.
# #### Hint: groupby Location with agg for sum and mean


loc_analysis=df.groupby('Location').agg({'Salary':['mean','sum']})

loc_analysis

# ### Q8.4: Pivot Table
# #### Create a pivot table showing department vs designation with salary totals.
# #### Hint: pd.pivot_table with values, index, columns
# 


pivot=pd.pivot_table(df,
                     index='Department',
                     columns='Designation',
                     values='Salary',
                     aggfunc='sum')

pivot

# ### Q8.5: Service Years
# #### Add a calculated column for service years (current year - JoiningYear).
# #### Hint: 2024 - JoiningYear


df['Service_year']=2024-df['JoiningYear']

year

# ### Q8.6: Top Earners
# #### Find top 10 employees by salary and display their details.
# #### Hint: nlargest(10, 'Salary')


top_emp=df.nlargest(10,'Salary')
top_10=top_emp[['EmployeeID', 'EmployeeName', 'Department', 'Salary']]

top_10

# ### Q8.7: Performance Analysis
# #### Identify underperformers (PerformanceRating < 3.0) by department.
# #### Hint: Filter and groupby


perform=df[df['PerformanceRating'] < 3.0]
underperform=perform.groupby('Department').size()
underperform

# ### Q8.8: Projects Analysis
# #### Create a summary showing projects completed by department.
# #### Hint: groupby Department and agg on ProjectsCompleted


df.groupby('Department').agg({'ProjectsCompleted':['sum','mean','count']})

# ### Q8.9: Export Report
# #### Export a comprehensive HR summary to hr_summary_report.csv.
# #### Hint: Multiple groupby operations


summary_report = df.groupby('Department').agg({'Salary': ['mean', 'sum', 'min', 'max'],
                                          'PerformanceRating': 'mean',
                                          'ProjectsCompleted': 'sum',
                                          'EmployeeID': 'count'
                                         })

summary_report

# ### Q8.10: Visualizations
# #### Create visualizations for salary distribution and performance ratings.
# #### Hint: boxplot and violin plot


import matplotlib.pyplot as plt
import seaborn as sns

fig, (ax1, ax2) = plt.subplots(1, 2, figsize=(12,4))
sns.boxplot(data=df, x='Department', y='Salary', ax=ax1, palette='Set3')
ax1.set_title('Salary Distribution by Department', fontweight='bold')
ax1.set_ylabel('Salary')

sns.violinplot(data=df, x='Location', y='PerformanceRating', ax=ax2, palette='Set1')
ax1.set_title('Performance Distribution by Performance', fontweight='bold')
ax1.set_ylabel('Performance')
plt.tight_layout()
plt.show()