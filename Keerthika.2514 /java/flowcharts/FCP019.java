import java.util.*;
public class FCP019{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
double N=sc.nextDouble();
double sr=0;
double TEB=0;
double p=0;
if(N<=50){
	p=0.50*N;
	sr=0.2*p;
	TEB=p+sr;
	System.out.println(TEB);
}else if(N<=150){
		p=((N-50)*0.75)+(50*0.50);
		sr=p*0.2;
		TEB=p+sr;
		System.out.println(TEB);
	}else if(N<=250){
			p=((N-150)*1.20)+(100*0.75)+(50*0.50);
			sr=p*0.2;
			TEB=p+sr;
			System.out.println(TEB);
		}else if(N>250){
				p=((N-250)*1.50)+(100*1.20)+(100*0.75)+(50*0.50);
				sr=p*0.2;
				TEB=p+sr;
				System.out.println(TEB);
				}

}}

				
	



			
	



