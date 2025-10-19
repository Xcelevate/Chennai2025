import java.util.Scanner;
public class FCP043 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        double sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += Math.pow(X, i) / (double) i;
        }
        long result = Math.round(sum);
        System.out.println(result);
    }
}
