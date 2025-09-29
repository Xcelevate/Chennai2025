import java.util.*;
public class FCP045{
public static void main(String []args){
Scanner Sc=new Scanner(System.in);
int N=Sc.nextInt();
for(int j=1; j<=N; j++){
	for(int s=1; s<=N-j; s++){
	System.out.print("  ");
	}
	for(int i= 1; i<=N+j; i++){
	if(i+j>N+1){
	System.out.print("* ");
	}
}
System.out.println();
}
}
}
