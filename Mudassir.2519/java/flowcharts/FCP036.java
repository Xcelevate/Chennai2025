import java.util.*;

public class FCP036 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int hcf = 1;

		int min = Math.min(a, b);
		for (int i = min; i > 0; i--) {
			if (a % i == 0 && b % i == 0) {
				hcf = i;
				break;
			}
		}

		long lcm = ((long) a * b) / hcf;
		System.out.println(hcf);
		System.out.println(lcm);
	}
}
