// Merge Two Sorted Arrays Without Sorting



import java.util.*;
public class Fcp064{
    public static void main(String[] args) {
        Scanner kk=new Scanner(System.in);
                int n=kk.nextInt();
		int m=kk.nextInt();
		int arr[]=new int[n];
		int brr[]=new int[m];
		int crr[]=new int[n+m];
		for(int i=0;i<n;i++){
			arr[i]=kk.nextInt();
		}
		for(int j=0;j<m;j++){
			brr[j]=kk.nextInt();
		}
		int i=0;
		int j=0;
		int k=0;
		while(i<n && j<m){
			if(arr[i]>brr[j]){
				crr[k]=brr[j];
				k++;
				j++;
			}
			else{
				crr[k]=arr[i];
				k++;
				i++;
			}
		}
		while( j<m){
			crr[k]=brr[j];
			k++;
			j++;
		}
		while( i<n){
			crr[k]=arr[i];
			i++;
			k++;
		}

		for(int z:crr){
			System.out.println(z);
		}
	}
}