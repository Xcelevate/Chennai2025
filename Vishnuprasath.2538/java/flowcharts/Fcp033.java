import java.util.*;
public class Fcp033
{
public static void main(String[] arg)
{
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int temp = n;
int r = 0;
int sum = 0;
while (n>0)
{
r = n%10;
sum = (sum*10)+r;
n = n/10;
}
if (sum==temp)
{
System.out.println("yes");
}
else
{
System.out.println("no");
}
}
}