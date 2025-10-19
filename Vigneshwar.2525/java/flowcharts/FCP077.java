import java.util.*;
public class FCP077{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b[][]=new int[a][a];
int c=0,d=a/2;
for(int e=1;e<=a*a;e++){
b[c][d]=e;
if(e%a==0){
c++;
}
else{
c--;
d--;
if(c<0){
c+=a;
}
if(d<0){
d+=a;
}}}
for(int f=0;f<a;f++){
for(int g=a-1;g>=0;g--){
System.out.println(b[f][g]);
}}}}
