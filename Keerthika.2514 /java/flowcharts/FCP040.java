import java.util.*;
public class FCP040{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int N=sc.nextInt();
long a=sc.nextLong();
long b=sc.nextLong();
long m1=0;
long m2=0;
if(a>b){
m1=a;
m2=b;
}else{
m1=b;
m2=a;
}
for(int i=3;i<=N;i++){
	long c=sc.nextLong();
	if(m1>c){
		if(m2>c){
			m2=m2;
		}else{
			m2=c;
		}
	}else{
	m2=m1;
	m1=c;
	}
}
System.out.println(m2);
}}