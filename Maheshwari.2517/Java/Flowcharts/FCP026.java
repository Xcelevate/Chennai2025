import java.util.Scanner;

public class FCP026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); 

        for (int t = 0; t < T; t++) {
            int M = sc.nextInt();
            int N = sc.nextInt();
            int sum = 0;

            for (int i = M; i <= N; i++) {
                sum += i;
            }

            System.out.println(sum);
        }
    }
}
