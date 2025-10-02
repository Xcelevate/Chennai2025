import java.util.*;
public class FCP027{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
float n=sc.nextFloat();
float a=0;
float c=0;
for(float i=1;i<=n;i++){
  a=1/i;
 c=c+a;
}
System.out.printf("%.2f",c);
}}
