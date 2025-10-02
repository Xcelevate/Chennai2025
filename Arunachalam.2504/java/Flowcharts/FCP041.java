import java.util.*;
public class FCP041{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int u=s.nextInt();
if(u>=3){
int a=s.nextInt();
int b=s.nextInt();
int m,n,m1;
m1=Integer.MIN_VALUE;
if(a>b){
m=a;
n=b;}
else{
m=b;
n=a;}
for(int i=3;i<=u;i++){
int c=s.nextInt();
if(c==m || c==n || c==m1){
continue;}
if(c>m){
m1=n;
n=m;
m=c;}
else{
if(c>n){
m1=n;
n=c;}
else{
if(c>m1){
m1=c;}}}}
System.out.println(m1);}
}}
