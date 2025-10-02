import java.util.*;
public class FCP015{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int d=sc.nextInt();
int m1=0;
int m2=0;
if(a>b){
m1=a;}
else {
m1=b;}
if(c>d){
m2=c;}
else{
m2=d;}
if(m1>m2){
System.out.println(m1);}
else{
System.out.println(m2);}
}}