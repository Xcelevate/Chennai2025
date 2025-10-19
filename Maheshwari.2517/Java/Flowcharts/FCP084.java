import java.util.Scanner;

public class FCP084 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

       
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                
                System.out.println("0");
            } else {
                
                System.out.print((int)Math.pow(2, i-1) + " ");

               
                for (int j = 2; j <= i; j++) {
                    System.out.print((int)Math.pow(2, i) + " ");
                }
                System.out.println();
            }
        }

        sc.close();
    }
}
