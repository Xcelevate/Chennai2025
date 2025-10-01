import java.util.*;

public class FCP066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[] a = new int[m];
        int[] b = new int[n];

        for (int i = 0; i < m; i++) a[i] = sc.nextInt();
        for (int i = 0; i < n; i++) b[i] = sc.nextInt();

        int i = 0, j = 0;
        int lu = -1;

        while (i < m && j < n) {
            if (a[i] < b[j]) {
                if (a[i] != lu) {
                    System.out.println(a[i]);
                    lu = a[i];
                }
                i++;
            } else if (a[i] > b[j]) {
                if (b[j] != lu) {
                    System.out.println(b[j]);
                    lu = b[j];
                }
                j++;
            } else {
                if (a[i] != lu) {
                    System.out.println(a[i]);
                    lu = a[i];
                }
                i++;
                j++;
            }
        }

        while (i < m) {
            if (a[i] != lu) {
                System.out.println(a[i]);
                lu = a[i];
            }
            i++;
        }

        while (j < n) {
            if (b[j] != lu) {
                System.out.println(b[j]);
                lu = b[j];
            }
            j++;
        }

        i = 0; 
        j = 0;
        int li = -1;

        while (i < m && j < n) {
            if (a[i] < b[j]) i++;
            else if (a[i] > b[j]) j++;
            else {
                if (a[i] != li) {
                    System.out.println(a[i]);
                    li = a[i];
                }
                i++;
                j++;
            }
        }
    }
}
