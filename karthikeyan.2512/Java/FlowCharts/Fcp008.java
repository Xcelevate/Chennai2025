import java.util.Scanner;
public class Fcp008{
     public static void main(String[]args){
      Scanner kk= new Scanner(System.in);
       int a=kk.nextInt();
       int b=kk.nextInt();
        Swap(a,b);
}

static void Swap(int x, int y){
           x=x+y;
           y=x-y;
           x=x-y;
      System.out.println(x);
      System.out.println(y);

}


}