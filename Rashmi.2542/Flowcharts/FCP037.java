import java.util.*;
public class FCP037{
 public static void main(String[] args){
   Scanner a = new Scanner(System.in);
   int Num = a.nextInt();
   int sum =0;
   for(int i=1; i<Num; i++){
    if(Num%i==0){
      sum += i;
    }
   }
   if(sum==Num){
    System.out.println("Yes");
   }else{
    System.out.println("No");
   }
 }
}