import java.util.*;
public class da{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int t=0;
int i=n,d;
while(i>0){
d=i%10;
int sum=1;
while(d>=1){
sum=sum*d;
d--;}
t=t+sum;
i=i/10;}
if(n==t&&n!=0){
System.out.println("yes");}
else
{
System.out.println("no");}}}

