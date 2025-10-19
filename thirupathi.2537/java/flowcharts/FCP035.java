import java.util.Scanner;
public class FCP035{
  public static void primeNum(int N){
    int count = 0;
    for(int i=1;i<=N;i++){
      if(N % i == 0){
        count = count + 1;
      }
     }
     if(count == 2){
       System.out.println("Yes");
     }
     else {
       System.out.println("No");
     }
}
   public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     int N = sc.nextInt();
     primeNum(N);
   }
}