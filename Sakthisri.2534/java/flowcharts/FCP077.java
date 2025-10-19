
import java.util.*;

public class FCP077 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a[][] = new int[n][n];

        int r = 0, c = n / 2;

        for (int x = 1; x <= n * n; x++) {
            a[r][c] = x;
            int newr = (r - 1 + n) % n;
            int newc = (c + 1) % n;
            if (a[newr][newc] != 0) {
                r = (r + 1) % n;
            } else {
                r = newr;
                c = newc;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(a[i][j] + " ");
            }

        }
    }
}