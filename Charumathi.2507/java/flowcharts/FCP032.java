import java.util.*;
public class FCP032{
public static void main(String []args){
Scanner Sc=new Scanner(System.in);
long N=Sc.nextLong();
long i = (long)Math.sqrt(N);
if(i*i==N && i>1){
	boolean prime = true;
	for(long j=2; j*j<=i; j++){
	if(i%j==0){
	prime = false;
	break;
	}
	}
	if(prime){
	System.out.println("Yes");
	}
	else{
	System.out.println("No");
	}
}
else{
System.out.println("No");
}
}
}