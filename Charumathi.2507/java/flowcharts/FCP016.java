import java.util.*;
public class FCP016{
public static void main(String []args){
Scanner Sc=new Scanner(System.in);
int Y=Sc.nextInt();
if(Y%400==0){
System.out.println("Yes");
}
else if(Y%100==0){
System.out.println("No");
}
else if(Y%4==0){
System.out.println("Yes");
}
else{
System.out.println("No");
}
}
}


