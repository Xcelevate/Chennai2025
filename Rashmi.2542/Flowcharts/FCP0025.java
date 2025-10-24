import java.util.*;
public class FCP0024{
 public static void main(String[] args){
  Scanner a = new Scanner(System.in);
  int Num = a.nextInt();
  int sum=0;
  for(int i=1; i<Num; i++){
    if(i%2!=0){
     sum = sum+i;
    }
   }
   System.out.println(sum);
 }
}