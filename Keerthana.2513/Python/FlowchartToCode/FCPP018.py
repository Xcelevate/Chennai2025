bs=int(input())
if bs<=10000:
    hra=0.2*bs
    da=0.8*bs
    gs=bs+hra+da
elif bs<=20000:
    hra=0.25*bs
    da=0.9*bs
    gs=bs+hra+da
else:
    hra=0.3*bs
    da=0.95*bs
    gs=bs+hra+da
    
print(round(gs))