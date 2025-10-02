import java.util.Scanner;
public class FCP039 {
  public static void findMaxMin(int N, Scanner sc) {
    int num = sc.nextInt();
    int max = num;
    int min = num;
    for (int i = 1; i < N; i++) {
      num = sc.nextInt();
      if (num > max) {
        max = num;
      }
      if (num < min) {
        min = num;
      }
    }
    System.out.println(max);
    System.out.println(min);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    findMaxMin(N, sc);
  }
}
