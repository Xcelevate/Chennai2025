import java.util.*;
public class FCP027{
public static void main(String [] args){
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int i=1;
double sum=0;
for(i=1;i<=a;i++){
sum+=1.0/i;}
System.out.println(sum);
}
}