import java.util.*;
public class Fcp009{
public static void main (String [] args){
Scanner sc= new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
int c =0;
int r=a%b;
if(r==0){
c=a-b;
}
else{
c=a-r;}
System.out.println(c);
}



}