import java.util.*;
public class FCP017{
public static void main(String a[]){
Scanner s=new Scanner(System.in);
int x=s.nextInt();
int y=s.nextInt();
int z=s.nextInt();
int m=0;
int n=0;
if(x>y){
m=x;
n=y;
}
else{
m=y;
n=x;
}
if(z>m){
n=m;
m=z;}
else{
if(z>n){
n=z;}}
System.out.println(n);}}