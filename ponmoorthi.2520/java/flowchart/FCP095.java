import java.util.*;
public class FCP095 
  {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] arr=new int[n];
	for(int p=0;p<n;p++){
	arr[p] =sc.nextInt();
	}
	int q, r;
	for(int p=1;p<n;p++){
	q = arr[p];
	r = p-1;
	while(r>=0){
	if(arr[r]>arr[r+1]){
	q = arr[r+1];
	arr[r+1] = arr[r];
	arr[r] = q;
	}
	r--;
	}
	}

	for(int p=0;p<n;p++){
	System.out.println(arr[p]);
	}

    }
}
