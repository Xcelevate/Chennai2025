import java.util.*;
public class FCP079{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int m=s.nextInt();
int a[]=new int[n];
int b[]=new int[m];
for(int i=0;i<n;i++){
a[i]=s.nextInt();
}
for(int i=0;i<m;i++){
b[i]=s.nextInt();
}
int c=(n>m?n:m);
int g[]=new int[c+1];
int i=n-1,j=m-1,k=c,d=0;
while(i>=0||j>=0){
int sum=d;
if(i>=0) sum+=a[i];
if(j>=0) sum+=b[j];
g[k]=sum%10;
d=sum/10;
i--;j--;k--;
}
g[k]=d;
if(g[0]==0){
for(int x=1;x<g.length;x++){
System.out.println(g[x]);
}}
else{
for(int x=0;x<g.length;x++){
System.out.println(g[x]);
}}}}
