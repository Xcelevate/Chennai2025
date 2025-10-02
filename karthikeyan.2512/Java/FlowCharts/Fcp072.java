//Stair Star Pattern



import java.util.*;
public class Fcp072{
public static void main(String[] args) {
   Scanner kk=new Scanner(System.in);
   	int n=kk.nextInt();
         int arr[]=new int[n];
	for(int i=0;i<n;i++){
	    arr[i]=kk.nextInt();
	}
int m=arr[0];
for(int k:arr){
    if(m<k){m=k;}
}
for(int i=1;i<=n ;i++){
int k=0;
   for(int j=1;j<=n ;j++){
       if(m==arr[k]){
	    System.out.print("*        ");
	    arr[k] = arr[k]-1;
	}
	else{System.out.print("         ");
        }
      k++;
    }
System.out.println();
   m -=1;
}
}}



