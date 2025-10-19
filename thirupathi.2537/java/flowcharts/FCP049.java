import java.util.Scanner;
public class FCP049 {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int c = 0;
        for (int i = 2; i < N; i++) {
            if (isPrime(i)) {
                c++;
            }
        }
        System.out.println(c);
    }
}
 