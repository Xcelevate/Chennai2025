
import java.util.*;

public class FCP094 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}

			for (int k = 0; k < n - i; k++) {
				if (i == 0 || k == 0 || k == n - i - 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}

			}

			System.out.println();
		}
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}

			for (int k = 0; k <= i; k++) {

				if (i == n - 1 || k == 0 || k == i) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
