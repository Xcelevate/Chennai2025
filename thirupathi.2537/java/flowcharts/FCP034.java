import java.util.Scanner;
public class FCP034{
  public static void factors_N(int N){
    for(int i=1; i<=N;i++){
       if(N%i==0){
       System.out.println(i);
       }
    }
   }
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      factors_N(N);
   }
}