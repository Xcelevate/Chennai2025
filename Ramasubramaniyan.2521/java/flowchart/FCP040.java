import java.util.Scanner;

public class FCP040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Ensure at least 2 numbers
        if (n < 2) {
            return;
        }

        int max1 = -1;
        int max2 = -1;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2 && num < max1) {
                max2 = num;
            }
        }

        System.out.println(max2);
    
    }
}