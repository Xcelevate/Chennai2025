import java.util.Scanner;

public class FCP048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        for (int i = m; i <= n; i++) {
            int temp = i;
            int vals = 0;

            int a = i;
            while (a > 0) {
                vals++;
                a /= 10;
            }

            int sum = 0;
            a = i;

            while (a > 0) {
                int digit = a % 10;
                sum += (int)Math.pow(digit, vals);
                a /= 10;
            }

            if (sum == i) {
                System.out.println(i);
            }
        }
    }
}


