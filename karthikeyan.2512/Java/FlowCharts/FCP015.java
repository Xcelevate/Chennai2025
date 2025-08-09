import java.util.Scanner;

  public class FCP015{

     public static void main(String[]args){
      Scanner kk=new Scanner (System.in);
       int a=kk.nextInt();
       int b=kk.nextInt();
       int c=kk.nextInt();
       int d=kk.nextInt();
       System.out.println(Max(a,b,c,d));
}
static int Max(int x, int y, int z, int w){
      int m=x>y?x:y;
      int n=m>z?m:z;
      return n>w?n:w;


}

}