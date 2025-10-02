import java.util.*;
public class FCP037{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
long n=sc.nextLong();
if(n == 1) {
System.out.println("No");
}
long count=1;
for(long i=2;i*i<n;i++){
	if(n%i==0){
		count=count+i;
		if(i!=n/i){
		count+=n/i;
		}
	}
}
if(n==count){
	System.out.println("Yes");
}else{
	System.out.println("No");
}
}}
