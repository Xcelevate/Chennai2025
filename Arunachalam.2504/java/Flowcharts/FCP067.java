import java.util.*;
public class FCP067{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
a[i]=s.nextInt();}
for(int i=0;i<n-1;i++){
int j=0;
while(n-1-i>j){
if(a[j]>a[j+1]){
int temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;}
j++;}}
int k=0;
while(k<n){
System.out.println(a[k]);
k++;}}}
