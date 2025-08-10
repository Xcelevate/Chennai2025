import java.util.Scanner;
public class Fcp050{
public static void main(String[]args){
Scanner kk=new Scanner(System.in);
int a=kk.nextInt();
Prime(a);
}
static void Prime(int x){
   int c;
if(x>2){
  for(int i=2;i<x;i++){
     c=0;
       if(x%i==0){
     for(int k=1;k<=i;k++){
       if(i%k==0){c +=1;}
        }
      if(c==2){System.out.println(i);}
      else{}
   }
}}
 else{System.out.println(" ");}

}}