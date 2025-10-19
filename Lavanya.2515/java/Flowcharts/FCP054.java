import java.util.*;
public class FCP054{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int [] arrays =new int[n];

for(int i=0;i<n;i++){
  arrays[i]=sc.nextInt();}

for(int i=n-1;i>=0;i--){
  System.out.println(arrays[i]);}

}}
