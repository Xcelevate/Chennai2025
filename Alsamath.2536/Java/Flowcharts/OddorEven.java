import java.util.*;
public class OddorEven{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<0){
			return;
		}
		if(n%2==0){	
			System.out.println("Even");
		}
		else{
			System.out.println("Odd");
		}
	}
}