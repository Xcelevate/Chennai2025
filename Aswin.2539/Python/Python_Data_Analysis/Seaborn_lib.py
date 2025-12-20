! pip install seaborn

# ### Create a scatter plot showing the relationship between CustomerAge and Revenue.
# #### Use 'Region' as the hue (color coding)
# #### Add a title and labels
# #### Use the 'whitegrid' style


import seaborn as sns

import matplotlib.pyplot as plt

import pandas as pd

df = pd.read_csv('sales_visualization_data.csv')

df

df.head()

sns.set_style('whitegrid')

# Create Scatter plot 
plt.figure(figsize=(10, 6))
sns.scatterplot(data = df, x = 'CustomerAge', y = 'Revenue', hue = 'Region',s=100, alpha = 1) # hue is used for grouping
#plt.plot(total_revenue.index, total_revenue.values,marker='o', linewidth=2, markersize=8, color='red')
plt.xlabel('CustomerAge', fontsize=12)
plt.ylabel('Total Revenue ($)', fontsize=12)
plt.title('CustomerAge Vs Revenue By Region', fontsize=14, fontweight='bold')
plt.legend(loc = 'upper left', fontsize = 12, title = 'Region', bbox_to_anchor =(1.05,1) )
plt.tight_layout()
plt.show()

# ### Create a box plot showing the distribution of Revenue across different Regions.
# #### Use Seaborn's boxplot()
# #### Apply custom color palette
# #### Add title and labels


# Create Box plot 
plt.figure(figsize=(10, 6))
sns.boxplot(data = df, x = 'Region', y = 'Revenue') 
#plt.plot(total_revenue.index, total_revenue.values,marker='o', linewidth=2, markersize=8, color='red')
plt.xlabel('Region', fontsize=12)
plt.ylabel('Revenue', fontsize=12)
plt.title('Revenue Across Different Region', fontsize=14, fontweight='bold')
plt.tight_layout()
plt.show()

df.describe()

data=[43,23,22,34,11]
labels=['class 1','class 2','class 3','class 4','class 5']
explode=[0.1,0,0,0,0]
#colors=['maroon','pink','orange','yellow','lightblue']
colors=sns.color_palette('colorblind') # bright light

plt.pie(data,labels=labels,explode=explode,autopct='%.0f%%')
plt.show()

# ### Donut Chart


fig, ax = plt.subplots()    #width=0.1 is ring chart ,width=0.5 is donut chart
wedges, texts,autotexts = ax.pie(data,labels=labels,colors=colors,startangle=90,autopct='%.0f%%',wedgeprops=dict(width=0.5))
ax.legend(wedges, labels, title="Classes", loc="best", bbox_to_anchor=(1, 0, 0.5, 1))
plt.show()

wedges

print(texts)

print(autotexts)

df.describe()

age=df['CustomerAge']
revenue=df['Revenue']

plt.figure(figsize=(15,8))
sns.barplot(x='CustomerAge',y='Revenue',data=df)
plt.title('CustomerAge vs Revenue',fontsize=15)
plt.show()

plt.figure(figsize=(15,8))
sns.countplot(x='Region',data=df)
plt.title('RegionCount',fontsize=14)
plt.show()

plt.figure(figsize=(15,8))
sns.countplot(x='CustomerAge',data=df)
plt.title('CustomerAgeCount',fontsize=14)
plt.show()

plt.figure(figsize=(15,8))
sns.histplot(x='CustomerAge',data=df)
plt.title('CustomerAgeCount',fontsize=14)
plt.show()

 #this graph is created use by kde-kernel Density estimate
plt.figure(figsize=(10, 6))
sns.histplot(data=df, x='CustomerAge', kde=True,bins=20 ,color='red')    
plt.xlabel('Customer Age', fontsize=12)
plt.ylabel('Frequency', fontsize=12)
plt.title('Distribution of Customer Ages', fontsize=14, fontweight='bold')
plt.tight_layout()
plt.show()


# ## Create a graph for region wise age vs revenue distribution use as many plots

# ### Barplot


plt.figure(figsize=(18,8))
sns.barplot(data=df,x= 'CustomerAge',y='Revenue',hue='Region')
plt.title('Region wise age vs Revenue',fontsize=12)
plt.legend(loc='best')
plt.show()

# #### Hist plot


plt.figure(figsize=(10,6))
sns.histplot(data=df,x= 'CustomerAge',kde=True,bins=20,hue='Region')
plt.xlabel('CustomerAge',fontsize=12,color='red')
plt.ylabel('Revenue',fontsize=12,color='Green')
plt.title('Region wise age vs Revenue',fontsize=12)
#plt.legend(loc='best')
plt.tight_layout()
plt.show()

# ### CountPlot


plt.figure(figsize=(18,8))
sns.countplot(data=df,x= 'CustomerAge',hue='Region',)
plt.title('Region wise age vs Revenue',fontsize=12)
plt.legend(loc='best')
plt.show()