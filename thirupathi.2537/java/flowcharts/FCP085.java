import java.util.Scanner;
public class FCP085 {
   public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
     int N = sc.nextInt();
     for(int i=1; i<=N; i++) {
       for(int j=1; j<=i; j++) {
            System.out.print(j + " ");
        }
        for(int j=i-1; j>=1; j--) {
           System.out.print(j + " ");
        }
       System.out.println();
    }
}
}