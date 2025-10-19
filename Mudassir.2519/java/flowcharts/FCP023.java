import java.util.Scanner;
public class FCP023{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		sc.nextLine();
		String name = sc.nextLine();

		for (long i = 0; i<a; i++){
			System.out.println(name);
		}
	}
}
			
		