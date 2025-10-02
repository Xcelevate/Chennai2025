import java.util.*;
public class FCP020{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
int d=s.nextInt();
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
System.out.println(n);}}
