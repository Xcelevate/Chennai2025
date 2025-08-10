import java.util.Scanner;
public class Fcp042{
public static void main(String[]args){
Scanner kk=new Scanner(System.in);
int a=kk.nextInt();
Fibonacci(a);
}
static void Fibonacci(int x){
long curr =0;
long next=1;
long a;
for (int i= 1; i<=x; i++){
System.out.println(curr);
a=(long)next+curr;
curr=(long)next;
next=a;}
}
}