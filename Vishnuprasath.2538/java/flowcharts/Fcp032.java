import java.util.*;
public class Fcp032
{
public static void main(String[] args)
{
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int count = 0;
for (int i = 1; i<=n; i++)
{
if(n%i==0)
{
count=count+1;
}
}
if(count==3)
{
System.out.println("yes");
}
else
{
System.out.println("no");
}
}
}