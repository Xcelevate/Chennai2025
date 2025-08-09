import java.util.Scanner;

public class Arithmetic {
   public static void main (String[]args){
      Scanner kk=new Scanner(System.in);
      int a=kk.nextInt();
      int b=kk.nextInt();
      arith(a,b);

}
public static void arith(int a,int b){
     int c=a+b;
     int d=a-b;
     int e=a*b;
     int f=a/b;
     float g=(float)a/b;
     int h=a%b;
     System.out.println(c);
     System.out.println(d);
     System.out.println(e);
     System.out.println(f);
     System.out.println(g);
     System.out.println(h);
}
}