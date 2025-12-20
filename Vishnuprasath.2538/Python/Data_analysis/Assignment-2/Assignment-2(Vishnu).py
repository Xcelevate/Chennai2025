# ## ASSIGNMENT 2: NumPy for Numeric Data


import numpy as np
import pandas as pd

df = pd.read_csv('assignment2_regional_performance(in).csv')

df

# ### Q2.1: Array Creation and Shape


# #### Load the regional performance data into NumPy arrays and display the shape and data types.


val = df[['Q1Revenue', 'Q2Revenue', 'Q3Revenue', 'Q4Revenue']].values

val

val.shape

print("Array shape:", val.shape)
print("Data type:", val.dtype)
print("Array:", val[:3])

# ### Q2.2: Annual Revenue Calculation


# #### Calculate the total annual revenue for each region (sum of Q1, Q2, Q3, Q4 revenues)


Total_revenue = df.groupby('RegionName')[['Q1Revenue', 'Q2Revenue', 'Q3Revenue', 'Q4Revenue']].sum()

Total_revenue

annual_revenue = val.sum(axis=1)
annual_revenue

annual_revenue.shape

for i, region in enumerate(df['RegionName']):
    print(df['RegionName'][i] , annual_revenue[i])

print("Annual Revenue by Region:")
for i, region in enumerate(df['RegionName']):
    print(f" {region}: ${annual_revenue[i]:,.0f}")

# ### Q2.3: Quarterly Average


# #### Find the average units sold per quarter across all regions


units = df[['Q1Units', 'Q2Units', 'Q3Units', 'Q4Units']].values

units

average_units = units.mean(axis=0)
average_units

quarters = ['Q1', 'Q2', 'Q3', 'Q4']
print("Average Units Sold per Quarter:")
for q, avg in zip(quarters, average_units):
    print(f"{q}: {avg:.1f} units")

# ### Q2.4: Conditional Filtering X
# #### Identify regions where Q4 revenue is higher than the annual average revenue


q4_revenues = val[:, 3]

annual_avg = annual_revenue.mean()

high_q4_mask = q4_revenues > annual_avg

high_q4_regions = df.loc[high_q4_mask, 'RegionName']

print("Regions where Q4 revenue is higher than annual average:")
print(high_q4_regions.tolist())

# ### Q2.5: 2D Matrix Operations


# #### Create a 2D matrix of quarterly revenues and compute column-wise totals (total revenue per quarter).


revenue_matrix = df[['Q1Revenue', 'Q2Revenue', 'Q3Revenue', 'Q4Revenue']].values
revenue_matrix

q_totals = revenue_matrix.sum(axis=0)
q_totals

quarters = ['Q1', 'Q2', 'Q3', 'Q4']
print("total Revenue per quarter:")
for q, total in zip(quarters, q_totals):
    print(f"{q}: ${total:,.0f}")

# ### Q2.6: Min-Max Normalization


# #### Normalize all revenue values between 0 and 1 using min-max normalization.


revenue_flat = val.flatten()
revenue_flat

min_val = revenue_flat.min()
max_val = revenue_flat.max()

min_val

max_val

normalized = (revenue_flat - min_val) / (max_val - min_val)

normalized

normalized[:10]

print("First 10 normalized values:", normalized[:10])
print("Min:", normalized.min())
print("Max:", normalized.max())

# ### Q2.7: Boolean Masking


# #### Use Boolean indexing to filter regions with total annual revenue > 500,000.


high_revenue_mask = annual_revenue > 500000
high_revenue_mask

high_revenue_regions = df.loc[high_revenue_mask, 'RegionName']
high_revenue_regions

print("Regions with total annual revenue > 500,000:")
print(high_revenue_regions.tolist())

# ### Q2.8: Element-wise Division
# #### Calculate the revenue per unit for each region and quarter (Revenue / Units).


revenue_per_unit = val / units
revenue_per_unit

for i in range(revenue_per_unit.shape[0]):
    print(df["RegionName"][i],revenue_per_unit[i])

# ### Q2.9: Statistical Analysis
# #### Calculate the standard deviation of revenue and identify outlier regions (> 2 std deviations from mean)


revenue_mean = revenue_flat.mean()
revenue_mean

revenue_std = revenue_flat.mean()
revenue_std

outlier_mask = abs(revenue_flat-revenue_mean)>2*revenue_std
outlier_mask

# ### Q2.10: Correlation Matrix
# #### Create a correlation matrix between quarterly revenues using NumPy.


cor = np.corrcoef(val.T)
cor

quarters = ['Q1', 'Q2', 'Q3', 'Q4']
print("Correlation Matrix (Quarterly Revenues):")
print("Quarters: Q1, Q2, Q3, Q4")
print(cor)