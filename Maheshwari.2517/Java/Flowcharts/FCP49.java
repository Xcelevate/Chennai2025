import java.util.Scanner;

public class FCP49 {

   
    public static boolean isPrime(int num) {
        if (num < 2) return false;

        
        for (int i = 2; i <= num / i; i++) {  
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        int n = sc.nextInt();

        int count = 0;

     
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }

      
        System.out.println(count);

        sc.close();
    }
}

