package DomJudge;
import java.util.Scanner;
public class FCP076 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [][] matrix = new int [n][n];

        for(int row =0 ; row < n ; row++ ) {
            for(int col = 0 ; col < n ; col++){
                 matrix [row][col] = scanner.nextInt();
            }
        }
        int min = matrix [0][0];

        for ( int row = 0 ; row < n ; row++){
            for( int col = 0 ; col < n ; col++){
                if( matrix [row][col] < min ){
                    min = matrix [row][col];

                }
            }
        }
        System.out.println(min);
    }
}
