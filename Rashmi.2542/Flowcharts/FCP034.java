import java.util.*;
public class FCP034{
 public static void main(String[] args){
   Scanner a = new Scanner(System.in);
   int Num = a.nextInt();
   for(int i=1; i<=Num; i++){
    if(Num%i==0){
        System.out.println(i);
    }
   }
 }
}