import java.util.*;
public class FCP038{
public static void main(String [] args){
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int temp=n;
int r=0;
int sum=0;
while(n>0){
r=n%10;
sum=sum+(r*r*r);
n=n/10;}
if(temp==sum){
System.out.println("YES");}
else{
System.out.println("No");}
}
}