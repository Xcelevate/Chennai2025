import java.util.Scanner;
public class Fcp029{
public static void main(String[]args){
Scanner kk=new Scanner(System.in);
int a=kk.nextInt();
System.out.println(Sum(a));
}

static int Sum(int x){
    int r,add=0;
   for(int i=x; i>0;i++){
   r=x%10;
   add = add + r;
   x /= 10;
   }
return add;
}
}