import java.util.*;

public class FCP003{
public static void main(String[]args){
Scanner scan = new Scanner(System.in);
int A = scan.nextInt();
int B = scan.nextInt();
int temp=A;
A=B;
B=temp;
System.out.println(A);
System.out.println(B);
}}