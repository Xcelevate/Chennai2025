import java.util.Scanner;
public class FCP068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
         int sum = sc.nextInt();
        int s = 0;
        int start = 0;
        int i = 0;

        while (i <= n) {
            if (s == sum) {
                for (int j = start; j < i; j++) {
                    System.out.println(a[j]);
                }
                return;
            } else if (s > sum) {
                s -= a[start];
                start++;
            } else {
                if (i < n) {
                    s += a[i];
                }
                i++;
            }
        }
      
    }
}
