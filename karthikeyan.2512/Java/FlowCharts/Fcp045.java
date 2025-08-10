import java.util.Scanner;
public class Fcp045{
public static void main(String[]args){
Scanner kk=new Scanner(System.in);
int a=kk.nextInt();
Pattern(a);
}

static void Pattern(int x){
  for(int i=1; i<=x;i++){
      for(int k=1; k<=x-i; k++){
     System.out.print("  ");}
      for(int j=1;j<=(i*2-1);j++){
       System.out.print("* ");}
System.out.println("");
}
}
}