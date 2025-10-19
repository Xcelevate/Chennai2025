import java.util.Scanner;

public class FCP089 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int t = (n + 1) / 2;
        int b = n / 2;
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("x  ");
            }
            for (int j = t - i; j > 0; j--) {
                System.out.print("0  ");
            }
            for (int j = n - t - i; j > 0; j--) {
                System.out.print("0  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("x  ");
            }
            System.out.println();
        }
        for (int i = b - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("x  ");
            }
            for (int j = t - i; j > 0; j--) {
                System.out.print("0  ");
            }
            for (int j = n - t - i; j > 0; j--) {
                System.out.print("0  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("x  ");
            }
            System.out.println();
        }
    }
}
