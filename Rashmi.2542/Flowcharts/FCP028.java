import java.util.*;
public class FCP028{
 public static void main(String[] args){
  Scanner a = new Scanner(System.in);
  int Num = a.nextInt();
  if(Num<10){
    System.out.println(1);
  }else if(Num<100){
   System.out.println(2);
  }else if(Num<1000){
   System.out.println(3);
  }else if(Num<10000){
   System.out.println(4);
  }else if(Num<100000){
   System.out.println(5);
  }else if(Num<1000000){
   System.out.println(6);
  }
 }
}