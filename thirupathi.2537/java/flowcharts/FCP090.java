import java.util.Scanner;
public class FCP090 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int j = i; j <= i + n; j++) {
                if (j <= n + 1) {
                    System.out.print(j + " ");
                } else {
                    System.out.print((2 * (n + 1) - j) + " ");
                }
            }
            System.out.println();
        }
    }
}
