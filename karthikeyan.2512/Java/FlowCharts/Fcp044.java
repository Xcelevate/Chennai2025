import java.util.Scanner;
public class Fcp044{
public static void main(String[]args){
Scanner kk=new Scanner(System.in);
int a=kk.nextInt();
Pattern(a);
}

static void Pattern(int x){
  for(int i=1; i<=x;i++){
      for(int k=1; k<=i; k++){
     System.out.print("* ");}
   System.out.println("");
}

}}