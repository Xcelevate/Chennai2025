import java.util.*;
public class FCP070{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
a[i]=s.nextInt();
}
int t=s.nextInt();
int m=0;
int r=n-1;
int l=0,c=0;
for(;l<=r;){
m=(l+r)/2;
if(a[m]==t){
System.out.println("yes");
c=c+1;
break;}
else if(a[m]<t){
l=m+1;}
else{
r=m-1;}
}
if(c!=1){
System.out.println("no");}}}

