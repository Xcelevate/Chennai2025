import numpy as np 
import pandas as pd 
import matplotlib.pyplot as plt
import seaborn as sns 


df = pd.read_csv('assignment6_customer_analytics.csv')
df

## Q6.1: Histogram with KDE
#### Create a histogram with KDE showing the distribution of customer ages using Seaborn.
plt.figure(figsize = (8,5))
sns.histplot(data = df, x ='Age',kde = True,bins = 20)
plt.title('Distribution of Customer Ages')
plt.xlabel('Age')
plt.ylabel('Count')
plt.show()

## Q6.2: Count Plot
#### Create a count plot showing the number of customers per region.
plt.figure (figsize = (10,8))
sns.countplot(data = df , x = 'Region')
plt.xlabel('Region')
plt.ylabel('Number of Customers')
plt.title('Number of Customers per Region')
plt.tight_layout()
plt.show()

## Q6.3: Scatter Plot with Hue
#### Create a scatter plot with Age vs Income, colored by Region using Seaborn.
plt.figure (figsize =(12,6))
sns.scatterplot(data = df, x = 'Age',y = 'Income',hue = 'Region')
plt.title ('Age Vs Income by Region')
plt.xlabel('Age')
plt.ylabel('Income')
plt.legend(title = 'Region')
plt.tight_layout()
plt.show()

## Q6.4: Box Plot
#### Create a box plot showing the distribution of PurchaseCount across regions
plt.figure(figsize = (12,6))
sns.boxplot(data= df , x = 'Region',y = 'PurchaseCount')

plt.title ('Purchase Count Distribution by Region')
plt.xlabel('Region')
plt.ylabel('Purchase Count')
plt.tight_layout()
plt.show()


## Q6.5: Heatmap
#### Create a heatmap showing correlations between numeric columns
numeric_df = df[['Age','Income','PurchaseCount','AvgOrderValue','CustomerRating']]
corr = numeric_df.corr()
plt.figure (figsize = (10,6))
sns.heatmap(corr, annot = True,cmap = 'coolwarm',fmt = '.2f')
plt.title('Correlation Between Numeric Columns')
plt.tight_layout()
plt.show()

## Q6.6: Bar Plot with CI
#### Create a bar plot showing average CustomerRating by Category with confidence intervals.
plt.figure(figsize = (8,5))
sns.barplot(data = df, x = 'Category',y = 'CustomerRating',ci ='sd')
plt.xlabel('Category')
plt.ylabel('Average Customer Rating')
plt.title('Average Customer Rating by Category (CI)')
plt.tight_layout()
plt.show()

## Q6.7: Pair Plot
#### Create a pair plot for Age, Income, PurchaseCount, CustomerRating colored by Region.
sns.pairplot(data = df,
             vars = ['Age','Income','PurchaseCount','CustomerRating'],hue = 'Region',diag_kind = 'kde')
plt.suptitle('Pair Plot of Age , Income,PurchaseCount,and CustomerRating by Region')
plt.show()

## Q6.8: Violin Plot
#### Create a violin plot showing the distribution of AvgOrderValue by Region
plt.figure(figsize=(8,5))
sns.violinplot(data = df,x = 'Region', y = 'AvgOrderValue')
plt.title('Distribution of Avg Order Value by Region')
plt.xlabel('Region')
plt.ylabel('Average Order Value')
plt.tight_layout()
plt.show()

## Q6.9: Clustermap
#### Create a clustermap (hierarchical heatmap) of customer metrics
numeric_df = df[['Age','Income','PurchaseCount','AvgOrderValue','CustomerRating']]
sns.clustermap(numeric_df.corr(),cmap = 'coolwarm',center = 0,annot = True,fmt = '.2f')
plt.suptitle('Clustermap of Customer behaviour')
plt.show()

## Q6.10: Joint Plot
#### Create a joint plot showing Age vs CustomerRating relationship with marginal distributions
sns.jointplot(data = df,x = 'Age',y = 'CustomerRating',kind = 'scatter',height = 6)
plt.suptitle('Age vs Customer Rating ')
plt.show()

## Challenge Extension
### Challenge 1: Create a custom color palette and apply to multiple plots.
sns.set_palette(['#1f77b4', '#ff7f0e', '#2ca02c', '#d62728'])  
sns.countplot(data=df, x='Region')
plt.show()

sns.scatterplot(data=df, x='Age', y='Income', hue='Region')
plt.show()

sns.violinplot(data=df, x='Region', y='AvgOrderValue')
plt.show()


### Challenge 2: Use FacetGrid for complex multi-variable analysis.



matrix = sns.FacetGrid(df,col = 'Region',height =4)
matrix.map_dataframe(sns.scatterplot, x = 'Age', y = 'Income')
matrix.add_legend()
plt.show()

### Challenge 3: Create regression plots with confidence bands.
plt.figure (figsize =(6,4))
sns.regplot(data = df,x = 'Age',y = 'Income', ci = 95)
plt.title('Regression of Income on Age ')
plt.tight_layout()
plt.show()
