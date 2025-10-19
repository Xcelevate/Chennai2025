import java.util.*;
public class center{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=n;
		int y=n;
		int z=n;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n+1;j++){
				if(x<=n+1){
					System.out.print(x+" ");
					x=x+1;
				}
				else{
					System.out.print(y+	" ");
					y=y-1;
				}
			}
			z=z-1;
			x=z;
			y=n;
			System.out.println();
		}
	}
}
				
				