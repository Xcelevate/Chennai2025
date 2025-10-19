import java.util.Scanner;
public class FCP040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 2) {
            return;
        }

        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int b = sc.nextInt();

            if (b > max) {
                smax = max;
                max = b;
            } else if (b > smax && b != max) {
                smax = b;
            }
        }

        System.out.println(smax);
    }
}

