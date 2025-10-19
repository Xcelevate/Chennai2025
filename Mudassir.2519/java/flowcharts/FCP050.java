import java.util.Scanner;

public class FCP050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                while (n % i == 0) {
                    n /= i;
                }
            }
        }
        if (n > 1) {
            System.out.print(n);
        }
    }
}
