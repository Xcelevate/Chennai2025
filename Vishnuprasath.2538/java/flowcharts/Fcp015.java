import java.util.*;
public class Fcp015
{
public static void main(String[] args)
{
Scanner scan = new Scanner(System.in);
int a = scan.nextInt();
int b = scan.nextInt();
int c = scan.nextInt();
int d = scan.nextInt();
int max = 0;
if (a>b)
{
max = a;
}
else
{
max = b;
}
if (max>c)
{
max = max;
}
else
{
max = c;
}
if (max>d)
{
max = max;
}
else
{
max = d;
}
System.out.println(max);
}
}