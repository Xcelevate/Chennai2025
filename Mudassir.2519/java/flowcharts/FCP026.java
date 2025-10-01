import java.util.Scanner;
public class FCP026{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		long sum = 0;
		for(int i =M; i<=N; i++){
			sum= (long)sum+i;
		}
		System.out.println(sum);
	}
}
