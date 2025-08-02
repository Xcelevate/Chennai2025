import java.util.*;
public class Fcp026
{
public static void main(String[] args)
{
Scanner scan = new Scanner(System.in);
int m = scan.nextInt();
int n = scan.nextInt();
long sum = 0;
for (int i=m;i<=n;i++)
{
sum=(long)sum+i;
}
System.out.println(sum);
}
}
