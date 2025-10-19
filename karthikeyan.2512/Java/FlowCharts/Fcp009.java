import java.util.Scanner;

public class Fcp009{
public static void main(String[]args){
  Scanner kk=new Scanner(System.in);
   int a=kk.nextInt();
   int b=kk.nextInt();
   System.out.println(div(a,b));
}
static int div(int x, int y){
       int z=x%y;
       int c=x-z;
      return c;
}
}