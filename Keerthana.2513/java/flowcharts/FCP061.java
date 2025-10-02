import java.util.*;
public class FCP061{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] arr=new int[n];
boolean[] counted=new boolean[n];
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
counted[i] = false; 
}
for(int k=0;k<n;k++)
{
if(counted[k]==true)
{  
continue;   
}
int count=1;
int s=k+1;
while(s<n)
{
if(arr[k]==arr[s])
{
count++;
counted[s]=true;
}
s++;
}
System.out.println(arr[k] + " - " + count);
counted[k] = true;
}
}}
            