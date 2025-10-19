import java.util.*;
public class FCP008{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int A=input.nextInt();
int B=input.nextInt();
A=A+B;
B=A-B;
A=A-B;
System.out.println(A);
System.out.println(B);
}
}
