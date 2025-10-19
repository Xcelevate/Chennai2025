import java.util.Scanner;
public class FCP063 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int array[] = new int[N];
    for(int i = 0; i<N; i++) {
      array[i] = sc.nextInt();
    }
    int mcount = 0;
    int ccount =0;
    for(int j=0; j<N; j++){
      if(array[j] == 1) {
         ccount++;
         if(ccount > mcount){
            mcount = ccount;
          }
        } else {
               ccount = 0;
      }
}
 System.out.println(mcount);
}
}        
   