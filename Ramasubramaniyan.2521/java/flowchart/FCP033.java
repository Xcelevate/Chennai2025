import java.util.Scanner;

public class FCP033 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int rev=0,t=n;
        while(t>0){
            rev=rev*10+t%10;
            t/=10;
        }
        if (rev==n) {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
