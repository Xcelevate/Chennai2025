import java.util.*;
public class FCP038{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int r=0;
int sum=0;
int k=0;
int m=n;
while(n!=0)
{
r=n%10;
k=r*r*r;
sum=sum+k;
n=n/10;
}
if(sum==m)
{
System.out.println("Yes");
}
else
{
System.out.println("No");
}
}}