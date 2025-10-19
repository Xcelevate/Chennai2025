import java.util.*;

public class FCP030 {
    public static void main(String[] args) {
      
        int n=14;
        int i=0;
       
        while(i*i<=n){
            if(i*i==n){
                System.out.println("Yes");
                break;
            }i++;
        
        }
        if (i*i>n) {
            System.out.println("No");
        }
        
  }
}