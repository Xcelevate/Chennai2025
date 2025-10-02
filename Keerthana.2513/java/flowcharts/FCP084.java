import java.util.*;
public class FCP084{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=1;i<n;i++)
{
int value=1;
for(int j=1;j<=i;j++)
{
System.out.print(value+" ");
value*=2;
}
System.out.println();
}
}}