import java.util.*;
public class FCP031{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int number=sc.nextInt();
int a=0;
int p=0;
while(number>0){
	p=number%10;
	a=a*10+p;
	number=number/10;
}
System.out.println(a);
}}