import java.util.Scanner;
    public class FCP017{
       public static void main(String[]args){
          Scanner kk=new Scanner(System.in);
          int a=kk.nextInt();
          int b=kk.nextInt();
          int c=kk.nextInt();
          Max(a,b,c);
}
 static void Max(int x,int y,int z){
          int m,n;
       if(x>y){
            m=x;
           n=y;}
        else{
             m=y;
             n=x;}
         if(m<z){System.out.println(m);}
         else if(n>z){System.out.println(n);}
         else{System.out.println(z);}
}
}