import java.util.Scanner;
public class Fcp051{
public static void main(String[]args){
Scanner kk=new Scanner(System.in);
long a=kk.nextInt();
System.out.println(Single(a));
}
static Long Single(Long x){
 
while(x>9){
     long sum=0;
   while(x>0){
      long r= x%10;
       sum +=r;
       x /=10;}
       x=sum;
}
    return x;
}

}