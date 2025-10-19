import java.util.*;
public class FCP049{
public static void main(String []args){
Scanner Sc=new Scanner(System.in);
long N=Sc.nextLong();
long k=0;
for(long i=2; i<N; i++){
boolean prime = true;
	for(long j=2; j*j<=i; j++){
	if(i%j==0){
	prime = false;
	break;
	}
	}
	if(prime){
	k++;
	}
}
System.out.println(k);
}
}