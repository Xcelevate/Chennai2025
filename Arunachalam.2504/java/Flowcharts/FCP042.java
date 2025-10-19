import java.util.*;
public class FCP042{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
long a=0;
long b=1;
if(n>=1){
System.out.println(a);}
if(n>=2){
System.out.println(b);}
for(int i=3;i<=n;i++){
long c=a+b;
System.out.println(c);
a=b;
b=c;}}}
