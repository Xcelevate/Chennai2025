import java.util.*;

public class FCP032 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        int c=0;
        while(i<=n){
            if(n%i==0){
            c++;
        }
            i++;

        }
        if(c==3)
        System.out.println("Yes");
        else
        System.out.println("No");
    }
}