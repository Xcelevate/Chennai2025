import java.util.Scanner;
public class Hollowdiamond{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		for(int i =1; i<=((2*n)-1); i++){
			if(i==1){
				System.out.print(" ".repeat(n-i));		
				System.out.println("*");
			}
			else if(i>1 && i<=n){
				System.out.print(" ".repeat(n-i));
				System.out.print("*");
				System.out.print(" ".repeat((2*i)-3));
				System.out.println("*");
			}
			else if(i>n && i<((2*n)-1)){
				System.out.print(" ".repeat(i-n));
				System.out.print("*");
				System.out.print(" ".repeat((2*(2*n - i) - 3)));
				System.out.println("*");
			}
			else{
				System.out.print(" ".repeat(i-n));		
				System.out.println("*");
			}	
		}
	}
}