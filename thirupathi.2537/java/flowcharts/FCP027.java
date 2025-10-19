import java.util.Scanner;
public class FCP027 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double result = harmonicSum(N);
        System.out.println(result);
    }
public static double harmonicSum(int N) {
   double S = 0;
   for (int i = 1; i <= N; i++) {
      S = S + (1.0 / i);
   }
      return S;
  }
}


