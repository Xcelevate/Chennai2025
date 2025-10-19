import java.util.*;
public class FCP015{
public static void main(String a[]){
Scanner s=new Scanner(System.in);
int max=0;
int max1=0;
int x=s.nextInt();
int y=s.nextInt();
int z=s.nextInt();
int v=s.nextInt();
if(x>y){
max=x;
}
else{
max=y;
}
if(max>z){
max1=max;
}
else{
max1=z;
}
if(max1>v){
System.out.println(max1);
}
else{
System.out.println(v);
}}}

