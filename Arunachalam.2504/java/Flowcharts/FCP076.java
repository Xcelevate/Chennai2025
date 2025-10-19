import java.util.*;
public class FCP076{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[][]=new int[n][n];
int c[][]=new int[n][n];
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
a[i][j]=s.nextInt();
}}
int k=0,g=0;
int m=a[k][g];
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
if(m>=a[i][j]){
m=a[i][j];}}}
System.out.println(m);
}}
  