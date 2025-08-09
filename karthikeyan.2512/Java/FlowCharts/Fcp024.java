import java.util.Scanner;
public class Fcp024{
public static void main(String[]args){
Scanner kk=new Scanner(System.in);
int a=kk.nextInt();
for(int i=2;i<a;i+=2){
   if(i%2==0){System.out.println(i);}
}
System.out.println(" ");
}
}