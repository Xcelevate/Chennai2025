import java.util.Scanner;

public class FCP036 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int a = m;
        int b = n;

        // Find HCF using Euclidean algorithm
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        int hcf = a;

        // Calculate LCM first using long to avoid overflow
        long lcm = (1L * m * n) / hcf;

        // Output in required order
        System.out.println(hcf);
        System.out.println(lcm);
    }
}
