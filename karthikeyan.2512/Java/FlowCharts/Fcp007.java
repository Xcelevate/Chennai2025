import java.util.Scanner;
public class FCP007{
   public static void main(String[]args){
    Scanner kk=new Scanner(System.in);
    float c=kk.nextFloat();
    System.out.println(fahren(c));

}
static float fahren(float x){
      return (((x*9)/5)+32);
}
}