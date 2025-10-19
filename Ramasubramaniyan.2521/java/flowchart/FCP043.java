import java.util.Scanner;

public class FCP043 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x = scan.nextInt();
	int i=1;
        double sum = 0;
        long power = 1;
	while (n > 0) {
            power *= x; 
            sum += (double) power / i;

            i++;
            n--;
        }
        

        System.out.println(Math.round(sum));
    }
}
