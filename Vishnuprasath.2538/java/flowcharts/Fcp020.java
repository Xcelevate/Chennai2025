import java.util.*;
public class Fcp020
{
public static void main(String[] args)
{
Scanner scan = new Scanner(System.in);
int a = scan.nextInt();
int b = scan.nextInt();
int c = scan.nextInt();
int d = scan.nextInt();
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
else if(c>smax)
{
smax = c;
}
else
{
smax = smax;
}
if (d>max)
{
smax = max;
max = d;
}
else if (d>smax)
{
smax = d;
}
else
{
smax = smax;
}
System.out.println(smax);
}
}