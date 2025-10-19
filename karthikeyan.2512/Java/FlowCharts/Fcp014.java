import java.io.*;
import java.util.Scanner;
  public class Fcp014{
      public static void main(String[]args){
       Scanner kk=new Scanner(System.in);
        int a=kk.nextInt();
        int b=kk.nextInt();
        int c=kk.nextInt();
        System.out.print(Greater(a,b,c));
}
static int Greater(int x,int y,int z){
    int m=(x>y?x:y);
     int n=(m>z?m:z);
     return n;
}}