//Max Consecutive 1's in Binary Array


import java.util.Scanner;
public class Fcp063{
    public static void main(String[]args){
	Scanner kk=new Scanner(System.in);
	int n=kk.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++){
	   arr[i]=kk.nextInt();
	}int max=0,count=0;;
         for(int k:arr){
             if(k==1) {count+=1;}
	     else{count=0;}
	
	     if(max<count){max=count;}
	}
	
	  System.out.println(max);
	
}
}