import java.util.Scanner;
public class FCP031 {
    public static int reverseNum(int N) {
        int rem, reverse = 0;
        while (N > 0) {
            rem = N % 10;
            reverse = reverse * 10 + rem;
            N = N / 10;
        }
        return reverse;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = reverseNum(N);
        System.out.println(result);
    }
}
  
    