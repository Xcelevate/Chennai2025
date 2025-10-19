import java.util.*;

public class FCP009{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
long a = sc.nextLong();
long b = sc.nextLong();

long c = (a/b)*b;
if(c==a)
System.out.println(c-b);
else
System.out.println(c);

}
}
