import java.util.*;
public class FCP003{
public static void main(String []args){
Scanner Sc=new Scanner(System.in);
int A=Sc.nextInt();
int B=Sc.nextInt(); 
int C;
C=A;
A=B;
B=C;
System.out.println(A);
System.out.println(B);
}
}