# Generated from: assignment_3_pandas.ipynb
# Converted at: 2025-12-20T11:34:23.117Z
# Next step (optional): refactor into modules & generate tests with RunCell
# Quick start: pip install runcell

# ## ASSIGNMENT 3: Introduction to Pandas


# ### Q3.1: Data Exploration


import pandas as pd
import numpy as np

df=pd.read_csv('assignment3_student_scores.csv')

df

print(df.shape)

df.info()

df.describe()

# ### Q3.2: Average Score Calculation


subjects=['Math','Science','History','English']

df['avg_score']=df[subjects].mean(axis=1)

df

# ### Q3.3: Missing Value Handling


df['Math']=df['Math'].fillna(df['Math'].mean())
df['Science']=df['Science'].fillna(df['Science'].mean())
df['English']=df['English'].fillna(df['English'].mean())


# ### Q3.4: Filtering by Performance


overall_mean=df['avg_score'].mean()

overall_mean

new_df=df[df['avg_score']>overall_mean]

new_df[['Name','avg_score']]

# ### Q3.5: Label-based Selection (loc)


df.loc[df['Name']=='Student_6','History']=77

# ### Q3.6: Integer-based Selection (iloc)


df.iloc[0:10,5:8]

# ### Q3.7: Sorting


df.sort_values('AttendancePercentage',ascending=False,inplace=True)

df.head(5)

# ### Q3.8: Conditional Column Creation


df['PassFail']=np.where(df['avg_score']>50,'Pass','Fail')

df

# ### Q3.9: Duplicate Removal


df.duplicated().sum()

# ### Q3.10: Data Export


df['avg_score']=round(df['avg_score'],2)
df['Math']=round(df['Math'],2)
df['Science']=round(df['Science'],2)
df['History']=round(df['History'],2)
df['English']=round(df['English'],2)

df.to_csv('student_scores_cleaned.csv',index=False)

# ## Challenge Extension


# ### Challenge 1: Create a grade categorization (A, B, C, D, F) based on average scores.


df['avg_grade']=df['avg_score'].apply(lambda score : 'A' if score >=85 else 'B' if score >=75 else 'C' if score >=65 else 'D' if score>=50 else 'E')

df

# ### Challenge 2: Calculate z-scores for each subject and identify outlier students.


df['Math_z'] = (df['Math'] - df['Math'].mean()) / df['Math'].std()
df['Science_z'] = (df['Science'] - df['Science'].mean()) / df['Science'].std()
df['English_z'] = (df['English'] - df['English'].mean()) / df['English'].std()
df['History_z'] = (df['History'] - df['History'].mean()) / df['History'].std()

df['Outlier'] = ((df['Math_z'].abs() > 3) |(df['Science_z'].abs() > 3) |(df['English_z'].abs() > 3))
print(df['Outlier'])

print(f" z-scores for math:\n {df['Math_z']}")
print(f" z-scores for Science:\n {df['Science_z']}")
print(f" z-scores for English:\n {df['English_z']}")
print(f" z-scores for History:\n {df['English_z']}")

# ### Challenge 3: Generate a summary report by Grade (A, B, C, etc.) showing statistics.


df.groupby('Grade')['avg_score'].describe()