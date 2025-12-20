# ## ASSIGNMENT 8: HR Employee Analytics


# ### Q8.1: Department Headcount
# #### Load HR data and display department-wise employee count


import pandas as pd
import seaborn as sns
import matplotlib.pyplot as plt

df = pd.read_csv('assignment8_hr_employee_data(in).csv')
df

emp_count = df.groupby('Department')['EmployeeID'].count()
emp_count

# ### Q8.2: Salary Analysis
# #### Calculate average salary by department and designation.


avg_salary = round(df.groupby(['Department','Designation'])['Salary'].mean(),2)
avg_salary

# ### Q8.3: Location Analysis
# #### Group employees by location and calculate total and average salary.


emp_location = round(df.groupby('Location')['Salary'].agg(['sum','mean']).reset_index(),2)
emp_location

# ### Q8.4: Pivot Table
# #### Create a pivot table showing department vs designation with salary totals.


pivot_table = pd.pivot_table(df, index='Department', columns='Designation', values='Salary', aggfunc='sum').reset_index()
pivot_table

# ### Q8.5: Service Years
# #### Add a calculated column for service years (current year - JoiningYear).


df['Service_Years']= 2024-df['JoiningYear']

df

# ### Q8.6: Top Earners
# #### Find top 10 employees by salary and display their details.


Top_earners = df.nlargest(10,'Salary')[['EmployeeID', 'EmployeeName', 'Department', 'Salary', 'PerformanceRating', 'ProjectsCompleted', 'Location', 'Service_Years']]

Top_earners

# ### Q8.7: Performance Analysis
# #### Identify underperformers (PerformanceRating < 3.0) by department


under = df[df['PerformanceRating']<3.0]
under_performers = under.groupby('Department').size()
under_performers

# ### Q8.8: Projects Analysis
# #### Create a summary showing projects completed by department.


summary = df.groupby('Department')['ProjectsCompleted'].sum().reset_index()
summary

# ### Q8.9: Export Report
# #### Export a comprehensive HR summary to hr_summary_report.csv.


df

hr_summary = round(df.groupby(['Department','Designation']).agg({'Salary':['sum', 'min', 'max', 'mean'], 'PerformanceRating':'mean', 'ProjectsCompleted':'sum', 'EmployeeID':'count', 'Service_Years':'median'}),2).reset_index()

hr_summary

hr_summary.to_csv('hr_summary_report.csv')

# ### Q8.10: Visualizations
# #### Create visualizations for salary distribution and performance ratings.



plt.boxplot(data=df, x='Salary')
plt.title("salary distribution and performance ratings")
plt.xlabel('Salary')
plt.ylabel('PerformanceRating')
plt.show()

sns.boxplot(x='Department', y='Salary', data=df)
plt.show()

sns.violinplot(data=df, x='Location', y='PerformanceRating')
plt.show()

fig, (ax1,ax2)=plt.subplots(1, 2, figsize=(14,5))
sns.boxplot(x='Department', y='Salary', data=df, ax=ax1, palette='Set1')
ax1.set_title('Salary Distribution by Department', fontweight='bold')
ax1.set_ylabel('Salary ($)')

sns.violinplot(data=df, x='Location', y='PerformanceRating', ax=ax2, palette='Set2')
ax2.set_title('Performance Rating by Location', fontweight='bold')
ax2.set_ylabel('Performance Rating')
plt.tight_layout()
plt.show()