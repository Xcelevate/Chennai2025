import java.util.Scanner;

public class AltPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double X = sc.nextDouble();
        double sum = 0.0;
        for (int k = 1; k <= N; k++) {
            int exponent = 2 * k - 1;
            double term = Math.pow(X, exponent) / exponent;
            if (k % 2 == 0) {
                term = -term;
            }

            sum += term;
        }

        System.out.println(sum);
    }
}
