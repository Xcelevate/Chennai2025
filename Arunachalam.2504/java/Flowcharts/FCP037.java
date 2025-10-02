import java.util.*;
public class FCP037{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int sum=0;
if(n<=0){
System.out.println("no");
}
else{
for(int i=1;i<=n/2;i++){
if(n%i==0){
sum=sum+i;
}}
if(n==sum){
System.out.println("yes");}
else
{System.out.println("no");}}}}
