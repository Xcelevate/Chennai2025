amount=int(input())
if amount<=50:
    tot=0.50*50
elif amount<=150:
    first=0.50*50
    second=0.75*(amount-50)
    tot=first+second
elif amount<=250:
    first=0.50*50
    second=0.75*100
    third=1.20*(amount-150)
    tot=first+second+third
else:
    first=0.50*50
    second=0.75*100
    third=1.20*100
    fourth=1.50*(amount-250)
    tot=first+second+third+fourth
    
bill=tot+tot*0.2
print(bill)