
//Print minimum number in a matrix
import java.util.Scanner;

public class FCP076 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = scan.nextInt();
            }
        }
        int min=a[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(min>a[i][j]){
                    min=a[i][j];
                }
            }
        }
        System.out.println(min);
    }
}
