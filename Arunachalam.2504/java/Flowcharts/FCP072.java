import java.util.*;
public class FCP072{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
a[i]=s.nextInt();}
int m=0;
for(int i=0;i<n;i++){
if(a[i]>m)m=a[i];
}
for(int r=m;r>=1;r--){
for(int i=0;i<n;i++){
if(a[i]>=r)System.out.print("*");
else System.out.print(" ");
if(i<n-1)System.out.print(" ");
}
System.out.println();
}}}
