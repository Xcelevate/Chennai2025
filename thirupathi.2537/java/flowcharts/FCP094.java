import java.util.Scanner;
public class FCP094 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = 2 * n + 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 || i == m - 1) {
                    System.out.print("*");
                } else if (j == 0 || j == m - 1) {
                    System.out.print("*");
                } else if (i == j || j == m - i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
