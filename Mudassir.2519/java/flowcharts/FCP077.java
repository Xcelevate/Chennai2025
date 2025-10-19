import java.util.*;

public class FCP077 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        int num = 1;
        int i = 0;
        int j = n / 2;

        while (num <= n * n) {
            arr[i][j] = num;
            num++;
            int ni = (i - 1 + n) % n;
            int nj = (j + 1) % n;
            if (arr[ni][nj] != 0) {
                i = (i + 1) % n;
            } else {
                i = ni;
                j = nj;
            }
        }

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                System.out.println(arr[r][c]);
            }
        }
    }
}
