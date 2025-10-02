import java.util.*;

public class FCP030 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong(); 


        for (long i = 0; i * i <= n; i++) { 
            if (i * i == n) {
                System.out.println("Yes");
                return; 
            }
        }

        System.out.println("No");
    }
}
