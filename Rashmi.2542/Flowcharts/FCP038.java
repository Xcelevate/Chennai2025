import java.util.*;
public class FCP038{
 public static void main(String[] args){
   Scanner a = new Scanner(System.in);
   int Num = a.nextInt();
   int N =Num;
   int sum =0;
   while(Num>0){
    int r = Num%10;
    sum += Math.pow(r,3);
    Num = Math.floorDiv(Num,10);
   }
   if(sum==N){
    System.out.println("Yes");
   }else{
    System.out.println("No");
   }
 }
}