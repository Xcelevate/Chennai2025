// Rotate array by k positions
import java.util.Scanner;

public class FCP062 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        int k = s.nextInt();
        k=k%n;
        for (int m = 0; m < k; m++) {
            int first = a[0];
            for (int i = 0; i < n-1; i++) {
                a[i] = a[i+1];
            }
            a[n - 1] = first;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}