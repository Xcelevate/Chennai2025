import java.util.Scanner;
public class FCP030 {
    static boolean isPerfectSquare(int n) {
        for (int i = 1; i * i <= n; i++) {
            if ((n % i == 0) && (n / i == i)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0 || isPerfectSquare(n))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
