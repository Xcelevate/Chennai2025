import java.util.Scanner;

public class FCP049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;

        for (int i = 2; i < n; i++) {
            int prime = 0;

            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    prime = 1;
                    break;
                }
            }

            if (prime == 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
