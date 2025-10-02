//Union and Intersection of Two Sorted Arrays



import java.util.*;
public class Fcp066 {
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
	for(i=0;i<z-1;i++){
	   if(crr[i] != crr[i+1]){System.out.println(crr[i]);}
	}
	if(crr[z-1] == crr[z-2]){System.out.println(crr[z-2]);}
	else{System.out.println(crr[z-1]);}
int num=-1;
	for(j=0;j<z-1;j++){
	    if(crr[j] == crr[j+1]){ 
		if(num !=crr[j]){
		System.out.println(crr[j]);
		num=crr[j];}
	     }
  	    else{num=-1;}
	}
}
}