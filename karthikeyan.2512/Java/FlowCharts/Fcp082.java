//Inverted Right Tringle Star Right 




import java.util.Scanner;
 public class Fcp082{
 public static void main(String[]args){
Scanner kk=new Scanner(System.in);
int a=kk.nextInt();
  Pattern(a);
}
static void Pattern(int x){
  for(int i=x; i>0; i--){
        for(int k=1; k<=i;k++){
         System.out.print("* ");
        }
System.out.println("");
  }
}
}