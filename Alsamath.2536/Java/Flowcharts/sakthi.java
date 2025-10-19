import java.util.*;
public class sakthi{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int n=input.nextInt();
int[] A=new int[n];
int[] B=new int[n];
int[] C=new int[n];
int c=0;
int j=0;
	for(int i=0;i<n;i++){
	
		A[i]=input.nextInt();
	}
	Arrays.sort(A);
	for(int i=0;i<n-1;i++){
		if(A[i]==A[i+1]){
			B[j]=A[i];
			j+=1;
			for(int k=0;k<j;k++){
				if(B[k]==A[i]){
					c=c+1;
				}
			}
		}
		if(c==1){
			for(int k=i;k<n;k++){ 
				C[k]=A[i];
				break;
			}
		}
	}
}
}

