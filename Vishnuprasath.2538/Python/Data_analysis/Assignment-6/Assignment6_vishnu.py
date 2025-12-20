import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
import seaborn as sns

df = pd.read_csv('assignment6_customer_analytics(in).csv')
df

# ### Q6.1: Histogram with KDE
# #### Create a histogram with KDE showing the distribution of customer ages using Seaborn.


sns.set_style("darkgrid")

sns.histplot(data=df, x="Age", kde=True)
plt.title("Distribution of Customer Ages")
plt.xlabel("Age")
plt.ylabel("Number of Customers")
plt.show()

# ### Q6.2: Count Plot
# #### Create a count plot showing the number of customers per region.


sns.countplot(data = df, x='Region', palette='Set1')
plt.title('Number of customers per region')
plt.xlabel('Region')
plt.ylabel('Number of customers')
plt.show()

# ### Q6.3: Scatter Plot with Hue
# #### Create a scatter plot with Age vs Income, colored by Region using Seaborn.


sns.scatterplot(data=df, x='Age', y='Income',hue='Region')
plt.title('Age vs Income by region')
plt.xlabel('Age')
plt.ylabel('Income')
plt.show()

# ### Q6.4: Box Plot
# #### Create a box plot showing the distribution of PurchaseCount across regions.


sns.boxplot(data=df, x='Region', y='PurchaseCount', palette='Set3')
plt.title('PurchaseCount across regions')
plt.xlabel('Regiopn')
plt.ylabel('PurchaseCount')
plt.show()

# ### Q6.5: Heatmap
# #### Create a heatmap showing correlations between numeric columns.


col = df[['CustomerID', 'Age', 'Income', 'PurchaseCount', 'AvgOrderValue', 'CustomerRating', 'YearsAsCustomer']]

correlation = col.corr()
correlation

plt.figure(figsize=(10, 6))
sns.heatmap(correlation, annot=True, cmap="coolwarm")
plt.title("Correlation Heatmap of Customer Data")
plt.show()

# ### Q6.6: Bar Plot with CI
# #### Create a bar plot showing average CustomerRating by Category with confidence intervals.


sns.barplot(data=df, x='Category', y='CustomerRating', palette='Set1')
plt.title('Average CustomerRating by Category')
plt.xlabel('Category')
plt.ylabel('Average CustomerRating')
plt.show()

# ### Q6.7: Pair Plot
# #### Create a pair plot for Age, Income, PurchaseCount, CustomerRating colored by Region.


sns.pairplot(df, vars=['Age', 'Income', 'PurchaseCount', 'CustomerRating'], hue='Region')
plt.show()

sns.pairplot(df, vars=['Age', 'Income', 'PurchaseCount', 'CustomerRating'], hue='Region')
plt.suptitle('Pair Plot: Customer Metrics by Region', y=1.01, fontsize=14, fontweight='bold')
plt.tight_layout()
plt.show()

# ### Q6.8: Violin Plot
# #### Create a violin plot showing the distribution of AvgOrderValue by Region.


plt.figure(figsize=(10, 6))
sns.violinplot(data=df, x='Region', y='AvgOrderValue', palette ='muted')
plt.title('Distribution of AvgOrderValue by Region')
plt.xlabel('Region')
plt.ylabel('AvgOrderValue')
plt.show()

# ### Q6.9: Clustermap
# #### Create a clustermap (hierarchical heatmap) of customer metrics.


sns.clustermap(correlation, cmap='coolwarm', standard_scale=1)
plt.show()

# ### Q6.10: Joint Plot
# #### Create a joint plot showing Age vs CustomerRating relationship with marginal distributions.


sns.jointplot(data=df, x='Age', y='CustomerRating', kind='scatter')
plt.show()

# ### Challenge Extension
# #### Challenge 1: Create a custom color palette and apply to multiple plots.


custom_palette = ["#4C72B0", "#55A868", "#C44E52", "#8172B2"]

sns.countplot(data = df, x='Region', palette=custom_palette)
plt.title('Number of customers per region')
plt.xlabel('Region')
plt.ylabel('Number of customers')
plt.show()

sns.boxplot(data=df, x='Region', y='PurchaseCount', palette=custom_palette)
plt.title('PurchaseCount across regions')
plt.xlabel('Regiopn')
plt.ylabel('PurchaseCount')
plt.show()

sns.barplot(data=df, x='Category', y='CustomerRating', palette=custom_palette)
plt.title('Average CustomerRating by Category')
plt.xlabel('Category')
plt.ylabel('Average CustomerRating')
plt.show()

# #### Challenge 2: Use FacetGrid for complex multi-variable analysis.


g = sns.FacetGrid(data=df, col="Region", col_wrap=2, height=4, aspect=1)
g.map_dataframe(sns.scatterplot, x="Age", y="Income")
g.set_axis_labels("Age", "Income")
g.set_titles("Region: {col_name}")
plt.show()

# #### Challenge 3: Create regression plots with confidence bands.


sns.regplot(data=df, x='Age', y='CustomerRating')
plt.title('Age vs Customer Rating with Regression Line')
plt.xlabel('Age')
plt.ylabel('CustomerRating')
plt.show()