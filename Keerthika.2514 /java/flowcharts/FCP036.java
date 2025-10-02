import java.util.*;
public class FCP036{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
long a=sc.nextInt();
long b=sc.nextInt();
long factor=0;
long HCF=0;
long LCM=0;
long max=0;
long min=0;
if(a>b){
	max=a;
	min=b;
}else{
	max=b;
	min=a;
}
for(long i=1;i<=min;i++){
	if(a%i==0){
		if(b%i==0){
			HCF=i;
		}
	}
}
factor=a*b;
LCM=factor/HCF;
System.out.println(HCF);
System.out.println(LCM);
}}
