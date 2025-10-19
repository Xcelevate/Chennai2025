import java.util.Scanner;

public class FCP091 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n <= 0 && n > 10) {
            return;
        }
        for (int i = 0; i < n; i++) {
            for (int s = 0; s < i; s++) {
                System.out.print(" ");
            }
            System.out.print(n - i);
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("_" + (n - j));
            }
            System.out.println();
        }
        for (int i = 1; i < n; i++) {
            for (int s = 0; s < n - 1 - i; s++) {
                System.out.print(" ");
            }
            System.out.print(i + 1);
            for (int j = 0; j < i; j++) {
                System.out.print("_" + (n - j));
            }
            System.out.println();
        }
    }
}