import java.util.Scanner;
public class FCP055{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int array[] = new int[N];
    for(int i=0; i<N; i++){
      array[i] = sc.nextInt();
    }
    int T = sc.nextInt();
    int c = 0;
    for(int j=0; j<N; j++){
      if(array[j] == T) {
        c++;
      }
     }
     if(c>0){
       System.out.println("Yes");
     }
     else {
       System.out.println("No");
    }
  }
}