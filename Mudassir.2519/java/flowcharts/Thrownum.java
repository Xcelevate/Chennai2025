import java.util.*;
public class Thrownum{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m=1;
		
		for(int i =1; i<=n; i++){
			for(int j=1; j<=n; j++){
				System.out.print(m);
				if(m==n){
					m=1;
					continue;
				}
				else{
					m=m+1;
				}
			}
			System.out.println();
			m= m+1;
		}
	}
}
		