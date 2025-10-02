import java.util.*;
public class FCP051{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int i=n;
int sum=0;
while(i>9){
sum=0;
while(i>0){
int d=i%10;
sum=sum+d;
i=i/10;
}
i=sum;
}
System.out.println(i);
}}
