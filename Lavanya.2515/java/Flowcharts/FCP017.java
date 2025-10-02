import java.util.*;
public class FCP017{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int max1=0;
int max2=0;
if(a>b){
max1=a;
max2=b;}
else{
max1=b;
max2=a;}
if(c>max1){
System.out.print(max1);}
else if(c>max2){
System.out.print(c);}
else{
System.out.print(max2);}
}}
