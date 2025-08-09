import java.util.Scanner;
public class Fcp026{
public static void main(String[]args){
Scanner kk=new Scanner(System.in);
int m=kk.nextInt();
int n=kk.nextInt();
System.out.println(Sum(m,n));
}
static long Sum(int x, int y){
long sum=0;
for(int i=x; i<=y; i++){
sum +=i;
}
return sum;
}

}