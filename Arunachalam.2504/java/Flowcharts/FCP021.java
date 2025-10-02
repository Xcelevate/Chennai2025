import java.util.*;
public class FCP021
{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
int d=s.nextInt();
int e=s.nextInt();
int f=s.nextInt();
int g=s.nextInt();
int h=s.nextInt();
int m,n;
if(a>b){
m=a;
n=b;
}
else{
m=b;
n=a;}
if(c>m){
n=m;
m=c;}
else{
if(c>n){
n=c;}}
if(d>m){
n=m;
m=d;
}
else{
if(d>n){
n=d;
}}
if(e>m){
n=m;
m=e;
}
else{
if(e>n){
n=e;
}}
if(f>m){
n=m;
m=f;
}
else{
if(f>n){
n=f;
}}
if(g>m){
n=m;
m=g;
}
else{
if(g>n){
n=g;
}}
if(h>m){
n=m;
m=h;
}
else{
if(h>n){
n=d;
}}
System.out.println(n);}}
