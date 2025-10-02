import java.util.*;
public class FCP084{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int N=sc.nextInt();
int a=0;
System.out.println(a+" ");
a=a+2;
for(int i=2;i<=N;i++){
System.out.print(a+" ");
a=a*2;
	for(int j=2;j<=i;j++){
		System.out.print(a+" ");
	}
System.out.println();
}
}}