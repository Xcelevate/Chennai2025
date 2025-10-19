import java.util.*;
public class FCP042{
public static void main(String[]args){
Scanner sc =new Scanner(System.in);
long n=sc.nextLong();
long a=0;
long b=1;
long temp=0;
for(long i=1;i<=n;i++)
{
System.out.println(a);
temp=a+b;
a=b;
b=temp;
}
}}
