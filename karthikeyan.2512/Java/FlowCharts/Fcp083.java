//Number Triangle Incremental





import java.util.Scanner;
 public class Fcp083{
 public static void main(String[]args){
Scanner kk=new Scanner(System.in);
 int a=kk.nextInt();
  Pattern(a);
}
static void Pattern(int g){
   int value=1;
 for(int i=1;i<=g;i++){
    for(int k=1;k<=i;k++){
       System.out.print(value + " ");
       value +=1;
  }
System.out.println("");
}
}
}