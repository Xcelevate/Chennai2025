import java.util.Scanner;

public class FCP007 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float c = s.nextFloat();
        float f = (float)((c*9)/5)+32;
        
        System.out.println(f);
    }
}