import java.util.Scanner;
public class Fcp010{
         public static void main(String[]args){
        Scanner kk=new Scanner(System.in);
       int a=kk.nextInt();
       int b=kk.nextInt();
       Max(a,b);  
}
public static void Max(int x,int y){
    if(x>=y){
  System.out.println(x);}
    else{
System.out.println(y);
}
}
}