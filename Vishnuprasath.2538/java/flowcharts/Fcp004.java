import java.util.*;
public class Fcp004 
{
public static void main(String[] args) 
{
Scanner scan = new Scanner(System.in);
int a = scan.nextInt();
int b = scan.nextInt();
if (1 <= a && a <= 1000000 && 1 <= b && b <= 1000000)
{
int add = a + b;
System.out.println(add);
int sub = a - b;
System.out.println(sub);
int mul = a * b;
System.out.println(mul);
if (b != 0) 
{
double d = (double)a / b;
System.out.println(d);
int div = a / b;
System.out.println(div);
int mod = a % b;
System.out.println(mod);
}
 else 
{
System.out.println("zero is not allowed in denominator");
}
}
}
}
