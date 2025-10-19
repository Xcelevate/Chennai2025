import java.util.*;
public class Fcp018
{
public static void main(String[] args)
{
Scanner scan = new Scanner(System.in);
long s = scan.nextLong();
long hra = 0;
long da = 0;
long total = 0;
if (s<=10000)
{
hra = (s*20)/100;
da = (s*80)/100;
}
else if (s<=20000)
{
hra = (s*25)/100;
da = (s*90)/100;
}
else if (s>20000)
{
hra = (s*30)/100;
da = (s*95)/100;
}
total = (s+hra+da);
System.out.print(total);
}
}
