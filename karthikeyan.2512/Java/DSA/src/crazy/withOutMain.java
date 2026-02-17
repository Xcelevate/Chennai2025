package crazy;

import java.util.Scanner;

public class withOutMain {

    static int a;
    static{
        Scanner kk = new Scanner(System.in);
        a = kk.nextInt();
        System.out.println(a + " without main i executed");
        System.exit(0);
    }
}
