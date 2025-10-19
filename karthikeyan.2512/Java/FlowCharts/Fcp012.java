import java.util.Scanner;

public class Fcp012{
    public static void main(String[]args){
     Scanner kk=new Scanner(System.in);
         float a=kk.nextFloat();
         Positive(a);
}
static void Positive(float x){
   if(x>0)
      {System.out.println("positive");}
   else if(x<0)
      {System.out.println("negative");}
   else
      {System.out.println("zero");}
}

}