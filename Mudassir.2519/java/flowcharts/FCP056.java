import java.util.Scanner;

public class FCP056 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int oddsum = 0, evensum = 0;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num % 2 == 0) {
                evensum += num;
            } else {
                oddsum += num;
            }
        }

        System.out.println(oddsum);
        System.out.println(evensum);
    }
}
