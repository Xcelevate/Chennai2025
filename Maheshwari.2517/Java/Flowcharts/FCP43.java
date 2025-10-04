import java.util.Scanner;

public class FCP43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        int n = sc.nextInt();  
        int x = sc.nextInt();  

        double sum = 0;

       
        for (int i = 1; i <= n; i++) {
           
            int power = 1;
            for (int j = 1; j <= i; j++) {
                power *= x;
            }

            
            sum += (double) power / i;
        }

      
        int rounded;
        if (sum - (int) sum >= 0.5) {
            rounded = (int) sum + 1;
        } else {
            rounded = (int) sum;
        }

        System.out.println(rounded);
    }
}

