import java.util.*;
public class FCP0018{
 public static void main(String[] args){
   Scanner a = new Scanner(System.in);
   int BS = a.nextInt();
   int F=0;
   if(BS<=10000){
    F = BS+(BS*20/100)+(BS*80/100);
  }else if(BS<=20000){
     F = BS+(BS*25/100)+(BS*90/100);
    }else if(BS>20000){
    F = BS+(BS*30/100)+(BS*95/100);
  }
  System.out.println(F);
 }
}