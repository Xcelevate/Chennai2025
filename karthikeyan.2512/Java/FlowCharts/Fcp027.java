import java.util.Scanner;
public class Fcp027{
public static void main(String[]args){
Scanner kk=new Scanner(System.in);
float a=kk.nextFloat();
System.out.printf("%.2f",Series(a));
}
static float Series(float x){
float sum=0;
for(float i=1; i<=x; i++){
  sum +=(1/i);
}
return sum;
}

}