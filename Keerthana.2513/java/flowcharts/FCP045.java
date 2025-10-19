import java.util.*;
public class FCP045{
public static void main(String[]args){  
Scanner sc=new Scanner(System.in);
int l=1;
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n-i;j++)
{
System.out.print("  ");
}
for(int k=1;k<=l;k++)
{
System.out.print("* ");
}
l=l+2;
System.out.println();
}
}} 