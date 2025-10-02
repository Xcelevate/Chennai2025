import java.util.*;
public class FCP055{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int count=0;
int n=sc.nextInt();
int []arr=new int[n]; 
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
int j=0;
int r=sc.nextInt();
while(j<n)
{
if(arr[j]==r)
{
count++;
}
j++;
}
if(count>=1)
{
System.out.println("Yes");
}
else
{
System.out.println("No");
}
}}
