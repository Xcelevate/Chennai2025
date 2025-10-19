import java.util.*;
public class FCP028{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int N=sc.nextInt();
if(N<10){
	System.out.println("1");
	}
else{
	if(N<100){
		System.out.println("2");
	}else{
		if(N<1000){
			System.out.println("3");
		}
		else{
			if(N<10000){
				System.out.println("4");
				}
			else{
				if(N<100000){
					System.out.println("5");
				}
			}
		}
	}
}
}}
