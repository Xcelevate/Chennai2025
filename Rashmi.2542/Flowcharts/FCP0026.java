import java.util.*;
public class FCP0026{
 public static void main(String[] args){
  Scanner a = new Scanner(System.in);
  int N = a.nextInt();
  int M = a.nextInt();
  int sum=0; 
  for(int i=N; i<=M; i++){
   sum = sum+i;
  }
  System.out.println(sum);
 }
}