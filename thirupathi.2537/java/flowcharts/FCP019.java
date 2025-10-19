import java.util.Scanner;
public class FCP019{
   public static void electricityBill(int N){
      double total_Bill = 0;
      double bill = 0;
      if(N <= 50) {
        bill = N * 0.50;
        total_Bill = bill * 0.2 + bill;
        System.out.println(total_Bill);
      }
      else if(N <= 150) {
         bill = 50 * 0.50 + (N-50) * 0.75;
         total_Bill = bill * 0.2 + bill;
         System.out.println(total_Bill);
      }
      else if(N<=250) {
         bill = 50 * 0.50 + 100 * 0.75 + (N-150) * 1.20;
         total_Bill = bill * 0.2 + bill;
         System.out.println(total_Bill);
      }
      else {
         bill = 50 * 0.50 + 100 * 0.75 + 100 * 1.20 + (N-250) * 1.50;
         total_Bill = bill * 0.2 + bill;
         System.out.println(total_Bill);
      }
    }
   public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
     int N = sc.nextInt();
     electricityBill(N);
  }
}