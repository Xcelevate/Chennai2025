import java.util.*;
public class FCP019{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
double r=0;
double s=0;
double l=0;
double k=0;
double diff=0;
double sum=0;
double f=0;
if(n<=50)
{
r=0.50*n;
f=r*0.2;
System.out.println(r+f);
}
else if(n<=150)
{
diff=n-50;
r=0.50*50;
s=0.75*diff;
sum=r+s;
f=sum*0.2;
System.out.println(sum+f);
}
else if(n<=250)
{
r=0.50*50;
l=0.75*100;
diff=n-150;
s=1.20*diff;
sum=r+l+s;
f=sum*0.2;
System.out.println(sum+f);
}
else
{
r=0.50*50;
l=0.75*100;
k=1.20*100;
diff=n-250;
s=1.50*diff;
sum=r+l+k+s;
f=sum*0.2;
System.out.println(sum+f);
}
}}