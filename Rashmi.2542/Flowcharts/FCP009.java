import java.util.*;
public class FCP009{
 public static void main(String[] args){
  Scanner a = new Scanner(System.in);
  int Num1 = a.nextInt();
  int Num2 = a.nextInt();
  int N = Num1 - (Num1%Num2);
  if(N<Num1){
  System.out.println(N);
  }
 }
}