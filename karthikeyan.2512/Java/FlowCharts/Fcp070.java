//Binary Search on Sorted Array



import java.util.*;
public class Fcp070{
    public static void main(String[] args) {
        Scanner kk=new Scanner(System.in);
                int n=kk.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
		   arr[i]=kk.nextInt();
		}
	int a=kk.nextInt();
	int count=0;
 	     for(int k:arr){
	        if(k==a){count =1; break;}	
	      }

		if(count==1){System.out.println("Yes");}
		else{System.out.println("No");}
}
}