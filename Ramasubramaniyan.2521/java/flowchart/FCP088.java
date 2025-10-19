import java.util.Scanner;

public class FCP088 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int s = 1;s<i;s++) {
                System.out.print("  ");
            }
            for (int j = n; j >= i; j--) {
                System.out.print(j);
                if (j > i) {
                    System.out.print(" ");
                }
            }
            for (int j = i + 1; j <= n; j++) {
                System.out.print(" "+j);
                
            }

            System.out.println();
        }
    
        for (int i = 2; i <= n; i++) {

            for (int s = 1; s < i; s++) {
                System.out.print("  ");
            }
         
            for (int j = n; j >= i; j--) {
                System.out.print(j);
                if (j > i) {
                    System.out.print(" ");
                }
            }
            for (int j = i + 1; j <= n; j++) {
                System.out.print(" "+j);
                
            }

            System.out.println();
        }
    }

}
