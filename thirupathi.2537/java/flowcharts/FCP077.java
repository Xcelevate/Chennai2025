import java.util.Scanner;
public class FCP077 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] magicSquare = new int[n][n];
        int number = 1;
        int i = 0, j = n / 2;
        while (number <= n * n) {
            magicSquare[i][j] = number;
            number++;
            int newi = (i - 1 + n) % n;
            int newj = (j + 1) % n;
            if (magicSquare[newi][newj] != 0) {
                i = (i + 1) % n;
            } else {
                i = newi;
                j = newj;
            }
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.println(magicSquare[i][j]);
            }
        }
    }
}
