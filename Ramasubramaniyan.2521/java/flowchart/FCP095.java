
//Insertion sort
import java.util.Scanner;

public class FCP095 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        for (int i = 1; i < n; i++) {
            int curr = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > curr) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = curr;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }

    }
}

