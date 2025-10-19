import java.util.Scanner;
  public class FCP018{

     public static void main(String[]args){
        Scanner kk=new Scanner(System.in);
          int a=kk.nextInt();
          Salary(a);
}
static void Salary(int x){ 
    if(x<=10000){System.out.println(x*0.2 + x*0.8 +x);}
    else if(x>20000){System.out.println(x*0.3 + x*0.95 +x);}
    else{System.out.println(x*0.25 + x*0.9 +x);}
}
}