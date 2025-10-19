import java.util.Scanner;

public class FCP022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int val1 = a, count1 = 1;
        int val2 = 0, count2 = 0;
        int val3 = 0, count3 = 0;
        int val4 = 0, count4 = 0;
        int val5 = 0, count5 = 0;
        if (b == val1) count1++;
        else {
            val2 = b;
            count2 = 1;
        }
        if (c == val1) count1++;
        else if (c == val2) count2++;
        else {
            val3 = c;
            count3 = 1;
        }
        if (d == val1) count1++;
        else if (d == val2) count2++;
        else if (d == val3) count3++;
        else {
            val4 = d;
            count4 = 1;
        }
        if (e == val1) count1++;
        else if (e == val2) count2++;
        else if (e == val3) count3++;
        else if (e == val4) count4++;
        else {
            val5 = e;
            count5 = 1;
        }
        System.out.println(val1 + " = " + count1);
        if (count2 > 0) System.out.println(val2 + " = " + count2);
        if (count3 > 0) System.out.println(val3 + " = " + count3);
        if (count4 > 0) System.out.println(val4 + " = " + count4);
        if (count5 > 0) System.out.println(val5 + " = " + count5);
    }
}
