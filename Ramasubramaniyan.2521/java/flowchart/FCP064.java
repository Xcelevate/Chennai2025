import java.util.Scanner;

public class FCP064 {
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

        int[] merged = new int[m + n];
        int i = 0, j = 0;
        for (int k = 0; k < m + n; k++) {
            if (i == m) {
                merged[k] = arr2[j];
                j++;
            } else {
                if (j == n) {
                    merged[k] = arr1[i];
                    i++;
                } else {
                    if (arr1[i] < arr2[j]) {
                        merged[k] = arr1[i];
                        i++;
                    } else {
                        merged[k] = arr2[j];
                        j++;
                    }
                }
            }
        }

        for (int x = 0; x < m + n; x++) {
            System.out.println(merged[x] );
        }
        sc.close();
    }
}
