import java.util.Scanner;


public class FCP005{
      public static void main(String[]args){
      Scanner kk=new Scanner(System.in);
      int a=kk.nextInt();
      int b=kk.nextInt();
      System.out.println(quo(a,b));
      System.out.println(rem(a,b));
}
static int quo(int x, int y){   
        return x/y;
}
static int rem(int x,int y){
       return x%y;
}

}