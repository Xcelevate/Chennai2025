import java.util.*;
public class FCP062{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp =0;
		
		int[] arr = new int[n];
		for (int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		int r = sc.nextInt();
		for(int i=1; i<=r; i++){
			for(int j=0; j<n-1; j++){
				temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}
		for(int i=0; i<n; i++){
			System.out.println(arr[i]);
		}
	}
}