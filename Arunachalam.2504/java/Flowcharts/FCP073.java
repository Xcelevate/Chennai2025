import java.util.*;
public class FCP073{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[][]=new int[n][n];
int b[][]=new int[n][n];
int c[][]=new int[n][n];
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
a[i][j]=s.nextInt();
}}
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
b[i][j]=s.nextInt();
}}
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
c[i][j]=a[i][j]+b[i][j];
}}
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
System.out.println(c[i][j]);
}}}}
