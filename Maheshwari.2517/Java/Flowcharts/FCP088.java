import java.util.Scanner;

public class FCP088 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

       
        for (int i = 1; i <= n; i++) {
            // Spaces
            for (int s = 1; s <= (n - i) * 2; s++) {
                System.out.print(" ");
            }

          
            for (int j = n; j >= n - i + 1; j--) {
                System.out.print(j + " ");
            }

           
            for (int j = n - i + 2; j <= n; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

        
        for (int i = n - 1; i >= 1; i--) {
      
            for (int s = 1; s <= (n - i) * 2; s++) {
                System.out.print(" ");
            }

           
            for (int j = n; j >= n - i + 1; j--) {
                System.out.print(j + " ");
            }

           
            for (int j = n - i + 2; j <= n; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

     
    }
}
