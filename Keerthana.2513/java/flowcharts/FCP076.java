import java.util.*;
public class FCP076{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[][] arr=new int[n][n];
int min=0;
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
arr[i][j]=sc.nextInt();
}
}
min=arr[0][0];
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
if(min>arr[i][j])
{
min=arr[i][j];
}
}
}
System.out.println(min);
}}