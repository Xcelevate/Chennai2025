import java.util.Scanner;
public class FCP042{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long sum =0;
		long ft =0;
		long st =1;
		for(long i =1; i<=n; i++){
			System.out.println(ft);
			sum= (long)ft+st;
			ft = st;
			st = sum;
		}
	}
}
