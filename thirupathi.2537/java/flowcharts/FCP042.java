import java.util.Scanner;
public class FCP042 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();    
    long A = 0;
    long B = 1;
    if (N >= 1) {
      System.out.println(A);
    }
    if (N >= 2) {
      System.out.println(B);
    }
    for (long i = 3; i <= N; i++) {
      long C = A + B;
      System.out.println(C);
      A = B;
      B = C;
    }
  }
}
