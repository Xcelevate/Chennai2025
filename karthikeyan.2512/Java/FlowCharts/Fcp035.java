import java.util.Scanner;
public class Fcp035{
public static void main(String[]args){
Scanner kk=new Scanner(System.in);
int a=kk.nextInt();
Prime(a);
}
static void Prime(int x){
int c=0;
for(int i=1; i<=x; i++){
if(x%i==0){
c += 1;}
}
if(c==2){System.out.println("yes");}
else{System.out.println("no");}
}
}