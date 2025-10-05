package DomJudge;

import java.util.Scanner;

public class FCP065 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        long array1[] = new long[a];
        long array2[] = new long[b];

        for (int i = 0; i < a; i++) {
            array1[i] = scanner.nextInt();

        }
        for (int i = 0; i < b; i++) {
            array2[i] = scanner.nextInt();

        }
        long total[] = new long[a + b];
        int i = 0, j = 0, k = 0;
        while (i < a && j < b) {
            if (array1[i] <= array2[j]) {
                total[k++] = array1[i++];
            } else {
                total[k++] = array2[j++];
            }
        }
        while (i < a) {
            total[k++] = array1[i++];
        }
        while (j < b) {
            total[k++] = array2[j++];
        }

        int n = total.length;
        double median;
        if (n % 2 == 1) {
            median = total[n / 2];

        } else {
            median = (total[n / 2 - 1] + total[n / 2]) / 2.0;
        }
        System.out.printf("%.1f",median);
    }
}


