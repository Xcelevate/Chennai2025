
//Median of two sorted arrays
import java.util.Scanner;

public class FCP065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] a = new int[m];
        int[] b = new int[n];
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        int[] mer = new int[m + n];
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (a[i] < b[j]) {
                mer[k] = a[i];
                i++;
                k++;
            } else {
                mer[k] = b[j];
                j++;
                k++;
            }
        }
        while (i < m) {
            mer[k] = a[i];
            i++;
            k++;
        }
        while (j < n) {
            mer[k] = b[j];
            j++;
            k++;
        }
        if ((m + n) % 2 == 0) {
            int mid = (m + n) / 2;
            System.out.println((mer[mid] + mer[mid - 1]) / 2.0);
        } else {
            int mid = (m + n) / 2;
            System.out.println((float)(mer[mid]));
        }

    }
}
