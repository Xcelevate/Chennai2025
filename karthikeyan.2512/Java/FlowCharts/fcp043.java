import java.util.Scanner;
public class Fcp043{
public static void main(String[]args){
Scanner kk=new Scanner(System.in);
int a=kk.nextInt();
int b=kk.nextInt();
System.out.println((int)Series(a,b));
}

static float Series(int x, int y){
 float value;
 float sum=0;
for(int i=1; i<=x; i++){
   value=(float)Math.pow(y,i);
   value=(float)value/i;
   sum +=(float)value;}
int res=(int)Math.ceil(sum);
return res;
 }}
