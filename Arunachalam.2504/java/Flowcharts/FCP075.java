import java.util.*;
public class FCP075{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[][]=new int[n][n];
int c[][]=new int[n][n];
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
a[i][j]=s.nextInt();
}}
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
c[i][j]=a[j][i];
}}
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
System.out.println(c[i][j]);
}}}}
