import java.util.Scanner;
public class FCP039{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long a = sc.nextLong();
		long max = a;
		long min = a;

		for (long i=1 ; i<n; i++){
			long b = sc.nextLong();
			if (b>max){
				max=b;
			}
			if (b<min){
				min=b;
			}
		}
		System.out.println(max);
		System.out.println(min);
	}
}

		
