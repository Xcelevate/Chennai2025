import java.util.*;
public class game{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String a="Hey";
				for (int i=0;i<=4;i++){
			String user=sc.nextLine();
			if(user.equalsIgnoreCase(a)){
				System.out.println("You win!");
				break;
			}
			else{
				System.out.println("You Lose Try again !");
			}
		}
	}
}