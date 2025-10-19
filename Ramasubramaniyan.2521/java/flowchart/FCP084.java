// Power Doubling Triangle
import java.util.Scanner;
public class FCP084 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        if (n < 1 || n > 10) {
            return;
        }
        int f=0,c=0,d=0;
        for(int i=1;i<=n;i++){
                if(i==1){
                    System.out.println(f+" ");
                    f=2;
                }
                else{
                    c=f;
                    d=c*2;
                    int j=1;
                    while(j<=i){
                        if(j==1){
                            System.out.print(c+" ");
                        }
                        else{
                            System.out.print(d+" ");
                        }
                        j=j+1;
                        
                    }
                    System.out.println();
                    f=d;
                }
        }
    }
}
