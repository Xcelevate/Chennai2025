import java.util.*;
public class FCP056{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int [] arrays =new int[n];
int even=0;
int odd=0;
for(int i=0;i<n;i++){
 arrays[i]=sc.nextInt();}

for(int i=0;i<n;i++){
 if(arrays[i]%2==0){
  even+=arrays[i];}
 else{
  odd+=arrays[i];}}

   System.out.println(odd);

   System.out.println(even);

}}
