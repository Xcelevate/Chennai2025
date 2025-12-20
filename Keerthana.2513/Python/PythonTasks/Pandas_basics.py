
Simple Series example
import pandas as pd
s=pd.Series(['keerthi','sanju','harini','kamsi'])
print(s)
0    keerthi
1      sanju
2     harini
3      kamsi
dtype: object
Simple DataFrame example
df=pd.DataFrame({'Name':['keerthi','sanju','harini','kamsi'],
                'Age':[21,14,22,22],
                'Salary':[50000, 60000, 70000,80000]})
print(df)
      Name  Age  Salary
0  keerthi   21   50000
1    sanju   14   60000
2   harini   22   70000
3    kamsi   22   80000
Creating Series
✅ 1. From a Python List
s = pd.Series([10, 20, 30, 40])
print(s)
0    10
1    20
2    30
3    40
dtype: int64
✅ 2. From a List WITH Custom Index
s=pd.Series([10,20,30],index=['Id1','Id2','Id3'])
print(s)
Id1    10
Id2    20
Id3    30
dtype: int64
✅ 3. From a Dictionary
s=pd.Series({'apple':50,'banana':30,'orange':25})
print(s)
apple     50
banana    30
orange    25
dtype: int64
Creating DataFrames
✅ 1. From a Dictionary of Lists
df=pd.DataFrame({'Name':['keerthi','sanju','harini','kamsi'],
                'Age':[21,14,22,22],
                'Salary':[50000, 60000, 70000,80000]})
print(df)
      Name  Age  Salary
0  keerthi   21   50000
1    sanju   14   60000
2   harini   22   70000
3    kamsi   22   80000
✅ 2. From a List of Dictionaries
## This format usually comes from APIs or JSON.
data=[{'Name':'keerthana','Age':21},{'Name':'Sanjana','Age':14}]
df=pd.DataFrame(data)
print(df)
        Name  Age
0  keerthana   21
1    Sanjana   14
✅ 3. From a Dictionary of Series
s1=pd.Series([100,200,300],index=['a','b','c'])
s2=pd.Series([10,20,30],index=['a','b','c'])
df=pd.DataFrame({'Sales':s1,'Profit':s2})
print(df)
   Sales  Profit
a    100      10
b    200      20
c    300      30
✅ 4. From a Numpy Array
import numpy as np
arr=np.array([[1,2,3],[7,8,9],[4,5,6]])
df=pd.DataFrame(arr,columns=['A','B','C'])
print(df)
   A  B  C
0  1  2  3
1  7  8  9
2  4  5  6
✅ 5. From a CSV File
df=pd.read_csv("car.csv")
🎯 Mini Excercise(learn)
Lesson 4: Understanding DataFrame Structure
df=pd.DataFrame({'Student':['Keerthana','Sanjana','Harini'],
                'Marks':[78,68,95],
                'City':['UK','Bangkok','Paris']})
print(df)            ## print full data frame
     Student  Marks     City
0  Keerthana     78       UK
1    Sanjana     68  Bangkok
2     Harini     95    Paris
print(df['Student'])  ##print only student column
0    Keerthana
1      Sanjana
2       Harini
Name: Student, dtype: object
print(df.head(2))    ##print 1st two rows
     Student  Marks     City
0  Keerthana     78       UK
1    Sanjana     68  Bangkok
print(df.shape)     ##print no of rows&columns
(3, 3)
print(df.columns)   ##print the list of column names
Index(['Student', 'Marks', 'City'], dtype='object')
print(df.dtypes)    ##print data types of each column
Student    object
Marks       int64
City       object
dtype: object
df.info()  ##print overview of data set
<class 'pandas.core.frame.DataFrame'>
RangeIndex: 3 entries, 0 to 2
Data columns (total 3 columns):
 #   Column   Non-Null Count  Dtype 
---  ------   --------------  ----- 
 0   Student  3 non-null      object
 1   Marks    3 non-null      int64 
 2   City     3 non-null      object
dtypes: int64(1), object(2)
memory usage: 204.0+ bytes
df.describe()   ##print summary statistics
Marks
count	3.000000
mean	80.333333
std	13.650397
min	68.000000
25%	73.000000
50%	78.000000
75%	86.500000
max	95.000000
Lesson 5: Selecting Columns and Rows
df.iloc[1]   ## select row by index
Student    Sanjana
Marks           68
City       Bangkok
Name: 1, dtype: object
df.iloc[0:2]
Student	Marks	City
0	Keerthana	78	UK
1	Sanjana	68	Bangkok
df.iloc[0:3,0:2]   ##select specific rows&columns
Student	Marks
0	Keerthana	78
1	Sanjana	68
2	Harini	95
df[df['Marks']>70]     ##select students with marks above 70
Student	Marks	City
0	Keerthana	78	UK
2	Harini	95	Paris
df[df['City']=='Paris']  #Student from paris
Student	Marks	City
2	Harini	95	Paris
df[(df['Marks']>70) & (df['City']=='UK')] #Multiple conditions (AND)
Student	Marks	City
0	Keerthana	78	UK
df[(df['Marks']>70) & (df['City']=='UK')] #OR condition
Student	Marks	City
0	Keerthana	78	UK
🎯 Your Exercise(Practice)
df['City']     #Select only the “City” column
0         UK
1    Bangkok
2      Paris
Name: City, dtype: object
df.head(2)     #Select the first two rows
Student	Marks	City
0	Keerthana	78	UK
1	Sanjana	68	Bangkok
df[['Student','Marks']]    #Select Student & Marks columns
Student	Marks
0	Keerthana	78
1	Sanjana	68
2	Harini	95
df[df['Marks']>80]    #Filter students with marks above 80
Student	Marks	City
2	Harini	95	Paris
df[df['City']=='Bangkok']
Student	Marks	City
1	Sanjana	68	Bangkok
Lesson 6: Adding, Updating, and Deleting Columns & Rows
df['Status']=['Pass','Pass','Pass'] #Adding a New Column
df['Result']=df['Marks']>=70  #Adding a Calculated Column
print(df)
     Student  Marks     City Status  Result
0  Keerthana     78       UK   Pass    True
1    Sanjana     68  Bangkok   Pass   False
2     Harini     95    Paris   Pass    True
df.drop('Status',axis=1,inplace=True) #Deleting a Column,axis=1(column)
print(df)
     Student  Marks     City  Result
0  Keerthana     78       UK    True
1    Sanjana     68  Bangkok   False
2     Harini     95    Paris    True
df.drop('Result',axis=1,inplace=False) #inplace=False mean it doesn't directly delete in df
Student	Marks	City
0	Keerthana	78	UK
1	Sanjana	68	Bangkok
2	Harini	95	Paris
print(df) # After drop it is there in df because of false
     Student  Marks     City  Result
0  Keerthana     78       UK    True
1    Sanjana     68  Bangkok   False
2     Harini     95    Paris    True
##Delete a row
df.drop(1,axis=0,inplace=False)    #based on index value,axis=0(row)
Student	Marks	City	Result
0	Keerthana	78	UK	True
2	Harini	95	Paris	True
print(df)
     Student  Marks     City  Result
0  Keerthana     78       UK    True
1    Sanjana     68  Bangkok   False
2     Harini     95    Paris    True
df.loc[2]=['Meena',88,'London',True]  #Adding a New Row it overrrides so made changes
print(df)
     Student  Marks     City  Result
0  Keerthana     78       UK    True
1    Sanjana     68  Bangkok   False
2      Meena     88   London    True
3      Meena     88   London    True
df.loc[2]=['Harini',95,'Paris',True]
print(df)
     Student  Marks     City  Result
0  Keerthana     78       UK    True
1    Sanjana     68  Bangkok   False
2     Harini     95    Paris    True
3      Meena     88   London    True
df.rename(columns={'City':'Location'})
