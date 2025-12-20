# ## ASSIGNMENT 3: Introduction to Pandas

# ### Dataset: assignment3_student_scores.csv

# ### Q3.1: Data Exploration

# #### Load the student scores dataset and display its shape, info, and basic statistics.

import pandas as pd # importing pandas module
df = pd.read_csv('assignment3_student_scores(in).csv') # load the dataset
print("These are the data in this dataset:") # display the title
df # display the result
print(f'Shape of this dataframe: {df.shape}') # display the shape of this dataframe
print(f'We have this data consits of no.of rows: {df.shape[0]}  and no.of columns: {df.shape[1]}') # display the no.of rows andno.of columns 
print("Information of this data here:") # display the header
df.info() # display the no.of columns,datatype and nullvalues
print("Basic statistics of this dataframe:")
df.describe()

# Q3.1: Data Exploration
import pandas as pd # importing pandas module
df = pd.read_csv('assignment3_student_scores(in).csv') # load the dataset
print("These are the data in this dataset:") # display the title
df # display the result
print(f'Shape of this dataframe: {df.shape}') # display the shape of this dataframe
print(f'We have this data consits of no.of rows: {df.shape[0]}  and no.of columns: {df.shape[1]}') # display the no.of rows andno.of columns
print("Information of this data here:") # display the header
df.info() # display the no.of columns,datatype and nullvalues
print("Basic statistics of this dataframe:")
df.describe() # display the basic information like min,max,count.mean,median

# #### Q3.2: Average Score Calculation

# #### Calculate the average score across all subjects (Math, Science, English, History) for each student.

filtered_score = ['Math','Science','English','History'] #filter the columns
df['Avg_Score'] = df[filtered_score].mean(axis=1) # calculate the average and stored in one column
df['Avg_Score'] = round(df['Avg_Score'],1)
print("Calculated Average Score Each Student:") # print the header
df[['StudentID','Name', 'Math', 'Science', 'English', 'History', 'Avg_Score']].head(10) # display the results along with their name,id,subject_names

#Q3.2: Average Score Calculation

filtered_score = ['Math','Science','English','History'] #filter the columns
df['Avg_Score'] = df[filtered_score].mean(axis=1)  # calculate the average and stored in one column
df['Avg_Score'] = round(df['Avg_Score'],1) 
print("Calculated Average Score Each Student:") # print the header
df[['StudentID','Name', 'Math', 'Science', 'English', 'History', 'Avg_Score']].head(10) # display the results along with their name,id,subject_names

# ### Q3.3: Missing Value Handling

# #### Fill missing values in Math, Science, and English with their respective column means.

df['Math'].fillna(round(df['Math'].mean(),1), inplace=True) # replace the missing values with their mean value
df['Science'].fillna(round(df['Science'].mean(),1), inplace=True) # replace the missing values with their mean value
df['English'].fillna(round(df['English'].mean(),1), inplace=True) # replace the missing values with their mean value
print("Fill missing values after:") # display the header
print(f'Math Column Missing Value Count: {df['Math'].isnull().sum()}') # display the count of missing value
print(f'Science Column Missing Value Count: {df['Science'].isnull().sum()}') # display the count of missing value
print(f'English Column Missing Value Count: {df['English'].isnull().sum()}') # display the count of missing value

#Q3.3: Missing Value Handling

df['Math'].fillna(round(df['Math'].mean(),1), inplace=True) # replace the missing values with their mean value
df['Science'].fillna(round(df['Science'].mean(),1), inplace=True) # replace the missing values with their mean value
df['English'].fillna(round(df['English'].mean(),1), inplace=True) # replace the missing values with their mean value
print("Fill missing values after:") # display the header
print(f'Math Column Missing Value Count: {df['Math'].isnull().sum()}') # display the count of missing value
print(f'Science Column Missing Value Count: {df['Science'].isnull().sum()}') # display the count of missing value
print(f'English Column Missing Value Count: {df['English'].isnull().sum()}') # display the count of missing value

# ### Q3.4: Filtering by Performance

# #### Filter students with an average score above the overall mean and display their names and average scores.

above_mean_students = df[df['Avg_Score'] > df['Avg_Score'].mean()]
print(f'Overall_mean : {df['Avg_Score'].mean():.2f}\n')
print(f'Students Above Average: {len(above_mean_students)}')
print(above_mean_students[['Name','Avg_Score']])

# Q3.4: Filtering by Performance
above_mean_students = df[df['Avg_Score'] > df['Avg_Score'].mean()]
print(f'Overall_mean : {df['Avg_Score'].mean():.2f}\n')
print(f'Students Above Average: {len(above_mean_students)}')
print(above_mean_students[['Name','Avg_Score']])

# ### Q3.5: Label-based Selection (loc)

# #### Use loc[] to update a specific student's Math score (e.g., StudentID 1001) to a new value.

df.loc[df['StudentID'] == 1001, 'Math'] = 95 # custom changes
df.loc[df['StudentID'] == 1002, 'Math'] = 89 # custom changes
df.loc[df['StudentID'] == 1003, 'Math'] = 93 # custom changes
print("Updated Math score for Students:")
print(df.loc[df['StudentID'] == 1001, ['Name', 'Math', 'Avg_Score']])
print(df.loc[df['StudentID'] == 1002, ['Name', 'Math', 'Avg_Score']])
print(df.loc[df['StudentID'] == 1003, ['Name', 'Math', 'Avg_Score']]) # display the changed records

# ### Q3.6: Integer-based Selection (iloc)

# #### Use iloc[] to select the first 10 rows and the last 3 columns, display them.

integer_selection = df.iloc[:10,-3:] # filter 10 rows and 3 columns
print("First 10 Records:")
print(integer_selection.head(10)) # display the records

# ###  Q3.7: Sorting

# #### Sort students by AttendancePercentage in descending order and display the top 5.

sort = df.sort_values(by='AttendancePercentage',ascending = False).nlargest(5,'AttendancePercentage')
print(f'Top 5 Students:\n{sort[['StudentID','Name','Grade','AttendancePercentage']]}')

# ### Q3.8: Conditional Column Creation

# #### Create a new column 'PassFail' where 'Pass' if average score > 50, else 'Fail'.

df['PassFail'] = df['Avg_Score'].apply(lambda avg: 'Pass' if avg > 50 else 'Fail')
print("Pass/Fail Distribtion")
print(df['PassFail'].value_counts())
print("First 10 Students with Pass/Fail:")
df[['StudentID','Name','AttendancePercentage','PassFail']].head(10)

# ### Q3.9: Duplicate Removal

# #### Identify and remove duplicate rows (if any) based on all columns.

duplicates = df.duplicated().sum() # find the duplicates
print(f'No of duplicates in this data: {duplicates}') # Count of the duplicates

# 1. Drop the duplicates
drop_duplicates = df.drop_duplicates() #  Drop the duplicates
print(f'No. of rows before: {len(df)} and rows dropped: {len(df) - len(drop_duplicates)}') # Corrected print statement using an f-string

# ### Q3.10: Data Export

# ### Export the cleaned and processed data to student_scores_cleaned.csv.

score_to_csv = df.to_csv(' student_scores_cleaned.csv',index = False)
print("Data exported to 'student_scores_cleaned.csv'")

# ### Challenge Extension

# #### Challenge 1: Create a grade categorization (A, B, C, D, F) based on average scores

df['Grade_Categorize'] = df['Avg_Score'].apply(lambda x: 'A' if x >= 90 else 
              'B' if x >= 80 else 
              'C' if x >= 70 else 
              'D' if x >= 60 else 'F') # using lambda function with apply condition
category_avg = df[['Grade_Categorize','Avg_Score']]
print("First 10 Records:")
category_avg.head(10) # display the result

# #### Challenge 2: Calculate z-scores for each subject and identify outlier students

import numpy as np
z_scores =(df[filtered_score] - df[filtered_score].mean()) / df[filtered_score].std() # find z_score
outlier = np.abs(z_scores) > 2 # find the outlier
result = pd.concat([df["Name"], z_scores], axis=1) # concat with students
df["Is_Outlier"] = outlier.any(axis=1)
print(f'Calculated Z_Score:\n{z_scores}')
print(f'Outliers:\n{outlier}')
print(f'Outlier Students:\n{result}') # display the result
print(f'Identified outlier students:\n{df["Is_Outlier"]}') # display the result

# #### Challenge 3: Generate a summary report by Grade (A, B, C, etc.) showing statistics.

print("Summary report by Grade:") # display the header
print("-"*40) # display the line
summary = df.groupby('Grade')['Avg_Score'].describe().round(2) # get the information of grades by avg_scores
summary # display the result