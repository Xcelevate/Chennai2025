st1 = input("Enter a 1st side : ")
st2 = input("Enter a 2nd side : ")
st3 = input("Enter a 3rd side : ")
p=st1.replace(".","")
q=st2.replace(".","")
r=st3.replace(".","")

if (p.isdigit() and q.isdigit() and r.isdigit()):

    s1=float(st1)
    s2=float(st2)
    s3=float(st3)
    # s1 = round(st1,2)
    # s2 = round(st2,2)
    # s3 = round(st3,2)
    
    if(((s1 + s2) > s3) or ((s2 + s3) > s1) or (s3 + s1) > s2):
        if(s1 == s2 == s3):
            print("Equilateral")
        elif(s1 == s2 or s2 == s3 or s3 == s1):
            print("Isoceles")
        else:
            print("scalen")
    else:
        print("This is not a valid triangle")
else:
    print("Enter a valid sides of triangle")