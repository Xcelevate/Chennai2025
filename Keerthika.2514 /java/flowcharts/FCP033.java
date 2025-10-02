import java.util.*;
public class FCP033{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=0;
int a=0;
int b=0;
m=n;
while(n>0){
	a=n%10;
	b=b*10+a;
	n=n/10;
}
if(b==m){
	System.out.println("Yes");
}else{
	System.out.println("No");
}
}}