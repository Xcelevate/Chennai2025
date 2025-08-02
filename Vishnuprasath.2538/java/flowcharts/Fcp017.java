import java.util.*;
public class Fcp017
{
public static void main(String[] args)
{
Scanner scan = new Scanner(System.in);
int a = scan.nextInt();
int b = scan.nextInt();
int c = scan.nextInt();
int max = 0;
int smax = 0;
if (a>b)
{
max = a;
smax = b;
}
else
{
max = b;
smax = a;
}
if (c>max)
{
smax = max;
max = c;
}
else if (c>smax)
{
smax =c;
}
System.out.println(smax);
}
}
