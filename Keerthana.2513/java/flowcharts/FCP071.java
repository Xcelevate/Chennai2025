import java.util.*;
public class FCP071{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int []arr=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
for(int k=0;k<n;k++)
{
for(int j=0;j<arr[k];j++)
{
System.out.print(">");
}
System.out.println();
}
}}