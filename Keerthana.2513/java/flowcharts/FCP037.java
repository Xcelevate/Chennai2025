import java.util.*;
public class FCP037{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
long i=1;
long s=0;
long N=sc.nextLong();
while(i<N)
{
if(N%i==0)
{
s=s+i;
}
i++;
}
if(s==N)
{
System.out.println("Yes");
}
else
{
System.out.println("No");
}
}}