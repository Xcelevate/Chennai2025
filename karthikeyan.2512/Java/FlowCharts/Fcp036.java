import java.util.Scanner;
public class Fcp036{
public static void main(String[]args){
Scanner kk=new Scanner(System.in);
int a=kk.nextInt();
int b=kk.nextInt();
hcfLcm(a,b);
}

static void hcfLcm(int x, int y){
int max, min;
int r=1;
if(x>=y){
     max=x;
     min=y;}
else{
     max=y;
     min=x;}

while(r>0){
     r=max%min;
     max=min;
     min=r;
}
System.out.println(max);
System.out.println(((x*y)/max));
}
}