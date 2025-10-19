import java.util.Scanner;

public class FCP051 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 0;
        
        do {
            sum = 0; 
            while (n > 0) {
                sum = sum + n % 10;
                n = n / 10;
            }
            n = sum;  
        } while (sum > 9); 
        
        System.out.println(sum);
    }
}