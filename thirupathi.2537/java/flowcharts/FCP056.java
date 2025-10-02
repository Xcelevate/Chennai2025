import java.util.Scanner;
public class FCP056{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int array[] = new int[N];
    for(int i=0; i<N; i++){
       array[i] = sc.nextInt();
    }
    int even = 0;
    int odd = 0; 
    for(int j=0; j<N; j++){
        if(array[j] % 2 == 0){
           even = even + array[j];
        } else {
           odd = odd + array[j];
        }
    }
   System.out.println(odd);
   System.out.println(even);
  }
}
    