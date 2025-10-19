//Symmetric Number Pyramid




import java.util.Scanner;
 public class Fcp085{
 public static void main(String[]args){
Scanner kk=new Scanner(System.in);
 int a=kk.nextInt();
  Pattern(a);
}

static void Pattern(int x){
int value=1;
  System.out.println("1");
 if(x>1){
    for(int i=2;i<=x;i++){
        for(int j=1;j<=i;j++){
          System.out.print(value + " ");
            value +=1;
            } value -=2;
             for(int k=1;k<i; k++){
                System.out.print(value + " ");
                  value -=1;
              }
        System.out.println("");
        value=1;
    }
}
}
}