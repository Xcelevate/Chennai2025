import java.util.*;
public class Fcp014
{
public static void main(String[] args)
{
Scanner scan = new Scanner(System.in);
int a = scan.nextInt();
int b = scan.nextInt();
int c = scan.nextInt();
int max = 0;
if (a>b)
{
max=a;
}
else
{
max=b;
}
if (max>c)
{
max = max;
}
else
{
max = c;
}
System.out.println(max);
}
}
