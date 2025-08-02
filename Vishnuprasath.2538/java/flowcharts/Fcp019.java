import java.util.*;
public class Fcp019
{
public static void main(String[] args)
{
Scanner scan = new Scanner(System.in);
long u = scan.nextLong();
double bill = 0;
if (u<=50)
{
bill=u*0.50;
}
else if (u<=150)
{
bill=(50*0.50)+(u-50)*0.75;
}
else if (u<=250)
{
bill=(50*0.50)+(100*0.75)+(u-150)*1.20;
}
else
{
bill=(50*0.50)+(100*0.75)+(100*1.20)+(u-250)*1.50;
}
double add = bill*0.20;
double amount = bill + add;
System.out.println(amount);
}
}