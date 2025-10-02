import java.util.*;
public class FCP062{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] arr=new int[n+1];
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
int k=sc.nextInt();
for(int r=0;r<k;r++)
{
int temp=0;
for(int l=0;l<n-1;l++)
{
temp=arr[l];
arr[l]=arr[l+1];
arr[l+1]=temp;
}
}
for(int z=0;z<n;z++)
{
System.out.println(arr[z]);
}
}}