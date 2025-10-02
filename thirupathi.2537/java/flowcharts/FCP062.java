import java.util.Scanner;
public class FCP062 {
  public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
     int N = sc.nextInt();
     int array[] = new int[N];
     for(int i=0; i<N; i++) {
      array[i] = sc.nextInt();
     }
     int A = sc.nextInt();
     A = A % N;
      if (A < 0) {
         A += N;
     }
     for(int j = A; j < N; j++) {
        System.out.println(array[j]);
     }
     for(int j = 0; j < A; j++){
        System.out.println(array[j]);
     }
   }
 }
     
    
         