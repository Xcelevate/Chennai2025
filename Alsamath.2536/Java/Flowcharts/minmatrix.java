import java.util.*;import java.util.*;
public class minmatrix{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int arr1[][]=new int[n][n];
		
		
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				arr1[i][j]=sc.nextInt();
			}
		}
		int min=arr1[0][0];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(min>arr1[i][j]){
					min=arr1[i][j];
				}
				
			}
		}
		System.out.println(min);
	}
}
				
