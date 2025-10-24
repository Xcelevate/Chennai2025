import java.util.*;
public class FCP0013{
 public static void main(String[] args){
   Scanner a = new Scanner(System.in);
   int Num = a.nextInt();
   if(Num%2==0){
    System.out.println(Num);
  }else{
     Num = Num*2;
     System.out.println(Num);
   }
 }
}