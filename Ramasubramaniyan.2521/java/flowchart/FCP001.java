import java.util.Scanner;

public class FCP001 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        input.nextLine(); 
        String b = input.nextLine();
        int c = input.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        input.close();
    }
}
