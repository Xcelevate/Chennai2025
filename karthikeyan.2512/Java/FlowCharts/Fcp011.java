import java.util.Scanner;

public class Fcp011{
    public static void main(String[]args){
     Scanner kk=new Scanner(System.in);
         int a=kk.nextInt();
         OddEven(a);
         }
static void OddEven(int x){
     if(x%2==0){
         System.out.println("even");
      }
     else{
         System.out.println("odd");
      }
   }
}