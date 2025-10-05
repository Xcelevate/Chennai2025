package DomJudge;

import java.util.Scanner;

public class FCP063 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int maxcount = 0;
        int currentcount = 0;

        for (int i = 0; i < a; i++) {
            int b = scanner.nextInt();
            if( b == 1){
                currentcount++;
                if(currentcount > maxcount){
                    maxcount = currentcount;
                }
            }else {
                currentcount = 0;
            }
        }
        System.out.println(maxcount);
    }
}
