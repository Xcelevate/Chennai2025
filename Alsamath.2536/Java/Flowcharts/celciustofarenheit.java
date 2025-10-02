import java.util.*;
public class celciustofarenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int celsius = sc.nextInt();
        System.out.println((float)(((float)celsius * 9.0/5) + 32));
    }
}