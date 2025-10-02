import java.util.*;
public class FCP014{
public static void main(String[]args){
Scanner sc =new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int max1=0;
if(a>b)
{
max1=a;
}
else
{
max1=b;
}
if(max1>c)
{
System.out.println(max1);
}
else
{
System.out.println(c);
}}
}