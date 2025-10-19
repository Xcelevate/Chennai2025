import java.util.Scanner;

public class FCP078 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] a = new int[n][n];
        int mincol = 0;
        int maxcol = n - 1;
        int minrow = 0;
        int maxrow = n - 1;
        int c = 1;

        while (c <= n * n) {
            for (int i = mincol; i <= maxcol; i++) {
                a[minrow][i] = c;
                c++;
            }
            minrow++;
            for (int i = minrow; i <= maxrow; i++) {
                a[i][maxcol] = c;
                c++;
            }
            maxcol--;
            for (int i = maxcol; i >= mincol; i--) {
                a[maxrow][i] = c;
                c++;
            }
            maxrow--;
            for (int i = maxrow; i >= minrow; i--) {
                a[i][mincol] = c;
                c++;
            }
            mincol++;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(a[i][j]);
            }
        }

    }
}
