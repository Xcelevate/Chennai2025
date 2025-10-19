import java.util.Scanner;
public class FCP038 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); 
        int t = n, sum = 0;

        while (t > 0) {
            int d = t % 10;        
            sum += d * d * d;      
            t /= 10;               
        }	

        if (sum == n)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
