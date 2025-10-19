import java .util.*;
public class FCP059{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
			int n= sc.nextInt();
			
			int[] arr = new int[n];
			for (int i=0; i<n; i++){
				arr[i] = sc.nextInt();
			}
			
			for(int i =0; i<n; i++){
				boolean got = false;
					for(int j=0; j<i; j++){
						if(arr[i] == arr[j]){
							got = true;
							break;
						}
					}
				if(got==true) continue;
				
				for(int k =i+1; k<n; k++){
					if(arr[i] == arr[k]){
						System.out.println(arr[i]);
						break;
					}
				}
			}
	}
}

