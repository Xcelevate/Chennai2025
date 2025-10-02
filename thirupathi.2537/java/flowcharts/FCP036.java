import java.util.Scanner;
public class FCP036 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int n = sc.nextInt();
        int a = N, b = n;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        int hcf = a;
        long lcm = (N * n) / hcf;
        System.out.println(hcf);
        System.out.println(lcm);
    }
}
