import java.util.*;
public class FCP030
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a=0;
for(int i=1;i*i<=n;i++)
{
  a=i*i;
}
if(a==n)
{
   System.out.println("yes");
}
else{
System.out.println("no");
}
}}

  

