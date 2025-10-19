import java.util.Scanner;
public class Fcp032{
public static void main(String[]args){
Scanner kk=new Scanner(System.in);
int a=kk.nextInt();
Divisor(a);
}

static void Divisor(int x){
  int c=0;
  for(int i=1; i<=x; i++){
  if(x%i==0){
   c +=1;}
}
 if(c==3){System.out.print("yes");}
 else{System.out.print("no");}
}}