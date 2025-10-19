//Prime factors of N
import java.util.Scanner;

public class FCP050 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        if (n < 2) {
            System.out.println(); 
            return;
        }

        
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                boolean isPrime = true;
                for (int j = 2; j * j <= i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }

                
                if (isPrime) {
                    System.out.println(i);
                    
                    while (n % i == 0) {
                        n /= i;
                    }
                }
            }
        }
    }
}