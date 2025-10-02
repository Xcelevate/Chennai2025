import java.util.*;
public class magicsquare{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[][]=new int[n][n];
		if(n%2!=0){
			int i=0;int j=n/2;
			for(int k=1;k<=n*n;k++){
				a[i][j]=k;
				int ni=(i-1+n)%n;
				int nj=(j+1+n)%n;
				if(a[ni][nj]!=0){
					i=i+1;
				}
				else{
					i=ni;
					j=nj;
				}
			}
		}
		for(int x=0;x<n;x++){
			for(int y=0;y<n;y++){
				System.out.printf("%d\t",a[x][y]);
			}
			System.out.println();
		}
	}
}

		
				
			
				