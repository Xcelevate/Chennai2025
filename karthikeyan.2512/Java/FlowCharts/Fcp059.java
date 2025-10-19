import java.util.*;
public class Fcp059{
  public static void main(String[]args){
     Scanner kk = new Scanner(System.in);
     int n=kk.nextInt();
     int arr[] = new int[n];
     for(int i = 0;i<n;i++){
       arr[i]=kk.nextInt();
     }
     int c=0;
     boolean[] brr = new boolean[n];
      for(int i=0;i<n;i++){
	   if(brr[i]){
 	       continue;
	     }
 	for(int j=i+1;j<n;j++){
	    if(arr[i]==arr[j]){
	        brr[j]=true;
	        c++;
	    }
         }
        if(c>0){
          System.out.println(arr[i]);
        }
       c=0;
    }
  }
}

