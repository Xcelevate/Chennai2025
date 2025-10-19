import java.util.Scanner;
public class FCP33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   
        int temp = n;
        int sum = 0;

        while (n > 0) {
            int x = n % 10;       
            sum = (sum * 10) + x; 
            n = n / 10;           
        }

        if (temp == sum) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
