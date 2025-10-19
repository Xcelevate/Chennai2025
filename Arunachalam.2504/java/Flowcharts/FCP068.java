import java.util.*;
public class FCP068{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
a[i]=s.nextInt();}
int m=s.nextInt();
int sum=0;
int si=0,ei=0;
for(int i=0;i<n;i++){
sum=0;
for(int j=i;j<n;j++){
sum=sum+a[j];
if(sum==m){
si=i;
ei=j;
i=n;
break;}
if(sum>m){
break;}
}}
for(int i=si;i<=ei;i++){
System.out.println(a[i]);}
}}
