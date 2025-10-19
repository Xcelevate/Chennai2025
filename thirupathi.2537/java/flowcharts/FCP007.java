import java.util.Scanner;
public class FCP007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float C = sc.nextFloat();
        float F = (float)(C * 9 / 5) + 32;
        System.out.println(F);
    }
}

