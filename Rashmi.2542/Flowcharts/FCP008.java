import java.util.*;
public class FCP008{
 public static void main(String[] args){
   Scanner a = new Scanner(System.in);
   int Num1 = a.nextInt();
   int Num2 = a.nextInt();
   Num1 = Num1 + Num2;
   Num2 = Num1 - Num2;
   Num1 = Num1 - Num2;
   System.out.println(Num1);
   System.out.println(Num2);
 }
}