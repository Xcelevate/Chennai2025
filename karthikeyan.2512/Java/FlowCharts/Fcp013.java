import java.util.Scanner;

 
public class Fcp013{
    public static void main(String[]args){
     Scanner kk=new Scanner(System.in);
     int a=kk.nextInt();
      Multiples(a);

}
static void Multiples(int x){
if(x%2==0){System.out.println(x);}
else{System.out.println(x+x);}
} 

}