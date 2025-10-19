import java.util.Scanner;
public class Fcp028{
public static void main(String[]args){
Scanner kk=new Scanner(System.in);
int a=kk.nextInt();
Digit(a);
}
static void Digit(int x){
if(x<10){System.out.println("1");}
else if(x<100){System.out.println("2");}
else if(x<1000){System.out.println("3");}
else if(x<10000){System.out.println("4");}
else if(x<100000){System.out.println("5");}
else if(x<1000000){System.out.println("6");}
else if(x<10000000){System.out.println("7");}
else{System.out.println("Re enter the number");}
}
}