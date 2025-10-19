import java.util.*;
public class FCP038{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int d=1;
int sum=0;
int x=n;
while(x>0){
d=x%10;
sum=sum+(d*d*d);
x=x/10;}
if(sum==n){
System.out.println("yes");
}
else{
System.out.println("no");
}}}

