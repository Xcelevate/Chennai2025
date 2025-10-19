import java.util.*;
public class FCP003{
public static void main(String[]args){
Scanner in = new Scanner(System.in);
int A = in.nextInt();
int B = in.nextInt();
int TEMP = 0;
TEMP = B;
B = A;
A = TEMP;
System.out.println( A );
System.out.println( B );
}
}