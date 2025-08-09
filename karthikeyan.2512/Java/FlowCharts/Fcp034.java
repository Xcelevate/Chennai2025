import java.util.Scanner;
public class Fcp034{
public static void main(String[]args){
Scanner kk=new Scanner(System.in);
int a=kk.nextInt();
Divisors(a);

}
static void Divisors(int x){
for(int i=1; i<=x; i++){
if(x%i==0){System.out.println(i);}
}
}}