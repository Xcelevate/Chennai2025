import java.util.Scanner;

public class FCP041 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            long n = sc.nextInt();

            if (n < 3) {
                return;
            }

            long max = Long.MIN_VALUE;
            long smax = Long.MIN_VALUE;
            long tmax = Long.MIN_VALUE;

            for (long i = 0; i < n; i++) {
                long num = sc.nextLong();

                if (num > max) {
                    tmax = smax;
                    smax = max;
                    max = num;
                } else if (num > smax && num != max) {
                    tmax = smax;
                    smax = num;
                } else if (num > tmax && num != smax && num != max) {
                    tmax = num;
                }
            }
            System.out.println(tmax);
    }
}
