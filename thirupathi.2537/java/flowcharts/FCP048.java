import java.util.Scanner;
public class FCP048{
  public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     int M = sc.nextInt();
     int N = sc.nextInt();
     for(int i = M ; i<=N; i++){
        int temp = i;
        int count = 0;
        while(temp > 0){
          temp = temp/10;
          count++;
        }
        temp = i;
        int Sum = 0;
int R = 0;
        while(temp > 0){
         R = temp % 10;
         Sum += Math.pow(R, count);
         temp = temp / 10;
        }
        if(Sum == i) {
          System.out.println(i);
        }
      }
   }
}
        
          
     