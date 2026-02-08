# Generated from: Seaborn.ipynb
# Converted at: 2026-01-10T09:21:08.555Z
# Next step (optional): refactor into modules & generate tests with RunCell
# Quick start: pip install runcell

pip install seaborn

# #### Create a scatter plot showing the relationship between CustomerAge and Revenue.Use 'Region' as the hue (color coding).Add a title and labels.Use the 'whitegrid' style


import pandas as pd

import matplotlib.pyplot as plt

import seaborn as sns

df = pd.read_csv("sales_visualization_data.csv")

df.head()

sns.set_style('whitegrid')

# Scatter Plot-MultiVariate
plt.figure(figsize=(10, 6))
sns.scatterplot(data=df, x='CustomerAge', y='Revenue', hue='Region', s=100, alpha=0.7)
plt.xlabel('CustomerAge', fontsize=12)
plt.ylabel('Revenue ($)', fontsize=12)
plt.title('CustomerAge Vs Revenue by Region', fontsize=14, fontweight='bold')
plt.legend(loc='upper left',fontsize=10,title='Region', bbox_to_anchor=(1.05,1))
plt.tight_layout()
plt.show()

# #### Create a box plot showing the distribution of Revenue across different Regions.Use Seaborn's boxplot().Apply custom color palette.Add title and labels


# Box -Bivariate
plt.figure(figsize=(10, 6))
sns.boxplot(data=df, x='Region',y='Revenue')
plt.xlabel('Region', fontsize=12)
plt.ylabel('Revenue ($)', fontsize=12)
plt.title('Revenue across different Regions', fontsize=14, fontweight='bold')
plt.tight_layout()
plt.show()

# Pie Chart
data=[43,23,21,34,11]
labels=['class 1','class 2','class 3','class 4','class 5']
explode=[0.1,0,0,0,0]
colors=['pink','brown','grey','lightblue','yellow']
colors=sns.color_palette('colorblind') # bright,light,pastel

plt.pie(data,labels=labels,explode=explode,colors=colors,autopct='%.0f%%')
plt.show

#donut chart
fig, ax = plt.subplots()
wedges, texts, autotexts = ax.pie(data,labels=labels,colors=colors,startangle=90,autopct='%.0f%%',wedgeprops=dict(width=0.5))
ax.legend(wedges, labels, title="Classes", loc="center left", bbox_to_anchor=(1, 0, 0.5, 1))
plt.show()

wedges

texts

autotexts

#ring chart
fig, ax = plt.subplots()
wedges, texts, autotexts = ax.pie(data,labels=labels,colors=colors,startangle=90,autopct='%.0f%%',wedgeprops=dict(width=0.1))
ax.legend(wedges, labels, title="Classes", loc="center left", bbox_to_anchor=(1, 0, 0.5, 1))
plt.show()

df.describe()

age=df['CustomerAge']
revenue=df['Revenue']

#barplot
plt.figure(figsize=(10,6)) #bivariate
sns.barplot(x='CustomerAge', y='Revenue', data=df)
plt.title('CustomerAge Vs Revenue',fontsize=14)
plt.show()

#Countplot
plt.figure(figsize=(10,6))
sns.countplot(x='Region', data=df)
plt.title('Countplot for Region',fontsize=14)
plt.show()

#Countplot
plt.figure(figsize=(10,6))
sns.countplot(x='CustomerAge', data=df)
plt.title('Countplot for CustomerAge',fontsize=14)
plt.show()

#histplot
plt.figure(figsize=(16,6))
sns.histplot(x = 'CustomerAge', data = df)
plt.title('Customer Age',fontsize=14)
plt.show()

#histplot
plt.figure(figsize=(10, 6))  #kde kernel density estimate
sns.histplot(data=df, x='CustomerAge', kde=True, bins=20, color='skyblue')
plt.xlabel('Customer Age', fontsize=12)
plt.ylabel('Frequency', fontsize=12)
plt.title('Distribution of Customer Ages', fontsize=14, fontweight='bold')
plt.tight_layout()
plt.show()
 

# #### Create a graph for region wise age vs revenue distribution


# # barplot


age=df['CustomerAge']
revenue=df['Revenue']
region=df['Region']

plt.figure(figsize=(10,6)) #bivariate
sns.barplot(x='CustomerAge', y='Revenue',hue='Region', data=df)
plt.title('CustomerAge Vs Revenue by Region',fontsize=14)
plt.legend(loc='upper right', bbox_to_anchor=(1.19,1))
plt.show()

#Countplot
plt.figure(figsize=(10,6))
sns.countplot(x='CustomerAge',hue='Region', data=df)
plt.title('CustomerAge Vs Revenue by Region',fontsize=14)
plt.legend(loc='upper right', bbox_to_anchor=(1.15,1))
plt.show()

#histplot
plt.figure(figsize=(16,6))
sns.histplot(x = 'CustomerAge', data = df)
plt.title('CustomerAge Vs Revenue by Region',fontsize=14)
plt.show()

#histplot
plt.figure(figsize=(10, 6))  #kde kernel density estimate
sns.histplot(data=df, x='CustomerAge',hue='Region', kde=True, bins=20, color='skyblue')
plt.xlabel('Customer Age', fontsize=12)
plt.ylabel('Revenue', fontsize=12)
plt.title('CustomerAge Vs Revenue by Region', fontsize=14, fontweight='bold')
plt.tight_layout()
plt.show()