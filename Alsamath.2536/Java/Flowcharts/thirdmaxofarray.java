import java.util.*;

public class thirdmaxofarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if (n < 3 || n > 10000) {
            return; // N must be at least 3
        }

        long max = -1, secondMax = -1, thirdMax = -1; // numbers can be up to 10^8

        for (int i = 0; i < n; i++) {
            long num = sc.nextLong();

            if (num >= max) {
                thirdMax = secondMax;
                secondMax = max;
                max = num;
            } else if (num >= secondMax) {
                thirdMax = secondMax;
                secondMax = num;
            } else if (num >= thirdMax) {
                thirdMax = num;
            }
        }

        System.out.println(thirdMax);
    }
}
