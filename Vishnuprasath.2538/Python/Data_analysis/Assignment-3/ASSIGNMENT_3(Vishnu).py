# ## ASSIGNMENT 3: Introduction to Pandas


# ### Q3.1: Data Exploration
# #### Load the student scores dataset and display its shape, info, and basic statistics.


import pandas as pd
import numpy as np
df = pd.read_csv('assignment3_student_scores(in).csv')
df

df.shape

df.info()

df.describe()

# ### Q3.2: Average Score Calculation
# #### Calculate the average score across all subjects (Math, Science, English, History) for each student


df['Avg_Score'] = round(df[['Math', 'Science', 'English', 'History']].mean(axis = 1),2)
df['Avg_Score']

df

# ### Q3.3: Missing Value Handling
# #### Fill missing values in Math, Science, and English with their respective column means.


df.isnull().sum()

math_mean = round(df['Math'].mean(),1)
math_mean

science_mean = round(df['Science'].mean(),1)
science_mean

english_mean = round(df['English'].mean(),1)
english_mean

df['Math'].fillna(math_mean, inplace = True)

df['Science'].fillna(science_mean, inplace = True)

df['English'].fillna(english_mean, inplace = True)

df

df.isnull().sum()

# ### Q3.4: Filtering by Performance
# #### Filter students with an average score above the overall mean and display their names and average scores.


overall_mean = round(df['Avg_Score'].mean(),2)
overall_mean

above_mean = df[df['Avg_Score'] > overall_mean]
above_mean

above_mean[['Name','Avg_Score']].sort_values('Avg_Score', ascending = False)

# ### Q3.5: Label-based Selection (loc)
# #### Use loc[] to update a specific student's Math score (e.g., StudentID 1001) to a new value.


student_id = 1001
df.loc[df['StudentID'] == student_id, 'Math'] = 92

# df.isnull().sum()


df.loc[df['StudentID']==student_id, ['Name', 'Math', 'Avg_Score']]

# ### Q3.6: Integer-based Selection (iloc)
# #### Use iloc[] to select the first 10 rows and the last 3 columns, display them


df.iloc[0:10, -3:]

# ### Q3.7: Sorting
# #### Sort students by AttendancePercentage in descending order and display the top 5.


df.sort_values('AttendancePercentage', ascending = False)

# ### Q3.8: Conditional Column Creation
# #### Create a new column 'PassFail' where 'Pass' if average score > 50, else 'Fail'.


df['PassFail'] = np.where(df['Avg_Score']>50, 'Pass', 'Fail')

df

# ### Q3.9: Duplicate Removal
# #### Identify and remove duplicate rows (if any) based on all columns.


df.duplicated().sum()

df.drop_duplicates()

# ### Q3.10: Data Export
# #### Export the cleaned and processed data to student_scores_cleaned.csv.


df.to_csv('student_scores_cleaned.csv', index = False)

# ## Challenge Extension


# ### Challenge 1: Create a grade categorization (A, B, C, D, F) based on average scores.


def get_grade(Avg_Score):
    if Avg_Score >= 90:
        return 'A'
    if Avg_Score >= 75:
        return 'B'
    if Avg_Score >= 60:
        return 'C'
    if Avg_Score >= 50:
        return 'D'
    else:
        return 'F'

df['Grade_Category'] = df['Avg_Score'].apply(lambda x: get_grade(x))

df

# ### Challenge 2: Calculate z-scores for each subject and identify outlier students


subjects = ['Math', 'Science', 'English', 'History']
subjects

for col in subjects:
    df[col + '_z'] = df[col].apply(lambda x: (x-df[col].mean()) / df[col].std())

df['Outlier']=df[[col+'_z' for col in subjects]].apply(lambda row: any(abs(row)>3))

df

# ## Challenge 3: Generate a summary report by Grade (A, B, C, etc.) showing statistics.


grade_summary = df.groupby('Grade_Category').agg({'Avg_Score':['count', 'min', 'max'], 'AttendancePercentage':'mean'}).reset_index()

grade_summary