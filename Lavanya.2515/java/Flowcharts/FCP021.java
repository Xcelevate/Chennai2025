import java.util.*;
public class FCP021{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int d=sc.nextInt();
int e=sc.nextInt();
int f=sc.nextInt();
int g=sc.nextInt();
int h=sc.nextInt();
int m1,m2;
if(a>b){
m1=a;
m2=b;}
else{
m1=b;
m2=a;}

if(m2>c){}
 else if(m1>c){
       m2=c;}
     else{
      m2=m1;
      m1=c; }

 if(m2>d){}
 else if(m1>d){
       m2=d;}
     else{
      m2=m1;
      m1=d; }

if(m2>e){}
 else if(m1>e){
       m2=e;}
     else{
      m2=m1;
      m1=e; }

if(m2>f){}
 else if(m1>f){
       m2=f;}
     else{
      m2=m1;
      m1=f; }

if(m2>g){}
 else if(m1>g){
       m2=g;}
     else{
      m2=m1;
      m1=g; }

if(m2>h){}
 else if(m1>h){
       m2=h;}
     else{
      m2=m1;
      m1=h; }
System.out.print(m2);
}}

