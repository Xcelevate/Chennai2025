
# ## ASSIGNMENT 6: Seaborn Advanced Visualization

# ### Dataset: assignment6_customer_analytics.csv

# ### Q6.1: Histogram with KDE

# #### Create a histogram with KDE showing the distribution of customer ages using Seaborn.

import seaborn as sns
import pandas as pd
import matplotlib.pyplot as plt
df = pd.read_csv('assignment6_customer_analytics(in).csv')
df.info()
# This graph is created use by kde-kernel Density estimate
plt.figure(figsize=(10, 6))
sns.set_style("darkgrid")
sns.histplot(data=df, x='Age', kde=True,bins=20 ,color='indigo')    
plt.xlabel('Customer Age', fontsize=12)
plt.ylabel('Frequency', fontsize=12)
plt.title('Distribution of Customer Ages', fontsize=14, fontweight='bold')
plt.tight_layout()
plt.show()

# ### Q6.2: Count Plot

# #### Create a count plot showing the number of customers per region

# Count Plot 
plt.figure(figsize=(12,6))
sns.countplot(data=df,x='Region',palette='bright')
plt.title('Customer Count Per Region',fontsize=14,fontweight ='bold')
plt.xlabel('Region',fontsize=12)
plt.ylabel('Customer Count',fontsize=12)
plt.show()

# ### Q6.3: Scatter Plot with Hue

# #### Create a scatter plot with Age vs Income, colored by Region using Seaborn.

# Create Scatter plot
plt.figure(figsize=(12,6))
sns.scatterplot (data = df, x='Age',y='Income',hue='Region', s= 100,alpha=1)
plt.xlabel('Age', fontsize=12)
plt.ylabel('Income',fontsize=12)
plt.title('Age Vs Income By Region', fontsize=14,fontweight='bold')
plt.legend()
plt.tight_layout()
plt.show()

# ### Q6.4: Box Plot

# #### Create a box plot showing the distribution of PurchaseCount across regions

# create Box plot
plt.figure(figsize=(12,6))
sns.boxplot(data=df,x='Region',y='PurchaseCount',palette='dark')
plt.xlabel('Region',fontsize=12)
plt.ylabel('PurchaseCount',fontsize=12)
plt.title('Distribution of PurchaseCount Across Regions',fontsize=14,fontweight='bold')
plt.tight_layout()
plt.show()

# ### Q6.5: Heatmap

# #### Create a heatmap showing correlations between numeric columns.

numeric_columns = df[['CustomerID','Age','Income','PurchaseCount','AvgOrderValue','CustomerRating','YearsAsCustomer']]
corr = numeric_columns.corr()
plt.figure(figsize=(12,6))
sns.heatmap(corr,annot=True,fmt='.2f',cmap='RdBu',center=0,square=True,lw=1)
plt.title('Correlation Matrix of Numeric Data', fontsize=14, fontweight='bold')
plt.tight_layout()
plt.show()

# ### Q6.6: Bar Plot with CI

# #### Create a bar plot showing average CustomerRating by Category with confidence intervals

plt.figure(figsize=(12,6))
sns.barplot(x='Category',y='CustomerRating',data=df,ci=95,palette='bright')
plt.xlabel('Category',fontsize=12)
plt.ylabel('CustomerRating',fontsize=12)
plt.title('Bar plot with Confidence intervels',fontsize=14,fontweight='bold')
plt.tight_layout()
plt.show()

# ### Q6.7: Pair Plot

# #### Create a pair plot for Age, Income, PurchaseCount, CustomerRating colored by Region.

# create Pair Plot
sns.pairplot(
    df,
    vars=['Age', 'Income', 'PurchaseCount', 'CustomerRating'],
    hue='Region',
    diag_kind='kde'
)
plt.suptitle('Pair plot for Distribution of Avergae Value',fontsize=14,fontweight='bold')
plt.show()

# ### Q6.8: Violin Plot

# #### Create a violin plot showing the distribution of AvgOrderValue by Region.

# create violin plot
sns.violinplot(x='Region',y='AvgOrderValue',data=df,cmap='coolwarm',inner='quartile')
plt.xlabel('Region',fontsize=12)
plt.ylabel('Average Order Value',fontsize=12)
plt.title('Distribution of AvgOrderValue by Region',fontsize=14,fontweight='bold')
plt.tight_layout()
plt.show()

# ### Q6.9: Clustermap

# #### Create a clustermap (hierarchical heatmap) of customer metrics.

# Create Clustermap
metrics = df[['Age', 'Income', 'PurchaseCount', 'AvgOrderValue', 'CustomerRating', 'YearsAsCustomer']]
corr = metrics.corr()
sns.clustermap(corr,cmap='RdBu',center=0,annot=True,fmt='.2f',linewidths=0.5)
plt.suptitle('Hierarchical Heatmap',fontsize=14,fontweight='bold')
plt.tight_layout()
plt.show()

# ### Q6.10: Joint Plot

# #### Create a joint plot showing Age vs CustomerRating relationship with marginal distributions

# Crate Joint plot
sns.jointplot(x='Age',y='CustomerRating',data=df,kind='scatter')
plt.xlabel('Age',fontsize=12)
plt.ylabel('CustomerRating',fontsize=12)
plt.suptitle('Age Vs CustomerRating RelationShip',y=1.0,fontweight='bold')
plt.show()

# ### Challenge Extension

# #### Challenge 1: Create a custom color palette and apply to multiple plots.

# Create Custom color Palette
custom_palette = ['red','maroon','green','cyan','blue','orange','yellow','olive','pink','indigo']
sns.set_palette(custom_palette)

# Bar plot 
sns.barplot(x='Region', y='Income', data=df,palette= custom_palette)
plt.title('Average Income by Region')
plt.show()

# box plot
sns.boxplot(x='Region', y='PurchaseCount', data=df,palette= custom_palette)
plt.title('Purchase Count Distribution by Region')
plt.show()

#violin plot
sns.violinplot(x='Region', y='CustomerRating', data=df,palette= custom_palette)
plt.title('Customer Rating Distribution by Region')
plt.show()

# count plot
sns.countplot(x='Region', data=df,palette= custom_palette)
plt.title('Customer Count by Region')
plt.show()

# Scatter plot
sns.histplot(data=df, x='Age', kde=True,bins=20 ,palette= custom_palette)   
plt.title('Distribution of Customer Ages', fontsize=14, fontweight='bold')
plt.show()


# #### Challenge 2: Use FacetGrid for complex multi-variable analysis.

# Facegrid for multi-variable analysis
g = sns.FacetGrid(df,row='Region',col='Category',height=4,aspect=1.2)

g.map(sns.scatterplot, 'Age', 'Income')
plt.suptitle('Facegrid for multi-variable',fontsize=16,y=1.00,fontweight='bold')
g.set_axis_labels('Age', 'Income')
plt.tight_layout()
plt.show()

# #### Challenge 3: Create regression plots with confidence bands

# create Regression Plots
sns.regplot(x='Age',y='Income',data=df,ci=95)
plt.xlabel('Age',fontsize=12)
plt.ylabel('Income',fontsize=12)
plt.title('Regression Plot of Age vs Income with Confidence Band',fontsize=14,fontweight='bold')
plt.tight_layout()
plt.show()