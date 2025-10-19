//Spiral Matrix Fill Pattern




import java.util.*;
public class Fcp078{
	public static void main(String[]args){
		Scanner kk=new Scanner(System.in);
		int n=kk.nextInt();
		int arr[][]=new int [n][n];
		int left=0,right=n-1,bottom=n-1,top=0;
		int val=1;
		
       while(top<=bottom && left<=right){
		for(int i=left;i<=right;i++){
			arr[left][i]=val++;	
		}
		top++;
		for(int i=top;i<=bottom;i++){
			arr[i][right]=val++;
		
		}
		right--;
             if(top<=bottom){
		for(int i=right;i>=left;i--){
			arr[bottom][i]=val++;
			
		}
		bottom--;}
            if(left <=right){
		for(int i=bottom;i>=top;i--){
			arr[i][left]=val++;
		}
		left++;
             }
	}
               for(int i=0;i<n;i++){
		    for (int j=0;j<n;j++){
			System.out.println(arr[i][j]);
			}
			
		}
	}
}