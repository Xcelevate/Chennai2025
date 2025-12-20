# Generated from: assignment_6_seaborn.ipynb
# Converted at: 2025-12-20T11:30:41.914Z
# Next step (optional): refactor into modules & generate tests with RunCell
# Quick start: pip install runcell

# ## Seaborn Advanced Visualization


# ### Q6.1: Histogram with KDE


import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns

df=pd.read_csv('assignment6_customer_analytics.csv')

df

sns.set_style('darkgrid')

plt.figure(figsize=(10,6))
sns.histplot(data=df,x='Age',kde=True,color='purple')
plt.xlabel('CustomerAge',fontsize=12)
plt.ylabel('Frequency',fontsize=12)
plt.title('Distribution of customerAge',fontsize=14,fontweight='bold')
plt.tight_layout()
plt.show()

# ## Q6.2: Count Plot


region_wise=df.groupby('Region')['CustomerID'].count()

plt.figure(figsize=(12,6))
sns.countplot(x='Region',data=df,palette=['lightblue','pink','purple'],hue='Category')
plt.xlabel('Region',fontsize=12)
plt.ylabel('Number of customers',fontsize=12)
plt.title('Number of customers per region category wise',fontsize=14,fontweight='bold')
plt.tight_layout()
plt.show()

# ### Q6.3: Scatter Plot with Hue


plt.figure(figsize=(12,6))
sns.scatterplot(data=df,x='Age',y='Income',palette='Set2',hue='Region',s=100,alpha=0.8)
plt.xlabel('Customer Age',fontsize=12)
plt.ylabel('Customer Income',fontsize=12)
plt.title('Number of customers per region category wise',fontsize=14,fontweight='bold')
plt.legend(loc='upper left',fontsize=10,title='Region',bbox_to_anchor=(1.05,1))
plt.tight_layout()
plt.show()

# ### Q6.4: Box Plot


plt.figure(figsize=(10,6))
sns.boxplot(data=df,x='Region',y='PurchaseCount',palette='viridis',hue='Region')
sns.color_palette('muted')
plt.xlabel('Revenue',fontsize=12)
plt.ylabel('Purchase count',fontsize=12)
plt.title('Distribution of purchaseCount', fontsize=14, fontweight='bold')
plt.tight_layout()
plt.show()

# ### Q6.5: Heatmap


df1=df[['CustomerID','Age','Income','PurchaseCount','AvgOrderValue','CustomerRating','YearsAsCustomer']]
corr=df1.corr()
plt.figure(figsize=(12,6))
sns.heatmap(corr,annot=True,fmt='.2f',cmap='RdBu',center=0,square=True,linewidths=1)
plt.title('Correlations between Numeric Columns')
plt.tight_layout()
plt.show()

# ### Q6.6: Bar Plot with CI


plt.figure(figsize=(10,6))
sns.barplot(data=df,x='Category',y='CustomerRating')
sns.set_palette("Set2")
plt.xlabel('Category', fontsize=12)
plt.ylabel('Average Customer Rating', fontsize=12)
plt.title('Average Rating by Category', fontsize=14, fontweight='bold')
plt.tight_layout()
plt.show()

# ### Q6.7: Pair Plot


sns.pairplot(data=df,
             vars=['Age', 'Income', 'PurchaseCount', 'CustomerRating'],
             hue='Region', 
             diag_kind='kde',  
             plot_kws={'alpha': 1})
plt.show()

# ### Q6.8: Violin Plot


sns.violinplot(data=df, x='Region', y='AvgOrderValue', palette='muted',hue='Region')
plt.title(' Distribution of Avg Order Value by Region',fontsize=12,fontweight='bold')

# ### Q6.9: Clustermap


sns.clustermap(corr,annot=True,fmt='.2f',cmap='RdBu',center=0)
plt.suptitle('Hierarchical Clustering of Customer Metrics', y=1.00,fontsize=13, fontweight='bold')

# ### Q6.10: Joint Plot


sns.jointplot(data=df, x='Age', y='CustomerRating', kind='scatter')
plt.suptitle('join plot ',y=1.02)
plt.tight_layout()
plt.show()

# ### Challenge Extension
# ### Challenge 1: Create a custom color palette and apply to multiple plots.


customize_palette = ['orange','pink','cyan','blue']
sns.set_palette(customize_palette)

sns.countplot(x='Region',data=df,hue='Region')
plt.xlabel('Region',fontsize=12)
plt.ylabel('Number of customers',fontsize=12)
plt.title('Number of customers per region category wise',fontsize=14,fontweight='bold')
plt.show()

sns.histplot(data=df, x='Age', kde=True,bins=20 ,palette= customize_palette,hue='Region')   
plt.title('Distribution of Customer Ages', fontsize=14, fontweight='bold')
plt.show()

sns.barplot(x='Region', y='Income', data=df,palette= customize_palette,hue='Region')
plt.title('Average Income by Region')
plt.show()

sns.countplot(x='Region', data=df,palette= customize_palette,hue='Region')
plt.title('Customer Count by Region')
plt.show()

sns.boxplot(x='Region', y='PurchaseCount', data=df,palette= customize_palette,hue='Region')
plt.title('Purchase Count Distribution by Region')
plt.show()

sns.violinplot(x='Region', y='CustomerRating', data=df,palette= customize_palette,hue='Region')
plt.title('Customer Rating Distribution by Region')
plt.show()



# ### Challenge 2: Use FacetGrid for complex multi-variable analysis.


s=sns.FacetGrid(df,row='Region',col='Category',height=4)
s.map(sns.scatterplot, 'Age', 'Income')
plt.suptitle('Facegrid for multi-variable',fontsize=16,fontweight='bold')
s.set_axis_labels('Age','Income')
plt.tight_layout()
plt.show()

# ### Challenge 3: Create regression plots with confidence bands.


sns.regplot(x='Age',y='Income',data=df,ci=85)
plt.xlabel('Age',fontsize=12)
plt.ylabel('Income',fontsize=12)
plt.title('Regression Plot of Age vs Income with Confidence Band',fontsize=14,fontweight='bold')
plt.tight_layout()
plt.show()