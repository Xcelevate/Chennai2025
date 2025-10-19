import java.util.*;
public class FCP047{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a=s.nextInt();
int b=s.nextInt();
int max,min;
int h=0,h1=0;
if(a>b){
max=a;
}
else{
max=b;}
for(int k=1;k<=max;k++){
if(a%k==0){
if(b%k==0){
h=k;}}}
if(n==2){
System.out.println(h);}
else{
for(int c=3;c<=n;c++){
int i=s.nextInt();
for(int j=1;j<=i;j++){
if(i%j==0){
h1=j;}
if(h==h1){
h=h1;}}}
System.out.println(h);}}}


