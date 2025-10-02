import java.util.*;
public class FCP045{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int N=sc.nextInt();
int c=1;
for(int i=0;i<N;i++){
	for(int j=N-i-1;j>0;j--){
		System.out.print("  ");
	}
	
	for(int k=0;k<c;k++){
		System.out.print("* ");
	}
	c+=2;
	System.out.println();
}
}}