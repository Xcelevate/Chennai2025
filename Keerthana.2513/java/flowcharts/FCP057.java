import java.util.*;
public class FCP057{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();
int[] arr=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
for(int j=0;j<n-1;j++)
{
if((m-1)==j)
{
arr[m-1]=arr[m];
System.out.println(arr[j]);
m++;
}
else
{
System.out.println(arr[j]);
}
}
}}

 