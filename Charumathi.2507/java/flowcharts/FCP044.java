import java.util.*;
public class FCP044{
public static void main(String []args){
Scanner Sc=new Scanner(System.in);
int N=Sc.nextInt();
for(int j=1; j<=N; j++){
	for(int i=1; i<=j; i++){
	System.out.print("* ");
	}
	System.out.println();
	}
}
}