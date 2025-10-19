import java.util.*;
public class FCP066{
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
int i=0,j=0,k=0,g=0;
int c[]=new int[n+m];
int d[]=new int[n+m];
while(i<n&&j<m){
if(a[i]<b[j]){
if(k==0||c[k-1]!=a[i]){
c[k]=a[i];
k++;}
i++;}
else if(a[i]>b[j]){
if(k==0||c[k-1]!=b[j]){
c[k]=b[j];
k++;}
j++;}
else{
if(k==0||c[k-1]!=a[i]){
c[k]=a[i];
k++;}
if(g==0||d[g-1]!=a[i]){
d[g]=a[i];
g++;}
i++;
j++;}}
while(i<n){
if(k==0||c[k-1]!=a[i]){
c[k]=a[i];
k++;}
i++;}
while(j<m){
if(k==0||c[k-1]!=b[j]){
c[k]=b[j];
k++;}
j++;}
for(i=0;i<k;i++){
System.out.println(c[i]);
}
for(i=0;i<g;i++){
System.out.println(d[i]);
}}}



