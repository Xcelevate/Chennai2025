import java.util.Scanner;

public class FCP051 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		
		while(n>9){
			int sum =0;
			int temp =n;
			while(temp>0){
				int rem = temp%10;
				sum = sum+rem;
				temp = temp /10;
			}
			n=sum;
		}
		System.out.print(n);
	}
}
		
		