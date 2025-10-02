import java.util.*;
public class FCP055{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int [] arrays =new int[n];
int c=0;
for(int i=0;i<n;i++){
 arrays[i]=sc.nextInt();}

int m=sc.nextInt();

for(int i=0;i<n;i++){
 if(arrays[i]==m){
  c =arrays[i];}}

if(c==m){
   System.out.print("Yes");}

else{
System.out.print("No");}

}}
