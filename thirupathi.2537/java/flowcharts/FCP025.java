import java.util.Scanner;
public class FCP025 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (sc.hasNextInt()) {
      int N = sc.nextInt();
      int sum = 0;
      for (int i = 1; i <= N; i += 2) {
        sum += i;
      }
      System.out.println(sum);
    }
  }
}

