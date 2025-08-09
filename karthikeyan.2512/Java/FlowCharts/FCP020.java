import java.util.Scanner;
    public class FCP020{
       public static void main(String[]args){
       Scanner kk=new Scanner(System.in);
        int a=kk.nextInt();
        int b=kk.nextInt();
        int c=kk.nextInt();
        int d=kk.nextInt();
        System.out.println(Great(a,b,c,d));
}
static int Great(int x,int y, int z, int w){
     int m1,m2;
        if(x>y){m1=x;m2=y;}
        else{m1=y;m2=x;}

        if(m1>z){
            if (m2>z){}
            else{m2=z;}}
        else{
             m2=m1;
             m1=z;}
         if(m1>w){
            if (m2>w){}
            else{m2=w;}}
        else{
             m2=m1;
             m1=w;}
        return m2;

}

}