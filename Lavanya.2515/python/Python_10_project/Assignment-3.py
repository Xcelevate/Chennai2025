# Generated from: Assignment-3.ipynb
# Converted at: 2025-12-20T10:50:20.740Z
# Next step (optional): refactor into modules & generate tests with RunCell
# Quick start: pip install runcell

# # ASSIGNMENT 3: Introduction to Pandas


# ## Questions


# ### Q3.1: Data Exploration 


# #### Load the student scores dataset and display its shape, info, and basic statistics.


import pandas as pd

df=pd.read_csv('assignment3_student_scores(in).csv')
df

df.shape

df.info()

# df.describe()


# ### Q3.2: Average Score Calculation


# #### Calculate the average score across all subjects (Math, Science, English, History) for each student.


subject = df[['Math','Science','English','History']]
df['Average_Score']=round(subject.mean(axis=1),2)
df[['Name', 'Math', 'Science', 'English', 'History', 'Average_Score']].head()

# ### Q3.3: Missing Value Handling


# #### Fill missing values in Math, Science, and English with their respective column means.


df[['Math','Science','English']].isnull().sum()

df['Math']=round(df['Math'].fillna(df['Math'].mean()),2)
df['Science']=round(df['Science'].fillna(df['Science'].mean()),2)
df['English']=round(df['English'].fillna(df['English'].mean()),2)

df[['Math','Science','English']].isnull().sum()

# ### Q3.4: Filtering by Performance


# #### Filter students with an average score above the overall mean and display their names and average scores.


overall_mean = df['Average_Score'].mean()
overall_mean 

filter_student=df[df['Average_Score']>overall_mean][['Name','Average_Score']]
filter_student

# ### Q3.5: Label-based Selection (loc)


# #### Use loc[] to update a specific student's Math score (e.g., StudentID 1001) to a new value


 df.loc[df['StudentID'] == 1001, 'Math'] = 34
df[['StudentID','Math']].head()

# ### Q3.6: Integer-based Selection (iloc


# #### Use iloc[] to select the first 10 rows and the last 3 columns, display them.


df.iloc[0:10, -3:]

# ### Q3.7: Sorting


# #### Sort students by AttendancePercentage in descending order and display the top 5.


attendance=df.sort_values('AttendancePercentage',ascending=False)
attendance.head()

df.nlargest(5,'AttendancePercentage')

# ### Q3.8: Conditional Column Creation


# #### Create a new column 'PassFail' where 'Pass' if average score > 50, else 'Fail'.


df['PassFail']=df['Average_Score'].apply(lambda x: 'Pass' if x > 50 else 'Fail')

df.head()

# ### Q3.9: Duplicate Removal 


# #### Identify and remove duplicate rows (if any) based on all columns.


df.duplicated().sum()

# ### Q3.10: Data Export


# #### Export the cleaned and processed data to student_scores_cleaned.csv.


df.to_csv('student_scores_cleaned.csv',index=False)

# # Challenge Extension


# ### Challenge 1: Create a grade categorization (A, B, C, D, F) based on average scores


df['Grade']=df['Average_Score'].apply(lambda x: 'A' if x > 80 else
                                                'B' if x >= 70 else
                                                'C' if x >= 60 else
                                                'D' if x >= 50 else 'F')                                  

df[['Name','Average_Score','Grade']].head(10)

# ### Challenge 2: Calculate z-scores for each subject and identify outlier students.


import numpy as np

value=df[['Math','Science','English','History']]

z_scores = (df['Average_Score'] - df['Average_Score'].mean()) / df['Average_Score'].std()
outlier = np.abs(z_scores) > 2
df["Is_Outlier"] = outlier
result = pd.concat([df["Name"], z_scores], axis=1)

print(f"Z_score {z_scores}")
print(f"Outlier {outlier}")
print(f"Result {result}")
print(df["Is_Outlier"])

# ### Challenge 3: Generate a summary report by Grade (A, B, C, etc.) showing statistics.


df.groupby('Grade')['Average_Score'].describe()