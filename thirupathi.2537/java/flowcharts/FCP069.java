import java.util.Scanner;

public class FCP069{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int[] result = new int[n];
        int j = 0;
        for (int i = k; i < n; i++) {
            result[j] = arr[i];
            j++;
        }
        for (int i = 0; i < k; i++) {
            result[j] = arr[i];
            j++;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(result[i]);
        }
    }
}