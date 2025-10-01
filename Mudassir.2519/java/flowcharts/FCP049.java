import java.util.*;
public class FCP049{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long count = 0;

        for (long i = 2; i < n; i++) {
            boolean prime = true;

            for (long j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                count++;
            }
        }

        System.out.println(count);
    }
}
