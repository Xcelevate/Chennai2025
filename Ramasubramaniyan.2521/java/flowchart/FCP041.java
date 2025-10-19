import java.util.Scanner;

public class FCP041 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long a = scan.nextLong();
        long b = scan.nextLong();
        long c = scan.nextLong();
        long max1 = a, max2 = b, max3 = c;
        if (max1 < max2) {
            long t = max1;
            max1 = max2;
            max2 = t;
        }
        if (max1 < max3) {
            long t = max1;
            max1 = max3;
            max3 = t;
        }
        if (max2 < max3) {
            long t = max2;
            max2 = max3;
            max3 = t;
        }
        for (int i = 3; i < n; i++) {
            long num = scan.nextLong();

            if (num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max3 = max2;
                max2 = num;
            } else if (num > max3) {
                max3 = num;
            }
        }

        System.out.println(max3);
    }
}
