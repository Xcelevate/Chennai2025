import java.util.Scanner;
public class FCP015 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int D = sc.nextInt();
    int max;
    if (A > B && A > C && A > D) {
      max = A;
    } else if (B > C && B > D) {
      max = B;
    } else if (C > D) {
      max = C;
    } else {
      max = D;
    }

    System.out.println(max);
  }
}
