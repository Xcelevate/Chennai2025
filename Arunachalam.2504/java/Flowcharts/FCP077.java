import java.util.*;
public class FCP077{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[][]=new int[n][n];
int r=0,c=n/2;
for(int i=1;i<=n*n;i++){
a[r][c]=i;
if(i%n==0){
r++;}
else{
r--;
c--;
if(r<0){
r+=n;}
if(c<0){
c+=n;}}}
for(int i=0;i<n;i++){
for(int j=n-1;j>=0;j--){
System.out.println(a[i][j]);}}}}
