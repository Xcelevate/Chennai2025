import java.util.*;
public class FCP049{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int count=0;
int num=0;

for(int i=n-1;i>0;i--){
count=0;
 for(int j=1;j*j<=i;j++){
   if(i%j==0){
     if(j*j==i){
     count++;}
      else{
        count+=2;}}

if(count>2){break;}
}
 if(count==2){
   num++;}
}
System.out.print(num);

}}