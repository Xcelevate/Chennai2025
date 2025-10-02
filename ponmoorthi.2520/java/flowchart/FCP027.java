import java.util.*;
public class FCP027{
public static void main(String a[]){
Scanner s=new Scanner(System.in);
float sum=0.0f;
float n=s.nextInt();
float i=1.0f;
while(i<=n){
float d=1/i;
sum=(float)sum+d;
i++;
}
System.out.println((float)sum);
}}