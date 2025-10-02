//Generate Odd Magic Square




import java.util.*;
public class Fcp077{
    public static void main(String[] args) {
        Scanner kk=new Scanner(System.in);
        int n=kk.nextInt();
	int arr[][]=new int[n][n];
	   int val =1;
	   int i=0,j=n/2;
	   for(int z=1;z<=n*n;z++){
		arr[i][j]=val;
	         if(val%n==0){
		   val++;
		    i+=1;
		}
		else{i--;j--;val++;}
		if(i==-1){i +=n;}
		if(j ==-1){j +=n;}
	    }	
		for(int k=0;k<n;k++){
		    for(int l=n-1;l>=0;l--){
                       System.out.println(arr[k][l]);
		     }	
	         }
}
}