import java.util.Scanner;
public class FCP030
{
public static void main(String args[])
{
Scanner ab=new Scanner(System.in);
long n=ab.nextLong();
long a=0;
boolean flag=false;
for(int i=0;i<=n;i++)
{
a=i*i;
if(a==n)
{
flag=true;
break;
}
}
if(flag)
{
System.out.println("Yes");
}
else
{
System.out.println("No");
}
}
}
