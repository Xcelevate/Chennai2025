
//Frequency of each number in array
import java.util.Scanner;

public class FCP061 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];
        int[] f = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        int visit = -1;
        for (int i = 0; i < n; i++) {
            int count = 1;
            if (f[i] == visit) {
                continue;
            }
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    count++;
                    f[j] = visit;
                }
                if (f[i] != visit) {
                    f[i] = count;
                }
            }
            f[i] = count;
        }
        for (int i = 0; i < n; i++) {
            if (f[i] != visit) {
                System.out.println(a[i] + " - " + f[i]);
            }
        }
    }
}
