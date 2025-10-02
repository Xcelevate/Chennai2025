import java.util.*;
public class FCP033{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int x=n;
int r=0;
int u;
while(n>0){
u=n%10;
r=(r*10)+u;
n=n/10;
}
if(x==r){
System.out.println("yes");}
else{
System.out.println("no");}}}