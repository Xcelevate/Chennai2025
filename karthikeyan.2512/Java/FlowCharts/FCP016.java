import java.util.Scanner;
  public class FCP016{

     public static void main(String[]args){
       Scanner kk=new Scanner(System.in);
        int a=kk.nextInt();
        if(a%4==0){
            if (a%100==0){
               if (a%400==0){System.out.println("yes");}
               else {System.out.println("no");}}
            else{System.out.println("yes");}}
        else{System.out.println("no");}
}

}