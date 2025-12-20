# Generated from: Assignment-6.ipynb
# Converted at: 2025-12-20T10:51:58.508Z
# Next step (optional): refactor into modules & generate tests with RunCell
# Quick start: pip install runcell

# # ASSIGNMENT 6: Seaborn Advanced Visualization


# ## Questions


# ### Q6.1: Histogram with KDE


# #### Create a histogram with KDE showing the distribution of customer ages using Seaborn.


import seaborn as sns

import matplotlib.pyplot as plt

import pandas as pd

df=pd.read_csv('assignment6_customer_analytics(in).csv')



df.head(10)

plt.figure(figsize=(10,6))
sns.histplot(data=df,x='Age',kde=True,bins=20,color='purple')
plt.xlabel('Customer Age',fontsize=12)
plt.ylabel('Frequency',fontsize=12)
plt.title('Distribution of Customer Ages',fontsize=14,fontweight='bold')
plt.tight_layout()
plt.show()

# ### Q6.2: Count Plot


# #### Create a count plot showing the number of customers per region.


plt.figure(figsize=(12,6))
sns.countplot(x='Region',data=df,palette=['red','yellow','green','purple'],hue='Region')
plt.xlabel('Region',fontsize=12)
plt.ylabel('Number of Customers',fontsize=12)
plt.title('Customer Count by Region',fontsize=14,fontweight='bold')
plt.tight_layout()
plt.show()

# ### Q6.3: Scatter Plot with Hue


# #### Create a scatter plot with Age vs Income, colored by Region using Seaborn.


plt.figure(figsize=(12,6))
sns.scatterplot(data=df,x='Age',y='Income',hue='Region',s=100,alpha=1)
plt.xlabel('Customer Age',fontsize=12)
plt.ylabel('Income',fontsize=12)
plt.title('Customer Age vs Income by Revenue',fontsize=12,fontweight='bold')
plt.grid(True,alpha=0.8)
plt.legend(loc='upper left',fontsize=10,title='Region',bbox_to_anchor=(1.05,1))
plt.tight_layout()
plt.show()

# ### Q6.4: Box Plot


# #### Create a box plot showing the distribution of PurchaseCount across regions


plt.figure(figsize=(10, 6))
sns.boxplot(data=df, x='Region', y='PurchaseCount', palette='coolwarm',hue='Region')
plt.xlabel('Region', fontsize=12)
plt.ylabel('Purchase Count', fontsize=12)
plt.title('Purchase Count Distribution by Region', fontsize=14, fontweight='bold')
plt.tight_layout()
plt.show()

# ### Q6.5: Heatmap


# #### Create a heatmap showing correlations between numeric columns.


df1=df[['CustomerID','Age','Income','PurchaseCount','AvgOrderValue','CustomerRating','YearsAsCustomer']]

corr=df1.corr()

corr

plt.figure(figsize=(12,6))
sns.heatmap(corr,annot=True,fmt='.2f',cmap='RdBu',center=0,square=True,linewidths=1)
plt.title('Correlations between Numeric Columns')
plt.tight_layout()
plt.show()

# ### Q6.6: Bar Plot with CI


# #### Create a bar plot showing average CustomerRating by Category with confidence intervals.


plt.figure(figsize=(10, 6))
sns.barplot(data=df,x='Category',y='CustomerRating',hue='Category',palette='viridis',errorbar=('ci', 95))
plt.xlabel('Category', fontsize=12)
plt.ylabel('Average Customer Rating', fontsize=12)
plt.title('Average Rating by Category (95% CI)', fontsize=14, fontweight='bold')
plt.tight_layout()
plt.show()

# ### Q6.7: Pair Plot


# #### Create a pair plot for Age, Income, PurchaseCount, CustomerRating colored by Region.


sns.pairplot(data=df,
    vars=['Age', 'Income', 'PurchaseCount', 'CustomerRating'],hue='Region',diag_kind='hist',plot_kws={'alpha':1})
plt.suptitle('Pair Plot: Customer Metrics by Region', y=1.01, fontsize=14, fontweight='bold')
plt.tight_layout()
plt.show()

# ### Q6.8: Violin Plot


# #### Create a violin plot showing the distribution of AvgOrderValue by Region.


sns.violinplot(data=df, x='Region', y='AvgOrderValue', palette='muted',hue='Region')
plt.title(' Distribution of Avg Order Value by Region',fontsize=12,fontweight='bold')

# ### Q6.9: Clustermap


# #### Create a clustermap (hierarchical heatmap) of customer metrics.


sns.clustermap(corr,annot=True,fmt='.2f',cmap='RdBu',center=0)
plt.suptitle('Hierarchical Clustering of Customer Metrics', y=1.00,fontsize=12, fontweight='bold')

# ### Q6.10: Joint Plot


# #### Create a joint plot showing Age vs CustomerRating relationship with marginal distributions.


sns.jointplot(
    data=df,
    x='Age',
    y='CustomerRating',
    kind='scatter',
    marginal_kws={'bins': 20}
)

plt.suptitle('Age vs Customer Rating with Marginal Distributions', y=1.02)
plt.show()

# ## Challenge Extension


# ### Challenge 1: Create a custom color palette and apply to multiple plots.


custom_palette = ['red', 'green', 'purple', 'pink']

# countplot
plt.figure(figsize=(8,5))
sns.countplot(data=df, x='Region',palette=custom_palette,hue='Region')
plt.title('Customer Count by Region')
plt.show()
# barplot
plt.figure(figsize=(8,5))
sns.barplot(
    data=df,
    x='Category',
    y='CustomerRating',palette=custom_palette,hue='Region',
    errorbar=('ci', 95)
)
plt.title('Average Customer Rating by Category')
plt.show()

# histplot
plt.figure(figsize=(8,5))
sns.histplot(data=df, x='Age', bins=20,palette=custom_palette,hue='Region')
plt.title('Age Distribution')
plt.show()

# boxplot
sns.boxplot(data=df, x='Region', y='PurchaseCount', palette='coolwarm',hue='Region')
plt.xlabel('Region', fontsize=12)
plt.ylabel('Purchase Count', fontsize=12)
plt.title('Purchase Count Distribution by Region', fontsize=14, fontweight='bold')
plt.tight_layout()
plt.show()

# ### Challenge 2: Use FacetGrid for complex multi-variable analysis.


m= sns.FacetGrid(df,row='Region',col='Category',height=4,aspect=1.2)
m.map(sns.scatterplot, 'Age', 'Income')
plt.suptitle('Facegrid for multi-variable',fontsize=16,y=1.00,fontweight='bold')
m.set_axis_labels('Age', 'Income')
plt.tight_layout()
plt.show()



# ### Challenge 3: Create regression plots with confidence bands.


sns.regplot(x='Age',y='Income',data=df,ci=95)
plt.xlabel('Age',fontsize=12)
plt.ylabel('Income',fontsize=12)
plt.title('Regression Plot of Age vs Income with Confidence Band',fontsize=14,fontweight='bold')
plt.tight_layout()
plt.show()