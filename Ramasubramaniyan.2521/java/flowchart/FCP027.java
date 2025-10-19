import java.util.Scanner;

public class FCP027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double sum = 0.0;

        for (int i = 1; i <= N; i++) {
            sum += 1.0 / i;
        }

        System.out.printf("%.2f", sum); // print rounded to 2 decimal places
    }
}
