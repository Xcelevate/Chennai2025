import java.util.*;
public class naturalnumberarray{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		if(n<1 || n>1000){ return; }
		int[] arr= new int[n];
		
		for (int i=0;i<n;i++){ 
			arr[i]=i+1;
			System.out.println(arr[i]);
		}
	}
}
		
		