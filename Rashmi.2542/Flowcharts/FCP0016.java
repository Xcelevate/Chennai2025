import java.util.*;
public class FCP0013{
 public static void main(String[] args){
   Scanner a = new Scanner(System.in);
   int Year = a.nextInt();
   if(Year%400==0){
     System.out.println("Yes");
  }else if(Year%4==0){
     if(Year%100!=0){
        System.out.println("Yes");
     }else{
        System.out.println("No");
     }
   }else{
     System.out.println("No");
   }
 }
}