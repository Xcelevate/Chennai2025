import java.util.*;
public class FCP064{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] arr = new int[n];
		int[] arr1 = new int[m];
		int[] res = new int[n+m];
		
		for (int i=0; i<n; i++) arr[i] = sc.nextInt();
		for (int i=0; i<m; i++) arr1[i] = sc.nextInt();
		
		int i =0, j=0, k=0;
		while(i<n && j<m){
			if(arr[i] <= arr1[j]){
				res[k++] = arr[i++];
			}
			else{
				res[k++] = arr1[j++];
			}
		}
		
		while(i<n){
			res[k++] = arr[i++];
		}
		while(j<m){
			res[k++] = arr1[j++];
		}
		
		for(int r : res) System.out.println(r);
	}
}
		
			
		