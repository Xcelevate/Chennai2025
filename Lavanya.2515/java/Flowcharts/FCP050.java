import java.util.*;
public class FCP050{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
long n=sc.nextLong();
long count=0;
boolean a=true;

for(long i=1;i<=n;i++){
 count=0;
  if(n%i==0){
for(long j=1;j<=i;j++){
   if(i%j==0){
     count++;}}}

   if(count==2){
System.out.println(i);
a=false;
}

}
if(a)
System.out.println();

}}  