package recursive;

import java.util.Scanner;

public class Main {
    static int count ;
    static {
        Scanner kk = new Scanner(System.in);
        count = kk.nextInt();
    }
    public static void main(String[] kk) {
        System.out.println(Math.abs(count - 11) + " -->  hii bro");
        count--;
        if(count == 0){
            return;
        }
        main(kk);
    }
}
