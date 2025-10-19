import java.util.*;
public class cu{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int temp=n;
int len=0;
int arr[]=new int[20];
while(temp>0){
arr[len]=temp%10;
temp=temp/10;
len++;}
String ans="yes";
for(int i=len-1;i>0;i--){
if(arr[i]%2==arr[i-1]%2){
ans="no";}}
System.out.println(ans);}}
