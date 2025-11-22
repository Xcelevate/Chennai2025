n = int(input())
perfect  = 0
for i in range(1,n+1):
    perfect = i * i
    if(perfect == n):
        break
    else:
        continue    
    
if (perfect == n):
    print("Yes")
    
else:
    print("No")
