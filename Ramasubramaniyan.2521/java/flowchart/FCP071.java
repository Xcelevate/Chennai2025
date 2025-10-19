import java.util.Scanner;

public class FCP071 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < a[i]; j++) {
                System.out.print(">");
            }
            System.out.println();
        }
    }
}