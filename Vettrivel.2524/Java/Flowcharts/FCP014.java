import java.util.*;

public class FCP014{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
int A = sc.nextInt();
int B = sc.nextInt();
int C = sc.nextInt();

if(A>B){
	if(A>C){
		System.out.println(A);
		}
	else{
		System.out.println(C);
	     }
}
else{
	if(B>C){
		System.out.println(B);
		}
	else{
		System.out.println(C);
	    }
}
}
}