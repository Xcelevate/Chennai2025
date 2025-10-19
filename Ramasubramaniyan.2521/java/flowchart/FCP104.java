import java.util.Scanner;

public class FCP104 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0;

        for (int i = 1; i <= n; i++) {
            int t = i;
            boolean isEven = true;

            while (t > 0) {
                int digit = t % 10;
                if (digit % 2 != 0) {
                    isEven = false;
                    break;
                }
                t /= 10;
            }

            if (isEven) {
                count++;
            }
        }

        System.out.println(count);
    }
}
