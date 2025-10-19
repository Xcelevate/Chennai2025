import java.util.*;
public class k{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
long n=s.nextInt();
int k=s.nextInt();
long c=0;
int d=0;
for(long i=n;i>0;i--){
if(n%i==0){
c=c+1;
if(c==k){
System.out.println(i);
d=d+1;
}
}}
if(d==0)
{
System.out.println("-1");}}}

