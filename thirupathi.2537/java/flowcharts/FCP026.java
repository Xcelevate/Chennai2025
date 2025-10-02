import java.util.Scanner;
public class FCP026 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        long S = 0;
        for(long i=M;i<=N;i++){
            S=S+i;
         }
        System.out.println(S);
     }
}