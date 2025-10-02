import java.util.*;
public class Finechecker{
public static void main(String [] args){
Scanner scan=new Scanner(System.in);
double due=scan.nextInt();
int days=scan.nextInt();
double extend=0.0;
if(days==0){
extend=due;
System.out.println(extend);}
else if(1<=days && days<=5){
extend=due+100;
System.out.println(extend);}
else if(6<=days && days<=9){
due=due+(due*0.02);
extend=due+500;
System.out.println(extend);}
else if(days>=10){
due=due+(due*0.15);
extend=due+1000;
System.out.println(extend);}
}
}



