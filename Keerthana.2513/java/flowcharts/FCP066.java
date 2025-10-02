import java.util.*;
public class FCP066{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int m=sc.nextInt();   
int n=sc.nextInt();
int s=m+n;
int d=0;
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
else if(arr1[j]<arr[i])  
{
arr2[k]=arr1[j];
j++;
}
else   
{
arr2[k]=arr[i];  
i++;
j++;
}
k++;
}
while(i<m)
{
arr2[k]=arr[i];  
i++;
k++;
}
while(j<n){
arr2[k]=arr1[j];  
j++;
k++;
}
{
if(d>0 && arr2[d]==arr2[d-1])
{
continue;
}
else
{
System.out.println(arr2[d]);
}
}
i=0; j=0;
while(i<m && j<n)
{
if(arr[i]<arr1[j]){
i++;
}
else if(arr1[j]<arr[i])
{
j++;
}
else
{   
System.out.println(arr[i]);
i++;
j++;
    }
}

}
}
