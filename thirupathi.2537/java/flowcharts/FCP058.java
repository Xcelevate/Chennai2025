import java.util.Scanner;
public class FCP058{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int array[] = new int[N + 1];
    for(int i=0; i<N; i++){
       array[i] = sc.nextInt();
     }
     int M = sc.nextInt();
     int X = sc.nextInt();
     for(int j=N; j>=M; j--){
        array[j] = array[j-1];
     }
     array[M - 1] = X;
     for(int i = 0; i <= N; i++){
          System.out.println(array[i]);
     }
}
}        