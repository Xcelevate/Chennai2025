import java.util.*;
public class FCP063{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp =0;
		
		int[] arr = new int[n];
		for (int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		int count =0;
		for(int i =0; i<n; i++){
			if(arr[i]==1) count = count+1;
			else{
				if(temp<=count) temp = count;
				count = 0;
			}
		}
		if(temp<=count) temp = count;
		System.out.println(temp);
	}
}