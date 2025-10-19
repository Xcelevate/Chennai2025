//Butterfly Star Pattern




import java.util.Scanner;
 public class Fcp087{
 public static void main(String[]args){
Scanner kk=new Scanner(System.in);
 int a=kk.nextInt();
  Pattern(a);
}
static void Pattern(int x){
int gap=x*2-2;
for(int i=1;i<=x;i++){
      for(int j=1;j<=i;j++){
        System.out.print("*");}
       for(int k=1;k<=gap;k++){
      System.out.print(" ");}
       for(int l=1;l<=i;l++){
       System.out.print("*");}
    System.out.println("");
    gap -=2;
}
      gap=2;
for(int i=x-1;i>0;i--){
      for(int j=1;j<=i;j++){
        System.out.print("*");}
       for(int k=1;k<=gap;k++){
      System.out.print(" ");}
       for(int l=1;l<=i;l++){
       System.out.print("*");}
    System.out.println("");
    gap +=2;
}
}
}