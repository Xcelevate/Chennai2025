import java.util.*;
public class FCP058{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
int temp=n;
int []arr=new int[n+1];
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
int m=sc.nextInt();
int x=sc.nextInt();
int j=n;
while(j>=m-1)
{
if(m-1<j)
{
arr[n]=arr[n-1];
n=n-1;
}
else
{
arr[j]=x;
}
j--;
}
for(int r=0;r<temp+1;r++)
{
System.out.println(arr[r]);
}
}}