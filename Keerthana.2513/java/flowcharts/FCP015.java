import java.util.*;
public class FCP015{
public static void main(String[]args){
Scanner sc =new Scanner(System.in);
int max1=0;
int min1=0;
int max2=0;
int min2=0;
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int d=sc.nextInt();
if(a>b)
{
max1=a;
min1=b;
}
else
{
max1=b;
min1=a;
}
if(c>d)
{
max2=c;
min2=d;
}
else
{
max2=d;
min2=c;
}
if(max1>max2)
{
System.out.println(max1);
}
else
{
System.out.println(max2);
}}}