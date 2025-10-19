import java.util.*;
public class Fcp004{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int ad=a+b;
int sub=a-b;
long multiple=(long)a*b;
double divide=(double)a/b;
int intfloor=a/b;
int modulo=a%b;
System.out.println(ad);
System.out.println(sub);
System.out.println(multiple);
System.out.println(divide);
System.out.println(intfloor);
System.out.println(modulo);
}
}