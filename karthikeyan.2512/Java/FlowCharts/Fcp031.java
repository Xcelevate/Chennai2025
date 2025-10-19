import java.util.Scanner;
public class Fcp031{
public static void main(String[]args){
Scanner kk=new Scanner(System.in);
int a=kk.nextInt();
System.out.println(Reverse(a));
}

static int Reverse(int x){
   int r,rev=0;
   for(int i=x; x>0;){
    r=x%10;
    rev =(rev*10) + r;
    x /= 10;
}
return rev;
}
}