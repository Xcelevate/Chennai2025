//Find Minimum Element in Matrix



import java.util.*;
public class Fcp076{
    public static void main(String[] args) {
        Scanner kk=new Scanner(System.in);
        int n=kk.nextInt();
		int arr[][]=new int [n][n];
		int min=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				arr[i][j]=kk.nextInt();
			}
		}min=arr[0][0];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(min>arr[i][j]){
					min=arr[i][j];
				}
			}
		}
		System.out.println(min);
	}
}
		