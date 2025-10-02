//Frequency of Each Number in Array


import java.util.Scanner;
public class Fcp061{
public static void main(String[]args){
Scanner kk=new Scanner(System.in);
int n=kk.nextInt();
   int arr[]=new int[n];
   
   for(int i=0;i<n;i++){
	arr[i]=kk.nextInt();
	}
   for(int i=0;i<n;i++){ 
       if(arr[i]==0){continue;}
	int c=1;
	for(int j=i+1;j<n;j++){
	  if(arr[i]==arr[j]){
		c++;
		arr[j]=0;
	   }
        }
           System.out.println(arr[i] + "-" + c);
      }
}
}