n = int(input())
c = 0
if n <= 10000:
    hra = n * 0.2
    da = n * 0.8
elif n <= 20000:
    hra = n * 0.25
    da = n * 0.9
else:
    hra = n * 0.3
    da = n * 0.95
c = n + hra + da
v = int(c)
print(v)