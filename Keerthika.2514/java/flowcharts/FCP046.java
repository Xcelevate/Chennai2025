import java.util.*;
public class FCP046{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int N=sc.nextInt();
for(int i=0;i<N;i++){
	for(int j=0;j<=i;j++){
	if(j==0||i==N-1||j==i){
		System.out.print("* ");
	}else{
		System.out.print("  ");
	}
	}
	System.out.println();
}
}}
	