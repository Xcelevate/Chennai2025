import java.util.*;
public class Trianglechecker{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
	
		if(a+b>c&& b+c>a&&c+a>b){ 
		
			if(a==b && b==c && c==a){
				System.out.println("Equilateral");
			}
			else if(a==b && b==a || b==c && c==b || c==a && a==c){
				System.out.println("Isoceles");
			} 
			else{
				System.out.println("Scalene");
			}
		}
		else{
			System.out.println("Invalid");
		}
	}
}
