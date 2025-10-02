import java.util.Scanner;
public class FCP038 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int original = N;
    int sum = 0;
    while (N > 0) {
      int digit = N % 10;
      sum = sum + (digit * digit * digit);
      N = N / 10;
    }
    if (sum == original) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
