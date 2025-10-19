import java.util.Scanner;
public class FCP092 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = N + 2;        
        for (int i = 0; i < N + 2; i++) {
            for (int j = 0; j < M; j++) {
                if (i == 0 || i == N + 1 || j == 0 || j == M - 1) {
                    System.out.print("*");
                } else if(j == 0 || j == M - 1) {
                System.out.print("* "); 
              else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}








