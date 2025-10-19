import java.util.Scanner;

public class FCP026 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        long sum = 0;
        
        while (m <= n) {
            sum = sum + m;
            m = m + 1;
        }

        System.out.println(sum);
    }
}
