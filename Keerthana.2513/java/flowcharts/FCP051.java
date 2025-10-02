import java.util.*;
public class FCP051{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int a=0;
int n=sc.nextInt();
while(n>9)
{
int sum=0;
while (n!=0)
{
sum=sum+n%10;
n=n/10;
}
n=sum;
}
System.out.println(n);
}}



