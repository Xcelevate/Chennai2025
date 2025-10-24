import java.util.Scanner;

public class FCP003{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter A new Number");
   int A = sc.nextInt();
   Scanner scn = new Scanner(System.in);
   System.out.println("Enter another Number");
   int B = scn.nextInt();

  int temp = A;
  A = B;
  B = temp;
  System.out.println(A);
  System.out.println(B);
  
 }
}