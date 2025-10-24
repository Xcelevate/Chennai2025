import java.util.*;
public class FCP008{
 public static void main(String[] args){
   Scanner a = new Scanner(System.in);
   int Num = a.nextInt();
   if(Num==0){
    System.out.println("Zero");
  }else if(Num<0){
    System.out.println("negative");
  }else if(Num>0){
    System.out.println("positive");
  }
 }  
}