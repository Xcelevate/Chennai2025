import java.util.Scanner;
public class FCP011{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();

		if(a%2==0){
			System.out.println("Even");
		}
		else{
			System.out.println("Odd");
		}
	}
}	
