import java.util.Scanner;
public class Fcp041{
public static void main(String[]args){
Scanner kk=new Scanner(System.in);
long n=kk.nextLong();
long a=kk.nextLong();
long b=kk.nextLong();
long c=kk.nextLong();
long F,S,T=0;
 if(a>b){
	 F=a;
	 S=b;
 }
 else{
	 F=b;
	 S=a;
 }
 if(F<c){
	  T=S;
	  S=F;
	  F=c;
 }
 else if(S<c){
	 T=S;
	 S=c;
 }
 else{
	 T=c;
 }
 long d;
 for(int i=4;i<=n;i++){
	 d=kk.nextLong();
	 if(F<=d){
		 if(F==d){}
		 else{
			 T=S;
			 S=F;
			 F=d;
		 }
	 }
	 else if(S<=d){
		 if(S==d){}
		 else{
			 T=S;
			 S=d;
		 }
	 }
	 else if(T<d){
		 T=d;
	 }
 }
 System.out.println(T);
}
}