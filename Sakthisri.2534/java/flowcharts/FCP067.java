import java.util.*;
public class FCP067 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] A=new int[n];
        int c=0;
        int t=0;
        for(int i=0;i<n;i++){
         A[i]=input.nextInt();
        }

        for(int j=0;j<n-1;j++){
        c=0;
         
        for(int i=0;i<n-1;i++){
  
         if(A[i]>A[i+1]){
           t=A[i];
           A[i]=A[i+1];
           A[i+1]=t;
           c=c+1;
         }
       }
       if(c==0){
         break;
       }
      }
    for(int i=0;i<n;i++){
         System.out.println(A[i]);
     }
}
}         
          


         