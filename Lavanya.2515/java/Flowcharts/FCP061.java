import java.util.*;
public class FCP061{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int [] arr=new int[n];
int [] arr1=new int[n];


for(int i=0;i<n;i++){
 arr[i]=sc.nextInt();}
int key=-1;

for(int i=0;i<n;i++){
  int count=1;
for(int j=i+1;j<n;j++){
  if(arr[i]==arr[j]){
     arr1[j]=key;
   count++;}}

if(arr1[i]!=key){
 arr1[i]=count;}
}
for(int i=0;i<n;i++){
 if(arr1[i]!=key){
    System.out.println(arr[i]+" - "+arr1[i]);}}

}}