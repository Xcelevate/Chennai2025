import java.util.Scanner;
public class FCP025{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int sum =0;
			for(int i=1; i<=a; i++){
				if(i%2==1){
					sum=sum+i;
				}
			}
			System.out.println(sum);
	}	
}

				
				
								
			
			
		
