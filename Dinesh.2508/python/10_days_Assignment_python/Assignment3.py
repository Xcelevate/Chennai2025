import numpy as np 
import pandas as pd

#### Load the student scores dataset and display its shape, info, and basic statistics.
df = pd.read_csv('assignment3_student_scores.csv')
print('Shape',df.shape)
print('Dataset Info')
print(df.info())
print('Basic Information')
print(df.describe())

## Q3.2: Average Score Calculation
#### Calculate the average score across all subjects (Math, Science, English, History) for each student.
sub_columns = ['Math','Science','English','History']
df['AvgScore'] = df[sub_columns].mean(axis = 1)
print ('Students average scores')
print(df[['Name','Math','Science','English','History','AvgScore']])

## Q3.3: Missing Value Handling
#### Fill missing values in Math, Science, and English with their respective column means.
df['Math'].fillna(df['Math'].mean(),inplace = True)
df['Science'].fillna(df['Science'].mean(),inplace = True)
df['English'].fillna(df['English'].mean(),inplace = True)
print(df[sub_columns].isnull().sum())

#### To write all mean values of each subject 
df[sub_columns] = df[sub_columns].fillna(df[sub_columns].mean())
print("Missing values after filling:")
print(df[sub_columns].isnull().sum())

## Q3.4: Filtering by Performance
#### Filter students with an average score above the overall mean and display their names and average scores.
df['AvgScore'] = df[sub_columns].mean(axis = 1)
overall_mean = df['AvgScore'].mean()
top_students = df[df['AvgScore'] > overall_mean]
print(top_students[['Name','AvgScore']].sort_values('AvgScore',ascending = False))

## Q3.5: Label-based Selection (loc)
#### Use loc[] to update a specific student's Math score (e.g., StudentID 1001) to a new value.
student_id = 1007
df.loc[df['StudentID'] == student_id, 'English'] = 99
print(f'Updated English score for StudentID {student_id}:')
print(df.loc[df['StudentID'] == student_id, ['Name','English']])

## Q3.6: Integer-based Selection (iloc)
#### Use iloc[] to select the first 10 rows and the last 3 columns, display them.
smallset = df.iloc[:10,-3:]
print('First 10 Rows, Last 3 Columns')
print(smallset)

## Q3.7: Sorting
#### Sort students by AttendancePercentage in descending order and display the top 5
sorted_students =df.sort_values("AttendancePercentage", ascending=False)
top5 = sorted_students.head(5)
print(top5)

## Q3.8: Conditional Column Creation
#### Create a new column 'PassFail' where 'Pass' if average score > 50, else 'Fail'
df["PassFail"] = np.where(df["AvgScore"] > 50, "Pass", "Fail")
print("Pass/Fail Distribution:")
print(df["PassFail"].value_counts())
print("\nSample with Pass/Fail:")
print(df[["Name", "AvgScore", "PassFail"]].head(10))

## Q3.9: Duplicate Removal
#### Identify and remove duplicate rows (if any) based on all columns
duplicate = df.duplicated().sum()
duplicate
df_no_dup = df.drop_duplicates()
cleaneddf = df.drop_duplicates(inplace=True)



## Q3.10: Data Export
#### Export the cleaned and processed data to student_scores_cleaned.csv
df.to_csv("student_scores_cleaned.csv", index=False)

## Challenge Extension
#### Challenge 1: Create a grade categorization (A, B, C, D, F) based on average scores.
marks = [
    df["AvgScore"] >= 90,
    df["AvgScore"] >= 80,
    df["AvgScore"] >= 70,
    df["AvgScore"] >= 60,
]

rank = ["A", "B", "C", "D"]

df["Grade"] = np.select(marks, rank, default="F")
df

#### Challenge 2: Calculate z-scores for each subject and identify outlier students.




# ### Challenge 3: Generate a summary report by Grade (A, B, C, etc.) showing statistics
grade_summary = df.groupby("Grade")[["Math", "Science", "English", "AvgScore"]].describe()
print(grade_summary)
grade_summary = (
    df.groupby("Grade")
      .agg(
          count=("StudentID", "count"),
          avg_score_mean=("AvgScore", "mean"),
          avg_score_min=("AvgScore", "min"),
          avg_score_max=("AvgScore", "max"),
          math_mean=("Math", "mean"),
          science_mean=("Science", "mean"),
          english_mean=("English", "mean"),
      )
      .sort_index()
)

print(grade_summary)