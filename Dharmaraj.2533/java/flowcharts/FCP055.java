import java.util.*;
public class FCP055{
public static void main(String[]args){
Scanner kk = new Scanner(System.in);




		int n=kk.nextInt();

		int []arr=new int [n];

		for(int i=0;i<n;i++){

			arr[i]=kk.nextInt();

		}

		int t=kk.nextInt();

		for(int i=0;i<n;i++){

			if(arr[i]==t){

				t=1;

			}

		}

		if(t==1){

			System.out.println("Yes");

		}

		else{

			System.out.println("no");

		}

	}

}
 