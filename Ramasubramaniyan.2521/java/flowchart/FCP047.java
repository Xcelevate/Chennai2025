import java.util.Scanner;

public class FCP047 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (2 <= n && n <= 1000) {
			int num1 = sc.nextInt();

			for (int i = 1; i < n; i++) {

				int c = sc.nextInt();
				int a = num1;
				int b = c;
				while (b > 0) {
					int temp = b;
					b = a % b;
					a = temp;

				}
				num1 = a;

			}
			System.out.println(num1);
		}
	}
}
