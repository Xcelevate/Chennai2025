import java.util.*;
public class FCP035{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int i=1;
int count=0;
int n=sc.nextInt();
while(i<=n)
{
if(n%i==0)
{
count=count+1;
}
i++;
}
if(count==2)
{
System.out.println("Yes");
}
else
{
System.out.println("No");
}
}}