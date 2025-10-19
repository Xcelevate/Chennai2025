import java.util.Scanner;
public class FCP003{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long temp = 0;

		temp = a;
		a = b;
		b = temp;
		
		System.out.println(a);
		System.out.println(b);
	}
}

