import java.util.*;
public class FCP063{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] arr=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
int maxcount=0;
int count=0;
for(int j=0;j<n;j++)
{
if(arr[j]==1)
{
count=count+1;
if(count>maxcount)
{
maxcount=count;
}
}
else
{
count=0;
}
}
System.out.println(maxcount);
}}