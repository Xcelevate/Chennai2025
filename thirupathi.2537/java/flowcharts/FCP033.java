import java.util.Scanner;
public class FCP033{
  public static void palindrome(int N){
    int M = N;
    int S = 0;
    int rev =  0;
    while(N>0){
       rev = N % 10;
       S = S * 10 + rev;
       N = N/10;
     }
     if(M==S){
       System.out.println("Yes");
     }
     else{
       System.out.println("No");
     }
   }
public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   palindrome(N);
 }
}

       
       
    