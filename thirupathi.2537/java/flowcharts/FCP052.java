import java.util.Scanner;
public class FCP052{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int array[] = new int[N];
    for(int i=0; i<N; i++){
      array[i] = sc.nextInt();
    }
    for(int j=0; j<N; j++) {
      System.out.println(array[j]);
    }
  }
}