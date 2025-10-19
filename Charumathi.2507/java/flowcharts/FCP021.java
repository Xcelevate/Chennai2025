import java.util.*;
public class FCP021{
public static void main(String []args){
Scanner Sc=new Scanner(System.in);
int A=Sc.nextInt();
int B=Sc.nextInt();
int C=Sc.nextInt();
int D=Sc.nextInt();
int E=Sc.nextInt();
int F=Sc.nextInt();
int G=Sc.nextInt();
int H=Sc.nextInt();
int M1=0;
int M2=0;
	if(A<B){
	M1=B;
	M2=A;
	}
	else{
	M1=A;
	M2=B;
	}
	if(M2<C){
		if(M1>C){
		M2=C;
		}
		else{
		M2=M1;
		M1=C;
		}
	}
	if(M2<D){
		if(M1>D){
		M2=D;
		}
		else{
		M2=M1;
		M1=D;
		}
	}
	if(M2<E){
		if(M1>E){
		M2=E;
		}
		else{
		M2=M1;
		M1=E;
		}
	}
	if(M2<F){
		if(M1>F){
		M2=F;
		}
		else{
		M2=M1;
		M1=F;
		}
	}
	if(M2<G){
		if(M1>G){
		M2=G;
		}
		else{
		M2=M1;
		M1=G;
		}
	}
	if(M2<H){
		if(M1>H){
		System.out.println(H);
		}
		else{
		System.out.println(M1);
		}
	}
	else{
	System.out.println(M2);
	}
}
}