import java.util.*;
public class FCP097{
public static void main(String []args){
Scanner Sc=new Scanner(System.in);
int a=Sc.nextInt();
int b=Sc.nextInt();
int c=Sc.nextInt();
if(a+b<=c || b+c<=a || c+a<=b){
	System.out.println("Invalid");
	return;
	}
else{
int[ ] A={a, b, c};
Arrays.sort(A);
long X=A[2]*A[2];
long Y=A[0]*A[0]+A[1]*A[1];
if(X<Y){
System.out.println("Acute");
}
else if(X==Y){
System.out.println("Right");
}
else{
System.out.println("Obtuse");
}
}
}
}