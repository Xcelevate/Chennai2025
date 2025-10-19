//Arrow Direction Pattern


import java.util.*;
public class Fcp071{
    public static void main(String[] args) {
        Scanner kk=new Scanner(System.in);
                int n=kk.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
		   arr[i]=kk.nextInt();
		}
		   for(int j:arr){
			int k=1;
			while(k<=j){
			   System.out.print(">");
			   k++;
			}
			System.out.println("");
	            }
     }
}
