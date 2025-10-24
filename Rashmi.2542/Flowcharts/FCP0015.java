import java.util.*;
public class FCP0013{
 public static void main(String[] args){
   Scanner a = new Scanner(System.in);
   int Num1 = a.nextInt();
   int Num2 = a.nextInt();
   int Num3 = a.nextInt();
   int Num4 = a.nextInt();
   int Max;
   if(Num1>Num2){
      Max = Num1;
    }else{
      Max = Num2;
    }
    if(Max<Num3){
      Max=Num3;
    }else if(Max<Num4){
         Max = Num4; 
      }
    System.out.println(Max);
  }
}