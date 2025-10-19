import java.util.Scanner;
public class FCP030{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long i =1;
		long sq =0;

		while(i*i<=a){
			sq = i*i;
			i++;
		}
		if(sq == a){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
}



