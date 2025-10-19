import java.util.*;
public class CU {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        int c,d,e=0;
        int f=b%2==0?1:0;
        while (b>0) {
            c =b%10;
            if (c%2==0) {
                d=0;
            } 
	    else {
                d=1;
            }
            if (f==d) {
                e=1;
            } else {
                f=d;
            }
            b/=10;
        }
        if (e==1) {
            System.out.println("no");
        } else {
            System.out.println("yes");
        }
    }
}
