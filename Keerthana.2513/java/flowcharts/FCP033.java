import java.util.*;
public class FCP033{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=0;
m=n;
int l=0;
int q=0;
while(n!=0)
{
	l=n%10;
	n=n/10;
	q=(q*10)+l;
}
if(q==m){
	System.out.println("Yes");
}
else{
	System.out.println("No");
}
}}