import java.util.*;
public class Chocolate{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int X=sc.nextInt();
		int N=sc.nextInt();
		int result=0;int S=0; int R=0;
		if(N>X){
			R=N-X;
			S=R*2;
			result=X+S;

		}else {
			result=N;
		}
		System.out.println(result);
	}
}

		