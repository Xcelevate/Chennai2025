import java.util.Scanner;
public class FCP046 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    if (N < 1 || N > 10) {
      return;
    } else {
      for (int i = 1; i <= N; i++) {
        for (int j = 1; j <= i; j++) {
          if (j == 1 || j == i || i == N) {
            System.out.print("* ");
          } else {
            System.out.print("  ");
          }
        }
        System.out.println();
      }
    }
  }
}
