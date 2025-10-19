import java.util.Scanner;
public class Fcp046{
public static void main(String[]args){
Scanner kk=new Scanner(System.in);
int a=kk.nextInt();
Pattern(a);
}

static void Pattern(int x){
  for(int i=1;i<=x;i++){
     for(int j=1;j<=i;j++){
      if( j==1 || j==i || i==x){
         System.out.print("* ");}
      else{
         System.out.print("  ");}
      }
    System.out.println("");
}
}
}