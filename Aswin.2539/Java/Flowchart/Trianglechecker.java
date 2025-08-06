import java.util.*;
public class Trianglechecker{
public static void main(String[] args) {
Scanner scan= new Scanner(System.in);
int A =scan.nextInt();
int B =scan.nextInt();
int C =scan.nextInt();
if(A+B>C && A+C>B && B+C>A){
	if(A==B && B==C){
System.out.println("Equilateral");}
else if(A==B || B==C ||A==C){
System.out.println("Isosceles");}
else{
System.out.println("Scalene");}}
else{
System.out.println("Invalid");}
}
}



