import java.util.*;
public class FCP060{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[]arr=new int[n];
for(int i=0;i<=n;i++)
{
for(int j=1;j<i;j++)
{
System.out.println(arr[j]);
}
}
}}