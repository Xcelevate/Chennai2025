import java.util.Scanner;
public class FCP027{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		float sum = 0;
		
		for(float i =1; i<=a; i++){
			sum = sum+(1/i);
		}
		System.out.printf("%.2f",sum);
	}
}