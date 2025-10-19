import java.util.Scanner;
public class Fcp030{
public static void main(String[]args){
Scanner kk=new Scanner(System.in);
long a=kk.nextInt();
Perfect(a);
}
static void Perfect(long x){
for(long i=1; i<=x;i++){
if(x==i*i){System.out.println("yes");break;}
else if(i==x){System.out.println("no");break;}
}
}
}