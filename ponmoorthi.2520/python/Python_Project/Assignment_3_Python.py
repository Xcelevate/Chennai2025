# Generated from: Assignment_3_Python.ipynb
# Converted at: 2025-12-20T08:54:18.026Z
# Next step (optional): refactor into modules & generate tests with RunCell
# Quick start: pip install runcell

import pandas as pd
import numpy as np

df=pd.read_csv("assignment3_student_scores(in).csv")

df

# ### Q3.1: Data Exploration
# #### Load the student scores dataset and display its shape, info, and basic statistics.
# #### Hint: Use .shape, .info(), .describe()


df.shape

df.info()

df.describe()

# ### Q3.2: Average Score Calculation
# #### Calculate the average score across all subjects (Math, Science, English, History) for each student.
# #### Hint: Create new column using .mean(axis=1) on subject column


df['avg_score']=df[['Math','Science','English','History']].mean(axis=1)


df['avg_score'].head(10)

df.head(10)

# ### Q3.2: Average Score Calculation
# #### Fill missing values in Math, Science, and English with their respective column means.
# #### Hint: Use .fillna() with df['Column'].mean()


df.isnull().sum()

df['Math'].fillna(df['Math'].mean(), inplace=True)

df['Science'].fillna(df['Science'].mean(), inplace=True)

df['English'].fillna(df['English'].mean(), inplace=True)

df['Math'].isnull().sum()
df['Science'].isnull().sum()
df['English'].isnull().sum()

# ### Q3.4: Filtering by Performance
# #### Filter students with an average score above the overall mean and display their names and averagescores.
# #### Hint: Use Boolean indexing with comparison to overall mean


avg=df['avg_score'].mean()

overall=df[df['avg_score']>avg]

overall.sort_values(by='avg_score',ascending=False).head()

# ### Q3.5: Label-based Selection (loc)
# #### Use loc[] to update a specific student's Math score (e.g., StudentID 1001) to a new value.
# #### Hint: df.loc[df['StudentID'] == 1001, 'Math'] = new_value


df.loc[df['StudentID']==1001,'Math']==1070
print(df.loc[df['StudentID'] == 1001, ['Name', 'Math', 'avg_score']])

# ### Q3.6: Integer-based Selection (iloc)
# #### Use iloc[] to select the first 10 rows and the last 3 columns, display them.
# #### Hint: df.iloc[0:10, -3:]


loc=df.iloc[0:10, -3:].head(10)
loc

# ### Q3.7: Sorting
# #### Sort students by AttendancePercentage in descending order and display the top 5.
# #### Hint: Use .nlargest() or .sort_values() with 
# 


attendance=df['AttendancePercentage'].nlargest(5)

attendance

# ### Q3.8: Conditional Column Creation ascending=False
# #### Create a new column 'PassFail' where 'Pass' if average score > 50, else 'Fail'.
# #### Hint: Use .apply() with a lambda function


df['PassFail'] = df['avg_score'].apply( lambda x: 'Pass' if x > 50 else 'Fail')

df['PassFail'].reset_index()

# ### Q3.9: Duplicate Removal
# #### Identify and remove duplicate rows (if any) based on all columns.
# #### Hint: Use .drop_duplicates() and .duplicated()


identify=df.duplicated().sum()
drop=df.drop_duplicates(inplace=True)

print(f"Identify duplicates : {identify} and drop duplictae : {len(df)}")

# ### Q3.10: Data Export
# #### Export the cleaned and processed data 
# #### Hint: Use .to_csv(index=False)


export=df.to_csv("assignment3_student_scores(in).csv",index=False)

export

# ## Challenge Extension
# ### Challenge 1: Create a grade categorization (A, B, C, D, F) based on average scores


def assign_grade(avg_score):
    if avg_score >= 90:
        return 'A'
    elif avg_score >= 80:
        return 'B'
    elif avg_score >= 70:
        return 'C'
    elif avg_score >= 60:
        return 'D'
    else:
        return 'F'

df['Grade'] = df['avg_score'].apply(assign_grade)

df['Grade'].reset_index()

# ### Challenge 2: 
# ### Calculate z-scores for each subject and identify outlier students


filtered=df[['Math','Science','English','History']]

z_scores = (df['avg_score'] - df['avg_score'].mean()) / df['avg_score'].std()
outlier = np.abs(z_scores) > 2
df["Is_Outlier"] = outlier
result = pd.concat([df["Name"], z_scores], axis=1)

print(f"Z_score {z_scores}")
print(f"Outlier {outlier}")
print(f"Result {result}")
print(df["Is_Outlier"])


# ### Challenge 3:
# #### Generate a summary report by Grade (A, B, C, etc.) showing statistics.


score= df.groupby('Grade')['avg_score'].describe().round(2)
score