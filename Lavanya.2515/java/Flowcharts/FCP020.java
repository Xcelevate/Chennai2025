
import java.util.*;
public class FCP020{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int d=sc.nextInt();
int m1,m2;
if(a>b){
  m1=a;
  m2=b;}
else{
  m1=b;
  m2=a;}

if(m1>c){
  if(m2>c){}
   else{m2=c;}
}else{m2 = m1;m1 = c;}
 
if(m1>d){
  if(m2>d){}
   else{m2=d;}
}else{m2 = m1;m1 = d;}
 
System.out.print(m2); 
}}