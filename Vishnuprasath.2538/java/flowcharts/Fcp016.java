import java.util.*;
public class Fcp016
{
public static void main(String[] args)
{
Scanner scan = new Scanner(System.in);
int year = scan.nextInt();
if ((year%100!=0 && year%4==0) || year%400==0)
{
System.out.println("yes");
}
else
{
System.out.println("no");
}
}
}
