import java.util.*;
public class FCP063{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int [] array=new int[n];
int count=0;
int max=0;

for(int i=0;i<n;i++){
   array[i]=sc.nextInt();}

for(int i=0;i<n;i++){
  if(array[i]==1){
    count++;
   if(count>max){
       max=count;}}
 else{
    count=0;}
}

System.out.print(max);

}}


