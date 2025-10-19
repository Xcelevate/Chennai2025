import java.util.*;
public class FCP040{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int u=s.nextInt();
int a=s.nextInt();
int b=s.nextInt();
int m,n;
if(a>b){
m=a;
n=b;}
else{
m=b;
n=a;
}
for(int i=3;i<=u;i++){
int c=s.nextInt();
if(c>m){
n=m;
m=c;}
else{
if(c>n){
n=c;}
}}
System.out.println(n);}}