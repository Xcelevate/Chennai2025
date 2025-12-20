BS=float(input())
if BS<=10000:
    HRA=0.20*BS
    DA=0.80*BS
elif BS<=20000:
    HRA=0.25*BS
    DA=0.90*BS  
else:
    HRA=0.30*BS
    DA=0.95*BS  
GS=HRA+DA+BS
print(int(GS))        