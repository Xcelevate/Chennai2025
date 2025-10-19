import java.util.*;
public class FCP033
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int q=n;
int a=0;
int r=0;
while(n!=0)
{
 a=n%10;
 r=r*10+a;
 n=n/10;
}
if(q==r)
{
System.out.println("yes");
}
else
{
System.out.println("no");
}
}}

