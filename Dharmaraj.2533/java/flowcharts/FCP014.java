import java.util.*;
public class FCP014{
public static void main(String [] args){
Scanner ab = new Scanner(System.in);
int A = ab.nextInt();
int B = ab.nextInt();
int C = ab.nextInt();
if (A>B){
if (A>C){
System.out.println(A);
}
else{
System.out.println(C);
}
}
else {
if (B>C){
System.out.println(B);
}
else{
System.out.println(C);
}
}
}
}