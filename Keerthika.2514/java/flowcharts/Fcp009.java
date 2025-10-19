import java.util.*;
public class Fcp009{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
a=a-1;
int c=a%b;
int d=a-c;
System.out.println(d);
}
}