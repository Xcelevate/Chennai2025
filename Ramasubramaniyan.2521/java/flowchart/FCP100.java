//Balanced Average Check
import java.util.Scanner;
public class BalancedAvg {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        if(n%2==0){
            int h=n/2,sum1=0,sum2=0;
            for(int i=0;i<h;i++){
                int a=scan.nextInt();
                sum1+=a;
            }
            for(int i=0;i<h;i++){
                int b=scan.nextInt();
                sum2+=b;
            }
            System.out.println(sum1==sum2?"Balanced":"Unbalanced");

        }
    }
}
