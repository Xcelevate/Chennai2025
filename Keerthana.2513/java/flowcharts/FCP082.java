import java.util.*;
public class FCP082{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=n;
for(int i=1;i<=m;i++)
{
	for(int j=1;j<=n;j++)
	{
	System.out.print("* ");
	}
n=n-1;
System.out.println();
}
}}