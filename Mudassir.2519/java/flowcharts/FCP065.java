import java.util.*;

public class FCP065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[] arr1 = new int[m];
        int[] arr2 = new int[n];

        for (int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] sum = new int[m + n];
        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
            if (arr1[i] <= arr2[j]) {
                sum[k++] = arr1[i++];
            } else {
                sum[k++] = arr2[j++];
            }
        }
        while (i < m) {
            sum[k++] = arr1[i++];
        }
        while (j < n) {
            sum[k++] = arr2[j++];
        }

        int total = m + n;
        double median;
        if (total % 2 == 1) {
            median = sum[total / 2];
        } else {
            median = (sum[(total / 2) - 1] + sum[total / 2]) / 2.0;
        }

        System.out.println(median);
    }
}
