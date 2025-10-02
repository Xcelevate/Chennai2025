import java.util.*;
public class FCP029{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int a=0;
int s=0;
int n=sc.nextInt();
while(n!=0)
{
	a=n%10;
	s=s+a;
	n=n/10;
}
System.out.println(s);
}}