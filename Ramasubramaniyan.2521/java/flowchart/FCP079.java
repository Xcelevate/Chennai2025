import java.util.Scanner;

public class FCP079 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int a[] = new int[m];
        int b[] = new int[n];
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            sum1 = sum1 * 10 + a[i];
        }
        for (int i = 0; i < n; i++) {
            sum2 = sum2 * 10 + b[i];
        }
        int tot = sum1 + sum2;
        int c = 0, temp = tot;
        if (temp == 0) {
            c = 1;
        } else {
            while (temp > 0) {
                c++;
                temp /= 10;
            }
        }
        int res[] = new int[c];
        for (int i = 0 ; i < c; i++) {
            res[i] = (int)tot % 10;
            tot /= 10;
        }
         for (int i = c-1; i>=0; i--) {
            System.out.println(res[i]);
        }


    }
}