import java.util.*;
public class FCP059{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
int[] arr=new int[n];
int[] dup=new int[n];
int m=0;
boolean p=true;
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
for(int j=0;j<n-1;j++)
{
for(int k=j+1;k<n;k++)
{
p=true;
if(arr[j]==arr[k])
{
for(int v=0;v<m;v++)
{
if(dup[v]==arr[j]){
p=false;
break;
}
}
if(p){
dup[m]=arr[j];
m++;
}
}
}
}
for(int u=0;u<m;u++){
System.out.println(dup[u]);
}
}
}

                                             
 