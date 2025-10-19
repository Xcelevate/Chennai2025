//Transpose Matrix A




import java.util.*;
public class Fcp075{
    public static void main(String[] args) {
        Scanner kk=new Scanner(System.in);
        int n=kk.nextInt();
		int arr[][]=new int [n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				arr[i][j]=kk.nextInt();
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.println(arr[j][i]);
			}
		}
    }
}