
import java.util.*;
public class FCP025
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int sum=0;
int i=0;
while(i<=a)
{
if(i%2==1)
{
sum=i+sum;
}
i++;
}
System.out.println(sum);

}}
