import java.util.*;
public class FCP049{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int N=sc.nextInt();
int a=0;
for(int i=2;i<N;i++){
boolean count=true;
	for(int  j=2;j*j<= i;j++){
		if(i%j==0){
			count=false;	
			break;
		}
		
	}
	if(count ){
		a=a+1;
	}
}
System.out.println(a);
}}