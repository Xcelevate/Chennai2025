import java.util.*;
public class FCP068{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int []arr=new int[n];
int sum=0;
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
int s=sc.nextInt();
for(int j=0;j<n;j++)
{
sum=0;
for(int k=j;k<n;k++)
{
sum=arr[k]+sum;
if(sum==s)
{
for(int z=j;z<=k;z++)
{
System.out.println(arr[z]);
}
return;
}
}
}
}}