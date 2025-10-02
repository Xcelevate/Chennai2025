import java.util.*;
public class spiralpattern{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int arr[][]=new int[n][n];
		int top =0;
		int bottom =n-1;
		int right =n-1;
		int left =0;
		int s=1;
	
	  while(top<=bottom && left<=right){
		for(int i=left;i<=right;i++){
			arr[top][i]=s;
			s=s+1;
		}
		top++;
		for(int i=top;i<=bottom;i++){
			arr[i][right]=s;
			s=s+1;
		}
		right--;
		for(int i = right;i>=left;i--){
			arr[bottom][i]=s;
			s=s+1;
		}
		bottom--;
		for(int i=bottom;i>=top;i--){
			arr[i][left]=s;
			s=s+1;
		}
		left++;
	  }
	  
	  for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				 System.out.printf("%4d", arr[i][j]);
			}
			System.out.println(); 
	  }
}
}
		
		
		
		
		
	
		