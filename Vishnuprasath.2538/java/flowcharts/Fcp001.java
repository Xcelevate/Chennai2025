import java.util.*;
public class Fcp001
{
public static void main(String[] args)
{
Scanner scan = new Scanner(System.in);
int a = scan.nextInt();
scan.nextLine();
String b = scan.nextLine();
int c = scan.nextInt();
if (a >= 1 && a <= 31)
{
System.out.println(a);
}
else
{
System.out.println("not valid");
}
switch (b)
{
case "january":
System.out.println("january");
break;
case "feburay":
System.out.println("feburay");
break;
case "march":
System.out.println("march");
break;
case "april":
System.out.println("april");
break;
case "may":
System.out.println("may");
break;
case "june":
System.out.println("june");
break;
case "july":
System.out.println("july");
break;
case "august":
System.out.println("august");
break;
case "september":
System.out.println("september");
break;
case "october":
System.out.println("october");
break;
case "november":
System.out.println("november");
break;
case "december":
System.out.println("december");
break;
default:
System.out.println("not valid");
}
if (c >= 1900 && c <= 2100)
{
System.out.println(c);
}
else
{
System.out.println("not valid");
}
}
}