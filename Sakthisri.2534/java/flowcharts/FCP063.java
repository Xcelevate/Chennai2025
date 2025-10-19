import java.util.*;
public class FCP063 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] A=new int[n];  
        int max=0;  
        int c=0;       
        for(int i=0;i<n;i++){
         A[i]=input.nextInt();
        }
        for(int i=0;i<n;i++){
          if(A[i]==1){
          c=c+1;
          if(c>max){
             max=c;
           }
         }

       else{
         c=0;          
       }
    }
       System.out.println(max);
}
}

           
          


         