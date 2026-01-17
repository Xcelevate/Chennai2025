# Generated from: Assignment_6_Pyhton.ipynb
# Converted at: 2025-12-20T08:55:12.754Z
# Next step (optional): refactor into modules & generate tests with RunCell
# Quick start: pip install runcell

import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns

df=pd.read_csv('assignment6_customer_analytics(in).csv')

df

# ### Q6.1: Histogram with KDE
# #### Create a histogram with KDE showing the distribution of customer ages using Seaborn.
# #### Hint: Use sns.histplot() with kde=True, set style to 'darkgrid'


sns.set_style('darkgrid')

plt.figure(figsize=(10, 6))
sns.histplot(data=df, x='Age', kde=True,bins=20 ,color='purple')    
plt.xlabel('Customer Age', fontsize=12)
plt.ylabel('Frequency', fontsize=12)
plt.title('Distribution of Customer Ages', fontsize=14, fontweight='bold')
plt.tight_layout()
plt.show()

# ### Q6.2: Count Plot
# #### Create a count plot showing the number of customers per region.
# #### Hint: Use sns.countplot() with palette


Customer_count=df.groupby('Region').agg({'CustomerID':'count'})
Customer_count

plt.figure(figsize=(15,8))
sns.countplot(x='Region',data=df,palette='colorblind')
plt.title('RegionCount',fontsize=14)
plt.tight_layout()
plt.show()

# ### Q6.3: Scatter Plot with Hue
# #### Create a scatter plot with Age vs Income, colored by Region using Seaborn.
# #### Hint: Use sns.scatterplot() with hue='Region'


plt.figure(figsize=(10, 6))
sns.scatterplot(data = df, x = 'Age',y = 'Income',hue = 'Region' ,s=100,alpha = 0.7)   #s--circle size  #alpha -- circlr color quality
plt.xlabel('CustomerAge', fontsize=12)
plt.ylabel('Income', fontsize=12)
plt.title('CustomerAge vs Income', fontsize=14, fontweight='bold')
plt.legend(loc='best',fontsize=10, title = 'Region')
plt.tight_layout()
plt.show()

# ### Q6.4: Box Plot
# #### Create a box plot showing the distribution of PurchaseCount across regions.
# #### Hint: Use sns.boxplot() with palette


plt.figure(figsize=(18,8))
sns.boxplot(data=df,x='Region',y='PurchaseCount',hue='Region',palette='colorblind')
plt.xlabel('Region', fontsize=12)
plt.ylabel('Purchase Count', fontsize=12)
plt.title('Distribution of Purchase Count',fontsize=12)
plt.legend(loc='best')
plt.show()

# ### Q6.5: Heatmap
# #### Create a heatmap showing correlations between numeric columns.
# #### Hint: Use sns.heatmap() on correlation matrix


numeric_cols = df[['Age', 'Income', 'PurchaseCount', 'AvgOrderValue', 'CustomerRating', 'YearsAsCustomer']]
corr = numeric_cols.corr()

plt.figure(figsize=(10, 8))
sns.heatmap(corr, annot=True, fmt='.2f',cmap='RdBu', center=0, square=False,linewidths=1)  #  annot=True-- Show numbers
plt.title('Correlation Matrix of Sales Data', fontsize=14, fontweight='bold')
plt.tight_layout()
plt.show()

# ### Q6.6: Bar Plot with CI
# #### Create a bar plot showing average CustomerRating by Category with confidence intervals.
# #### Hint: Use sns.barplot() which adds CI automatically




plt.figure(figsize=(10, 6))
sns.barplot(data=df, x='Category', y='CustomerRating', palette='RdBu', ci=95)
plt.xlabel('Category', fontsize=12)
plt.ylabel('Average Customer Rating', fontsize=12)
plt.title('Average Rating by Category (95% CI)', fontsize=14, fontweight='bold')
plt.tight_layout()
plt.show()

# ### Q6.7: Pair Plot
# #### Create a pair plot for Age, Income, PurchaseCount, CustomerRating colored by Region.
# ### Hint: Use sns.pairplot() with hue='Region'


sns.pairplot(data=df,
             vars=['Age', 'Income', 'PurchaseCount', 'CustomerRating'],
             hue='Region', 
             diag_kind='kde',  #diag_kind----it produce a diagram in diagonal   #kws---keyword arguments   #ci=95---cnfidence intervals
             plot_kws={'alpha': 1})
plt.show()

# ### Q6.8: Violin Plot
# #### Create a violin plot showing the distribution of AvgOrderValue by Region.
# #### Hint: Use sns.violinplot()


plt.figure(figsize=(10, 6))
sns.violinplot(data=df, x='Region', y='AvgOrderValue', palette='bright')
plt.xlabel('Region', fontsize=12)
plt.ylabel('Average Order Value ($)', fontsize=12)
plt.title('Distribution of Avg Order Value by Region', fontsize=14, fontweight='bold')
plt.tight_layout()
plt.show()

# ### Q6.9: Clustermap
# #### Create a clustermap (hierarchical heatmap) of customer metrics.
# #### Hint: Use sns.clustermap() on numeric data


numeric_cols = df[['Age', 'Income', 'PurchaseCount', 'AvgOrderValue', 'CustomerRating', 'YearsAsCustomer']]
corr = numeric_cols.corr()

plt.figure(figsize=(10, 8))
sns.clustermap(corr, annot=True, fmt='.2f',cmap='RdBu', center=0, square=True,linewidths=1)  #  annot=True-- Show numbers
plt.title('Correlation Matrix of Sales Data', fontsize=14, fontweight='bold')
plt.tight_layout()
plt.show()

# ### Q6.10: Joint Plot
# #### Create a joint plot showing Age vs CustomerRating relationship with marginal distributions.
# #### Hint: Use sns.jointplot() with kind='scatter'


sns.jointplot(data=df, x='Age', y='CustomerRating', kind='resid', height=4, space=0.2, marginal_kws=dict(bins=70))
plt.show()

sns.jointplot(data=df, x='Age', y='CustomerRating', kind='resid', height=4, space=0.2)
plt.suptitle('join plot ')
plt.tight_layout()
plt.show()

# ### Challenge Extension
# #### Challenge 1: Create a custom color palette and apply to multiple plots


e Custom color Palette
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

# ### Challenge 2:
# #### Use FacetGrid for complex multi-variable analysis.


m= sns.FacetGrid(df,row='Region',col='Category',height=4,aspect=1.2)
m.map(sns.scatterplot, 'Age', 'Income')
plt.suptitle('Facegrid for multi-variable',fontsize=16,y=1.00,fontweight='bold')
m.set_axis_labels('Age', 'Income')
plt.tight_layout()
plt.show()

# ### Challenge 3:
# #### Create regression plots with confidence bands.


sns.regplot(x='Age',y='Income',data=df,ci=95)
plt.xlabel('Age',fontsize=12)
plt.ylabel('Income',fontsize=12)
plt.title('Regression Plot of Age vs Income with Confidence Band',fontsize=14,fontweight='bold')
plt.tight_layout()
plt.show()