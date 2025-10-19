import java.util.Scanner;

public class Chocolate{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int g = sc.nextInt();
		int s = sc.nextInt();
		int rem =s-g;
		int sum =0;

		if(g>=s) sum = s*1;
		
		if(rem>0) sum = (rem*2)+(g*1);
		
		System.out.print(sum);
	}
}	