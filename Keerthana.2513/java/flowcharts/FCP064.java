import java.util.*;
public class FCP064{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int m=sc.nextInt();
int n=sc.nextInt();
int s=0;
s=m+n;
int[] arr=new int[m];
int[] arr1=new int[n]; 
int[] arr2=new int[s];
for(int i=0;i<m;i++)
{
arr[i]=sc.nextInt();
}
for(int j=0;j<n;j++)
{
arr1[j]=sc.nextInt();
}
int i=0; 
int j=0; 
int k=0;
while(i<m && j<n)
{
if(arr[i]<arr1[j])
{
arr2[k]=arr[i];
i++;
}
else
{
arr2[k]=arr1[j];
j++;
}
k++;
}
while(i<m){
arr2[k]=arr[i];
i++;
k++;
}
while(j<n){
arr2[k]=arr1[j];
j++;
k++;
}
for(int d=0;d<s;d++)
{
System.out.println(arr2[d]);
}
}}