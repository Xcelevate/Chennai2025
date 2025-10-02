import java.util.*;
public class FCP074{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[][]arr=new int[n][n];
int[][]arr1=new int[n][n];
int[][]array=new int[n][n];
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
arr[i][j]=sc.nextInt();
}
}
for(int l=0;l<n;l++)
{
for(int r=0;r<n;r++)
{
arr1[l][r]=sc.nextInt();
}
}
for(int k=0;k<n;k++)
{
for(int m=0;m<n;m++)
{
array[k][m]=arr[k][m]-arr1[k][m];
}
}
for(int y=0;y<n;y++)
{
for(int z=0;z<n;z++)
{
System.out.println(array[y][z]);
}
}
}}