import java.util.*;
public class FCP004{
public static void main(String[]args){
Scanner in = new Scanner(System.in);
long A = in.nextLong();
long B = in.nextLong();

long ADD = A + B;
long SUB = A - B;
long MUL = A*B;
double FDIVISION = ((double)A/B); 
long DIVIDE = A/B;
long MOD = A%B;

System.out.println(ADD);
System.out.println(SUB);
System.out.println(MUL);
System.out.println(FDIVISION);
System.out.println(DIVIDE);
System.out.println(MOD);
}
}
