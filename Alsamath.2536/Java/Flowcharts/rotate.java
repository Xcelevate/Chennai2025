import java.util.*;
public class rotate{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for (int i=1;i<=n;i++){
			int s=i;
			int r=1;
			for(int j=1;j<=n;j++){
				if(s<=n){
					System.out.print(s+" ");
					s=s+1;
				}
				else{
					System.out.print(r+" ");
					r=r+1;
				}
			}
			System.out.println();
		}
	}
}