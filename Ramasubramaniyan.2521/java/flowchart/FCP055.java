import java.util.Scanner;
public class FCP055 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        int t = scan.nextInt();
        
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (a[i] == t) {
                found = true;
                break;
            }
        }
        
        if (found) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
