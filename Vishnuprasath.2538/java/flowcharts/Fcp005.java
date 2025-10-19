import java.util.*;
public class Fcp005
{
public static void main(String[] args)
{
Scanner scan = new Scanner(System.in);
int a = scan.nextInt();
int b = scan.nextInt();
int c = 0;
int d = 0;
if(b!=0)
{
c=a/b;
d=a%b;
System.out.println(c);
System.out.println(d);
}
}
}