import java.util.Scanner;

public class FCP089{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

       
        for (int i = 1; i <= n; i++) {
        
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n) {
                
                    System.out.print("0\t");
                } else if (i == j || i + j == n + 1 || j == 1 || j == n) {
                   
                    System.out.print("x\t");
                } else {
                  
                    System.out.print("0\t");
                }
            }
            System.out.println();
        }

     
    }
}
