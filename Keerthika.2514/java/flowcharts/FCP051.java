import java.util.*;
public class FCP051{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int N=sc.nextInt();

while(N/10>0){
	int m=N;
	N=0;
	while(m>0){
		int p=m%10;
		m=m/10;
		N=N+p;
	}
}
System.out.println(N);
}}