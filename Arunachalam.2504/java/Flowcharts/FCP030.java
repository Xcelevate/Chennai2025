import java.util.*;
public class FCP030{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int c=0;
for(int i=0;i<=n;i++)
{
if(i*i==n){
System.out.println("yes");
c=c+1;
break;
}
}
if(c!=1){
System.out.println("no");}
}}