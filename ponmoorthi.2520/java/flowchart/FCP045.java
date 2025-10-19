import java.util.*;
public class FCP045{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int N=sc.nextInt();
int c=1;
for(int s=0;s<N;s++){
	for(int j=N-s-1;j>0;j--){
		System.out.print("  ");
	}
	
	for(int m=0;m<c;m++){
		System.out.print("* ");
	}
	c+=2;
	System.out.println();
}
}}