//Star Diamond


import java.util.Scanner;
 public class Fcp086{
 public static void main(String[]args){
Scanner kk=new Scanner(System.in);
 int a=kk.nextInt();
Pattern(a);
 }


static void Pattern(int x){
     for(int i=1;i<=x;i++){
         for(int j=1;j<=x-i;j++){
               System.out.print(" ");}
         for(int k=1;k<=i*2-1;k++){
             System.out.print("*");}
       System.out.println("");
      }
    for(int i=x-1;i>0;i--){
          for(int j=1;j<=x-i;j++){
         System.out.print(" ");
          }
          for(int k=1;k<=i*2-1;k++){
           System.out.print("*");
                }
             System.out.println("");

}
}
}