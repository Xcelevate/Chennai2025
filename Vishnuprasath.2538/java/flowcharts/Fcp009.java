import java.util.*;
public class Fcp009
{
public static void main(String[] args)
{
Scanner scan = new Scanner(System.in);
int a = scan.nextInt();
int b = scan.nextInt();
if (1<=a && b<=10000000)
{
int c = a%b;
int d = a-c;
System.out.println(d);
}
}
}