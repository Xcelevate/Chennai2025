import java.util.Scanner;

public class FCP058 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int x = sc.nextInt();

        for (int i = n; i >= m; i--) {
            arr[i] = arr[i - 1];
        }
        arr[m - 1] = x;

        for (int i = 0; i <= n; i++) {
            System.out.println(arr[i]);
		}
    }
}
