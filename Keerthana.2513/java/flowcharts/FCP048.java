import java.util.*;
public class FCP048{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int m=sc.nextInt();
int n=sc.nextInt();
int s=0;
int k=0;
int product=1;
int z=0;
int sum=0;
int temp=0;
for(int i=m;i<n;i++)
{
sum=0;
s=0;
temp=i;
while(temp!=0)
{
s++;
temp/=10;
}
temp=i;
while(temp!=0)
{
product =1;
k=temp%10;
z=0;
while(z<s)
{
product=product*k;
z++;
}
sum=sum+product;
temp/=10;
}
if(i==sum)
{
System.out.println(i);
}
}
}}