import java.util.Scanner;

public class FCP090 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int start = n - i;
            int end = n + 1 - i;
            for (int j = start; j <= end; j++) {
                System.out.print(j + " ");
            }
            for (int j = end - 1; j >= start; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
