import java.util.Scanner;
public class FCP064 {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int M = sc.nextInt();
      int array1[] = new int[N];
      int array2[] = new int[M];
      for(int i=0; i<N; i++){
        array1[i] = sc.nextInt();
      } 
      for(int j=0; j<M; j++) {
         array2[j] = sc.nextInt();
      }
      int i=0, j=0;
      while(i<N && j<M) {
        if(array1[i] <= array2[j]) {
             System.out.println(array1[i]);
             i++;
         } else {
              System.out.println(array2[j]);
              j++;
         }
         }
    while(i < N){
         System.out.println(array1[i]);
         i++;
      }
     while(j < M){
         System.out.println(array2[j]);
         j++;
      }

}
}
