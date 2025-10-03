import java.util.Scanner;
public class FCP31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int temp;
        if (n < 0) {
            temp = -n;   
        } else {
            temp = n;
        }
        while (temp > 0) {
            int x = temp % 10;      
            sum = (sum * 10) + x;    
            temp = temp / 10;        
        }

       
        if (n < 0) {
            sum = -sum;
        }

        System.out.println(sum);
    }
}





