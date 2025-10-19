import java.util.Scanner;

public class FCP039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long num = sc.nextLong(); 
        long max = num, min = num; 
        for (int i = 1; i < n; i++) {
            num = sc.nextLong(); 
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        
        System.out.println(max); 
        System.out.println(min); 
        
    }
}