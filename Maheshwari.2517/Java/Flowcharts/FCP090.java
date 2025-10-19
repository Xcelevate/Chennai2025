import java.util.Scanner;

public class FCP089 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

       
        for (int i = n; i >= 1; i--) {
         
            for (int j = 0; j <= n; j++) {
                int val = i + j;
                if (val > n + 1) {
                    val = 2 * (n + 1) - val;
                }
                System.out.print(val + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
