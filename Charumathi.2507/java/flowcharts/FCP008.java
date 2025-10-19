import java.util.*;
public class FCP008{
public static void main(String []args){
Scanner Sc=new Scanner(System.in);
int A=Sc.nextInt();
int B=Sc.nextInt(); 
A=A+B;
B=A-B;
A=A-B;
System.out.println(A);
System.out.println(B);
}
}