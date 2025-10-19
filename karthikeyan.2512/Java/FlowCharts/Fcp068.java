//Subarray with Given Sum


import java.util.Scanner;
public class Fcp068{
  public static void main(String[]args){
     Scanner kk=new Scanner(System.in);
        int n=kk.nextInt();
        int arr[]=new int[n];
	for(int i=0;i<n;i++){
	    arr[i]=kk.nextInt();
	}
	int s=kk.nextInt();
int c=0;
	for(int i=0;i<n;i++){
	     int z=arr[i];
		for(int j=i+1;j<n+1;j++){
		      if(z<=s){
			   if(z==s){   
				while(i<j){System.out.println(arr[i++]);c=1;}
				return;
			   }
			   else if(i==n-1 && (arr[i]>s || arr[i]<s)){							System.out.println("nothing");c=1;
			   }
			   else{z += arr[j];}
		       }
		      else{break;}
		}		   
	}
if(c==0){System.out.println("nothing");}
}
}