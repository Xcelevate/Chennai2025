import java.util.*;
public class Fcp018{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int amount = sc.nextInt();
int N = amount;
if (amount <= 10000)
{
int a = (20 * N) / 100;
int b = (80 * N) / 100;
int salary = N + a + b;
System.out.println(salary);
}
else if (amount <= 20000)
{
int a = (25 * N) / 100;
int b = (90 * N) / 100;
int salary = N + a + b;
System.out.println(salary);
}
else
{
int a = (30 * N) / 100;
int b = (95 * N) / 100;
int salary = N + a + b;
System.out.println(salary);
}
}
}
