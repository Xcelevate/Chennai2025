import java.util.Scanner;

public class FCP086 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                if (k < 2 * i - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                if (k < 2 * i - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
