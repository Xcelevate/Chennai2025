# Generated from: plot.ipynb
# Converted at: 2026-01-10T09:21:58.685Z
# Next step (optional): refactor into modules & generate tests with RunCell
# Quick start: pip install runcell

import numpy as np
import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns

# Violin Plot
data = pd.DataFrame({'sepal_length': np.random.normal(5.5, 0.8, 200)})
sns.violinplot(data=data, y='sepal_length')
plt.title('Distribution of Sepal Length')
plt.show()

# Swarm Plot
# Load sample data
tips = sns.load_dataset('tips')
 
# Single variable swarm plot
sns.swarmplot(data=tips, x='total_bill')
plt.title('Distribution of Total Bill Amounts')
plt.show()

# Strip Plot
# 1. Load Sample Data (e.g., 'tips' dataset from Seaborn)
tips = sns.load_dataset("tips")
 
# 2. Create the Strip Plot
plt.figure(figsize=(10, 6)) # Set plot size
sns.stripplot(x="day", y="total_bill", data=tips, jitter=True, hue="sex") # Plot points, add jitter & hue
 
# 3. Customize & Show Plot
plt.title('Total Bill Amount by Day (Seaborn Strip Plot)')
plt.xlabel('Day of Week')
plt.ylabel('Total Bill ($)')
plt.show()

sns.swarmplot(data=tips, x='day', y='total_bill', 
              hue='sex', dodge=True, size=6, palette='Set2')
plt.title('Total Bill: Day and Sex Comparison')
plt.show()