import java.util.Scanner;
public class FCP080 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        int[] a = new int[n];
        int[] b = new int[m];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i] = scan.nextInt();
        }
        long s1 = 0;
        for (int i = 0; i < n; i++) {
            s1 = s1 * 10 + a[i];
        }
        long s2 = 0;
        for (int i = 0; i < m; i++) {
            s2 = s2 * 10 + b[i];
        }
        long p = s1 * s2;
        String ps = Long.toString(p);
        for (int i = 0; i < ps.length(); i++) {
            System.out.println(ps.charAt(i));
        }
    }
}
