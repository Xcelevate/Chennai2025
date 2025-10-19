import java.util.*;
public class FCP031
{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int r=0;
int n=s.nextInt();
while(n>0){
int u=n%10;
r=(r*10)+u;
n=n/10;
}
System.out.println(r);
}}