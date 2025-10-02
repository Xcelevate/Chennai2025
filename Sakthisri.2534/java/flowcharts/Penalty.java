import java.util.*;
public class Penalty{
public static void main(String[] args){
Scanner Sc=new Scanner(System.in);
int amt=Sc.nextInt();
int days=Sc.nextInt();
double fine=0;
if(days==0){
System.out.println(0+amt);
}
else if (days<=5){
 System.out.println((int)(100+amt));
}
else if(days<=9){
double newAmt=amt*0.02;
System.out.println((int)(amt+500+newAmt));
}
else if(days>=10){
double newAmtt=amt*0.15;
System.out.println((int)(amt+1000+newAmtt));
}
}
}


