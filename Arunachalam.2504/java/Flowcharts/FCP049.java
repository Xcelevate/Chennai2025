import java.util.*;
public class FCP049{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int c=0;
if(n>=2){
for(int i=2;i<n;i++){
int d=0;
for(int j=1;j*j<=i;j++){
if(i%j==0){
if(j*j==i){
d=d+1;
}else{
d=d+2;
}}
}
if(d==2){
c=c+1;
}}
}
System.out.println(c);}}
