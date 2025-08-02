import java.util.*;
public class Fcp006
{
public static void main(String[] args)
{
Scanner scan = new Scanner(System.in);
int a = scan.nextInt();
int b = 0;
if(1<=a && a<=10000000)
{
b = a%10;
System.out.println(b);
}
}
}