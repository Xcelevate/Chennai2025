//Find Median of Two Sorted Arrays



import java.util.*;
public class Fcp065{
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
		int z=n+m;
		if(z%2==0){
			float val= (float)(crr[z/2]+crr[(z/2)-1])/2;
			System.out.println(val);
		}
		else{System.out.println((float)crr[z/2]);}
	}
}