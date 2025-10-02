import java.util.*;
public class ct{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
int m1,d,m2,m3;
if(a>b){
m1=a;
m2=b;}
else{
m1=b;
m2=a;}
if(c>m1){
m3=m2;
m2=m1;
m1=c;}
else{
m3=c;}
if(a+b>c && a+c>b && b+c>a){
d=(m1*m1)-((m2*m2)+(m3*m3));
if(d<0){
System.out.println("Acute");}
else if(d==0){
System.out.println("Right");}
else{
System.out.println("Obtuse");}}
else{
System.out.println("Invalid");}}}
