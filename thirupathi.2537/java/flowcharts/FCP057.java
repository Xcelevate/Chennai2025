import java.util.Scanner;
public class FCP057 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int array[] = new int[N];
    for(int i=0; i<N; i++){
      array[i] = sc.nextInt();
    }
    M = M - 1;
    for(int j=0; j<N-1; j++){
       if(j == M){
       for(int k=M; k<N-1; k++){
       array[k] = array[k+1];
              j=N-1;
}}
      }
      for (int j = 0; j < N - 1; j++) {
            System.out.println(array[j]);   }
 }
} 