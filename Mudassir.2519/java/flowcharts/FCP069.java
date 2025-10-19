import java.util.*;

public class FCP069 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        int[] result = new int[n];
        int ind = 0;

        for (int i = k % n; ind < n; i = (i + k) % n) {
            if (result[ind] == 0) {
                result[ind] = arr[i];
                ind++;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(result[i]);
        }
    }
}
