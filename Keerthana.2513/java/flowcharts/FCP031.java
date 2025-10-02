import java.util.*;
public class FCP031{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int l=0;
int q=0;
int n=sc.nextInt();
while(n!=0)
{
	l=n%10;
	n=n/10;
	q=(q*10)+l;
}
System.out.println(q);
}}