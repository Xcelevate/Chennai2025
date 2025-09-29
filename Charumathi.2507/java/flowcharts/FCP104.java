import java.util.*;
public class FCP104{
public static void main(String []args){
Scanner Sc=new Scanner(System.in);
int N=Sc.nextInt();
int temp=N;
int c=0;

for(int i=N; i>1; i--){
int num=i;
boolean A=true;
	while(num>0){
	int k=num%10;
	if(k%2!=0){
	A=false;
	break;
	}
	else{
	A=true;
	}
	num/=10;
}
if(A){
c++;
}	
}
System.out.println(c);
}
}