import java.util.*;
public class cy{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int c=0;
int t;
for(int i=1;i<=n;i++){
for(int j=2;j<=n;j++){
for(int k=3;k<=n;k++){
t=i+j+k;
if(i<j&&j<k){
if(t==n){
c=c+1;
break;}}
}}}
System.out.println(c);}}