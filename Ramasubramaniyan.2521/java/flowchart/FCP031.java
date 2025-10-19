import java.util.Scanner;
public class FCP031 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        if (n <= 1) {
            System.out.println("No");
            return;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }
}
