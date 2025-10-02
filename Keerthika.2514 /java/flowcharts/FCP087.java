import java.util.*;
public class FCP087{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int N=sc.nextInt();	
int r=2;
int s=2;
for(int i=0;i<N;i++){
	for(int j=0;j<=i;j++){
		System.out.print("*");
	}
	for(int j=N+N-i-r;j>0;j--){
		System.out.print(" ");
	}
	r++;
	for(int j=N+N-i;j<=N+N;j++){
		System.out.print("*");
	}	
System.out.println();
}
for(int i=0;i<N-1;i++){
	for(int j=N-1-i;j>0;j--){
		System.out.print("*");
	}
	for(int j=0;j<s;j++){
		System.out.print(" ");
	}
	s+=2;
	for(int j=N-i;j>1;j--){
		System.out.print("*");
	}
System.out.println();
}
}}