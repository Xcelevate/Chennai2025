import java.util.*;
public class FCP{
public static void main(String [] args){
Scanner scan= new Scanner(System.in);
int a=scan.nextInt();
int b=scan.nextInt();
int c=scan.nextInt();
int d=scan.nextInt();
int m1=0;
int m2=0;
if(a<b){
m1=a;
m2=b;}
else{
m1=b;
m2=a;}
if(c<m1){
m2=m1;
m1=c;}
else if(c<m2){
m2=c;}
if(d<m1){
m2=m1;
m1=d;}
else if(d<m2){
m2=d;}
System.out.println(m2);
} }
