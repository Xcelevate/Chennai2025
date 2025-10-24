import java.util.*;
public class FCP0027{
 public static void main(String[] args){
  Scanner a = new Scanner(System.in);
  float Num = a.nextFloat();
  float sum=0;
  for(float i=1; i<=Num; i++){
   sum = sum + 1/i;
  }
   System.out.println(sum);
 }
}