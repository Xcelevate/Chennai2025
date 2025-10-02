import java.util.*;
public class FCP070{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int []arr=new int[n];
int mid=0;
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
int x=sc.nextInt();
mid=n/2;
if(arr[mid]==x)
{
System.out.println("Yes");
return;
}
else if(arr[mid]<x)
{
for(int j=mid+1;j<n;j++)
{
if(arr[j]==x)
{
System.out.println("Yes");
return;
}
}
}
else
{
for(int j=mid-1;j>=0;j--)
{
if(arr[j]==x)
{
System.out.println("Yes");
return;
}
}
}
System.out.println("No");
}}
