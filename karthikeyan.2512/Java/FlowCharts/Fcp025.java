import java.util.Scanner;
public class Fcp025{
public static void main(String[]args){
Scanner kk=new Scanner(System.in);
int a=kk.nextInt();
System.out.println(Sum(a));
}
static int Sum(int x){
int sum=0;
for(int i=1;i<=x; i+=2){
sum+=i;
}
return sum;
}
}
